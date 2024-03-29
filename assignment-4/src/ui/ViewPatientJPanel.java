/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Community;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author pridh
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Patient mainP;
    Map<Patient, ArrayList<VitalSigns>> mainPatientHistory = Patient.getEncounters();
    
    public ViewPatientJPanel() {
        initComponents();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtPatientName.setEditable(false);
        txtPatientID.setEditable(false);
        txtBirthDate.setEditable(false);
        txtAge.setEditable(false);
        txtCommunityName.setEditable(false);
        txtCommunityID.setEditable(false);
        txtCity.setEditable(false);
        txtHouseNo.setEditable(false);
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
        lblSearchID = new javax.swing.JLabel();
        txtSearchID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        txtCommunityID = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtHouseNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Patient Record");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, -1));

        lblSearchID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearchID.setText("Enter Patient ID :");
        add(lblSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 50, 118, -1));

        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });
        add(txtSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 51, 131, -1));

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Patient Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 136, 124, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 137, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Patient ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 174, 124, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date Of Birth :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 212, 124, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Community Name :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 288, 124, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Age :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 250, 124, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Community ID :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 326, 124, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("City :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 364, 124, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("House No :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 402, 124, -1));
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 175, 150, -1));
        add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 213, 150, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 251, 150, -1));
        add(txtCommunityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 289, 150, -1));
        add(txtCommunityID, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 327, 150, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 365, 150, -1));
        add(txtHouseNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 403, 150, -1));

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 432, 150, -1));

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 97, 100, -1));

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 97, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Community community;
        Map<Patient, ArrayList<VitalSigns>> map = Patient.getEncounters();
        boolean flag = false;
        ArrayList<VitalSigns> arr = new ArrayList<VitalSigns>();
        VitalSigns vitals;
        flag = fireValidations();
        Patient patient = new Patient();
        boolean exists = false;
        
        if (flag) {
            for (Patient p : map.keySet()) {
                if (Integer.parseInt(txtPatientID.getText()) == p.getId()) {
                    patient = p;
                    arr = map.get(p);
                    exists = true;
                    
                }
            }

            if (exists) {
                String birthDate = txtBirthDate.getText();
                community = new Community();
                community.setHouseNo(txtHouseNo.getText());
                community.setId(Integer.parseInt(txtCommunityID.getText()));
                community.setName(txtCommunityName.getText());
                community.setCity(txtCity.getText());

                patient.setAge(Integer.parseInt(txtAge.getText()));
                patient.setCommunity(community);
                patient.setName(txtPatientName.getText());
                patient.setId(Integer.parseInt(txtPatientID.getText()));
                patient.setBirthDate(birthDate);
                mainP = patient;
                
                JOptionPane.showMessageDialog(btnUpdate, "Details Updated successfully");

                btnDelete.setEnabled(true);
                txtPatientName.setEditable(false);
                txtPatientID.setEditable(false);
                txtBirthDate.setEditable(false);
                txtAge.setEditable(false);
                txtCommunityName.setEditable(false);
                txtCommunityID.setEditable(false);
                txtCity.setEditable(false);
                txtHouseNo.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(btnUpdate, "No Patient exists for the entered ID");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Map<Patient, ArrayList<VitalSigns>> patientHistory = Patient.getEncounters();
        boolean exists = false;
       
        for (Patient patient : patientHistory.keySet()) {
            if (Integer.parseInt(txtSearchID.getText()) == patient.getId()) {
                exists = true;
            }
        }
        
        if (!exists) {
            JOptionPane.showMessageDialog(btnUpdate, "No Patient exists for the entered ID");
        } else {
            for (Patient p : patientHistory.keySet()) {
                if (Integer.parseInt(txtSearchID.getText()) == p.getId()) {
                    mainP = p;
                    txtPatientID.setText(String.valueOf(p.getId()));
                    txtBirthDate.setText(p.getBirthDate());
                    txtPatientName.setText(p.getName());
                    txtAge.setText(String.valueOf(p.getAge()));
                    Community community = new Community();
                    community = p.getCommunity();
                    txtCity.setText(community.getCity());
                    txtCommunityID.setText(String.valueOf(community.getId()));
                    txtHouseNo.setText(community.getHouseNo());
                    txtCommunityName.setText(community.getName());
                    btnUpdate.setEnabled(true);
                    btnDelete.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnDelete.setEnabled(false);
        txtPatientName.setEditable(true);
        txtPatientID.setEditable(false);
        txtBirthDate.setEditable(true);
        txtAge.setEditable(true);
        txtCommunityName.setEditable(true);
        txtCommunityID.setEditable(true);
        txtCity.setEditable(true);
        txtHouseNo.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        mainPatientHistory.remove(mainP);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtPatientName.setEditable(false);
        txtPatientID.setEditable(false);
        txtBirthDate.setEditable(false);
        txtAge.setEditable(false);
        txtCommunityName.setEditable(false);
        txtCommunityID.setEditable(false);
        txtCity.setEditable(false);
        txtHouseNo.setEditable(false);
        txtPatientName.setText("");
        txtPatientID.setText("");
        txtBirthDate.setText("");
        txtAge.setText("");
        txtCommunityName.setText("");
        txtCommunityID.setText("");
        txtCity.setText("");
        txtHouseNo.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    private boolean fireValidations() {
        boolean valid = true;

        if (!txtPatientName.getText().matches("^[a-zA-Z]*$") || (txtPatientName.getText() == null) || (txtPatientName.getText().length() == 0)) {
            txtPatientName.setBackground(Color.red);
            valid = false;
        } else {
            txtPatientName.setBackground(Color.white);
        }
        
        if (!txtPatientID.getText().matches("^[0-9]+$") || (txtPatientID.getText() == null) || (txtPatientID.getText().length() == 0)) {
            txtPatientID.setBackground(Color.red);
            valid = false;
            JOptionPane.showMessageDialog(this, "Patient ID is digits only!");
        } else {
            txtPatientID.setBackground(Color.white);
        }

        if (!txtBirthDate.getText().matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$") || (txtBirthDate.getText() == null) || (txtBirthDate.getText().length() == 0)) {
            txtBirthDate.setBackground(Color.red);
            valid = false;
            JOptionPane.showMessageDialog(this, "Please enter date in DD/MM/YYYY format");
        } else {
            txtBirthDate.setBackground(Color.white);
        }

        if (!txtAge.getText().matches("^[0-9]{1,3}$") || (txtAge.getText().length() == 0)) {
            txtAge.setBackground(Color.red);
            valid = false;
        } else {
            txtAge.setBackground(Color.white);
        }
        
        if (!txtCommunityName.getText().matches("^[a-zA-Z]*$") || (txtCommunityName.getText() == null) || (txtCommunityName.getText().length() == 0)) {
            txtCommunityName.setBackground(Color.red);
            valid = false;
        } else {
            txtCommunityName.setBackground(Color.white);
        }
        
        if (!txtCommunityID.getText().matches("^[0-9]+$") || (txtCommunityID.getText() == null) || (txtCommunityID.getText().length() == 0)) {
            txtCommunityID.setBackground(Color.red);
            valid = false;
            JOptionPane.showMessageDialog(this, "Community ID is digits only!");
        } else {
            txtCommunityID.setBackground(Color.white);
        }
        
        if (!txtCity.getText().matches("^[a-zA-Z]*$") || (txtCity.getText() == null) || (txtCity.getText().length() == 0)) {
            txtCity.setBackground(Color.red);
            valid = false;
        } else {
            txtCity.setBackground(Color.white);
        }
        
        if (!txtHouseNo.getText().matches("^[a-zA-Z0-9]*$") || (txtHouseNo.getText() == null) || (txtHouseNo.getText().length() == 0)) {
            txtHouseNo.setBackground(Color.red);
            valid = false;
        } else {
            txtHouseNo.setBackground(Color.white);
        }
        
        return valid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblSearchID;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSearchID;
    // End of variables declaration//GEN-END:variables
}
