package com.parkingbookingsystem;

import com.parkingbookingsystem.commands.Result;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

import com.parkingbookingsystem.ParkingSpace.ParkingStatus;

public class ParkingSystemTest {

    @BeforeClass
    public static void setUp() {
        File dir = new File("src/main/java/data");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
    }

    @Test
    public void testUserCreation() {
        User user = new User("john.doe@example.com", "Password@123", "Client");
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("Password@123", user.getPassword());
        assertEquals("Client", user.getType());
    }

    @Test
    public void testUserCanLogin() {
        User user = new User("jane.doe@example.com", "SecurePass!1", "Client");
        assertTrue(user.canLogin("SecurePass!1"));
        assertFalse(user.canLogin("WrongPass"));
    }

    @Test
    public void testUserSetters() {
        User user = new User("alice@example.com", "InitialPass1!", "Client");
        user.setEmail("alice.new@example.com");
        user.setPassword("NewPass@123");
        user.setType("Admin");

        assertEquals("alice.new@example.com", user.getEmail());
        assertEquals("NewPass@123", user.getPassword());
        assertEquals("Admin", user.getType());
    }

    @Test
    public void testUserEquality() {
        User user1 = new User("bob@example.com", "Password1!", "Client");
        User user2 = new User("bob@example.com", "Password1!", "Client");
        User user3 = new User("charlie@example.com", "Password2@", "Admin");

        assertEquals(user1, user2);
        assertNotEquals(user1, user3);
        assertEquals(user1, user1);
        assertNotEquals(user1, new Object());
    }

