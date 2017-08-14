package com.patientManagement.factories;

import com.patientManagement.domain.Treatment;
import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/10.
 */
public class TreatmentFactory {
    public static Treatment getTreatment(Map<String, String> values, String id){
        Treatment treatment = new Treatment.Builder()
                .id(id)
                .treatmentName(values.get("treatmentName"))
                .description(values.get("description"))
                .dosage(values.get("dosage"))
                .build();
        return treatment;
    }
}
