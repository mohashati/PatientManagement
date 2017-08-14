package com.patientManagement.services;

import com.patientManagement.domain.Diagnosis;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface DiagnosisService {
    Diagnosis create(Diagnosis diagnosis);
    Diagnosis read(String id);
    Diagnosis update(Diagnosis diagnosis);
    void delete(String id);
}
