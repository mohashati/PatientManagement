package com.patientManagement.factories;

import com.patientManagement.domain.Patient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class PatientFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("name","Zimasa");
        values.put("surname","Bhaduza");
        values.put("address","N03 Umhlonto Drive Joe Slovo Park");
        values.put("cellNumber","0794339330");
        values.put("condition","Critical");
        values.put("attendenceType","first time");
    }
    @Test
    public void getPatient() throws Exception {
        Patient patient = PatientFactory.getPatient(values,"101");
        assertEquals("0794339330",patient.getCellNumber());
    }
}
