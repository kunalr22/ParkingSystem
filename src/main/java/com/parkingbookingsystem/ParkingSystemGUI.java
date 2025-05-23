package com.parkingbookingsystem;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;
import com.parkingbookingsystem.commands.*;


public class ParkingSystemGUI implements Subscriber {
    private final Controller controller = new Controller();
    private final Database db = Database.getInstance();
    private final Invoker invoker = new Invoker();
    private final JFrame frame;
    private String currUserEmail;
    private int currParkingLot;
    private final CardLayout cardLayout = new CardLayout();
    private final JPanel mainPanel;
    private final Deque<String> prevPanels = new ArrayDeque<>();
    private DefaultListModel<String> 
        parkingSpaceBookingManagementModel, 
        parkingLotManagementModel,
        parkingSpaceManagementModel,
        parkingSpaceBookingModel, 
        userApprovalModel,
        paymentModel;
    
    public ParkingSystemGUI() {
        db.addSubscriber(this); // observe the model

        frame = new JFrame("Parking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 500);
        frame.setResizable(false);
        
        mainPanel = new JPanel(cardLayout);
        
        mainPanel.add(createLoginPanel(), "Login");
        mainPanel.add(createRegisterPanel(), "Register");
        mainPanel.add(createClientPanel(), "Client");
        mainPanel.add(createManagerPanel(), "Manager");
        mainPanel.add(createSuperManagerPanel(), "SuperManager");
        mainPanel.add(createUserApprovalPanel(), "UserApproval");
        mainPanel.add(createParkingLotManagementPanel(), "ParkingLotManagement");
        mainPanel.add(createParkingSpaceManagementPanel(), "ParkingSpaceManagement");
        mainPanel.add(createParkingSpaceBookingPanel(), "ParkingSpaceBooking");
        mainPanel.add(createParkingSpaceBookingManagementPanel(), "ParkingSpaceBookingManagement");
        mainPanel.add(createPaymentPanel(), "Payment");

        // initial update
        updateUserApprovalModel();
        updateParkingSpaceBookingManagementModel();
        updateParkingSpaceBookingModel();
        updateParkingLotManagementModel();
        updateparkingSpaceManagementModel();
        updatePaymentModel();
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    private JPanel createLoginPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Log In");
        JLabel registerLabel = new JLabel("Don't have an account?");
        JButton registerButton = new JButton("Register");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(emailLabel, gbc);
        gbc.gridx = 1;
        panel.add(emailField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(loginButton, gbc);

        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridy = 3;
        panel.add(spacer, gbc);
        
        gbc.gridy = 4;
        panel.add(registerLabel, gbc);

        gbc.gridy = 5;
        panel.add(registerButton, gbc);
        
        loginButton.addActionListener(_ -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            // User user = controller.getUserById(email);
            Command<User> getUser = new GetUserCommand(controller, email);
            invoker.setCommand(getUser);
            User user = (User) invoker.executeCommand().getResult();
            if (user != null && user.canLogin(password)) {
                currUserEmail = email;
                JOptionPane.showMessageDialog(frame, "Login successful!");
                switch (user.getType()) {
                    case SuperManager.TYPE -> cardLayout.show(mainPanel, "SuperManager");
                    case Manager.TYPE -> cardLayout.show(mainPanel, "Manager");
                    default -> cardLayout.show(mainPanel, "Client");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });
        
        registerButton.addActionListener(_ -> cardLayout.show(mainPanel, "Register"));
        
        return panel;
    }
    
    private JPanel createRegisterPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JLabel userTypeLabel = new JLabel("User Type:");
        // If new user types are added, has to be modified. Violates Open-Close principle.
        JComboBox<String> userTypeField = new JComboBox<>(UserFactory.getAllClientTypes());
        JButton registerButton = new JButton("Register");
        JLabel loginLabel = new JLabel("Already have an account?");
        JButton loginButton = new JButton("Login");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(emailLabel, gbc);
        gbc.gridx = 1;
        panel.add(emailField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(userTypeLabel, gbc);
        gbc.gridx = 1;
        panel.add(userTypeField, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(registerButton, gbc);

        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridy = 4;
        panel.add(spacer, gbc);
        
        gbc.gridy = 5;
        panel.add(loginLabel, gbc);

        gbc.gridy = 6;
        panel.add(loginButton, gbc);
        
        registerButton.addActionListener(_ -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String type = (String) userTypeField.getSelectedItem();

            // controller.createUser(email, password, type);
            Command<User> createUser = new CreateUserCommand(controller, email, password, type);
            invoker.setCommand(createUser);
            Result<User> result = (Result<User>) invoker.executeCommand();
            if (result.getResult() != null) {
                JOptionPane.showMessageDialog(frame, "Registration successful!");
                cardLayout.show(mainPanel, "Login");
                // updateUserApprovalModel();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid user creation: " + result.getMessage());
            }
        });
        
        loginButton.addActionListener(_ -> cardLayout.show(mainPanel, "Login"));
        
        return panel;
    }

    private JPanel createClientPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel welcomeLabel = new JLabel("Welcome Dear Client!");
        JButton bookingButton = new JButton("Book A Parking Space");
        JButton manageBookingsButton = new JButton("Manage Existing Bookings");
        JButton paymentButton = new JButton("Make A Payment");
        JButton logoutButton = new JButton("Log Out");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(welcomeLabel, gbc);
        
        gbc.gridy = 1;
        panel.add(bookingButton, gbc);
        
        gbc.gridy = 2;
        panel.add(manageBookingsButton, gbc);
        
        gbc.gridy = 3;
        panel.add(paymentButton, gbc);
        
        gbc.gridy = 4;
        panel.add(spacer, gbc);
        
        gbc.gridy = 5;
        panel.add(logoutButton, gbc);

        bookingButton.addActionListener(_ -> {
            prevPanels.push("Client");
            updateParkingSpaceBookingModel();
            cardLayout.show(mainPanel, "ParkingSpaceBooking");
        });
        
        manageBookingsButton.addActionListener(_ -> {
            prevPanels.push("Client");
            updateParkingSpaceBookingManagementModel();
            cardLayout.show(mainPanel, "ParkingSpaceBookingManagement");
        });

        paymentButton.addActionListener(_ -> {
            prevPanels.push("Client");
            updatePaymentModel();
            cardLayout.show(mainPanel, "Payment");
        });

        logoutButton.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Hate to see you leave! Please come back soon!");
            currUserEmail = null;
            cardLayout.show(mainPanel, "Login");
        });
        
        return panel;
    }

