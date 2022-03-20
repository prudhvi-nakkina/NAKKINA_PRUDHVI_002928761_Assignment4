/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pridh
 */
public class Patient extends Person {
    
    private static HashMap<Patient, ArrayList<VitalSigns>> encounterHistory = new HashMap<Patient,ArrayList<VitalSigns>>();
    private static ArrayList<VitalSigns> vsArray = new ArrayList<VitalSigns>();

    public static HashMap<Patient, ArrayList<VitalSigns>> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(HashMap<Patient, ArrayList<VitalSigns>> encounterHistory) {
        Patient.encounterHistory = encounterHistory;
    }

    public static ArrayList<VitalSigns> getVsArray() {
        return vsArray;
    }

    public static void setVsArray(ArrayList<VitalSigns> vsArray) {
        Patient.vsArray = vsArray;
    }
    
    public static void addVitalsigns(VitalSigns vitalsign)
    {
        vsArray.add(vitalsign);
    }
}
