package com.patientManagement.factories;

import com.patientManagement.domain.Appointment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class AppointmentFactoryTest {
    Map<String,String> values;
    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","12");
        values.put("appointmentDate","2017-08-14");
    }
    @Test
    public void getAppointment() throws Exception {
        Appointment appointment = AppointmentFactory.getAppointment(values,"12");
        assertEquals("2017-08-14",appointment.getAppointmentDate());
    }



}
