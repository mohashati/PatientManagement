package com.patientManagement.services;

import com.patientManagement.domain.Treatment;
import com.patientManagement.factories.TreatmentFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class TreatmentServiceTest {
    TreatmentService service;
    Map<String, String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "12");
        values.put("treatmentName", "Panado");
        values.put("description", "Heals headache and fever");
        values.put("dosage", "Take 3 tablets a day, after meals");
    }

    @Test
    public void create() throws Exception {
        Treatment treatment = TreatmentFactory.getTreatment(values, "12");
        service.create(treatment);
        assertEquals("Teboho",treatment.getTreatmentName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Treatment readTreatment = service.read("12");
        assertEquals("Panado",readTreatment.getTreatmentName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Treatment readTreatment = service.read("12");
        Treatment newTreatment = new Treatment.Builder()
                .treatmentName(values.get( "Grandpa"))
                .description(values.get("Heals headache and fever"))
                .dosage(values.get("Take 3 tablets a day, after meals"))
                .build();
        service.update(newTreatment);
        Treatment updatedTreatment = service.read("12");
        assertEquals("Grandpa", updatedTreatment.getTreatmentName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("12");
        Treatment treatment = service.read("12");
        assertNull(treatment);
    }
}
