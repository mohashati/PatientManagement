package com.patientManagement.factories;

import com.patientManagement.domain.Diagnosis;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DiagnosisFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("name","Headache");
        values.put("description","shar pain in the forehead");
        values.put("dosage","Take take 3 tablets 3 times a day");
    }
    @Test
    public void getDiagnosis() throws Exception {
        Diagnosis diagnosis = DiagnosisFactory.getDiagnosis(values,"12");
        assertEquals("Panado",diagnosis.getName());
    }
}
