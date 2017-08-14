package com.patientManagement.factories;

import com.patientManagement.domain.Diagnosis;

import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/11.
 */
public class DiagnosisFactory {
    public static Diagnosis getDiagnosis(Map<String,String> values, String id){
        Diagnosis diagnosis = new Diagnosis.Builder()
                .id(id)
                .name(values.get("name"))
                .description(values.get("description"))
                .build();
        return diagnosis;
    }
}
