package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Diagnosis;
import com.patientManagement.repositories.Implementation.DiagnosisRepositoryImplementation;
import com.patientManagement.services.DiagnosisService;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class DiagnosisServiceImplementation implements DiagnosisService{

    private static DiagnosisServiceImplementation service = null;

    DiagnosisRepositoryImplementation repository = DiagnosisRepositoryImplementation.getInstance();

    public static DiagnosisServiceImplementation getInstance(){
        if(service == null)
            service = new DiagnosisServiceImplementation();
        return service;
    }
    public Diagnosis create(Diagnosis diagnosis) {return repository.create(diagnosis);}

    public Diagnosis read(String id) {return repository.read(id);}

    public Diagnosis update(Diagnosis diagnosis) {return repository.update(diagnosis);}

    public void delete(String id) {repository.delete(id);}
}
