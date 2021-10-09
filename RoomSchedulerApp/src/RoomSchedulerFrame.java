/* Dev Patel
   CMPSC 221
   Final Project : Room Scheduler */

// Necessary Imports
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

// GUI class
public class RoomSchedulerFrame extends javax.swing.JFrame {
    public RoomSchedulerFrame() {
        initComponents();
        // Loading the combo boxes with data.
        rebuildReserveFacultyComboBox();
        rebuildReserveDateComboBox();
        rebuildStatusDateComboBox();
        rebuildCancelFacultyComboBox();
        rebuildCancelDateComboBox();
        rebuildDropRoomComboBox();
        rebuildStatusFacultyComboBox();
    }
    // rebuilding methods for all combo boxes
    public void rebuildReserveFacultyComboBox() {
        reserveFacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getFacultyList().toArray()));        
    }
    public void rebuildReserveDateComboBox() {
        reserveDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));
    }
    public void rebuildStatusDateComboBox() {
        statusDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));
    }
    public void rebuildCancelFacultyComboBox() {
        cancelFacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getFacultyList().toArray()));       
    }
    public void rebuildCancelDateComboBox() {
        cancelDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));
    }
    public void rebuildDropRoomComboBox() {
        dropRoomComboBox.setModel(new javax.swing.DefaultComboBoxModel(RoomQueries.getAllPossibleRooms().toArray()));
    }
    public void rebuildStatusFacultyComboBox() {
        statusFacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getFacultyList().toArray()));
    }
    
    // Generated code by the form editor
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomSchedulerTitleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JTabbedPane();
        addFacultyPanel = new javax.swing.JPanel();
        addFacultyNameLabel = new javax.swing.JLabel();
        addFacultyTextField = new javax.swing.JTextField();
        addFacultyButton = new javax.swing.JButton();
        addFacultyStatusLabel = new javax.swing.JLabel();
        reserveRoomPanel = new javax.swing.JPanel();
        reserveFacultyLabel = new javax.swing.JLabel();
        reserveFacultyComboBox = new javax.swing.JComboBox<>();
        reserveDateLabel = new javax.swing.JLabel();
        reserveDateComboBox = new javax.swing.JComboBox<>();
        reserveSeatsLabel = new javax.swing.JLabel();
        reserveSeatsTextField = new javax.swing.JTextField();
        reserveSubmitButton = new javax.swing.JButton();
        reserveStatusLabel = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        statusDateLabel = new javax.swing.JLabel();
        statusDateComboBox = new javax.swing.JComboBox<>();
        statusWaitlistButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusFacultyTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusDateTextArea = new javax.swing.JTextArea();
        statusDateButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        statusWaitlistTextArea = new javax.swing.JTextArea();
        statusFacultyLabel = new javax.swing.JLabel();
        statusFacultyComboBox = new javax.swing.JComboBox<>();
        statusFacultyButton = new javax.swing.JButton();
        addRoomPanel = new javax.swing.JPanel();
        roomFacultyLabel = new javax.swing.JLabel();
        roomSeatsLabel = new javax.swing.JLabel();
        roomNameTextField = new javax.swing.JTextField();
        roomSeatsTextField = new javax.swing.JTextField();
        addRoomButton = new javax.swing.JButton();
        addRoomStatusLabel = new javax.swing.JLabel();
        addDatePanel = new javax.swing.JPanel();
        addDateLabel = new javax.swing.JLabel();
        addDateButton = new javax.swing.JButton();
        addDateStatusLabel = new javax.swing.JLabel();
        addDateSpinner = new javax.swing.JSpinner();
        cancelReservationPanel = new javax.swing.JPanel();
        cancelFacultyLabel = new javax.swing.JLabel();
        cancelFacultyComboBox = new javax.swing.JComboBox<>();
        cancelDateLabel = new javax.swing.JLabel();
        cancelDateComboBox = new javax.swing.JComboBox<>();
        cancelReservationButton = new javax.swing.JButton();
        cancelReservationStatusLabel = new javax.swing.JLabel();
        dropRoomPanel = new javax.swing.JPanel();
        dropRoomLabel = new javax.swing.JLabel();
        dropRoomComboBox = new javax.swing.JComboBox<>();
        dropRoomButton = new javax.swing.JButton();
        dropRoomStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roomSchedulerTitleLabel.setFont(new java.awt.Font("Times", 1, 24)); // NOI18N
        roomSchedulerTitleLabel.setForeground(new java.awt.Color(0, 0, 204));
        roomSchedulerTitleLabel.setText("ROOM SCHEDULER");

        addFacultyNameLabel.setText("Faculty Name: ");

        addFacultyTextField.setColumns(20);

        addFacultyButton.setText("Submit");
        addFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyButtonActionPerformed(evt);
            }
        });

        addFacultyStatusLabel.setText("    ");

        javax.swing.GroupLayout addFacultyPanelLayout = new javax.swing.GroupLayout(addFacultyPanel);
        addFacultyPanel.setLayout(addFacultyPanelLayout);
        addFacultyPanelLayout.setHorizontalGroup(
            addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFacultyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addFacultyButton)
                .addGap(195, 195, 195))
            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                .addGroup(addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFacultyPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(addFacultyNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addFacultyPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        addFacultyPanelLayout.setVerticalGroup(
            addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFacultyPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addFacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFacultyNameLabel)
                    .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addFacultyButton)
                .addGap(44, 44, 44)
                .addComponent(addFacultyStatusLabel)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        mainPanel.addTab("Add Faculty", addFacultyPanel);

        reserveFacultyLabel.setText("Faculty: ");

        reserveDateLabel.setText("Date: ");

        reserveSeatsLabel.setText("Seats Required: ");

        reserveSeatsTextField.setColumns(3);

        reserveSubmitButton.setText("Submit");
        reserveSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveSubmitButtonActionPerformed(evt);
            }
        });

        reserveStatusLabel.setText("   ");

        javax.swing.GroupLayout reserveRoomPanelLayout = new javax.swing.GroupLayout(reserveRoomPanel);
        reserveRoomPanel.setLayout(reserveRoomPanelLayout);
        reserveRoomPanelLayout.setHorizontalGroup(
            reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(reserveSubmitButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reserveRoomPanelLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reserveDateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reserveFacultyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reserveSeatsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reserveDateComboBox, 0, 112, Short.MAX_VALUE)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reserveFacultyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
            .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(reserveStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reserveRoomPanelLayout.setVerticalGroup(
            reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reserveRoomPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveFacultyLabel)
                    .addComponent(reserveFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveDateLabel)
                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(reserveRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveSeatsLabel)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reserveSubmitButton)
                .addGap(33, 33, 33)
                .addComponent(reserveStatusLabel)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        mainPanel.addTab("Reserve Room", reserveRoomPanel);

        statusDateLabel.setText("Date:");

        statusWaitlistButton.setText("Show Status by Waitlist");
        statusWaitlistButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        statusWaitlistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusWaitlistButtonActionPerformed(evt);
            }
        });

        statusFacultyTextArea.setColumns(20);
        statusFacultyTextArea.setRows(5);
        jScrollPane1.setViewportView(statusFacultyTextArea);

        statusDateTextArea.setColumns(20);
        statusDateTextArea.setRows(5);
        jScrollPane2.setViewportView(statusDateTextArea);

        statusDateButton.setText("Show Status by Date");
        statusDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusDateButtonActionPerformed(evt);
            }
        });

        statusWaitlistTextArea.setColumns(20);
        statusWaitlistTextArea.setRows(5);
        jScrollPane3.setViewportView(statusWaitlistTextArea);

        statusFacultyLabel.setText("Faculty: ");

        statusFacultyButton.setText("Show Status by Faculty");
        statusFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFacultyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, statusPanelLayout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(statusDateLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statusDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(statusDateButton))
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(statusWaitlistButton))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(statusFacultyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusFacultyButton)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusDateLabel)
                    .addComponent(statusDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusDateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(statusWaitlistButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusFacultyLabel)
                    .addComponent(statusFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusFacultyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        mainPanel.addTab("Status", statusPanel);

        roomFacultyLabel.setText("Room Name: ");

        roomSeatsLabel.setText("Seats: ");

        addRoomButton.setText("Submit");
        addRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addRoomPanelLayout = new javax.swing.GroupLayout(addRoomPanel);
        addRoomPanel.setLayout(addRoomPanelLayout);
        addRoomPanelLayout.setHorizontalGroup(
            addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRoomPanelLayout.createSequentialGroup()
                .addGroup(addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addRoomPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(addRoomButton))
                    .addGroup(addRoomPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roomSeatsLabel)
                            .addComponent(roomFacultyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addRoomPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addRoomStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        addRoomPanelLayout.setVerticalGroup(
            addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRoomPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomFacultyLabel)
                    .addComponent(roomNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomSeatsLabel)
                    .addComponent(roomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addRoomButton)
                .addGap(43, 43, 43)
                .addComponent(addRoomStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        mainPanel.addTab("Add Room", addRoomPanel);

        addDateLabel.setText("Date: ");

        addDateButton.setText("Submit");
        addDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateButtonActionPerformed(evt);
            }
        });

        addDateSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout addDatePanelLayout = new javax.swing.GroupLayout(addDatePanel);
        addDatePanel.setLayout(addDatePanelLayout);
        addDatePanelLayout.setHorizontalGroup(
            addDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDatePanelLayout.createSequentialGroup()
                .addGroup(addDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDatePanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(addDateLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addDatePanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(addDateButton))
                    .addGroup(addDatePanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(addDateStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        addDatePanelLayout.setVerticalGroup(
            addDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDatePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDateLabel)
                    .addComponent(addDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addDateButton)
                .addGap(50, 50, 50)
                .addComponent(addDateStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        mainPanel.addTab("Add Date", addDatePanel);

        cancelFacultyLabel.setText("Faculty Name: ");

        cancelDateLabel.setText("Date: ");

        cancelReservationButton.setText("Submit");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cancelReservationPanelLayout = new javax.swing.GroupLayout(cancelReservationPanel);
        cancelReservationPanel.setLayout(cancelReservationPanelLayout);
        cancelReservationPanelLayout.setHorizontalGroup(
            cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelReservationPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelDateLabel)
                    .addComponent(cancelFacultyLabel))
                .addGap(18, 18, 18)
                .addGroup(cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelFacultyComboBox, 0, 111, Short.MAX_VALUE)
                    .addComponent(cancelDateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133))
            .addGroup(cancelReservationPanelLayout.createSequentialGroup()
                .addGroup(cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cancelReservationPanelLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(cancelReservationButton))
                    .addGroup(cancelReservationPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(cancelReservationStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cancelReservationPanelLayout.setVerticalGroup(
            cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelReservationPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelFacultyLabel)
                    .addComponent(cancelFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cancelReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDateLabel)
                    .addComponent(cancelDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cancelReservationButton)
                .addGap(48, 48, 48)
                .addComponent(cancelReservationStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        mainPanel.addTab("Cancel Reservation", cancelReservationPanel);

        dropRoomLabel.setText("Room: ");

        dropRoomButton.setText("Submit");
        dropRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dropRoomPanelLayout = new javax.swing.GroupLayout(dropRoomPanel);
        dropRoomPanel.setLayout(dropRoomPanelLayout);
        dropRoomPanelLayout.setHorizontalGroup(
            dropRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropRoomPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(dropRoomLabel)
                .addGap(18, 18, 18)
                .addComponent(dropRoomComboBox, 0, 111, Short.MAX_VALUE)
                .addGap(167, 167, 167))
            .addGroup(dropRoomPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(dropRoomButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropRoomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dropRoomStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        dropRoomPanelLayout.setVerticalGroup(
            dropRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropRoomPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(dropRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropRoomLabel)
                    .addComponent(dropRoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dropRoomButton)
                .addGap(42, 42, 42)
                .addComponent(dropRoomStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        mainPanel.addTab("Drop Room", dropRoomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(roomSchedulerTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomSchedulerTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Action Performed for the button that adds faculty to the table
    private void addFacultyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addFacultyButtonActionPerformed
    {//GEN-HEADEREND:event_addFacultyButtonActionPerformed
        // Adding faculty to the faculty table.
        String name = addFacultyTextField.getText();
        Faculty.addFaculty(name);
        addFacultyStatusLabel.setText(name+" has been added to the Faculty.");
        // rebuilding the reservation faculty combo box.
        rebuildReserveFacultyComboBox();
        rebuildStatusFacultyComboBox();
        rebuildCancelFacultyComboBox();
    }//GEN-LAST:event_addFacultyButtonActionPerformed

    // Action Performed for the button that shows waitlisted entrys
    private void statusWaitlistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusWaitlistButtonActionPerformed
        ArrayList<WaitlistEntry> waitlistEntryArray = WaitlistQueries.getWaitlistByDate();
        statusWaitlistTextArea.setText("");
        for (int i=0; i < waitlistEntryArray.size(); i++) {
            statusWaitlistTextArea.append(waitlistEntryArray.get(i).getFacultyName()+"   "+waitlistEntryArray.get(i).getDate()+"   "+waitlistEntryArray.get(i).getSeats()+"\n");
        }
    }//GEN-LAST:event_statusWaitlistButtonActionPerformed

    // Action Performed for the button that shows the status of reserved rooms by dates
    private void statusDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusDateButtonActionPerformed
        java.sql.Date date = java.sql.Date.valueOf(statusDateComboBox.getSelectedItem().toString());
        ArrayList<ReservationEntry> reservationEntryList = ReservationQueries.getReservationsByDate(date);
        statusDateTextArea.setText("");
        for (int j=0; j < reservationEntryList.size(); j++) {
            statusDateTextArea.append(reservationEntryList.get(j).getFacultyName()+" reserved "+reservationEntryList.get(j).getRoom()+"\n");
        }
    }//GEN-LAST:event_statusDateButtonActionPerformed

    // Action Performed for the button that does the actual reservation of rooms
    private void reserveSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveSubmitButtonActionPerformed
        String facultyName = reserveFacultyComboBox.getSelectedItem().toString();
        int seats = Integer.parseInt(reserveSeatsTextField.getText());
        java.sql.Date date = java.sql.Date.valueOf(reserveDateComboBox.getSelectedItem().toString());
        java.sql.Timestamp timestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        String message = ReservationQueries.addReservationEntry(facultyName, seats, date, timestamp);
        if (message.equals("Added to Waitlist")) {
            reserveStatusLabel.setText(facultyName+" gets waitlisted");
        }
        else if (message.equals("Error")) {
            reserveStatusLabel.setText("Error Occured");
        }
        else {
            reserveStatusLabel.setText(facultyName+" reserves room "+message);
        }       
    }//GEN-LAST:event_reserveSubmitButtonActionPerformed

    // Action Performed for the button that adds a new room to the Rooms table
    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomButtonActionPerformed
        String room = roomNameTextField.getText();
        int seats = Integer.parseInt(roomSeatsTextField.getText());
        RoomQueries.addRoom(room, seats);
        String output = "room "+room+" gets added"+"\n";
        ArrayList<WaitlistEntry> waitlistArray = WaitlistQueries.getWaitlistByDate();
        for (int i=0; i<waitlistArray.size(); i++) {
            String message = ReservationQueries.addReservationEntry(waitlistArray.get(i).getFacultyName(), seats, waitlistArray.get(i).getDate(), waitlistArray.get(i).getTimestamp());
            if (message!="Added to Waitlist" && message!="Error") {
                String x = WaitlistQueries.deleteWaitlistEntry(waitlistArray.get(i).getFacultyName(), waitlistArray.get(i).getDate());
                output += waitlistArray.get(i).getFacultyName()+" reserves "+room+" for date "+waitlistArray.get(i).getDate()+"\n";
            }
        }
        addRoomStatusLabel.setText(convertToMultiline(output));
        rebuildDropRoomComboBox();
    }//GEN-LAST:event_addRoomButtonActionPerformed

    // Action Performed for the button that adds a new date to the Dates table
    private void addDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDateButtonActionPerformed
        String date = new SimpleDateFormat("yyyy-MM-dd").format(addDateSpinner.getValue());
        Dates.addDate(java.sql.Date.valueOf(date));
        addDateStatusLabel.setText(date+" added successfully");
        rebuildReserveDateComboBox();
        rebuildStatusDateComboBox();
        rebuildCancelDateComboBox();
    }//GEN-LAST:event_addDateButtonActionPerformed
    
    // Action Performed for the button that cancels an existing reservation
    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        String facultyName = cancelFacultyComboBox.getSelectedItem().toString();
        java.sql.Date date = java.sql.Date.valueOf(cancelDateComboBox.getSelectedItem().toString());
        String message = WaitlistQueries.deleteWaitlistEntry(facultyName, date);
        String text = ReservationQueries.cancelReservation(facultyName, date);
        ArrayList<WaitlistEntry> waitlistArray = new ArrayList<WaitlistEntry>();
        if (message == "Waitlist Entry Deleted") {
            cancelReservationStatusLabel.setText(facultyName+" gets cancelled from waitlist");
        }
        if (text == "Reservation Cancelled") {
            cancelReservationStatusLabel.setText(facultyName+" "+cancelDateComboBox.getSelectedItem().toString()+" gets cancelled");
            waitlistArray = WaitlistQueries.getWaitlistByDate();
            for (int i=0; i<waitlistArray.size(); i++) {
                ArrayList<String> roomList = new ArrayList<String>();
                roomList = RoomQueries.getAllPossibleRooms();
                for (String j: roomList) {
                    String reserveRoom = ReservationQueries.addReservationEntry(waitlistArray.get(i).getFacultyName(), waitlistArray.get(i).getSeats(), waitlistArray.get(i).getDate(), waitlistArray.get(i).getTimestamp());
                    if (reserveRoom!="Added to Waitlist" && reserveRoom!="Error") {
                        message = WaitlistQueries.deleteWaitlistEntry(waitlistArray.get(i).getFacultyName(), waitlistArray.get(i).getDate());
                        cancelReservationStatusLabel.setText(cancelReservationStatusLabel.getText()+"\n"+waitlistArray.get(i).getFacultyName()+" gets room "+reserveRoom+" reserved");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    // Action Performed for the button that drops an existing room from the Rooms table
    private void dropRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropRoomButtonActionPerformed
        String room = dropRoomComboBox.getSelectedItem().toString();
        ArrayList<ReservationEntry> reservationEntryList = RoomQueries.dropRoom(room);
        String output = "Room "+room+" dropped successfully"+"\n";
        dropRoomStatusLabel.setText("");
        for (int i=0; i<reservationEntryList.size(); i++) {
            String message = ReservationQueries.cancelReservation(reservationEntryList.get(i).getFacultyName(), reservationEntryList.get(i).getDate());
            if (message == "Reservation Cancelled") {
                String text = ReservationQueries.addReservationEntry(reservationEntryList.get(i).getFacultyName(), reservationEntryList.get(i).getSeats(), reservationEntryList.get(i).getDate(), reservationEntryList.get(i).getTimestamp());
                if (text == "Added to Waitlist") {
                    output += reservationEntryList.get(i).getFacultyName()+" "+reservationEntryList.get(i).getDate()+" is moved to waitlist"+"\n";
                }
                else if (text == "Error") {
                    dropRoomStatusLabel.setText("Error");
                }
                else {
                    output += reservationEntryList.get(i).getFacultyName()+" reserves room "+text+" on "+reservationEntryList.get(i).getDate();
                }
                dropRoomStatusLabel.setText(convertToMultiline(output));
            }
        }
        rebuildDropRoomComboBox();
    }//GEN-LAST:event_dropRoomButtonActionPerformed

    // Action performed for the button that shows the status of reservations by faculty
    private void statusFacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFacultyButtonActionPerformed
        // TODO add your handling code here:
        String facultyName = String.valueOf(statusFacultyComboBox.getSelectedItem().toString());
        ArrayList<ReservationEntry> reservationsByFaculty = ReservationQueries.getReservationsByFaculty(facultyName);
        for (int i=0; i<reservationsByFaculty.size(); i++) {
            statusFacultyTextArea.append(reservationsByFaculty.get(i).getFacultyName()+"   "+reservationsByFaculty.get(i).getRoom()+"   "+reservationsByFaculty.get(i).getDate()+"\n");
        }
    }//GEN-LAST:event_statusFacultyButtonActionPerformed
    
    // Method to make a JLabel show multi-line texts
    public static String convertToMultiline(String input) {
        return "<html>" + input.replaceAll("\n", "<br>");
    }
    
    // Main Method
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomSchedulerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDateButton;
    private javax.swing.JLabel addDateLabel;
    private javax.swing.JPanel addDatePanel;
    private javax.swing.JSpinner addDateSpinner;
    private javax.swing.JLabel addDateStatusLabel;
    private javax.swing.JButton addFacultyButton;
    private javax.swing.JLabel addFacultyNameLabel;
    private javax.swing.JPanel addFacultyPanel;
    private javax.swing.JLabel addFacultyStatusLabel;
    private javax.swing.JTextField addFacultyTextField;
    private javax.swing.JButton addRoomButton;
    private javax.swing.JPanel addRoomPanel;
    private javax.swing.JLabel addRoomStatusLabel;
    private javax.swing.JComboBox<String> cancelDateComboBox;
    private javax.swing.JLabel cancelDateLabel;
    private javax.swing.JComboBox<String> cancelFacultyComboBox;
    private javax.swing.JLabel cancelFacultyLabel;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JPanel cancelReservationPanel;
    private javax.swing.JLabel cancelReservationStatusLabel;
    private javax.swing.JButton dropRoomButton;
    private javax.swing.JComboBox<String> dropRoomComboBox;
    private javax.swing.JLabel dropRoomLabel;
    private javax.swing.JPanel dropRoomPanel;
    private javax.swing.JLabel dropRoomStatusLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JComboBox<String> reserveDateComboBox;
    private javax.swing.JLabel reserveDateLabel;
    private javax.swing.JComboBox<String> reserveFacultyComboBox;
    private javax.swing.JLabel reserveFacultyLabel;
    private javax.swing.JPanel reserveRoomPanel;
    private javax.swing.JLabel reserveSeatsLabel;
    private javax.swing.JTextField reserveSeatsTextField;
    private javax.swing.JLabel reserveStatusLabel;
    private javax.swing.JButton reserveSubmitButton;
    private javax.swing.JLabel roomFacultyLabel;
    private javax.swing.JTextField roomNameTextField;
    private javax.swing.JLabel roomSchedulerTitleLabel;
    private javax.swing.JLabel roomSeatsLabel;
    private javax.swing.JTextField roomSeatsTextField;
    private javax.swing.JButton statusDateButton;
    private javax.swing.JComboBox<String> statusDateComboBox;
    private javax.swing.JLabel statusDateLabel;
    private javax.swing.JTextArea statusDateTextArea;
    private javax.swing.JButton statusFacultyButton;
    private javax.swing.JComboBox<String> statusFacultyComboBox;
    private javax.swing.JLabel statusFacultyLabel;
    private javax.swing.JTextArea statusFacultyTextArea;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton statusWaitlistButton;
    private javax.swing.JTextArea statusWaitlistTextArea;
    // End of variables declaration//GEN-END:variables
}