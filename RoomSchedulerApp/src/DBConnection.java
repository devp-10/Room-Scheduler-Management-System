/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Class for connecting to the database
public class DBConnection {

    private static Connection connection;
    private static final String user = "java";
    private static final String password = "java";
    private static final String database = "jdbc:derby://localhost:1527/RoomSchedulerDBDevdpp5410";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(database, user, password);
            } 
            catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Could not open database.");
                System.exit(1);
            }
        }
        return connection;
    }
}
