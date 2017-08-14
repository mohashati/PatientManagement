package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Patient;
import com.patientManagement.repositories.Implementation.PatientRepositoryImplementation;
import com.patientManagement.services.PatientService;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class PatientServiceImplementation implements PatientService{
    private static PatientServiceImplementation service = null;

    PatientRepositoryImplementation repository = PatientRepositoryImplementation.getInstance();

    public static PatientServiceImplementation getInstance(){
        if(service == null)
            service = new PatientServiceImplementation();
        return service;
    }

    public Patient create(Patient patient) {return repository.create(patient);}

    public Patient read(String id) {return repository.read(id);}

    public Patient update(Patient patient) {return repository.update(patient);}

    public void delete(String id) {repository.delete(id);}
}
