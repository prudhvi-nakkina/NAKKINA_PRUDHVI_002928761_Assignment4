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
    
    private static HashMap<Patient, ArrayList<VitalSigns>> encounters = new HashMap<Patient,ArrayList<VitalSigns>>();
    private static ArrayList<VitalSigns> vsArray = new ArrayList<VitalSigns>();

    public static HashMap<Patient, ArrayList<VitalSigns>> getEncounters() {
        return encounters;
    }

    public static void setEncounters(HashMap<Patient, ArrayList<VitalSigns>> encounters) {
        Patient.encounters = encounters;
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
