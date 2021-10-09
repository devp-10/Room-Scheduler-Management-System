/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Faculty {
    private static Connection connection;
    private static ArrayList<String> faculty = new ArrayList<String>();
    private static PreparedStatement addFaculty;
    private static PreparedStatement getFacultyList;
    private static ResultSet resultSet;
    
    // Adding a faculty to the Faculty table
    public static void addFaculty(String name) {
        connection = DBConnection.getConnection();
        try {
            addFaculty = connection.prepareStatement("insert into faculty (name) values (?)");
            addFaculty.setString(1, name);
            addFaculty.executeUpdate();
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    // Getting all the faculty names from the Faculty table
    public static ArrayList<String> getFacultyList() {
        connection = DBConnection.getConnection();
        ArrayList<String> faculty = new ArrayList<String>();
        try {
            getFacultyList = connection.prepareStatement("select name from faculty order by name");
            resultSet = getFacultyList.executeQuery();
            while(resultSet.next()) {
                faculty.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return faculty;
    }
}
