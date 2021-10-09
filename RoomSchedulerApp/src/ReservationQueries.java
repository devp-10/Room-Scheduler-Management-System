/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */
    
// Necessary Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationQueries {
    private static Connection connection;
    private static PreparedStatement addReservationEntry;
    private static PreparedStatement getReservationsByDate;
    private static PreparedStatement getReservationsByFaculty;
    private static PreparedStatement getRoomsReservedByDate;
    private static PreparedStatement findReservation;
    private static PreparedStatement cancelReservation;
    private static PreparedStatement getSuitableRoom;
    private static PreparedStatement findRoom;
    private static RoomEntry possibleRoom;
    private static ResultSet resultSet;
    private static ArrayList<ReservationEntry> reservation = new ArrayList<ReservationEntry>();
    
    // Adding a reservation to the Reservations table
    public static String addReservationEntry(String facultyName, int seats, java.sql.Date date, java.sql.Timestamp timestamp) {
        connection = DBConnection.getConnection();
        try {
            getSuitableRoom = connection.prepareStatement("SELECT * FROM Rooms WHERE Seats>=? ORDER BY Seats");
            getSuitableRoom.setInt(1, seats);
            resultSet = getSuitableRoom.executeQuery();
            ArrayList<RoomEntry> roomEntryList = new ArrayList<RoomEntry>();
            while (resultSet.next()) {
                roomEntryList.add(new RoomEntry(resultSet.getString(1),resultSet.getInt(2)));
            }
            for (int i=0; i<roomEntryList.size(); i++) {
                possibleRoom = roomEntryList.get(i);
                findRoom = connection.prepareStatement("SELECT * FROM Reservations WHERE Room=? and Date=? ");
                findRoom.setString(1, possibleRoom.getRoom());
                findRoom.setDate(2, date);
                resultSet = findRoom.executeQuery();
                
                ArrayList<ReservationEntry> entryList = new ArrayList<ReservationEntry>();
                while (resultSet.next()) {
                    entryList.add(new ReservationEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(4),resultSet.getDate(3),resultSet.getTimestamp(5)));
                }
                if (entryList.isEmpty()) {
                    String message = findReservation(facultyName, date);
                    if (message == "Reservation Not Found") {
                        addReservationEntry = connection.prepareStatement("insert into Reservations (Faculty, Room, Seats, Date, TimeStamp) Values(?,?,?,?,?)");
                        addReservationEntry.setString(1, facultyName);
                        addReservationEntry.setString(2, possibleRoom.getRoom());
                        addReservationEntry.setInt(3, possibleRoom.getSeats());
                        addReservationEntry.setDate(4, date);
                        addReservationEntry.setTimestamp(5, timestamp);
                        addReservationEntry.executeUpdate();
                        return possibleRoom.getRoom();
                    }
                    else {
                        return "Error";
                    }
                }
            }
            String text = WaitlistQueries.findWaitlist(facultyName, date);
            if (text == "Waitlist Not Found") {
                WaitlistQueries.addWaitlistEntry(facultyName, seats, date, timestamp);
                return "Added to Waitlist";
            }
            else {
                return "Error";
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return "Error";
        }
    }
    // Getting all reservations by date
    public static ArrayList<ReservationEntry> getReservationsByDate(java.sql.Date date) {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> reservationsArrayByDate = new ArrayList<ReservationEntry>();
        try {
            getReservationsByDate = connection.prepareStatement("SELECT * FROM Reservations WHERE date=?");
            getReservationsByDate.setDate(1, date);
            resultSet = getReservationsByDate.executeQuery();
            while (resultSet.next()) {
                ReservationEntry reservationsEntryByDate = new ReservationEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4), resultSet.getDate(3), resultSet.getTimestamp(5));
                reservationsArrayByDate.add(reservationsEntryByDate);
            }
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return reservationsArrayByDate;
    }
    // Getting all reservations by faculty
    public static ArrayList<ReservationEntry> getReservationsByFaculty(String facultyName) {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> reservationsArrayByFaculty = new ArrayList<ReservationEntry>();
        try {
            getReservationsByFaculty = connection.prepareStatement("SELECT * FROM Reservations WHERE faculty=?");
            getReservationsByFaculty.setString(1, facultyName);
            resultSet = getReservationsByFaculty.executeQuery();
            while (resultSet.next()) {
                ReservationEntry reservationsEntryByFaculty = new ReservationEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(4),resultSet.getDate(3),resultSet.getTimestamp(5));
                reservationsArrayByFaculty.add(reservationsEntryByFaculty);
            }
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return reservationsArrayByFaculty;
    }
    // Getting all reserved rooms by date
    public static ArrayList<String> getRoomsReservedByDate(java.sql.Date date) {
        connection = DBConnection.getConnection();
        ArrayList<String> roomList = new ArrayList<String>();
        try {
            getRoomsReservedByDate = connection.prepareStatement("Select room from reservations where date = ? ");
            getRoomsReservedByDate.setDate(1, date);
            resultSet = getRoomsReservedByDate.executeQuery();
            while (resultSet.next()) {
                roomList.add(resultSet.getString(1));
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return roomList;
    }
    // Finding a reservation in the Reservations table
    public static String findReservation(String facultyName, java.sql.Date date) {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> entryList = new ArrayList<ReservationEntry>();
        try {
            findReservation = connection.prepareStatement("SELECT * FROM Reservations WHERE faculty=? and Date=?");
            findReservation.setString(1,facultyName);
            findReservation.setDate(2, date);
            resultSet = findReservation.executeQuery();
            while(resultSet.next()) {
                entryList.add(new ReservationEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(4),resultSet.getDate(3),resultSet.getTimestamp(5)));
            }
            if (entryList.isEmpty()) {
                return "Reservation Not Found";
            }
            else {
                return "Reservation Found";
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return "Error";
        }
    }
    // Deleting an existing reservation from the Reservations table
    public static String cancelReservation(String facultyName, java.sql.Date date) {
        String message = findReservation(facultyName, date);
        try {
            if (message == "Reservation Found") {
                connection = DBConnection.getConnection();
                cancelReservation=connection.prepareStatement("delete from reservations where faculty=? and date=?");
                cancelReservation.setString(1, facultyName);
                cancelReservation.setDate(2, date);
                cancelReservation.executeUpdate();
                return "Reservation Cancelled";
            }
            else {
                return "Error";
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return "Error";
        }
    }
}