package com.patientManagement.factories;

import com.patientManagement.domain.Doctor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DoctorFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("name","Teboho");
        values.put("surname","Moshasha");
        values.put("address","37 Boetsap Street Delft");
        values.put("cellNumber","0749718342");
        values.put("speciality","Dentist");
        values.put("qualification","MBH in Medicne");
    }
    @Test
    public void getDoctor() throws Exception {
        Doctor doctor = DoctorFactory.getDoctor(values,"13");
        assertEquals("Teboho",doctor.getName());
    }

}
