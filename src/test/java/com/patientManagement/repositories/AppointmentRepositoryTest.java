package com.patientManagement.repositories;

import com.patientManagement.domain.Appointment;
import com.patientManagement.factories.AppointmentFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class AppointmentRepositoryTest {
    Map<String,String> values;
    AppointmentRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("appointmentDate","2017-08-14");
    }

    @Test
    public void create() throws Exception {
        Appointment appointment = AppointmentFactory.getAppointment(values,"12");
        repository.create(appointment);
        assertEquals("2017-08-14",appointment.getAppointmentDate());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Appointment readAppointment = repository.read("12");
        assertEquals("2017-08-14",readAppointment.getAppointmentDate());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Appointment readAppointment = repository.read("12");
        Appointment newAppointment = new Appointment.Builder()
                .appointmentDate(values.get("2017-09-09"))
                .build();
        repository.update(newAppointment);
        Appointment updatedAppointment = repository.read("12");
        assertEquals("2017-09-09", updatedAppointment.getAppointmentDate());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("12");
        Appointment appointment = repository.read("12");
        assertNull(appointment);
    }

}
