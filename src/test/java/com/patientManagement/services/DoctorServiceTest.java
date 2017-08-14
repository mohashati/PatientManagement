package com.patientManagement.services;

import com.patientManagement.domain.Doctor;
import com.patientManagement.factories.DoctorFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DoctorServiceTest {
    Map<String,String> values;
    DoctorService service;

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
    public void create() throws Exception {
        Doctor doctor = DoctorFactory.getDoctor(values, "12");
        service.create(doctor);
        assertEquals("Teboho",doctor.getName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Doctor readDoctor = service.read("12");
        assertEquals("Teboho",readDoctor.getName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Doctor readDoctor = service.read("12");
        Doctor newDoctor = new Doctor.Builder()
                .name(values.get("Teboho"))
                .surname(values.get("Dingile"))
                .address(values.get("37 Boetsap Street Delft"))
                .cellNumber(values.get("0749718342"))
                .speciality(values.get("Dentist"))
                .qualification(values.get("MBH in Medicne"))
                .build();
        service.update(newDoctor);
        Doctor updatedDoctor = service.read("12");
        assertEquals("2017-09-09", updatedDoctor.getName());
    }


    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("12");
        Doctor doctor = service.read("12");
        assertNull(doctor);
    }
}
