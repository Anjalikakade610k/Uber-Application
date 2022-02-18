/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UbercarCatalog;

/**
 *
 * @author anjalikakade
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    UbercarCatalog catalog;
    public ViewJPanel( UbercarCatalog catalog) {
        initComponents();
        this.catalog = catalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSerialNumber = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        lblVehicleInsurance = new javax.swing.JLabel();
        lblRideOption = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtManufactureDate = new javax.swing.JTextField();
        chcSeatCount = new java.awt.Choice();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtVehicleInsurance = new javax.swing.JTextField();
        comboRideOption = new javax.swing.JComboBox<>();
        chckYes = new javax.swing.JCheckBox();
        lblTitle = new javax.swing.JLabel();
        chckNo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUberDetails = new javax.swing.JTable();
        lblAvailable = new javax.swing.JLabel();
        radioCertified = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        radioNotCertified = new javax.swing.JRadioButton();
        lblBrandName = new javax.swing.JLabel();
        lblManufactureDate = new javax.swing.JLabel();
        lblSeatCount = new javax.swing.JLabel();

        lblSerialNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblSerialNumber.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblSerialNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblSerialNumber.setText("Serial Number:");

        lblModelNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblModelNumber.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblModelNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblModelNumber.setText("Model Number:");

        lblCity.setBackground(new java.awt.Color(0, 0, 0));
        lblCity.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City:");

        lblMaintenanceCertificate.setBackground(new java.awt.Color(0, 0, 0));
        lblMaintenanceCertificate.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblMaintenanceCertificate.setForeground(new java.awt.Color(255, 255, 255));
        lblMaintenanceCertificate.setText("Available:");

        lblVehicleInsurance.setBackground(new java.awt.Color(0, 0, 0));
        lblVehicleInsurance.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblVehicleInsurance.setForeground(new java.awt.Color(255, 255, 255));
        lblVehicleInsurance.setText("Vehicle Insurance:");

        lblRideOption.setBackground(new java.awt.Color(0, 0, 0));
        lblRideOption.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblRideOption.setForeground(new java.awt.Color(255, 255, 255));
        lblRideOption.setText("Ride option:");

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        txtManufactureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufactureDateActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        comboRideOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uber Rent", "Uber Green", "Uber X", "Uber Pool" }));
        comboRideOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRideOptionActionPerformed(evt);
            }
        });

        chckYes.setBackground(new java.awt.Color(0, 0, 0));
        chckYes.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        chckYes.setForeground(new java.awt.Color(255, 255, 255));
        chckYes.setText("Yes");

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Apple SD Gothic Neo", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("See your Uber Details & Update");

        chckNo.setBackground(new java.awt.Color(0, 0, 0));
        chckNo.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        chckNo.setForeground(new java.awt.Color(255, 255, 255));
        chckNo.setText("No");

        tblUberDetails.setBackground(new java.awt.Color(51, 51, 51));
        tblUberDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblUberDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Manufactured Date", "Seat Count", "Serial Number", "Model Number", "City", "Availability", "Maintenance Certificate", "Vehicle Insurance", "Uber Type", "Entry Date", "Updation Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUberDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUberDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUberDetails);

        lblAvailable.setBackground(new java.awt.Color(0, 0, 0));
        lblAvailable.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailable.setText("Maintenance Certificate");

        radioCertified.setBackground(new java.awt.Color(102, 102, 102));
        radioCertified.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        radioCertified.setForeground(new java.awt.Color(255, 255, 255));
        radioCertified.setText("Certified");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        radioNotCertified.setBackground(new java.awt.Color(102, 102, 102));
        radioNotCertified.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        radioNotCertified.setForeground(new java.awt.Color(255, 255, 255));
        radioNotCertified.setText("Expired");

        lblBrandName.setBackground(new java.awt.Color(51, 51, 51));
        lblBrandName.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblBrandName.setForeground(new java.awt.Color(255, 255, 255));
        lblBrandName.setText("Brand Name:");

        lblManufactureDate.setBackground(new java.awt.Color(0, 0, 0));
        lblManufactureDate.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblManufactureDate.setForeground(new java.awt.Color(255, 255, 255));
        lblManufactureDate.setText("Manufactured Date:");

        lblSeatCount.setBackground(new java.awt.Color(0, 0, 0));
        lblSeatCount.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        lblSeatCount.setForeground(new java.awt.Color(255, 255, 255));
        lblSeatCount.setText("Seat Count:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1625, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addComponent(lblBrandName))
                                        .addComponent(lblAvailable)
                                        .addComponent(lblManufactureDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSeatCount, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMaintenanceCertificate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblVehicleInsurance, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRideOption, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(chcSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                            .addComponent(txtManufactureDate)
                                            .addComponent(txtModelNumber)
                                            .addComponent(txtCity)
                                            .addComponent(txtVehicleInsurance)
                                            .addComponent(comboRideOption, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(chckYes)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(chckNo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioCertified)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radioNotCertified))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(btnUpdate)))
                            .addGap(1146, 1146, 1146))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblBrandName)
                        .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblManufactureDate)
                        .addComponent(txtManufactureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSeatCount)
                        .addComponent(chcSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSerialNumber)
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModelNumber)
                        .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaintenanceCertificate)
                                .addComponent(chckYes)
                                .addComponent(chckNo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVehicleInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVehicleInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRideOption)
                                .addComponent(comboRideOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAvailable)
                                .addComponent(radioCertified)
                                .addComponent(radioNotCertified))
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate))
                        .addComponent(lblCity))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        chcSeatCount.add("2");
        chcSeatCount.add("4");
        chcSeatCount.add("6");
        comboRideOption.addItem("Uber Taxi");
        comboRideOption.addItem("Uber Intercity");
        comboRideOption.addItem("Uber XL");
        comboRideOption.addItem("Uber Comfort");
        comboRideOption.addItem("Uber black");
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtManufactureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufactureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufactureDateActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void comboRideOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRideOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRideOptionActionPerformed

    private void tblUberDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUberDetailsMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblUberDetails.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblUberDetails.getModel();
        txtBrandName.setText(model.getValueAt(selectedRow,0).toString());
        txtManufactureDate.setText(model.getValueAt(selectedRow,1).toString());
        chcSeatCount.select(model.getValueAt(selectedRow,2).toString());
        txtSerialNumber.setText(model.getValueAt(selectedRow,3).toString());
        txtModelNumber.setText(model.getValueAt(selectedRow,4).toString());
        txtCity.setText(model.getValueAt(selectedRow,5).toString());
        if(chckYes.isSelected()){
            chckYes.setText(model.getValueAt(selectedRow,6).toString());
        }else if(chckNo.isSelected()){
            chckNo.setText(model.getValueAt(selectedRow,6).toString());
        }
        if(radioCertified.isSelected()){
            radioCertified.setText(model.getValueAt(selectedRow,7).toString());
        }else if(radioNotCertified.isSelected()){
            radioNotCertified.setText(model.getValueAt(selectedRow,7).toString());
        }
        txtVehicleInsurance.setText(model.getValueAt(selectedRow,8).toString());
        comboRideOption.setSelectedItem(model.getValueAt(selectedRow,9).toString());

    }//GEN-LAST:event_tblUberDetailsMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblUberDetails.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblUberDetails.getModel();

        if(selectedRowIndex>=0){
            model.setValueAt(txtBrandName.getText(),selectedRowIndex,0);
            model.setValueAt(txtManufactureDate.getText(),selectedRowIndex,1);
            model.setValueAt(chcSeatCount.getSelectedItem(),selectedRowIndex,2);
            model.setValueAt(txtSerialNumber.getText(),selectedRowIndex,3);
            model.setValueAt(txtModelNumber.getText(),selectedRowIndex,4);
            model.setValueAt(txtCity.getText(),selectedRowIndex,5);
            if(chckYes.isSelected()){
                model.setValueAt(chckYes.getText(), selectedRowIndex,6);
            }else if(chckNo.isSelected()){
                model.setValueAt(chckNo.getText(), selectedRowIndex,6);
            }
            if(radioCertified.isSelected()){
                model.setValueAt(radioCertified.getText(), selectedRowIndex,7);

            }else if(radioNotCertified.isSelected()){
                model.setValueAt(radioNotCertified.getText(), selectedRowIndex,7);

            }
            model.setValueAt(txtVehicleInsurance.getText(),selectedRowIndex,8);
            model.setValueAt(comboRideOption.getSelectedItem().toString(),selectedRowIndex,9);
            String fleetUpdationDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            model.setValueAt(fleetUpdationDate, selectedRowIndex, 11);
        }else
        {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");

        }
        txtBrandName.setText("");
        txtManufactureDate.setText("");
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtCity.setText("");
        txtVehicleInsurance.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private java.awt.Choice chcSeatCount;
    private javax.swing.JCheckBox chckNo;
    private javax.swing.JCheckBox chckYes;
    private javax.swing.JComboBox<String> comboRideOption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblRideOption;
    private javax.swing.JLabel lblSeatCount;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicleInsurance;
    private javax.swing.JRadioButton radioCertified;
    private javax.swing.JRadioButton radioNotCertified;
    private javax.swing.JTable tblUberDetails;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufactureDate;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtVehicleInsurance;
    // End of variables declaration//GEN-END:variables
}