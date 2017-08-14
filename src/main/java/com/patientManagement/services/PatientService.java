package com.patientManagement.services;

import com.patientManagement.domain.Patient;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface PatientService {
    Patient create(Patient patient);
    Patient read(String id);
    Patient update(Patient patient);
    void delete(String id);
}
