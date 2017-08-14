package com.patientManagement.services;

import com.patientManagement.domain.Appointment;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface AppointmentService {
    Appointment create(Appointment appointment);
    Appointment read(String id);
    Appointment update(Appointment appointment);
    void delete(String id);
}
