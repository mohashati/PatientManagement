package com.patientManagement.repositories.Implementation;


import com.patientManagement.domain.Doctor;
import com.patientManagement.repositories.DoctorRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DoctorRepositoryImplementation implements  DoctorRepository {
    private static DoctorRepositoryImplementation repository = null;
    private Map<String, Doctor> doctorTable;
    private DoctorRepositoryImplementation(){doctorTable = new HashMap<String, Doctor>();}

    public static DoctorRepositoryImplementation getInstance(){
        if(repository ==null)
            repository = new DoctorRepositoryImplementation();
        return repository;
    }

    public Doctor create(Doctor doctor) {
        doctorTable.put(doctor.getId(),doctor);
        Doctor addDoctor = doctorTable.get(doctor.getId());
        return addDoctor;
    }

    public Doctor read(String id) {
        Doctor doctor = doctorTable.get(id);
        return doctor;
    }

    public Doctor update(Doctor doctor) {
        doctorTable.put(doctor.getId(),doctor);
        Doctor updateDoctor = doctorTable.get(doctor.getId());
        return updateDoctor;
    }

    public void delete(String id) {
        doctorTable.remove(id);
    }
}
