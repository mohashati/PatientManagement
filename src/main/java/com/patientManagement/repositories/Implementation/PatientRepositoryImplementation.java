package com.patientManagement.repositories.Implementation;

import com.patientManagement.domain.Patient;
import com.patientManagement.repositories.PatientRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/13.
 */

public class PatientRepositoryImplementation implements PatientRepository {

    private static PatientRepositoryImplementation repository = null;
    private Map<String, Patient> patientTable;
    private PatientRepositoryImplementation(){patientTable = new HashMap<String, Patient>();}

    public static PatientRepositoryImplementation getInstance(){
        if(repository ==null)
            repository = new PatientRepositoryImplementation();
        return repository;
    }

    public Patient create(Patient patient) {
        patientTable.put(patient.getId(),patient);
        Patient addPatient = patientTable.get(patient.getId());
        return addPatient;
    }

    public Patient read(String id) {
            Patient readPatient = patientTable.get(id);
            return readPatient;
    }

    public Patient update(Patient patient) {
        patientTable.put(patient.getId(),patient);
        Patient updatePatient = patientTable.get(patient.getId());
        return updatePatient;
    }
	
    public void delete(String id) {
        patientTable.remove(id);
    }
}
