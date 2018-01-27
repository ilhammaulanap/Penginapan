/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.room;

import javax.swing.JOptionPane;

/**
 *
 * @author Lukman
 */
public class RoomEditView extends javax.swing.JDialog {
    DatabaseRoom db = new DatabaseRoom();
    int idRoom;
    
     public RoomEditView(java.awt.Frame parent, boolean modal,int id, int no_room, String class_room, String status) {
        super(parent, modal);
        initComponents();
        int classR = 0;
        int statusH = 0;
        
        if (null != class_room)switch (class_room) {
            case "VIP":
                classR = 0;
                break;
            case "Family":
                classR = 1;
                break;
            case "Single Bed":
                classR = 2;
                break;
            case "Double Bed":
                classR = 3;
                break;
            default:
                break;
        }
       
        if (null != status)switch (status) {
            case "Booked":
                statusH = 0;
                break;
            case "Used":
                statusH = 1;
                break;
            case "Available":
                statusH = 2;
                break;
            default:
                break;
        }
        
        idRoomLabel.setText(String.valueOf(id));
        noRoomField.setText(String.valueOf(no_room));
        ClassComboBox.setSelectedIndex(classR);
        StatusComboBox.setSelectedIndex(statusH);
    }

    

    
     
    public int getIdRoom() {
        return idRoom;
    }
    /**
     * Creates new form RoomEditView
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idRoomLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        noRoomField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ClassComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        updateRoom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID ROOM");

        idRoomLabel.setText("idroom");

        jLabel3.setText("No. Room");

        noRoomField.setText("FieldNoRoom");
        noRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRoomFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        ClassComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"VIP\"", "\"Family\"", "\"Single Bed\"", "\"Double Bed\"" }));
        ClassComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Class Room");

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Booked\"", "\"Used\"", "\"Available\"" }));

        updateRoom.setText("Update");
        updateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idRoomLabel)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateRoom)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idRoomLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(noRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateRoom)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRoomFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_noRoomFieldActionPerformed

    private void updateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoomActionPerformed
        // TODO add your handling code here:
        int classR = 0;
        int statusH = 0;
      
          // TODO add your handling code here:
        int id = Integer.valueOf(idRoomLabel.getText());
        int noR = Integer.valueOf(noRoomField.getText());
        int ccb = Integer.valueOf(ClassComboBox.getSelectedIndex());
        int scb = Integer.valueOf(StatusComboBox.getSelectedIndex());
        ccb = ccb + 1;
        scb = scb + 1;
        db.update_room(id,noR,ccb,scb);
        
            
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambah");
        setVisible(false);
    }//GEN-LAST:event_updateRoomActionPerformed

    private void ClassComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassComboBoxActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClassComboBox;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel idRoomLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField noRoomField;
    private javax.swing.JButton updateRoom;
    // End of variables declaration//GEN-END:variables
}
