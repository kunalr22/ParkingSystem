package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Login extends JFrame implements ActionListener {

    JTextField emailBox;
    JPasswordField passwordBox;
    JButton registerButton, loginButton;
    JButton showPasswordButton;

    ImageIcon closedEye = new ImageIcon(
            ImageIO.read(new File("src/images/closed-eye.png"))
                    .getScaledInstance(20, 20, Image.SCALE_SMOOTH));

    ImageIcon openEye = new ImageIcon(
            ImageIO.read(new File("src/images/open-eye.png"))
                    .getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );

    public Login() throws IOException {

        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);

        JLabel header = new JLabel("Login");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        JPanel headerWrapper = new JPanel(new BorderLayout());
        headerWrapper.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        headerWrapper.add(header, BorderLayout.CENTER);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailLabel.setBounds(100, 0, 300, 40);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordLabel.setBounds(100, 100, 300, 40);

        showPasswordButton = new JButton();
        showPasswordButton.setBounds(405, 155, 30, 30);
        showPasswordButton.setIcon(closedEye);
        showPasswordButton.setFocusPainted(false);
        showPasswordButton.addActionListener(this);


        emailBox = new JTextField();
        emailBox.setBounds(100, 50, 300, 40);
        emailBox.setBorder(BorderFactory.createCompoundBorder(emailBox.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        passwordBox = new JPasswordField();
        passwordBox.setBounds(100, 150, 300, 40);
        passwordBox.setBorder(BorderFactory.createCompoundBorder(passwordBox.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        passwordBox.setEchoChar('●');

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setFont(new Font("Arial", Font.PLAIN, 16));
        registerButton.setFocusable(false);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setFont(new Font("Arial", Font.PLAIN, 16));
        loginButton.setFocusable(false);

        JPanel centerPanel = new JPanel();
        centerPanel.add(emailLabel);
        centerPanel.add(emailBox);
        centerPanel.add(passwordLabel);
        centerPanel.add(showPasswordButton);
        centerPanel.add(passwordBox);
        centerPanel.setLayout(null);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(registerButton);
        bottomPanel.add(loginButton);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        this.setTitle("Login");
        this.add(headerWrapper, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showPasswordButton) {
            if (showPasswordButton.getIcon() == closedEye) {
                showPasswordButton.setIcon(openEye);
                passwordBox.setEchoChar((char) 0);
            } else {
                showPasswordButton.setIcon(closedEye);
                passwordBox.setEchoChar('●');
            }
        } else if (e.getSource() == registerButton) {
            this.dispose();
            try {
                new Register();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void setButtonListener(ActionListener listener) {
        showPasswordButton.addActionListener(listener);
    }
}