    @Test
    public void testUserHashCode() {
        User user1 = new User("dave@example.com", "Password1!", "Client");
        User user2 = new User("dave@example.com", "Password1!", "Client");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void testUserToString() {
        User user = new User("eve@example.com", "Password1!", "Client");
        String expected = "{ email='eve@example.com', password='Password1!', type='Client' }";
        assertEquals(expected, user.toString());
    }

    @Test
    public void testPasswordValidation() {
        assertTrue(User.passwordValid("Valid1!"));
        assertFalse(User.passwordValid("invalid"));
        assertFalse(User.passwordValid("INVALID1!"));
        assertFalse(User.passwordValid("valid1!"));
        assertFalse(User.passwordValid("Valid!"));
    }

    @Test
    public void testClientEmailValidation() {
        assertTrue(User.clientEmailValid("valid.email@example.com"));
        assertFalse(User.clientEmailValid("invalid.email@parking.system"));
        assertFalse(User.clientEmailValid("invalid.email@.com"));
        assertFalse(User.clientEmailValid("invalid.email@com"));
    }

    @Test
    public void testSerializeUser() {
        User user = new User("serialize@example.com", "Password1!", "Client");
        String[] serialized = user.serialize();
        assertArrayEquals(new String[]{"serialize@example.com", "Password1!", "Client"}, serialized);
    }

    /* Visitor class tests */

    @Test
    public void testVisitorCreation() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        assertEquals("visitor@example.com", visitor.getEmail());
        assertEquals("Password@123", visitor.getPassword());
        assertEquals(Visitor.TYPE, visitor.getType());
        assertTrue(visitor.isValidated());
    }
    @Test
    public void testVisitorRate() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        assertEquals(15, visitor.getRate(), 0);
    }

    @Test
    public void testVisitorValidation() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        assertTrue(visitor.isValidated());
        visitor.invalidate();
        assertFalse(visitor.isValidated());
        visitor.validate();
        assertTrue(visitor.isValidated());
    }
    @Test
    public void testVisitorCanLogin() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        assertTrue(visitor.canLogin("Password@123"));
        visitor.invalidate();
        assertFalse(visitor.canLogin("Password@123"));
    }

    @Test
    public void testVisitorSetters() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        visitor.setEmail("newvisitor@example.com");
        visitor.setPassword("NewPassword@123");
        visitor.setType("NewType");

        assertEquals("newvisitor@example.com", visitor.getEmail());
        assertEquals("NewPassword@123", visitor.getPassword());
        assertEquals("NewType", visitor.getType());
    }
    @Test
    public void testVisitorEquality() {
        Visitor visitor1 = new Visitor("visitor1@example.com", "Password@123");
        Visitor visitor2 = new Visitor("visitor1@example.com", "Password@123");
        Visitor visitor3 = new Visitor("visitor2@example.com", "Password@123");

        assertEquals(visitor1, visitor2);
        assertNotEquals(visitor1, visitor3);
    }

    @Test
    public void testVisitorHashCode() {
        Visitor visitor1 = new Visitor("visitor@example.com", "Password@123");
        Visitor visitor2 = new Visitor("visitor@example.com", "Password@123");

        assertEquals(visitor1.hashCode(), visitor2.hashCode());
    }

    @Test
    public void testVisitorToString() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        String expected = "{ email='visitor@example.com', password='Password@123', type='Visitor' }";
        assertEquals(expected, visitor.toString());
    }

    @Test
    public void testVisitorSerialize() {
        Visitor visitor = new Visitor("visitor@example.com", "Password@123");
        String[] serialized = visitor.serialize();
        assertArrayEquals(new String[]{"visitor@example.com", "Password@123", "Visitor", "true"}, serialized);
    }


    /* Student class tests */

    @Test
    public void testStudentCreation() {
        Student student = new Student("student@example.com", "Password@123");
        assertEquals("student@example.com", student.getEmail());
        assertEquals("Password@123", student.getPassword());
        assertEquals(Student.TYPE, student.getType());
        assertFalse(student.isValidated());
    }

    @Test
    public void testStudentRate() {
        Student student = new Student("student@example.com", "Password@123");
        assertEquals(5, student.getRate(), 0);
    }

    @Test
    public void testStudentValidation() {
        Student student = new Student("student@example.com", "Password@123");
        assertFalse(student.isValidated());
        student.validate();
        assertTrue(student.isValidated());
        student.invalidate();
        assertFalse(student.isValidated());
    }

    @Test
    public void testStudentCanLogin() {
        Student student = new Student("student@example.com", "Password@123");
        assertFalse(student.canLogin("Password@123"));
        student.validate();
        assertTrue(student.canLogin("Password@123"));
    }

    @Test
    public void testStudentSerialize() {
        Student student = new Student("student@example.com", "Password@123");
        String[] serialized = student.serialize();
        assertArrayEquals(new String[]{"student@example.com", "Password@123", Student.TYPE, "false"}, serialized);
        student.validate();
        serialized = student.serialize();
        assertArrayEquals(new String[]{"student@example.com", "Password@123", Student.TYPE, "true"}, serialized);
    }

    /* Faculty class tests */

    @Test
    public void testFacultyCreation() {
        Faculty faculty = new Faculty("faculty@example.com", "Password@123");
        assertEquals("faculty@example.com", faculty.getEmail());
        assertEquals("Password@123", faculty.getPassword());
        assertEquals(Faculty.TYPE, faculty.getType());
        assertFalse(faculty.isValidated());
    }

    @Test
    public void testFacultyRate() {
        Faculty faculty = new Faculty("faculty@example.com", "Password@123");
        assertEquals(8, faculty.getRate(), 0);
    }

    @Test
    public void testFacultyValidation() {
        Faculty faculty = new Faculty("faculty@example.com", "Password@123");
        assertFalse(faculty.isValidated());
        faculty.validate();
        assertTrue(faculty.isValidated());
        faculty.invalidate();
        assertFalse(faculty.isValidated());
    }

    @Test
    public void testFacultyCanLogin() {
        Faculty faculty = new Faculty("faculty@example.com", "Password@123");
        assertFalse(faculty.canLogin("Password@123"));
        faculty.validate();
        assertTrue(faculty.canLogin("Password@123"));
    }

    @Test
    public void testFacultySerialize() {
        Faculty faculty = new Faculty("faculty@example.com", "Password@123");
        String[] serialized = faculty.serialize();
        assertArrayEquals(new String[]{"faculty@example.com", "Password@123", Faculty.TYPE, "false"}, serialized);
        faculty.validate();
        serialized = faculty.serialize();
        assertArrayEquals(new String[]{"faculty@example.com", "Password@123", Faculty.TYPE, "true"}, serialized);
    }

    /* Staff class tests */

    @Test
    public void testStaffCreation() {
        Staff staff = new Staff("staff@example.com", "Password@123");
        assertEquals("staff@example.com", staff.getEmail());
        assertEquals("Password@123", staff.getPassword());
        assertEquals(Staff.TYPE, staff.getType());
        assertFalse(staff.isValidated());
    }

    @Test
    public void testStaffRate() {
        Staff staff = new Staff("staff@example.com", "Password@123");
        assertEquals(10, staff.getRate(), 0);
    }

    @Test
    public void testStaffValidation() {
        Staff staff = new Staff("staff@example.com", "Password@123");
        assertFalse(staff.isValidated());
        staff.validate();
        assertTrue(staff.isValidated());
        staff.invalidate();
        assertFalse(staff.isValidated());
    }

    @Test
    public void testStaffCanLogin() {
        Staff staff = new Staff("staff@example.com", "Password@123");
        assertFalse(staff.canLogin("Password@123"));
        staff.validate();
        assertTrue(staff.canLogin("Password@123"));
        assertFalse(staff.canLogin("invalidPassword"));
    }

    @Test
    public void testStaffSerialize() {
        Staff staff = new Staff("staff@example.com", "Password@123");
        String[] serialized = staff.serialize();
        assertArrayEquals(new String[]{"staff@example.com", "Password@123", Staff.TYPE, "false"}, serialized);
        staff.validate();
        serialized = staff.serialize();
        assertArrayEquals(new String[]{"staff@example.com", "Password@123", Staff.TYPE, "true"}, serialized);
    }

    /* Manager class tests */

    @Test
    public void testManagerCreation() {
        Manager manager = new Manager("manager@example.com", "Password@123");
        assertEquals("manager@example.com", manager.getEmail());
        assertEquals("Password@123", manager.getPassword());
        assertEquals(Manager.TYPE, manager.getType());
    }

    @Test
    public void testManagerType() {
        Manager manager = new Manager("manager@example.com", "Password@123");
        assertEquals(Manager.TYPE, manager.getType());
    }

    /* SuperManager class tests */

    @Test
    public void testSuperManagerCreation() {
        SuperManager superManager = SuperManager.getInstance("super@parking.system", "SManager@1234");
        assertEquals("super@parking.system", superManager.getEmail());
        assertEquals("SManager@1234", superManager.getPassword());
        assertEquals(SuperManager.TYPE, superManager.getType());
    }

    @Test
    public void testSuperManagerSingleton() {
        SuperManager firstInstance = SuperManager.getInstance("super@parking.system", "SManager@1234");
        SuperManager secondInstance = SuperManager.getInstance("another@example.com", "AnotherPassword@123");
        assertSame(firstInstance, secondInstance);
        assertEquals("super@parking.system", secondInstance.getEmail());
        assertEquals("SManager@1234", secondInstance.getPassword());
    }

    @Test
    public void testSuperManagerType() {
        SuperManager superManager = SuperManager.getInstance("super@parking.system", "SManager@1234");
        assertEquals(SuperManager.TYPE, superManager.getType());
    }

    /* UserFactory class tests */

    @Test
    public void testCreateStaff() {
        User user = UserFactory.createUser("staff@example.com", "pass", "Non-Faculty Staff");
        assertTrue(user instanceof Staff);
        assertEquals("Non-Faculty Staff", user.getType());
        assertFalse(((Client) user).isValidated());
    }

    @Test
    public void testCreateStudent() {
        User user = UserFactory.createUser("student@example.com", "pass", "Student");
        assertTrue(user instanceof Student);
        assertEquals("Student", user.getType());
        assertFalse(((Client) user).isValidated());
    }

    @Test
    public void testCreateVisitor() {
        User user = UserFactory.createUser("visitor@example.com", "pass", "Visitor");
        assertTrue(user instanceof Visitor);
        assertEquals("Visitor", user.getType());
        assertTrue(((Client) user).isValidated()); // Visitor constructor sets validated = true
    }

    @Test
    public void testCreateFaculty() {
        User user = UserFactory.createUser("faculty@example.com", "pass", "Faculty");
        assertTrue(user instanceof Faculty);
        assertEquals("Faculty", user.getType());
        assertFalse(((Client) user).isValidated());
    }

    @Test
    public void testCreateManager() {
        User user = UserFactory.createUser("manager@example.com", "pass", "Manager");
        assertEquals("Manager", user.getType());
    }

    @Test
    public void testCreateSuperManager() {
        User user = UserFactory.createUser("super@example.com", "pass", "Super Manager");
        assertEquals("Super Manager", user.getType());
    }

    @Test
    public void testValidateTrueFlag_setsValidatedTrue() {
        User user = UserFactory.createUser("student2@example.com", "pass", "Student", "true");
        assertTrue(((Client) user).isValidated());
    }

    @Test
    public void testValidateFalseFlag_remainsFalse() {
        User user = UserFactory.createUser("student2@example.com", "pass", "Student", "false");
        assertFalse(((Client) user).isValidated());
    }

    @Test
    public void testInvalidType_returnsNull() {
        User user = UserFactory.createUser("invalid@example.com", "pass", "Alien");
        assertNull(user);
    }

    @Test
    public void testGetAllClientTypes() {
        String[] expected = { "Non-Faculty Staff", "Student", "Visitor", "Faculty" };
        assertArrayEquals(expected, UserFactory.getAllClientTypes());
    }

    /* Sensor class tests */

    @Test
    public void testSensorCreation() {
        Sensor sensor = new Sensor(1, 101);
        assertEquals(1, sensor.getSensorId());
        assertEquals(101, sensor.getParkingSpaceId());
        assertFalse(sensor.isCarDetected());
    }

    @Test
    public void testSetCarDetected() {
        Sensor sensor = new Sensor(1, 101);
        sensor.setCarDetected(true);
        assertTrue(sensor.isCarDetected());
        sensor.setCarDetected(false);
        assertFalse(sensor.isCarDetected());
    }

    @Test
    public void testSendInfoToSystem() {
        Sensor sensor = new Sensor(1, 101);
        String expectedInfo = "Sensor ID: 1, Parking Space ID: 101, Car Detected: false";
        assertEquals(expectedInfo, sensor.sendInfoToSystem());
        sensor.setCarDetected(true);
        expectedInfo = "Sensor ID: 1, Parking Space ID: 101, Car Detected: true";
        assertEquals(expectedInfo, sensor.sendInfoToSystem());
    }

    @Test
    public void testScanCarInfo() {
        Sensor sensor = new Sensor(1, 101);
        assertNull(sensor.scanCarInfo());
    }

    /* ParkingSpace class tests */

    @Test
    public void testParkingSpaceCreation() {
        Sensor sensor = new Sensor(1, 101);
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor, "A1");
        assertEquals(101, space.getParkingSpaceId());
        assertEquals(ParkingSpace.ParkingStatus.AVAILABLE, space.getStatus());
        assertEquals(1, space.getParkingLotId());
        assertEquals(sensor, space.getSensor());
        assertEquals("A1", space.getLocation());
    }

    @Test
    public void testSetParkingSpaceId() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.setParkingSpaceId(102);
        assertEquals(102, space.getParkingSpaceId());
    }

    @Test
    public void testSetParkingSpaceStatus() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.setStatus(ParkingSpace.ParkingStatus.OCCUPIED);
        assertEquals(ParkingSpace.ParkingStatus.OCCUPIED, space.getStatus());
    }

    @Test
    public void testSetParkingLotId() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.setParkingLotId(2);
        assertEquals(2, space.getParkingLotId());
    }

    @Test
    public void testSetSensor() {
        Sensor newSensor = new Sensor(2, 102);
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.setSensor(newSensor);
        assertEquals(newSensor, space.getSensor());
    }

    @Test
    public void testSetLocation() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.setLocation("B2");
        assertEquals("B2", space.getLocation());
    }

    @Test
    public void testEnableParkingSpace() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.OUT_OF_SERVICE, 1, new Sensor(1, 101), "A1");
        space.enable();
        assertEquals(ParkingSpace.ParkingStatus.AVAILABLE, space.getStatus());
    }

    @Test
    public void testDisableParkingSpace() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.disable();
        assertEquals(ParkingSpace.ParkingStatus.OUT_OF_SERVICE, space.getStatus());
    }

    @Test
    public void testSerializeParkingSpace() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        String[] serialized = space.serialize();
        assertArrayEquals(new String[]{"101", "AVAILABLE", "1", "1", "A1"}, serialized);
    }

    @Test
    public void testDeserializeParkingSpace() {
        String[] data = {"101", "AVAILABLE", "1", "1", "A1"};
        ParkingSpace space = ParkingSpace.deserialize(data);
        assertEquals(101, space.getParkingSpaceId());
        assertEquals(ParkingSpace.ParkingStatus.AVAILABLE, space.getStatus());
        assertEquals(1, space.getParkingLotId());
        assertEquals(1, space.getSensor().getSensorId());
        assertEquals("A1", space.getLocation());
    }

    @Test
    public void testParkingSpaceEquals() {
        Sensor sensor1 = new Sensor(1, 101);
        Sensor sensor2 = new Sensor(1, 101);
        ParkingSpace space1 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor1, "A1");
        ParkingSpace space2 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor1, "A1");
        ParkingSpace space3 = new ParkingSpace(102, ParkingSpace.ParkingStatus.OCCUPIED, 2, sensor2, "B2");
        assertEquals(space1, space2);
        assertNotEquals(space1, space3);

        ParkingSpace space4 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 2, sensor1, "A1");
        assertNotEquals(space1, space4);

        ParkingSpace space5 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor2, "A1");
        assertNotEquals(space1, space5);

        ParkingSpace space6 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor1, "B2");
        assertNotEquals(space1, space6);

        ParkingSpace space7 = new ParkingSpace(101, ParkingStatus.OCCUPIED, 1, sensor1, "A1");
        assertNotEquals(space1, space7);
    }

    @Test
    public void testParkingSpaceHashCode() {
        Sensor sensor = new Sensor(1, 101);
        ParkingSpace space1 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor, "A1");
        ParkingSpace space2 = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor, "A1");
        assertEquals(space1.hashCode(), space2.hashCode());
    }

    @Test
    public void testParkingSpaceToString() {
        Sensor sensor = new Sensor(1, 101);
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, sensor, "A1");
        String expected = "{ parkingSpaceId='101', status='AVAILABLE', parkingLotId='1', sensor='" + sensor +"', location='A1'}";
        assertEquals(expected, space.toString());
    }

    @Test
    public void testParkingSpaceIdMethod() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.parkingSpaceId(102);
        assertEquals(102, space.getParkingSpaceId());
    }

    @Test
    public void testParkingSpaceStatusMethod() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.status(ParkingSpace.ParkingStatus.OCCUPIED);
        assertEquals(ParkingSpace.ParkingStatus.OCCUPIED, space.getStatus());
    }

    @Test
    public void testParkingLotIdMethod() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.parkingLotId(2);
        assertEquals(2, space.getParkingLotId());
    }

    @Test
    public void testSensorMethod() {
        Sensor newSensor = new Sensor(2, 102);
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.sensor(newSensor);
        assertEquals(newSensor, space.getSensor());
    }

    @Test
    public void testLocationMethod() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        space.location("B2");
        assertEquals("B2", space.getLocation());
    }

    @Test
    public void testParkingSpaceEqualsSameObject() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        assertTrue(space.equals(space));
    }

    @Test
    public void testParkingSpaceEqualsDifferentClass() {
        ParkingSpace space = new ParkingSpace(101, ParkingSpace.ParkingStatus.AVAILABLE, 1, new Sensor(1, 101), "A1");
        String differentClassObject = "Not a ParkingSpace";
        assertFalse(space.equals(differentClassObject));
    }

    /* ParkingLot class tests */

    @Test
    public void testParkingLotConstructorWithLocation() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertEquals("Downtown", parkingLot.getLocation());
        assertTrue(parkingLot.isEnabled());
        assertNotNull(parkingLot.getSpaces());
        assertEquals(100, parkingLot.getSpaces().length);
    }

    @Test
    public void testParkingLotConstructorWithIdLocationAndEnabled() {
        ParkingLot parkingLot = new ParkingLot(200, "Uptown", false);
        assertEquals(200, parkingLot.getParkingLotId());
        assertEquals("Uptown", parkingLot.getLocation());
        assertFalse(parkingLot.isEnabled());
        assertNotNull(parkingLot.getSpaces());
        assertEquals(100, parkingLot.getSpaces().length);
    }

    @Test
    public void testParkingLotGetSpaces() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertNotNull(parkingLot.getSpaces());
        assertEquals(100, parkingLot.getSpaces().length);
    }

    @Test
    public void testParkingLotSetSpaces() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        ParkingSpace[] newSpaces = new ParkingSpace[50];
        parkingLot.setSpaces(newSpaces);
        assertEquals(50, parkingLot.getSpaces().length);
    }

    @Test
    public void testParkingLotGetParkingSpaceByIdFound() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        ParkingSpace space = parkingLot.getParkingSpaceById(1);
        assertNotNull(space);
        assertEquals(1, space.getParkingSpaceId());
    }

    @Test
    public void testParkingLotGetParkingSpaceByIdNotFound() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        ParkingSpace space = parkingLot.getParkingSpaceById(101);
        assertNull(space);
    }

    @Test
    public void testParkingLotGetAvailableParkingSpaceList() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        List<ParkingSpace> availableSpaces = parkingLot.getAvailableParkingSpaceList();
        assertEquals(100, availableSpaces.size());
        for (ParkingSpace space : availableSpaces) {
            assertEquals(ParkingSpace.ParkingStatus.AVAILABLE, space.getStatus());
        }
    }

    @Test
    public void testParkingLotGetParkingLotId() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertTrue(parkingLot.getParkingLotId() > 0);
    }

    @Test
    public void testParkingLotGetLocation() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertEquals("Downtown", parkingLot.getLocation());
    }

    @Test
    public void testParkingLotSetLocation() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        parkingLot.setLocation("Uptown");
        assertEquals("Uptown", parkingLot.getLocation());
    }

    @Test
    public void testParkingLotIsEnabled() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertTrue(parkingLot.isEnabled());
    }

    @Test
    public void testParkingLotSetEnabled() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        parkingLot.setEnabled(false);
        assertFalse(parkingLot.isEnabled());
    }

    @Test
    public void testParkingLotEnable() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        parkingLot.setEnabled(false);
        parkingLot.enable();
        assertTrue(parkingLot.isEnabled());
    }

    @Test
    public void testParkingLotDisable() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        parkingLot.disable();
        assertFalse(parkingLot.isEnabled());
    }

    @Test
    public void testParkingLotEqualsSameObject() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        assertTrue(parkingLot.equals(parkingLot));
    }

    @Test
    public void testParkingLotEqualsDifferentObject() {
        ParkingLot parkingLot = new ParkingLot("Downtown");
        Object otherObject = new Object();
        assertFalse(parkingLot.equals(otherObject));
    }

    @Test
    public void testParkingLotEqualsSameValues() {
        ParkingLot parkingLot1 = new ParkingLot(200, "Downtown", true);
        ParkingLot parkingLot2 = new ParkingLot(200, "Downtown", true);
        assertTrue(parkingLot1.equals(parkingLot2));
    }

    @Test
    public void testParkingLotEqualsDifferentValues() {
        ParkingLot parkingLot1 = new ParkingLot(200, "Downtown", true);
        ParkingLot parkingLot2 = new ParkingLot(201, "Uptown", false);
        assertFalse(parkingLot1.equals(parkingLot2));
    }

    @Test
    public void testParkingLotHashCode() {
        ParkingLot parkingLot1 = new ParkingLot(200, "Downtown", true);
        ParkingLot parkingLot2 = new ParkingLot(200, "Downtown", true);
        assertEquals(parkingLot1.hashCode(), parkingLot2.hashCode());
    }

    @Test
    public void testParkingLotToString() {
        ParkingLot parkingLot = new ParkingLot(200, "Downtown", true);
        String expected = "{ parkingId='200', location='Downtown', enabled='true'}";
        assertEquals(expected, parkingLot.toString());
    }

    @Test
    public void testParkingLotSerialize() {
        ParkingLot parkingLot = new ParkingLot(200, "Downtown", true);
        String[] serialized = parkingLot.serialize();
        assertArrayEquals(new String[]{"200", "Downtown", "true"}, serialized);
    }

    @Test
    public void testParkingLotDeserialize() {
        String[] data = {"200", "Downtown", "true"};
        ParkingLot parkingLot = ParkingLot.deserialize(data);
        assertEquals(200, parkingLot.getParkingLotId());
        assertEquals("Downtown", parkingLot.getLocation());
        assertTrue(parkingLot.isEnabled());
    }

    /* Booking class tests */

    @Test
    public void testBookingConstructorWithUserIdAndParkingDetails() {
        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 3600000); // 1 hour later
        Booking booking = new Booking("user1", 1, 1, 10.0, startTime, endTime, "ABC123");
        assertEquals("user1", booking.getUserId());
        assertEquals(1, booking.getParkingSpaceId());
        assertEquals(1, booking.getParkingLotId());
        assertEquals(10.0, booking.getDepositAmount(), 0);
        assertEquals(10.0, booking.getRemainingAmount(), 0);
        assertEquals(startTime, booking.getStartTime());
        assertEquals(endTime, booking.getEndTime());
        assertEquals("ABC123", booking.getLicensePlate());
        assertEquals("pending confirmation", booking.getStatus());
        assertFalse(booking.isCheckedIn());
    }

    @Test
    public void testBookingConstructorWithAllFields() {
        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 3600000);
        Date checkInTime = new Date();
        Booking booking = new Booking(1, "user1", 1, 1, 20.0, 10.0, startTime, endTime, checkInTime, true, "ABC123", "confirmed");
        assertEquals(1, booking.getBookingId());
        assertEquals("user1", booking.getUserId());
        assertEquals(1, booking.getParkingSpaceId());
        assertEquals(1, booking.getParkingLotId());
        assertEquals(10.0, booking.getDepositAmount(), 0);
        assertEquals(10.0, booking.getRemainingAmount(), 0);
        assertEquals(startTime, booking.getStartTime());
        assertEquals(endTime, booking.getEndTime());
        assertEquals(checkInTime, booking.getCheckInTime());
        assertTrue(booking.isCheckedIn());
        assertEquals("ABC123", booking.getLicensePlate());
        assertEquals("confirmed", booking.getStatus());
    }

    @Test
    public void testBookingGetRemainingAmountCheckedInWithinOneHour() {
        Date startTime = new Date();
        Date checkInTime = new Date(startTime.getTime() + 1800000); // 30 minutes later
        Booking booking = new Booking("user1", 1, 1, 10.0, startTime, new Date(startTime.getTime() + 3600000), "ABC123");
        booking.setCheckInTime(checkInTime);
        assertEquals(0.0, booking.getRemainingAmount(), 0);
    }

    @Test
    public void testBookingGetRemainingAmountCheckedInAfterOneHour() {
        Date startTime = new Date();
        Date checkInTime = new Date(startTime.getTime() + 7200000); // 2 hours later
        Booking booking = new Booking("user1", 1, 1, 10.0, startTime, new Date(startTime.getTime() + 3600000), "ABC123");
        booking.setCheckInTime(checkInTime);
        assertEquals(10.0, booking.getRemainingAmount(), 0);
    }

    @Test
    public void testBookingSetAndGetLicensePlate() {
        Booking booking = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        booking.setLicensePlate("XYZ789");
        assertEquals("XYZ789", booking.getLicensePlate());
    }

    @Test
    public void testBookingEqualsSameObject() {
        Booking booking = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        assertTrue(booking.equals(booking));
    }

    @Test
    public void testBookingEqualsDifferentObject() {
        Booking booking = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        Object otherObject = new Object();
        assertFalse(booking.equals(otherObject));
    }

    @Test
    public void testBookingEqualsSameValues() {
        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 3600000);
        Booking booking1 = new Booking("user1", 1, 1, 10.0, startTime, endTime, "ABC123");
        Booking booking2 = new Booking("user1", 1, 1, 10.0, startTime, endTime, "ABC123");
        assertTrue(booking1.equals(booking2));
    }

    @Test
    public void testBookingEqualsDifferentValues() {
        Booking booking1 = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        Booking booking2 = new Booking("user2", 2, 2, 20.0, new Date(), new Date(), "XYZ789");
        assertFalse(booking1.equals(booking2));
    }

    @Test
    public void testBookingEqualsBranches() {
        Booking booking1 = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        Booking booking2 = new Booking("user1", 2, 1, 10.0, new Date(), new Date(), "ABC123");
        assertFalse(booking1.equals(booking2));

        Booking booking3 = new Booking("user1", 1, 2, 10.0, new Date(), new Date(), "ABC123");
        assertFalse(booking1.equals(booking3));

        Booking booking5 = new Booking("user1", 1, 1, 10.0, new Date(10), new Date(), "ABC123");
        assertFalse(booking1.equals(booking5));

        Booking booking6 = new Booking("user1", 1, 1, 10.0, new Date(), new Date(10), "ABC123");
        assertFalse(booking1.equals(booking6));
    }

    @Test
    public void testBookingHashCode() {
        Booking booking1 = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        Booking booking2 = new Booking("user1", 1, 1, 10.0, new Date(), new Date(), "ABC123");
        assertNotEquals(booking1.hashCode(), booking2.hashCode());
    }

    @Test
    public void testBookingToString() {
        Booking booking = new Booking(1, "user1", 1, 1, 20.0, 10.0, new Date(), new Date(), new Date(), true, "ABC123", "confirmed");
        String expected = "{ bookingId='1', userId='user1', parkingSpaceId='1', parkingLotId='1', remainingAmount='10.0', depositAmount='10.0', startTime='" + booking.getStartTime() + "', endTime='" + booking.getEndTime() + "', checkInTime='" + booking.getCheckInTime() + "', checkedIn='true', status='confirmed'}";
        assertEquals(expected, booking.toString());
    }

    @Test
    public void testBookingSerialize() {
        Booking booking = new Booking(1, "user1", 1, 1, 20.0, 10.0, new Date(), new Date(), new Date(), true, "ABC123", "confirmed");
        String[] serialized = booking.serialize();
        assertEquals("1", serialized[0]);
        assertEquals("user1", serialized[1]);
        assertEquals("1", serialized[2]);
        assertEquals("1", serialized[3]);
        assertEquals("20.0", serialized[4]);
        assertEquals("10.0", serialized[5]);
        assertEquals(Long.toString(booking.getStartTime().getTime()), serialized[6]);
        assertEquals(Long.toString(booking.getEndTime().getTime()), serialized[7]);
        assertEquals(Long.toString(booking.getCheckInTime().getTime()), serialized[8]);
        assertEquals("checked in", serialized[9]);
        assertEquals("ABC123", serialized[10]);
        assertEquals("confirmed", serialized[11]);
    }

    @Test
    public void testBookingDeserialize() {
        Date startTime = new Date();
        Date endTime = new Date(startTime.getTime() + 3600000);
        Date checkInTime = new Date();
        String[] data = {"1", "user1", "1", "1", "20.0", "10.0", Long.toString(startTime.getTime()), Long.toString(endTime.getTime()), Long.toString(checkInTime.getTime()), "checked in", "ABC123", "confirmed"};
        Booking booking = Booking.deserialize(data);
        assertEquals(1, booking.getBookingId());
        assertEquals("user1", booking.getUserId());
        assertEquals(1, booking.getParkingSpaceId());
        assertEquals(1, booking.getParkingLotId());
        assertEquals(10.0, booking.getRemainingAmount(), 0);
        assertEquals(10.0, booking.getDepositAmount(), 0);
        assertEquals(startTime, booking.getStartTime());
        assertEquals(endTime, booking.getEndTime());
        assertEquals(checkInTime, booking.getCheckInTime());
        assertTrue(booking.isCheckedIn());
        assertEquals("ABC123", booking.getLicensePlate());
        assertEquals("confirmed", booking.getStatus());
    }

    /* Payment class tests */

    @Test
    public void testPaymentConstructorWithUserId() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(101, payment.getPaymentId());
        assertEquals("user1", payment.getUserId());
        assertEquals(1, payment.getBookingId());
        assertEquals(100.0, payment.getAmount(), 0);
        assertEquals("pending", payment.getStatus());
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    public void testPaymentConstructorWithPaymentId() {
        Payment.setCounter(100);
        Payment payment = new Payment(102, "user2", 2, 200.0, "paid", "Debit Card");
        assertEquals(102, payment.getPaymentId());
        assertEquals("user2", payment.getUserId());
        assertEquals(2, payment.getBookingId());
        assertEquals(200.0, payment.getAmount(), 0);
        assertEquals("paid", payment.getStatus());
        assertEquals("Debit Card", payment.getPaymentMethod());
    }

    @Test
    public void testPaymentProcessPayment() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        payment.ProcessPayment();
        assertEquals("paid", payment.getStatus());
    }

    @Test
    public void testPaymentGetPaymentId() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(101, payment.getPaymentId());
    }

    @Test
    public void testPaymentGetUserId() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals("user1", payment.getUserId());
    }

    @Test
    public void testPaymentGetBookingId() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(1, payment.getBookingId());
    }

    @Test
    public void testPaymentGetAmount() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(100.0, payment.getAmount(), 0);
    }

    @Test
    public void testPaymentSetAmount() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        payment.setAmount(200.0);
        assertEquals(200.0, payment.getAmount(), 0);
    }

    @Test
    public void testPaymentGetStatus() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals("pending", payment.getStatus());
    }

    @Test
    public void testPaymentSetStatus() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        payment.setStatus("paid");
        assertEquals("paid", payment.getStatus());
    }

    @Test
    public void testPaymentGetPaymentMethod() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    public void testPaymentSetPaymentMethod() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        payment.setPaymentMethod("Debit Card");
        assertEquals("Debit Card", payment.getPaymentMethod());
    }

    @Test
    public void testPaymentAmount() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(payment, payment.amount(200.0));
        assertEquals(200.0, payment.getAmount(), 1e-15);
    }

    @Test
    public void testPaymentStatus() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(payment, payment.status("paid"));
        assertEquals("paid", payment.getStatus());
    }

    @Test
    public void testPaymentPaymentMethod() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(payment, payment.paymentMethod("Debit Card"));
        assertEquals("Debit Card", payment.getPaymentMethod());
    }

    @Test
    public void testPaymentEquals() {
        Payment.setCounter(100);
        Payment payment1 = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        Payment payment2 = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        assertFalse(payment1.equals(payment2));
        assertTrue(payment1.equals(payment1));
        assertFalse(payment1.equals(new Object()));

        Payment.setCounter(100);
        Payment payment3 = new Payment("user2", 2, 200.0, "paid", "Debit Card");
        assertFalse(payment1.equals(payment3));

        Payment.setCounter(100);
        Payment payment4 = new Payment(101, "user1", 10, 100.0, "pending", "Credit Card");
        assertFalse(payment1.equals(payment4));

        Payment.setCounter(100);
        Payment payment5 = new Payment(101, "user1", 1, 200.0, "pending", "Credit Card");
        assertFalse(payment1.equals(payment5));

        Payment.setCounter(100);
        Payment payment6 = new Payment(101, "user1", 1, 100.0, "paid", "Credit Card");
        assertFalse(payment1.equals(payment6));

        Payment.setCounter(100);
        Payment payment7 = new Payment(101, "user1", 1, 100.0, "pending", "Debit Card");
        assertFalse(payment1.equals(payment7));
    }

    @Test
    public void testPaymentHashCode() {
        Payment.setCounter(100);
        Payment payment1 = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        Payment.setCounter(100);
        Payment payment2 = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        assertEquals(payment1.hashCode(), payment2.hashCode());
    }

    @Test
    public void testPaymentToString() {
        Payment.setCounter(100);
        Payment payment = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        String expected = "{ paymentId='101', userId='user1', bookingId='1', amount='100.0', status='pending', paymentMethod='Credit Card'}";
        assertEquals(expected, payment.toString());
    }

    @Test
    public void testPaymentSerialize() {
        Payment.setCounter(100);
        Payment payment = new Payment(101, "user1", 1, 100.0, "pending", "Credit Card");
        String[] serialized = payment.serialize();
        assertArrayEquals(new String[]{"101", "user1", "1", "100.0", "pending", "Credit Card"}, serialized);
    }

    @Test
    public void testPaymentDeserialize() {
        String[] data = {"101", "user1", "1", "100.0", "pending", "Credit Card"};
        Payment.setCounter(100);
        Payment payment = Payment.deserialize(data);
        assertEquals(101, payment.getPaymentId());
        assertEquals("user1", payment.getUserId());
        assertEquals(1, payment.getBookingId());
        assertEquals(100.0, payment.getAmount(), 0);
        assertEquals("pending", payment.getStatus());
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    /* All Strategy class tests */

    @Test
    public void testCreditCardStrategyCreation() {
        CreditCardStrategy strategy = new CreditCardStrategy();
        assertNotNull(strategy);
    }

    @Test
    public void testCreditCardStrategyProcessPayment() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        CreditCardStrategy strategy = new CreditCardStrategy();
        assertTrue(strategy.processPayment(payment));
    }

    @Test
    public void testDebitCardStrategyCreation() {
        DebitCardStrategy strategy = new DebitCardStrategy();
        assertNotNull(strategy);
    }

    @Test
    public void testDebitCardStrategyProcessPayment() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Debit Card");
        DebitCardStrategy strategy = new DebitCardStrategy();
        assertTrue(strategy.processPayment(payment));
    }

    @Test
    public void testEtransferStrategyCreation() {
        EtransferStrategy strategy = new EtransferStrategy();
        assertNotNull(strategy);
    }

    @Test
    public void testEtransferStrategyProcessPayment() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "E-Transfer");
        EtransferStrategy strategy = new EtransferStrategy();
        assertTrue(strategy.processPayment(payment));
    }

    /* RealPaymentProcessor class tests */

    @Test
    public void testRealPaymentProcessorConstructor() {
        RealPaymentProcessor processor = new RealPaymentProcessor();
        assertNotNull(processor);
    }

    @Test
    public void testRealPaymentProcessorProcessPaymentCreditCard() {
        Payment.setCounter(100);
        Payment payment = new Payment("user1", 1, 100.0, "pending", "Credit Card");
        RealPaymentProcessor processor = new RealPaymentProcessor();
        assertTrue(processor.processPayment(payment));
    }

    @Test
    public void testRealPaymentProcessorProcessPaymentDebitCard() {
        Payment.setCounter(100);
        Payment payment = new Payment("user2", 2, 200.0, "pending", "Debit Card");
        RealPaymentProcessor processor = new RealPaymentProcessor();
        assertTrue(processor.processPayment(payment));
    }

    @Test
    public void testRealPaymentProcessorProcessPaymentETransfer() {
        Payment.setCounter(100);
        Payment payment = new Payment("user3", 3, 300.0, "pending", "E-Transfer");
        RealPaymentProcessor processor = new RealPaymentProcessor();
        assertTrue(processor.processPayment(payment));
    }

    @Test
    public void testRealPaymentProcessorProcessPaymentInvalidMethod() {
        Payment.setCounter(100);
        Payment payment = new Payment("user4", 4, 400.0, "pending", "Invalid Method");
        RealPaymentProcessor processor = new RealPaymentProcessor();
        // assert that an unchecked exception with no defined message by programmer is thrown as a result of calling processPayment on null
        try {
            processor.processPayment(payment);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    /* PaymentProcessorProxy class tests */


    /* All Command class tests */

    /* Database class tests */
    @Test
    public void testDatabaseGetInstance() {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        assertNotNull(db1);
        assertSame(db1, db2);
    }

    @Test
    public void testDatabaseReadAll() throws IOException {
        Database db = Database.getInstance();
        List<String[]> records = db.readAll("testTable");
        assertNotNull(records);
    }

    @Test
    public void testDatabaseWriteAll() throws IOException {
        Database db = Database.getInstance();
        List<String[]> records = new ArrayList<>();
        records.add(new String[]{"1", "Test"});
        db.writeAll("testTable", records);
        List<String[]> readRecords = db.readAll("testTable");
        assertEquals(1, readRecords.size());
        assertArrayEquals(new String[]{"1", "Test"}, readRecords.get(0));
    }

    @Test
    public void testDatabaseInsert() throws IOException {
        Database db = Database.getInstance();
        String[] record = {"2", "InsertTest"};
        db.insert("testTable", record);
        List<String[]> readRecords = db.readAll("testTable");
        assertTrue(readRecords.stream().anyMatch(r -> Arrays.equals(r, record)));
    }

    @Test
    public void testDatabaseUpdate() throws IOException {
        Database db = Database.getInstance();
        String[] newRecord = {"1", "UpdatedTest"};
        boolean updated = db.update("testTable", 0, newRecord);
        assertTrue(updated);
        List<String[]> readRecords = db.readAll("testTable");
        assertArrayEquals(newRecord, readRecords.get(0));
    }

    @Test
    public void testDatabaseUpdateInvalidRow() throws IOException {
        Database db = Database.getInstance();
        String[] newRecord = {"3", "InvalidUpdate"};
        boolean updated = db.update("testTable", 10, newRecord);
        assertFalse(updated);
    }

    @Test
    public void testDatabaseDelete() throws IOException {
        Database db = Database.getInstance();
        boolean deleted = db.delete("testTable", 0);
        assertTrue(deleted);
        List<String[]> readRecords = db.readAll("testTable");
        assertTrue(readRecords.isEmpty());
    }

    @Test
    public void testDatabaseDeleteInvalidRow() throws IOException {
        Database db = Database.getInstance();
        boolean deleted = db.delete("testTable", 10);
        assertFalse(deleted);
    }

    @Test
    public void testDatabaseAddSubscriber() {
        Database db = Database.getInstance();
        Subscriber subscriber = tableName -> {};
        db.addSubscriber(subscriber);
        db.notifySubscribers("testTable");
    }

    @Test
    public void testDatabaseRemoveSubscriber() {
        Database db = Database.getInstance();
        Subscriber subscriber = tableName -> {};
        db.addSubscriber(subscriber);
        db.removeSubscriber(subscriber);
        db.notifySubscribers("testTable");
    }

    @Test
    public void testDatabaseRemoveAllSubscribers() {
        Database db = Database.getInstance();
        Subscriber subscriber1 = tableName -> {};
        Subscriber subscriber2 = tableName -> {};
        db.addSubscriber(subscriber1);
        db.addSubscriber(subscriber2);
        db.removeAllSubscribers();
        db.notifySubscribers("testTable");
    }
    /* Controller class tests */
    @Test
    public void testControllerGetUserById() {
        Controller controller = new Controller();
        Result<User> result = controller.getUserById("super@parking.system");
        assertNotNull(result.getResult());
        assertEquals("super@parking.system", result.getResult().getEmail());
    }

    @Test
    public void testControllerCreateUser() {
        Controller controller = new Controller();
        try {
            controller.createUser("client100@email.com", "Test@1234", "Visitor");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
        Result<User> result = controller.createUser("test@email.com", "Test@1234", "Visitor");
        assertNotNull(result.getResult());
        assertEquals("test@email.com", result.getResult().getEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testControllerCreateUserWithInvalidEmail() {
        Controller controller = new Controller();
        controller.createUser("invalid-email", "Test@1234", "Client");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testControllerCreateUserWithStaffEmailFormat() {
        Controller controller = new Controller();
        controller.createUser("test@parking.system", "Test@1234", "Client");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testControllerCreateUserWithInvalidPassword() {
        Controller controller = new Controller();
        controller.createUser("test@email.com", "password", "Client");
    }

    @Test
    public void testControllerGetUnvalidatedClients() {
        Controller controller = new Controller();
        Result<List<Client>> result = controller.getUnvalidatedClients();
        assertNotNull(result.getResult());
    }

    @Test
    public void testControllerValidateUser() {
        Controller controller = new Controller();
        try {
            controller.createUser("student@email.com", "Test@1234", "Student");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        controller.validateUser("student@email.com");
        Result<User> result = controller.getUserById("student@email.com");
        assertTrue(((Client) result.getResult()).isValidated());
    }

    @Test
    public void testControllerDeleteUser() {
        Controller controller = new Controller();
        controller.createUser("delete@email.com", "Delete@1234", "Visitor");
        controller.deleteUser("delete@email.com");
        Result<User> result = controller.getUserById("delete@email.com");
        assertNull(result.getResult());
    }

    @Test
    public void testControllerGetBookingsForUser() {
        Controller controller = new Controller();
        Result<List<Booking>> result = controller.getBookingsForUser("super@parking.system");
        assertNotNull(result.getResult());
    }

    @Test
    public void testControllerAddPayment() {
        Controller controller = new Controller();
        try {
            controller.createUser("user100@email.com", "Test@1234", "Visitor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Booking b;
        try {
            b = controller.bookParkingSpace("client100@email.com", 1, 201, "ABC123", new Date(), new Date(System.currentTimeMillis() + 3600000));
        } catch (Exception e) {
            b = controller.getBookingsForUser("client100@email.com").getResult().get(0);
        }
        controller.addPayment(100.0, "Credit Card", b.getBookingId());
        assertEquals("paid", b.getStatus());
    }

    @Test
    public void testControllerGetAvailableParkingSpaceList() {
        Controller controller = new Controller();
        Result<List<ParkingSpace>> result = controller.getAvailableParkingSpaceList();
        assertNotNull(result.getResult());
    }

    @Test
    public void testControllerBookParkingSpace() {
        Controller controller = new Controller();
        try {
            controller.createUser("client100@email.com", "Client@1234", "Visitor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        controller.bookParkingSpace("client100@email.com", 2, 201, "ABC123", new Date(), new Date(System.currentTimeMillis() + 3600000));
        assertFalse(controller.getBookingsForUser("client100@email.com").getResult().isEmpty());
    }

    @Test
    public void testControllerDisableParkingLotById() {
        Controller controller = new Controller();
        ParkingLot p = null;
        try {
            p = controller.createParkingLot("Test Location");
        } catch (IOException e) {
            fail("Failed to create parking lot");
        }
        controller.disableParkingLotById(p.getParkingLotId());
        assertFalse(p.isEnabled());
    }

    @Test
    public void testControllerEnableParkingLotById() {
        Controller controller = new Controller();
        ParkingLot p = null;
        try {
            p = controller.createParkingLot("Test Location");
        } catch (IOException e) {
            fail("Failed to create parking lot");
        }
        controller.disableParkingLotById(p.getParkingLotId());
        controller.enableParkingLotById(p.getParkingLotId());
        assertTrue(p.isEnabled());
    }

    @Test
    public void testControllerDisableParkingSpaceById() {
        Controller controller = new Controller();
        ParkingLot p = null;
        try {
            p = controller.createParkingLot("Test Location");
        } catch (IOException e) {
            fail("Failed to create parking lot");
        }
        controller.disableParkingSpaceById(p.getParkingLotId(), 1);
        assertEquals(p.getSpaces()[0].getStatus(), ParkingStatus.OUT_OF_SERVICE);
    }

    @Test
    public void testControllerEnableParkingSpaceById() {
        Controller controller = new Controller();
        ParkingLot p = null;
        try {
            p = controller.createParkingLot("Test Location");
        } catch (IOException e) {
            fail("Failed to create parking lot");
        }
        controller.disableParkingSpaceById(p.getParkingLotId(), 1);
        controller.enableParkingSpaceById(p.getParkingLotId(), 1);
        assertTrue(p.getSpaces()[0].getStatus().equals(ParkingStatus.AVAILABLE));
    }

    @Test
    public void testControllerModifyParkingSpaceBooking() {
        Controller controller = new Controller();
        try {
            controller.createUser("client100@email.com", "Client@1234", "Visitor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Booking b;
        try {
            b = controller.bookParkingSpace("client100@email.com", 1, 201, "ABC123", new Date(), new Date(System.currentTimeMillis() + 3600000));
        } catch (Exception e) {
            b = controller.getBookingById(1).getResult();
        }
        Date newStartTime = new Date();
        Date newEndTime = new Date(System.currentTimeMillis() + 7200000);
        b = controller.modifyParkingSpaceBooking("client100@email.com", b.getBookingId(), b.getParkingSpaceId(), b.getParkingLotId(), "XYZ789", newStartTime, newEndTime);
        assertEquals("XYZ789", b.getLicensePlate());
        assertEquals(newStartTime, b.getStartTime());
        assertEquals(newEndTime, b.getEndTime());
    }

    @Test
    public void testControllerCancelParkingSpaceBooking() {
        Controller controller = new Controller();
        Booking b;
        try {
            b = controller.bookParkingSpace("client100@email.com", 1, 201, "ABC123", new Date(), new Date(System.currentTimeMillis() + 3600000));
            controller.cancelParkingSpaceBooking("client100@email.com", 201, 1);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
        try {
            b = controller.bookParkingSpace("client100@email.com", 2, 201, "ABC123", new Date(System.currentTimeMillis() + 3000000), new Date(System.currentTimeMillis() + 3600000));
        } catch (Exception e) {
            b = controller.getBookingById(2).getResult();
        }
        int id = b.getBookingId();
        controller.cancelParkingSpaceBooking("client100@email.com", b.getParkingLotId(), b.getParkingSpaceId());
        assertNull(controller.getBookingById(id).getResult());
    }

    @Test
    public void testControllerCheckIntoBooking() {
        Controller controller = new Controller();
        try {
            controller.createUser("client100@email.com", "Client@1234", "Visitor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Booking b = null;
        try {
            ParkingLot lot = controller.createParkingLot("Test Location");
            b = controller.bookParkingSpace("client100@email.com", 1, lot.getParkingLotId(), "ABC123", new Date(), new Date(System.currentTimeMillis() + 3600000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        controller.checkIntoBooking(b);
        assertNotNull(b.getCheckInTime());
        assertTrue(b.isCheckedIn());
    }

    @Test
    public void testControllerGenerateManager() throws IOException {
        Controller controller = new Controller();
        Result<User> result = controller.generateManager();
        assertNotNull(result.getResult());
        assertEquals("Manager", result.getResult().getType());
    }

    @Test
    public void testControllerCreateParkingLot() throws IOException {
        Controller controller = new Controller();
        ParkingLot p = controller.createParkingLot("New Location");
        assertNotNull(p);
    }

    @AfterClass
    public static void tearDown() {
        File dir = new File("src/main/java/data");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
    }
}
