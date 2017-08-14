package com.patientManagement.repositories;

import com.patientManagement.domain.Patient;
import com.patientManagement.factories.PatientFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class PatientRepositoryTest {

    PatientRepository repository;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "12");
        values.put("name", "Zimasa");
        values.put("surname", "Bhaduza");
        values.put("address", "N03 Umhlonto Drive Joe Slovo Park");
        values.put("cellNumber", "0794339330");
        values.put("condition", "Critical");
        values.put("attendenceType", "first time");
    }

    @Test
    public void create() throws Exception {
        Patient patient = PatientFactory.getPatient(values, "12");
        repository.create(patient);
        assertEquals("Teboho",patient.getName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Patient readPatient = repository.read("12");
        assertEquals("Zimasa",readPatient.getName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Patient readPatient = repository.read("12");
        Patient newPatient = new Patient.Builder()
                .name(values.get( "Zimasa"))
                .surname(values.get("Moshasha"))
                .address(values.get("37 Boetsap Street Delft"))
                .cellNumber(values.get("0749718342"))
                .condition(values.get("Critical"))
                .attendanceType(values.get("Regular"))
                .build();
        repository.update(newPatient);
        Patient updatedPatient = repository.read("12");
        assertEquals("Zimasa", updatedPatient.getName());
    }


    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("12");
        Patient patient = repository.read("12");
        assertNull(patient);
    }
}