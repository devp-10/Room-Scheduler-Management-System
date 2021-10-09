/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WaitlistQueries {
    private static Connection connection;
    private static PreparedStatement addWaitlistEntry;
    private static PreparedStatement getWaitlistByDate;
    private static PreparedStatement getWaitlistByFaculty;
    private static PreparedStatement findWaitlist;
    private static PreparedStatement deleteWaitlistEntry;
    private static ResultSet resultSet;

    // Adding a waitlist entry to the Waitlist table
    public static void addWaitlistEntry(String facultyName, int seats, java.sql.Date date, java.sql.Timestamp timestamp) {
        connection = DBConnection.getConnection();
        try {
            addWaitlistEntry = connection.prepareStatement("insert into Waitlist (Faculty, Seats, Date, TimeStamp) values(?,?,?,?)");
            addWaitlistEntry.setString(1,facultyName);
            addWaitlistEntry.setInt(2,seats);
            addWaitlistEntry.setDate(3, date);
            addWaitlistEntry.setTimestamp(4,timestamp);
            addWaitlistEntry.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    // Getting all waitlist entrys by date
    public static ArrayList<WaitlistEntry> getWaitlistByDate() {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> waitListArrayByDate = new ArrayList<WaitlistEntry>();
        try {
            getWaitlistByDate = connection.prepareStatement("SELECT * FROM Waitlist ORDER BY date,Timestamp");
            resultSet = getWaitlistByDate.executeQuery();
            while (resultSet.next()) {
                WaitlistEntry waitlistEntry = new WaitlistEntry(resultSet.getString(1),resultSet.getInt(4),resultSet.getDate(2),resultSet.getTimestamp(3));
                waitListArrayByDate.add(waitlistEntry);
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return waitListArrayByDate ;
    }
    // Getting all waitlist entrys by faculty
    public static ArrayList<WaitlistEntry> getWaitlistByFaculty(String facultyName) {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> WaitlistArrayByFaculty = new ArrayList<WaitlistEntry>();
        try {
            getWaitlistByFaculty = connection.prepareStatement("SELECT * FROM Waitlist WHERE faculty=?");
            getWaitlistByFaculty.setString(1,facultyName);
            resultSet=getWaitlistByFaculty.executeQuery();
            while(resultSet.next()) {
                WaitlistEntry waitlistEntryByFaculty = new WaitlistEntry(resultSet.getString(1),resultSet.getInt(2),resultSet.getDate(3),resultSet.getTimestamp(4));
                WaitlistArrayByFaculty.add(waitlistEntryByFaculty);
            }
            
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return WaitlistArrayByFaculty;
    }
    // Finding a waitlist entry in the Waitlist table
    public static String findWaitlist(String facultyName, java.sql.Date date) {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> entryList = new ArrayList<WaitlistEntry>();
        try {
            findWaitlist = connection.prepareStatement("SELECT * FROM Waitlist WHERE faculty=? and Date=?");
            findWaitlist.setString(1, facultyName);
            findWaitlist.setDate(2, date);
            resultSet = findWaitlist.executeQuery();
           
            while (resultSet.next()) {
                entryList.add(new WaitlistEntry(resultSet.getString(1),resultSet.getInt(4),resultSet.getDate(2),resultSet.getTimestamp(3)));
            }
            if (entryList.isEmpty()) {
                return "Waitlist Not Found";
            }
            else {
                return "Waitlist Found";
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
            return "Error";
        }
    }
    // Deleting a waitlist from the Waitlist table
    public static String deleteWaitlistEntry(String facultyName, java.sql.Date date) {
        connection = DBConnection.getConnection();
        try {
            deleteWaitlistEntry = connection.prepareStatement("delete from Waitlist where faculty=? and date=?");
            deleteWaitlistEntry.setString(1, facultyName);
            deleteWaitlistEntry.setDate(2, date);
            deleteWaitlistEntry.executeUpdate();
            return "Waitlist Entry Deleted";
            
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
            return "Error";
        }
    }
}