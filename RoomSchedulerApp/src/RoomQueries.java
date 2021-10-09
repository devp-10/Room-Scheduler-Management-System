/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomQueries {
    private static Connection connection;
    private static PreparedStatement addRoom;
    private static PreparedStatement getAllPossibleRooms;
    private static PreparedStatement dropRoom;
    private static PreparedStatement findReservation;
    private static ResultSet resultSet;
    static ArrayList<String> roomList = new ArrayList<String>();
    
    // Adding a room to the Rooms table
    public static void addRoom(String room, int seats) {
        connection = DBConnection.getConnection();
        try {
            addRoom = connection.prepareStatement("insert into rooms (name, seats) values (?,?)");
            addRoom.setString(1, room);
            addRoom.setInt(2, seats);
            addRoom.executeUpdate();
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Couln't find the entry");
            System.exit(1);
        }
    }
    // Getting all the rooms from the Rooms table
    public static ArrayList<String> getAllPossibleRooms() {
        connection = DBConnection.getConnection();        
        try {
            getAllPossibleRooms = connection.prepareStatement("SELECT name FROM rooms ORDER BY seats");
            resultSet = getAllPossibleRooms.executeQuery();
            
            while(resultSet.next()) {
                roomList.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return roomList;
    }
    // Dropping a room from the Rooms table
    public static ArrayList<ReservationEntry> dropRoom(String room) {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> reservationEntryList = new ArrayList<ReservationEntry>();
        try {
            dropRoom = connection.prepareStatement("delete from rooms where name=?");
            dropRoom.setString(1, room);
            dropRoom.executeUpdate();
            
            findReservation = connection.prepareStatement("select * from Reservations where room=?");
            findReservation.setString(1, room);
            resultSet = findReservation.executeQuery();
            while (resultSet.next()) {
                reservationEntryList.add(new ReservationEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(4),resultSet.getDate(3),resultSet.getTimestamp(5)));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return reservationEntryList;
    }
}