    private JPanel createManagerPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel welcomeLabel = new JLabel("Welcome Manager!");
        JButton verifyUsersButton = new JButton("Verify Newly Registered Users");
        JButton manageParkingButton = new JButton("Manage Parking Booking");
        JButton logoutButton = new JButton("Log Out");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(welcomeLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(verifyUsersButton, gbc);
        
        gbc.gridy = 2;
        panel.add(manageParkingButton, gbc);
        
        gbc.gridy = 3;
        panel.add(spacer, gbc);
        
        gbc.gridy = 4;
        panel.add(logoutButton, gbc);

        manageParkingButton.addActionListener(_ -> {
            prevPanels.push("Manager");
            // updateParkingLotManagementModel();
            cardLayout.show(mainPanel, "ParkingLotManagement");
        });

        verifyUsersButton.addActionListener(_ -> {
            prevPanels.push("Manager");
            // updateUserApprovalModel();
            cardLayout.show(mainPanel, "UserApproval");

        });

        logoutButton.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Hate to see you leave! Please come back soon!");
            currUserEmail = null;
            cardLayout.show(mainPanel, "Login");
        });
        
        return panel;
    }

    private JPanel createSuperManagerPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel welcomeLabel = new JLabel("Welcome SuperManager!");
        JButton generateManagerButton = new JButton("Generate New Manager Account");
        JButton verifyUsersButton = new JButton("Verify Newly Registered Users");
        JButton manageParkingButton = new JButton("Manage Parking Booking");
        JButton logoutButton = new JButton("Log Out");
        
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(welcomeLabel, gbc);
        
        gbc.gridy = 1;
        panel.add(generateManagerButton, gbc);
        
        gbc.gridy = 2;
        panel.add(verifyUsersButton, gbc);
        
        gbc.gridy = 3;
        panel.add(manageParkingButton, gbc);
        
        gbc.gridy = 4;
        panel.add(spacer, gbc);
        
        gbc.gridy = 5;
        panel.add(logoutButton, gbc);

        generateManagerButton.addActionListener(_ -> {
            // User newManager = controller.generateManager();
            Command<User> generateManager = new GenerateManagerCommand(controller);
            invoker.setCommand(generateManager);
            Result<User> result = (Result<User>) invoker.executeCommand();
            User newManager = result.getResult();
            if (newManager != null) {
                JOptionPane.showMessageDialog(frame, "New manager account generated: Username: " + newManager.getEmail() + ", Password: " + newManager.getPassword());
            } else {
                JOptionPane.showMessageDialog(frame, "Error generating new manager: " + result.getMessage());
            }
        });

        manageParkingButton.addActionListener(_ -> {
            prevPanels.push("SuperManager");
            // updateParkingLotManagementModel();
            cardLayout.show(mainPanel, "ParkingLotManagement");
        });
        
        verifyUsersButton.addActionListener(_ -> {
            prevPanels.push("SuperManager");
            // updateUserApprovalModel();
            cardLayout.show(mainPanel, "UserApproval");
        });

        logoutButton.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Hate to see you leave! Please come back soon!");
            currUserEmail = null;
            cardLayout.show(mainPanel, "Login");
        });
        
        return panel;
    }

    private void updateUserApprovalModel() {
        userApprovalModel.clear();
        Command<List<Client>> getUnvalidatedClients = new GetUnvalidatedClientsCommand(controller);
        invoker.setCommand(getUnvalidatedClients);
        List<Client> unvalidatedClients = (List<Client>) invoker.executeCommand().getResult();
        // for (Client client : controller.getUnvalidatedClients())
        for (Client client : unvalidatedClients)
            userApprovalModel.addElement(client.getEmail() + ", " + client.getType() + ", pending approval");
    }

    private JPanel createUserApprovalPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    
        JLabel instructionLabel = new JLabel("Please select a user from the list and approve or decline their registration.");
        userApprovalModel = new DefaultListModel<>();
        JList<String> userList = new JList<>(userApprovalModel);
        updateUserApprovalModel();
        JScrollPane scrollPane = new JScrollPane(userList);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        JButton approveButton = new JButton("Approve");
        JButton declineButton = new JButton("Decline");
        Dimension buttonSize = new Dimension(200, 25);
        approveButton.setPreferredSize(buttonSize);
        declineButton.setPreferredSize(buttonSize);
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(declineButton, gbc);
        
        gbc.gridx = 1;
        panel.add(approveButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(spacer, gbc);
        
        gbc.gridy = 4;
        panel.add(backButton, gbc);

        approveButton.addActionListener(_ -> {
            if (userList.getSelectedIndex() != -1) {
                String user = userList.getSelectedValue();
                // controller.validateUser(user.split(", ")[0]);
                Command<Void> validateUser = new ValidateUserCommand(controller, user.split(", ")[0]);
                invoker.setCommand(validateUser);
                invoker.executeCommand();
                JOptionPane.showMessageDialog(frame, "You approved user: " + user.split(", ")[0] + "!");
                // updateUserApprovalModel();
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a user first.");
            }
        });

        declineButton.addActionListener(_ -> {
            if (userList.getSelectedIndex() != -1) {
                String user = userList.getSelectedValue();
                // controller.deleteUser(user.split(", ")[0]);
                Command<Void> deleteUser = new DeleteUserCommand(controller, user.split(", ")[0]);
                invoker.setCommand(deleteUser);
                invoker.executeCommand();
                JOptionPane.showMessageDialog(frame, "You deleted user: " + user.split(", ")[0] + "!");
                // updateUserApprovalModel();
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a user first.");
            }
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
    }
    
    private void updatePaymentModel() {
        paymentModel.clear();
        Command<List<Booking>> getBookingsForUser = new GetBookingsForUserCommand(controller, currUserEmail);
        invoker.setCommand(getBookingsForUser);
        List<Booking> bookings = (List<Booking>) invoker.executeCommand().getResult();
        // for (Booking b : controller.getBookingsForUser(currUserEmail))
        for (Booking b : bookings)
            paymentModel.addElement(b.getBookingId()+ ", " + b.getParkingSpaceId() + ", " + b.getParkingLotId() + ", from " + b.getStartTime() + ", to " + b.getEndTime() + ", license place: " + b.getLicensePlate());
    }

    private JPanel createPaymentPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    
        JLabel instructionLabel = new JLabel("Please select existing booking from the list.");
        paymentModel = new DefaultListModel<>();
        JList<String> bookingList = new JList<>(paymentModel);
        updatePaymentModel();
        JScrollPane scrollPane = new JScrollPane(bookingList);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        JLabel amountLabel = new JLabel("Amount Due:");
        // JTextField amountField = new JTextField(15);
        JLabel toPayLabel = new JLabel();
        JLabel deductedLabel = new JLabel("Deposit deducted?");
        JLabel deductedFlagLabel = new JLabel();
        JLabel paymentMethodLabel = new JLabel("Payment Method:");
        JComboBox<String> paymentMethodField = new JComboBox<>(Payment.PAYMENT_TYPES);
        JButton payButton = new JButton("Make A Payment");
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        panel.add(amountLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(toPayLabel, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        panel.add(deductedLabel, gbc);

        gbc.gridx = 1;
        panel.add(deductedFlagLabel, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        panel.add(paymentMethodLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(paymentMethodField, gbc);

        gbc.gridwidth = 2;
        gbc.gridy = 5;
        gbc.gridx = 0;
        panel.add(payButton, gbc);
        
//        gbc.gridy = 6;
//        panel.add(spacer, gbc);
        
        gbc.gridy = 7;
        panel.add(backButton, gbc);

        bookingList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && bookingList.getSelectedIndex() != -1) {
                String booking = bookingList.getSelectedValue();
                Command<Booking> getBookingById = new GetBookingByIdCommand(controller, Integer.parseInt(booking.split(", ")[0]));
                invoker.setCommand(getBookingById);
                Booking bookingObj = (Booking) invoker.executeCommand().getResult();
                if (bookingObj.getEndTime().after(new Date())) {
                    JOptionPane.showMessageDialog(frame, "You can't pay for a booking that hasn't ended yet.");
                    bookingList.clearSelection();
                    toPayLabel.setText("");
                    deductedFlagLabel.setText("");
                    return;
                }
                if (bookingObj.getStatus().equals("paid")) {
                    JOptionPane.showMessageDialog(frame, "This booking has already been paid for.");
                    bookingList.clearSelection();
                    toPayLabel.setText("");
                    deductedFlagLabel.setText("");
                    return;
                }
                toPayLabel.setText(String.format("$%.2f", bookingObj.getRemainingAmount()) );
                boolean deductedFlag = bookingObj.isCheckedIn() && bookingObj.getCheckInTime().getTime() - bookingObj.getStartTime().getTime() < 3600000;
                deductedFlagLabel.setText(deductedFlag ? "Yes" : "No");
                deductedFlagLabel.setForeground(deductedFlag ? java.awt.Color.GREEN : java.awt.Color.RED);
            }
        });

        payButton.addActionListener(_ -> {
           if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a booking first.");
                return;
           }
           String booking = bookingList.getSelectedValue();
           Command<Booking> getBookingById = new GetBookingByIdCommand(controller, Integer.parseInt(booking.split(", ")[0]));
           invoker.setCommand(getBookingById);
           Booking bookingObj = (Booking) invoker.executeCommand().getResult();
           Command<Void> addPayment = new AddPaymentCommand(controller, bookingObj.getRemainingAmount(), (String) paymentMethodField.getSelectedItem(), bookingObj.getBookingId());
           invoker.setCommand(addPayment);
           invoker.executeCommand();
           JOptionPane.showMessageDialog(frame, "Payment successful. You paid: " + String.format("$%.2f", bookingObj.getRemainingAmount()));
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
    }

    private void updateParkingSpaceBookingModel() {
        parkingSpaceBookingModel.clear();
        Command<List<ParkingSpace>> getAvailableParkingSpaceList = new GetAvailableParkingSpaceListCommand(controller);
        invoker.setCommand(getAvailableParkingSpaceList);
        List<ParkingSpace> availableParkingSpaceList = (List<ParkingSpace>) invoker.executeCommand().getResult();
        // for (ParkingSpace p : controller.getAvailableParkingSpaceList())
        for (ParkingSpace p : availableParkingSpaceList) {
            parkingSpaceBookingModel.addElement(p.getParkingSpaceId() + ", " + p.getParkingLotId() + ", available");
        }
    }

    private JPanel createParkingSpaceBookingPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel instructionLabel = new JLabel("Please select a parking space from the list.");
        parkingSpaceBookingModel = new DefaultListModel<>();
        JList<String> bookingList = new JList<>(parkingSpaceBookingModel);
        updateParkingSpaceBookingModel();
        JScrollPane scrollPane = new JScrollPane(bookingList);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.MINUTE);
        JSpinner fromTimeSpinner = new JSpinner(model);
        fromTimeSpinner.setEditor(new JSpinner.DateEditor(fromTimeSpinner, "yyyy-MM-dd HH:mm"));
        JLabel fromLabel = new JLabel("From:");
        JLabel licenseLabel = new JLabel("License Plate:");
        JTextField licenseField = new JTextField(15);
        JLabel paymentMethodLabel = new JLabel("Deposit Payment Method:");
        JComboBox<String> paymentMethodField = new JComboBox<>(Payment.PAYMENT_TYPES);
        JButton bookButton = new JButton("Book Space");
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        panel.add(fromLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(fromTimeSpinner, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        panel.add(licenseLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(licenseField, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        panel.add(paymentMethodLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(paymentMethodField, gbc);

        gbc.gridwidth = 2;
        gbc.gridy = 5;
        gbc.gridx = 0;
        panel.add(bookButton, gbc);
        
        gbc.gridy = 6;
        panel.add(spacer, gbc);
        
        gbc.gridy = 7;
        panel.add(backButton, gbc);

        bookButton.addActionListener(_ -> {
            if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking space first.");
                return;
            }
            String booking = bookingList.getSelectedValue();
            try {
                if (licenseField.getText().isEmpty()) {
                    throw new IllegalArgumentException("License plate can't be empty.");
                }
                if (licenseField.getText().length() != 7) {
                    throw new IllegalArgumentException("License plate must be 7 characters long.");
                }
                if (!licenseField.getText().matches("^[A-Za-z]{4}\\d{3}$")) {
                    throw new IllegalArgumentException("License plate must be in the standard Ontario Passenger Plate format. For example: CEFN107");
                }
                Date fromTime = (Date) fromTimeSpinner.getValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fromTime);
                calendar.add(Calendar.HOUR, 1);
                Date toTime = calendar.getTime();
                Command<Void> bookParkingSpace = new BookParkingSpaceCommand(
                        controller,
                        currUserEmail,
                        Integer.parseInt(booking.split(", ")[0]),
                        Integer.parseInt(booking.split(", ")[1]),
                        licenseField.getText(),
                        fromTime,
                        toTime);
                invoker.setCommand(bookParkingSpace);
                invoker.executeCommand();
                Command<User> getUserById = new GetUserCommand(controller, currUserEmail);
                invoker.setCommand(getUserById);
                Client client = (Client) invoker.executeCommand().getResult();
                JOptionPane.showMessageDialog(frame, String.format("Parking space was successfully booked! A deposit of $%.2f was made.", client.getRate()));
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Couldn't process the booking: " + e.getMessage());
            }
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
        
    }

    private void updateParkingSpaceBookingManagementModel() {
        parkingSpaceBookingManagementModel.clear();
        Command<List<Booking>> getBookingsForUser = new GetBookingsForUserCommand(controller, currUserEmail);
        invoker.setCommand(getBookingsForUser);
        List<Booking> bookings = (List<Booking>) invoker.executeCommand().getResult();
        for (Booking b : bookings) {
            Command<ParkingLot> getParkingLotById = new GetParkingLotByIdCommand(controller, b.getParkingLotId());
            invoker.setCommand(getParkingLotById);
            ParkingLot parkingLot = (ParkingLot) invoker.executeCommand().getResult();
//            ParkingLot parkingLot = getParkingLotById.execute().getResult();
            parkingSpaceBookingManagementModel.addElement("Booking: " + b.getBookingId()+ ", Space: " + b.getParkingSpaceId() + ", LotID: " + b.getParkingLotId() + ", Lot Name: " + parkingLot.getLocation() + ", From: " + b.getStartTime() + ", To: " + b.getEndTime() + ", License Place: " + b.getLicensePlate() + ", Checked in: " + b.isCheckedIn());
        }
    }

    private JPanel createParkingSpaceBookingManagementPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel instructionLabel = new JLabel("Please select existing booking from the list.");
        parkingSpaceBookingManagementModel = new DefaultListModel<>();
        JList<String> bookingList = new JList<>(parkingSpaceBookingManagementModel);
        updateParkingSpaceBookingManagementModel();
        JScrollPane scrollPane = new JScrollPane(bookingList);
        scrollPane.setPreferredSize(new Dimension(300, 140));
        JButton cancelButton = new JButton("Cancel Booking");
        JButton modifyButton = new JButton("Apply Changes");
        JButton extendButton = new JButton("Extend Booking by 1 Hour");
        JButton checkInButton = new JButton("Check In");
        Dimension buttonSize = new Dimension(200, 25);
        cancelButton.setPreferredSize(buttonSize);
        modifyButton.setPreferredSize(buttonSize);
        extendButton.setPreferredSize(buttonSize);
        checkInButton.setPreferredSize(buttonSize);
        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.MINUTE);
        JSpinner fromTimeSpinner = new JSpinner(model);
        fromTimeSpinner.setEditor(new JSpinner.DateEditor(fromTimeSpinner, "yyyy-MM-dd HH:mm"));
        JLabel fromLabel = new JLabel("New From:");
        JLabel licenseLabel = new JLabel("New License Plate:");
        JTextField licenseField = new JTextField(15);
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        panel.add(fromLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(fromTimeSpinner, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        panel.add(licenseLabel, gbc);
        
        gbc.gridx = 1;
        panel.add(licenseField, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        panel.add(cancelButton, gbc);

        gbc.gridx = 1;
        panel.add(modifyButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(extendButton, gbc);

        gbc.gridx = 1;
        panel.add(checkInButton, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        panel.add(spacer, gbc);
        
        gbc.gridy = 7;
        panel.add(backButton, gbc);

        modifyButton.addActionListener(_ -> {
            if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a booking first.");
                return;
            }
            String booking = bookingList.getSelectedValue();
            try {
                if (licenseField.getText().isEmpty()) {
                    throw new IllegalArgumentException("License plate can't be empty.");
                }
                if (licenseField.getText().length() != 7) {
                    throw new IllegalArgumentException("License plate must be 7 characters long.");
                }
                if (!licenseField.getText().matches("^[A-Za-z]{4}\\d{3}$")) {
                    throw new IllegalArgumentException("License plate must be in the standard Ontario Passenger Plate format: ABCD123");
                }
                Date fromTime = (Date) fromTimeSpinner.getValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fromTime);
                calendar.add(Calendar.HOUR, 1);
                Date toTime = calendar.getTime();
                Command<Void> modifyParkingSpaceBooking = new ModifyParkingSpaceBookingCommand(
                        controller,
                        currUserEmail,
                        Integer.parseInt(booking.split(", ")[0].substring(9)),
                        Integer.parseInt(booking.split(", ")[1].substring(7)),
                        Integer.parseInt(booking.split(", ")[2].substring(7)),
                        licenseField.getText(),
                        fromTime,
                        toTime);
                invoker.setCommand(modifyParkingSpaceBooking);
                invoker.executeCommand();
//                modifyParkingSpaceBooking.execute();
                JOptionPane.showMessageDialog(frame, "Parking Space was successfully modified!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Couldn't modify the booking: " + e.getMessage());
            }
        });

        cancelButton.addActionListener(_ -> {
            if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a booking first.");
                return;
            }
            String booking = bookingList.getSelectedValue();
            try {
                Command<Void> cancelParkingSpaceBooking = new CancelParkingSpaceBookingCommand(
                        controller,
                        currUserEmail,
                        Integer.parseInt(booking.split(", ")[2].substring(7)),
                        Integer.parseInt(booking.split(", ")[1].substring(7)));
                invoker.setCommand(cancelParkingSpaceBooking);
                invoker.executeCommand();
                JOptionPane.showMessageDialog(frame, "Parking Space was successfully canceled!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Couldn't cancel the booking: " + e.getMessage());
            }
        });

        extendButton.addActionListener(_ -> {
            if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a booking first.");
                return;
            }
            String booking = bookingList.getSelectedValue();
            try {
                Command<Booking> getBookingById = new GetBookingByIdCommand(controller, Integer.parseInt(booking.split(", ")[0].substring(9)));
                invoker.setCommand(getBookingById);
                Booking bookingObj = (Booking) invoker.executeCommand().getResult();
//                Booking bookingObj = getBookingById.execute().getResult();

                if (bookingObj.getEndTime().before(new Date())) {
                    throw new IllegalArgumentException("You can't extend a booking that has already ended.");
                }

                Date newEndTime = new Date(bookingObj.getEndTime().getTime() + 3600000); // Add 1 hour
                Command<Void> modifyParkingSpaceBooking = new ModifyParkingSpaceBookingCommand(
                        controller,
                        currUserEmail,
                        bookingObj.getBookingId(),
                        bookingObj.getParkingSpaceId(),
                        bookingObj.getParkingLotId(),
                        bookingObj.getLicensePlate(),
                        bookingObj.getStartTime(),
                        newEndTime);
                invoker.setCommand(modifyParkingSpaceBooking);
                invoker.executeCommand();
//                modifyParkingSpaceBooking.execute();
                JOptionPane.showMessageDialog(frame, "Booking was successfully extended by 1 hour!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Couldn't extend the booking: " + e.getMessage());
            }
        });

        checkInButton.addActionListener(_ -> {
            if (bookingList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a booking first.");
                return;
            }
            String booking = bookingList.getSelectedValue();
            if (booking.split(", ")[7].substring(12).equals("true")) {
                JOptionPane.showMessageDialog(frame, "You have already checked in!");
                return;
            }
            try {
                Command<Booking> getBookingById = new GetBookingByIdCommand(controller, Integer.parseInt(booking.split(", ")[0].substring(9)));
                invoker.setCommand(getBookingById);
                Booking bookingObj = (Booking) invoker.executeCommand().getResult();
//                Booking bookingObj = getBookingById.execute().getResult();
                if (bookingObj.getEndTime().before(new Date())) {
                    throw new IllegalArgumentException("You can't check in after the booking has ended.");
                }
                if (bookingObj.getStartTime().before(new Date())) {
                    Command<Void> checkIn = new CheckInToBookingCommand(
                            controller,
                            bookingObj);
                    invoker.setCommand(checkIn);
                    invoker.executeCommand();
//                    checkIn.execute();
                    if (bookingObj.getCheckInTime().getTime() - bookingObj.getStartTime().getTime() < 3600000)
                        JOptionPane.showMessageDialog(frame, "You have successfully checked in!");
                    else
                        JOptionPane.showMessageDialog(frame, "You have successfully checked in! No-show in the first hour so deposit fee will not be deducted.");
                } else {
                    throw new IllegalArgumentException("You can't check in before the booking time.");
                }
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Couldn't check in: " + e.getMessage());
            }
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
        
    }
   
    private void updateParkingLotManagementModel() {
        parkingLotManagementModel.clear();
        Command<List<ParkingLot>> getParkingLotList = new GetParkingLotListCommand(controller);
        invoker.setCommand(getParkingLotList);
        List<ParkingLot> parkingLots = (List<ParkingLot>) invoker.executeCommand().getResult();
//        List<ParkingLot> parkingLots = getParkingLotList.execute().getResult();
        // for (ParkingLot p : controller.getParkingLotList())
        for (ParkingLot p : parkingLots)
            parkingLotManagementModel.addElement(p.getParkingLotId() + ", " + p.getLocation() + ", " + (p.isEnabled()? "enabled" : "disabled"));
       
    }

    private JPanel createParkingLotManagementPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel instructionLabel = new JLabel("Please select a parking lot from the list or add a new one.");
        parkingLotManagementModel = new DefaultListModel<>();
        JList<String> parkingLotList = new JList<>(parkingLotManagementModel);
        updateParkingLotManagementModel();
        JScrollPane scrollPane = new JScrollPane(parkingLotList);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        JButton manageParkingSpaceButton = new JButton("Manage Parking Spaces in this Lot");
        JButton disableButton = new JButton("Disable Parking Lot");
        JButton enableButton = new JButton("Enable Parking Lot");
        JButton addButton = new JButton("Add A New Parking Lot");
        Dimension buttonSize = new Dimension(200, 25);
        disableButton.setPreferredSize(buttonSize);
        enableButton.setPreferredSize(buttonSize);
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        panel.add(manageParkingSpaceButton, gbc);

        gbc.gridy = 3;
        panel.add(addButton, gbc);
        
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(disableButton, gbc);
        
        gbc.gridx = 1;
        panel.add(enableButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(spacer, gbc);
        
        gbc.gridy = 6;
        panel.add(backButton, gbc);

        addButton.addActionListener(_ -> {
            String location = JOptionPane.showInputDialog(frame, "Enter the location of the new parking lot:");
            if (location == null) return;
            // controller.createParkingLot(location);
            Command<Void> createParkingLot = new CreateParkingLotCommand(controller, location);
            invoker.setCommand(createParkingLot);
            Result<Void> result = (Result<Void>) invoker.executeCommand();
//            Result<Void> result = createParkingLot.execute();
            if (result == null) {
                JOptionPane.showMessageDialog(frame, "Parking lot was successfully added!");
                // updateParkingLotManagementModel();
            } else {
                JOptionPane.showMessageDialog(frame, "Couldn't add the parking lot: " + result.getMessage());
            }
        });

        disableButton.addActionListener(_ -> {
            if (parkingLotList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking lot first.");
                return;
            }
            String parkingLot = parkingLotList.getSelectedValue();
            controller.disableParkingLotById(Integer.parseInt(parkingLot.split(", ")[0]));
            JOptionPane.showMessageDialog(frame, "Parking lot was successfully disabled!");
            // updateParkingLotManagementModel();
        });

        enableButton.addActionListener(_ -> {
            if (parkingLotList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking lot first.");
                return;
            }
            String parkingLot = parkingLotList.getSelectedValue();
            controller.enableParkingLotById(Integer.parseInt(parkingLot.split(", ")[0]));
            JOptionPane.showMessageDialog(frame, "Parking lot was successfully enabled!");
            // updateParkingLotManagementModel();
        });

        manageParkingSpaceButton.addActionListener(_ -> {
            if (parkingLotList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking lot first.");
                return;
            }
            String parkingLot = parkingLotList.getSelectedValue();
            currParkingLot = Integer.parseInt(parkingLot.split(", ")[0]);
            prevPanels.push("ParkingLotManagement");
            updateparkingSpaceManagementModel();
            cardLayout.show(mainPanel, "ParkingSpaceManagement");
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
    }

    private void updateparkingSpaceManagementModel() {
        parkingSpaceManagementModel.clear();
        // ParkingLot currPL = controller.getParkingLotById(currParkingLot);
        Command<ParkingLot> getParkingLotById = new GetParkingLotByIdCommand(controller, currParkingLot);
        invoker.setCommand(getParkingLotById);
        ParkingLot currPL = (ParkingLot) invoker.executeCommand().getResult();
//        ParkingLot currPL = getParkingLotById.execute().getResult();
        
        if (currPL != null)
            for (ParkingSpace p : currPL.getSpaces())
                parkingSpaceManagementModel.addElement(p.getParkingSpaceId() + ", " + p.getParkingLotId() + ", " + p.getStatus());
       
    }

    private JPanel createParkingSpaceManagementPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel instructionLabel = new JLabel("Please select a parking space from the list.");
        parkingSpaceManagementModel = new DefaultListModel<>();
        JList<String> parkingSpaceList = new JList<>(parkingSpaceManagementModel);
        updateparkingSpaceManagementModel();
        JScrollPane scrollPane = new JScrollPane(parkingSpaceList);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        JButton disableButton = new JButton("Disable Parking Space");
        JButton enableButton = new JButton("Enable Parking Space");
        Dimension buttonSize = new Dimension(200, 25);
        disableButton.setPreferredSize(buttonSize);
        enableButton.setPreferredSize(buttonSize);
        JButton backButton = new JButton("Back");
        JLabel spacer = new JLabel(" ");
        spacer.setPreferredSize(new Dimension(0, 20));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(instructionLabel, gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(disableButton, gbc);
        
        gbc.gridx = 1;
        panel.add(enableButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(spacer, gbc);
        
        gbc.gridy = 4;
        panel.add(backButton, gbc);

        enableButton.addActionListener(_ -> {
            if (parkingSpaceList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking space first.");
                return;
            }
            String parkingSpace = parkingSpaceList.getSelectedValue();
            controller.enableParkingSpaceById(currParkingLot, Integer.parseInt(parkingSpace.split(", ")[0]));
            JOptionPane.showMessageDialog(frame, "Parking lot was successfully enabled!");
            // updateparkingSpaceManagementModel();
        });

        disableButton.addActionListener(_ -> {
            if (parkingSpaceList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(frame, "Please select a parking space first.");
                return;
            }
            String parkingSpace = parkingSpaceList.getSelectedValue();
            controller.disableParkingSpaceById(currParkingLot, Integer.parseInt(parkingSpace.split(", ")[0]));
            JOptionPane.showMessageDialog(frame, "Parking lot was successfully disabled!");
            // updateparkingSpaceManagementModel();
        });

        backButton.addActionListener(_ -> {
            cardLayout.show(mainPanel, prevPanels.pop());
        });
        
        return panel;
    }

    @Override
    public void update(String tableName) {
        // Update the corresponding model based on the table name
        switch (tableName) {
            case "Users" -> updateUserApprovalModel();
            case "Bookings" -> {
                updateParkingSpaceBookingManagementModel();
                updateParkingSpaceBookingModel();
            }
            case "ParkingLots" -> updateParkingLotManagementModel();
            case "ParkingSpaces" -> updateparkingSpaceManagementModel();
            case "Payments" -> updatePaymentModel();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch(UnsupportedLookAndFeelException e ) {
            System.err.println( "Failed to initialize LaF" );
        }
        SwingUtilities.invokeLater(ParkingSystemGUI::new);
    }
}