package com.patientManagement.services;

import com.patientManagement.domain.Doctor;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface DoctorService {
    Doctor create(Doctor doctor);
    Doctor read(String id);
    Doctor update(Doctor doctor);
    void delete(String id);
}
