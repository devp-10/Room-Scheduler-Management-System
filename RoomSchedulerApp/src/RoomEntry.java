/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

public class RoomEntry {
    private String room;
    private int seats;
    
    // Constructor of RoomEntry
    public RoomEntry(String room, int seats) {
        this.room = room;
        this.seats = seats;
    }
    // Setter and Getter for room
    public void setRoom(String newRoom) {this.room = newRoom;}
    public String getRoom() {return room;}
    
    // Setter and Getter for seats
    public void setSeats(int newSeats) {this.seats = newSeats;}
    public int getSeats() {return seats;}

}
