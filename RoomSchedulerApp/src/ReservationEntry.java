/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

public class ReservationEntry {
    private String facultyName;
    private String room;
    private int seats;
    private java.sql.Date date;
    private java.sql.Timestamp timestamp;
    
    // Constructor of ReservationEntry
    public ReservationEntry(String facultyName, String room, int seats, java.sql.Date date, java.sql.Timestamp timestamp) {
        this.facultyName = facultyName;
        this.room = room;
        this.seats = seats;
        this.date = date;
        this.timestamp = timestamp;
    }
    // Setter and Getter for faculty name
    public void setFacultyName(String newFacultyName) {this.facultyName = newFacultyName;}
    public String getFacultyName() {return facultyName;}
    
    // Setter and Getter for room
    public void setRoom(String newRoom) {this.room = newRoom;}
    public String getRoom() {return room;}
    
    // Setter and Getter for seats
    public void setSeats(int newSeat) {this.seats = newSeat;}
    public int getSeats() {return seats;}
    
    // Setter and Getter for date
    public void setDate(java.sql.Date newDate) {this.date = newDate;}
    public java.sql.Date getDate() {return date;}
    
    // Setter and Getter for timestamp
    public void setTimestamp(java.sql.Timestamp newTimestamp) {this.timestamp = newTimestamp;}
    public java.sql.Timestamp getTimestamp() {return timestamp;}

}