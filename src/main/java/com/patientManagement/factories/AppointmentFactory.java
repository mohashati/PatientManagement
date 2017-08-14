package com.patientManagement.factories;

import com.patientManagement.domain.Appointment;

import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/11.
 */
public class AppointmentFactory {
    public static Appointment getAppointment(Map<String, String> values, String id){
        Appointment appointment = new Appointment.Builder()
                .id(id)
                .appointmentDate(values.get("appointmentDate"))
                .build();
        return appointment;
    }
}
