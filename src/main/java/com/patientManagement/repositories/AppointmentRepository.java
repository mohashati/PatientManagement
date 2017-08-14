package com.patientManagement.repositories;

import com.patientManagement.domain.Appointment;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface AppointmentRepository {
    Appointment create(Appointment appointment);

    Appointment read(String id);

    Appointment update(Appointment appointment);

    void delete(String id);
}
