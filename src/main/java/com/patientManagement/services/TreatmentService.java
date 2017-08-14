package com.patientManagement.services;

import com.patientManagement.domain.Treatment;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public interface TreatmentService {
    Treatment create(Treatment treatment);

    Treatment read(String id);

    Treatment update(Treatment treatment);

    void delete(String id);
}
