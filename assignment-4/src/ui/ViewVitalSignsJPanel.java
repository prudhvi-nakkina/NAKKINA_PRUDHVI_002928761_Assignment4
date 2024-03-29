/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author pridh
 */
public class ViewVitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignsJPanel
     */
    public ViewVitalSignsJPanel() {
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
        txtSearchID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalsTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Patient's Vitals");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 700, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Patient ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 104, -1, -1));
        add(txtSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 105, 145, -1));

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 104, 100, -1));

        vitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Blood Pressure", "Temperature", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 249, -1, 91));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<VitalSigns> arr = new ArrayList<VitalSigns>();
        Community community;
        VitalSigns vitals;
        Patient patient = new Patient();
        Map<Patient, ArrayList<VitalSigns>> history = Patient.getEncounters();
        boolean exists = false;
        String[] columns = {"Date", "Blood Pressure", "Temperature", "Pulse"};
        DefaultTableModel tbl = new DefaultTableModel(columns, 0);
        for (Patient p : history.keySet()) {
            if (Integer.parseInt(txtSearchID.getText()) == p.getId()) {
                arr = history.get(p);
                patient = p;
                exists = true;
            }
        }
        if (exists) {
            ArrayList<VitalSigns> sol = history.get(patient);
            if (sol.size() == 0) {
                JOptionPane.showMessageDialog(jScrollPane1, "No Data exists for specified patient");
            }
            for (VitalSigns signs : sol) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String date = dtf.format(signs.getDate());
                Vector<String> v = new Vector<String>();
                v.add(date);
                v.add(String.valueOf(signs.getBloodPressure()));
                v.add(String.valueOf(signs.getTemperature()));
                v.add(String.valueOf(signs.getPulse()));
                tbl.addRow(v);

            }
            vitalsTable.setModel(tbl);
        }
        else {
            JOptionPane.showMessageDialog(jScrollPane1, "Patient does not exist");
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTable vitalsTable;
    // End of variables declaration//GEN-END:variables
}
