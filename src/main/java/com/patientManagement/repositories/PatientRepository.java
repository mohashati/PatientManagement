package com.patientManagement.repositories;

import com.patientManagement.domain.Patient;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface PatientRepository {
    Patient create(Patient Pent);

    Patient read(String id);

    Patient update(Patient patient);

    void delete(String id);
}
