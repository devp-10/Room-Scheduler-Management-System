/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

public class WaitlistEntry {
    private String facultyName;
    private int seats;
    private java.sql.Date date;
    private java.sql.Timestamp timestamp;
    
    // Constructor of WaitlistEntry
    public WaitlistEntry(String facultyName, int seats, java.sql.Date date, java.sql.Timestamp timestamp) {
        this.facultyName = facultyName;
        this.seats = seats;
        this.date = date;
        this.timestamp = timestamp;
    }
    // Setter and getter for faculty name
    public void setFacultyName(String newFacultyName) {this.facultyName = newFacultyName;}
    public String getFacultyName() {return facultyName;}
        
    // Setter and Getter for seats
    public void setSeats(int newSeat) {this.seats = newSeat;}
    public int getSeats() {return seats;}
    
    // Setter and Getter for date
    public void setDate(java.sql.Date newDate) {this.date = newDate;}
    public java.sql.Date getDate() {return date;}
    
    // Setter and getter for timestamp
    public void setTimestamp(java.sql.Timestamp newTimestamp) {this.timestamp = newTimestamp;}
    public java.sql.Timestamp getTimestamp() {return timestamp;}

}