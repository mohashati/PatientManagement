package com.patientManagement.repositories.Implementation;

import com.patientManagement.domain.Diagnosis;
import com.patientManagement.repositories.DiagnosisRepository;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/13.
 */

public class DiagnosisRepositoryImplementation implements DiagnosisRepository {
    private static DiagnosisRepositoryImplementation repository = null;
    private Map<String, Diagnosis> diagnosisTable;
    private DiagnosisRepositoryImplementation(){diagnosisTable = new HashMap<String, Diagnosis>();}

    public static DiagnosisRepositoryImplementation getInstance(){
        if(repository ==null)
            repository = new DiagnosisRepositoryImplementation();
        return repository;
    }
    public Diagnosis create(Diagnosis diagnosis) {
        diagnosisTable.put(diagnosis.getId(),diagnosis);
        Diagnosis addDiagnosis = diagnosisTable.get(diagnosis.getId());
        return addDiagnosis;
    }
	
    public Diagnosis read(String id) {
        Diagnosis diagnosis = diagnosisTable.get(id);
        return diagnosis;
    }

    public Diagnosis update(Diagnosis diagnosis) {
        diagnosisTable.put(diagnosis.getId(),diagnosis);
        Diagnosis updateDiagnosis = diagnosisTable.get(diagnosis.getId());
        return updateDiagnosis;
    }

    public void delete(String id) {
        diagnosisTable.remove(id);
    }
}
