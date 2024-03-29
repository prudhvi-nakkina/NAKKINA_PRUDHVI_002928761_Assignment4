/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author pridh
 */
public class ViewCommunityRecordsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityRecordsJPanel
     */
    public ViewCommunityRecordsJPanel() {
        initComponents();
        
        calculateAbnormalities();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        temperatureTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pulseTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        bpTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 700, -1));

        temperatureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Patient ID", "Abnormal Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(temperatureTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 200, 519, 92));

        pulseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Patient ID", "Abnormal Pulse"
            }
        ));
        jScrollPane3.setViewportView(pulseTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 318, 519, 90));

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));

        bpTable.setBackground(new java.awt.Color(204, 204, 255));
        bpTable.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        bpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Patient ID", "Abnormal BP"
            }
        ));
        jScrollPane4.setViewportView(bpTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 83, 519, 90));
    }// </editor-fold>//GEN-END:initComponents


    public void calculateAbnormalities() {
        Map<Patient, ArrayList<VitalSigns>> history = Patient.getEncounters();
        
        DefaultTableModel bpRecords = (DefaultTableModel) bpTable.getModel();
        bpRecords.setRowCount(0);
        
        DefaultTableModel tempRecords = (DefaultTableModel) temperatureTable.getModel();
        tempRecords.setRowCount(0);
        
        DefaultTableModel pulseRecords = (DefaultTableModel) pulseTable.getModel();
        pulseRecords.setRowCount(0);
        
        for (Patient p : history.keySet()) {
            ArrayList<VitalSigns> vitals = history.get(p);
            int communityId = p.getCommunity().getId();
            
            Object[] temprow = new Object[3];
            temprow[0] = String.valueOf(communityId);
            temprow[1] = p.getId();
            if (vitals.get(vitals.size()-1).getTemperature() > 98.6) {
                temprow[2] = "Yes";
            } else {
                temprow[2] = "No";
            }
            tempRecords.addRow(temprow);
            
            Object[] bprow = new Object[3];
            bprow[0] = String.valueOf(communityId);
            bprow[1] = p.getId();
            if (vitals.get(vitals.size()-1).getBloodPressure()> 120) {
                bprow[2] = "Yes";
            } else {
                bprow[2] = "No";
            }
            bpRecords.addRow(bprow);
            
            Object[] pulserow = new Object[3];
            pulserow[0] = String.valueOf(communityId);
            pulserow[1] = p.getId();
            if (vitals.get(vitals.size()-1).getPulse()> 100) {
                pulserow[2] = "Yes";
            } else {
                pulserow[2] = "No";
            }
            pulseRecords.addRow(pulserow);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bpTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable pulseTable;
    private javax.swing.JTable temperatureTable;
    // End of variables declaration//GEN-END:variables
}
