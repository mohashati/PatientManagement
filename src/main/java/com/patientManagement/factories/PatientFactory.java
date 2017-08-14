package com.patientManagement.factories;

import com.patientManagement.domain.Patient;

import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class PatientFactory {
    public static Patient getPatient(Map<String,String>values,String id){
        Patient patient = new Patient.Builder()
                .id(id)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .address(values.get("address"))
                .cellNumber(values.get("cellNumber"))
                .build();
        return  patient;
    }
}
