/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dates {
    private static Connection connection;
    private static PreparedStatement addDate;
    private static PreparedStatement getAllDates;
    private static ResultSet resultSet;
    
    // Adding a date to the Dates table
    public static void addDate(java.sql.Date date) {
        connection = DBConnection.getConnection();
        try {
            addDate = connection.prepareStatement("insert into dates (date) values (?)");
            addDate.setDate(1, date);
            addDate.executeUpdate();
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }   
    }
    // Getting all dates from the Dates table
    public static ArrayList<java.sql.Date> getAllDates() {
        connection = DBConnection.getConnection();
        ArrayList<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
        try {
            getAllDates = connection.prepareStatement("select Date from Dates order by Date");
            resultSet = getAllDates.executeQuery();
            while (resultSet.next()) {
                dateList.add(resultSet.getDate(1));
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return dateList;    
    }
}
