package com.patientManagement.services;

import com.patientManagement.domain.Appointment;
import com.patientManagement.factories.AppointmentFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class AppointmentServiceTest {
    Map<String,String> values;
    AppointmentService service;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("appointmentDate","2017-08-14");
    }

    @Test
    public void create() throws Exception {
        Appointment appointment = AppointmentFactory.getAppointment(values,"12");
        service.create(appointment);
        assertEquals("2017-08-14",appointment.getAppointmentDate());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Appointment readAppointment = service.read("12");
        assertEquals("2017-08-14",readAppointment.getAppointmentDate());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Appointment readAppointment = service.read("12");
        Appointment newAppointment = new Appointment.Builder()
                .appointmentDate(values.get("2017-09-09"))
                .build();
        service.update(newAppointment);
        Appointment updatedAppointment = service.read("12");
        assertEquals("2017-09-09", updatedAppointment.getAppointmentDate());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("12");
        Appointment appointment = service.read("12");
        assertNull(appointment);
    }
}
