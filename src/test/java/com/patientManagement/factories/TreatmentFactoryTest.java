package com.patientManagement.factories;

import com.patientManagement.domain.Treatment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class TreatmentFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("treatmentName","Panado");
        values.put("description","Heals headache and fever");
        values.put("dosage","Take 3 tablets a day, after meals");
    }
    @Test
    public void getTreatment() throws Exception {
        Treatment treatment = TreatmentFactory.getTreatment(values,"201");
        assertEquals("Panado",treatment.getTreatmentName());
    }
}
