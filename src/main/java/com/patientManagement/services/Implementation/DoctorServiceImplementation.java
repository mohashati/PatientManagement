package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Doctor;
import com.patientManagement.repositories.Implementation.DoctorRepositoryImplementation;
import com.patientManagement.services.DoctorService;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DoctorServiceImplementation implements DoctorService {
    private static DoctorServiceImplementation service = null;

    DoctorRepositoryImplementation repository = DoctorRepositoryImplementation.getInstance();

    public static DoctorServiceImplementation getInstance(){
        if(service == null)
            service = new DoctorServiceImplementation();
        return service;
    }

    public Doctor create(Doctor doctor) {return repository.create(doctor);}

    public Doctor read(String id) {return repository.read(id);}

    public Doctor update(Doctor doctor) {return repository.update(doctor);}

    public void delete(String id) {repository.delete(id);}
}
