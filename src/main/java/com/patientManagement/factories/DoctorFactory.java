package com.patientManagement.factories;

import com.patientManagement.domain.Doctor;

import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/10.
 */
public class DoctorFactory {
    public static Doctor getDoctor(Map<String,String>values,String id){
        Doctor doctor = new Doctor.Builder()
                .id(id)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .address(values.get("address"))
                .cellNumber(values.get("address"))
                .speciality(values.get("speciality"))
                .qualification(values.get("qualification"))
                .build();
                return doctor;
    }
}
