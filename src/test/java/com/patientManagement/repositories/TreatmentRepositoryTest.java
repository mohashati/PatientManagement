package com.patientManagement.repositories;

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
public class TreatmentRepositoryTest {
    TreatmentRepository repository;
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
        repository.create(treatment);
        assertEquals("Teboho",treatment.getTreatmentName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Treatment readTreatment = repository.read("12");
        assertEquals("Panado",readTreatment.getTreatmentName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Treatment readTreatment = repository.read("12");
        Treatment newTreatment = new Treatment.Builder()
                .treatmentName(values.get( "Grandpa"))
                .description(values.get("Heals headache and fever"))
                .dosage(values.get("Take 3 tablets a day, after meals"))
                .build();
        repository.update(newTreatment);
        Treatment updatedTreatment = repository.read("12");
        assertEquals("Grandpa", updatedTreatment.getTreatmentName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("12");
        Treatment treatment = repository.read("12");
        assertNull(treatment);
    }
}
