/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckIn;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import penginapanmaster.Booking.DatabaseBooking;

/**
 *
 * @author Army
 */
public class CheckInView extends javax.swing.JFrame {
    DatabaseCheckIn db = new DatabaseCheckIn();
    int idBook,idCustomer;
    
    public CheckInView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDBooking = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIDCustomer = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtIDRoom = new javax.swing.JTextField();
        txtNoRoom = new javax.swing.JTextField();
        txtClassRoom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txtCheckIn = new javax.swing.JTextField();
        txtCheckOut = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 370, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Order ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, -1));
        getContentPane().add(txtIDBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, -1));

        btnSearch.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 20));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("ID Customer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel5.setText("ID Room");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel6.setText("No Room");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel7.setText("Class Room");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Check In");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 176, 60, 20));

        txtIDCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 230, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 230, -1));
        getContentPane().add(txtIDRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 74, -1));
        getContentPane().add(txtNoRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 74, -1));

        txtClassRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassRoomActionPerformed(evt);
            }
        });
        getContentPane().add(txtClassRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 74, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel9.setText("Check Out");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 70, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Duration");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel11.setText("Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 40, 10));

        btnProses.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        btnProses.setText("Check In");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 87, -1));

        btnBatal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnBatal.setText("Cancel");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 76, -1));
        getContentPane().add(txtCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 128, -1));

        txtCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(txtCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 128, -1));
        getContentPane().add(txtLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 59, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 128, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkin.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDCustomerActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       CheckIn dt = null;
       idBook = Integer.valueOf(txtIDBooking.getText());
       CheckInPresenter ck = new CheckInPresenter();
       dt = ck.selectBooking(idBook);
       txtIDCustomer.setText(String.valueOf(dt.getId_customer()));
       txtIDRoom.setText(String.valueOf(dt.getId_room()));
       txtCheckIn.setText(String.valueOf(dt.getCheck_in()));
       txtCheckOut.setText(String.valueOf(dt.getCheck_out()));
       txtClassRoom.setText(String.valueOf(dt.getClass_room()));
       txtLama.setText(String.valueOf(dt.getId_customer()));
       txtNama.setText(String.valueOf(dt.getId_customer()));
       txtNoRoom.setText(String.valueOf(dt.getId_customer()));
       txtTotal.setText(String.valueOf(dt.getId_customer()));
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        try {
            //ambil baris dimana kursor berada
               idCustomer = Integer.valueOf(txtIDRoom.getText());
               db.setUsedRoom(idCustomer);
               JOptionPane.showMessageDialog(null, "Proses Check In Berhasil");
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    private void txtClassRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassRoomActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckOutActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCheckIn;
    private javax.swing.JTextField txtCheckOut;
    private javax.swing.JTextField txtClassRoom;
    private javax.swing.JTextField txtIDBooking;
    private javax.swing.JTextField txtIDCustomer;
    private javax.swing.JTextField txtIDRoom;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoRoom;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
