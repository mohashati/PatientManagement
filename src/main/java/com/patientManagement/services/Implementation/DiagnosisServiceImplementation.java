package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Diagnosis;
import com.patientManagement.repositories.Implementation.DiagnosisRepositoryImplementation;
import com.patientManagement.services.DiagnosisService;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service

/**
 * Created by tmoshasha on 2017/08/13.
 */
 
@Service
@RequestMapping(path="/patientManagement")
public class DiagnosisServiceImplementation implements DiagnosisService{
	@Autowired
    private static DiagnosisServiceImplementation service = null;

    DiagnosisRepositoryImplementation repository = DiagnosisRepositoryImplementation.getInstance();
	
	
    public static DiagnosisServiceImplementation getInstance(){
        if(service == null)
            service = new DiagnosisServiceImplementation();
        return service;
    }
	
	@GetMapping(path="/makeDiagnosis")
    public Diagnosis create(Diagnosis diagnosis) {return repository.create(diagnosis);}
	
	@GetMapping(path="/viewDiagnosis")
    public Diagnosis read(String id) {return repository.read(id);}
	
	@GetMapping(path="/updateDiagnosis")
    public Diagnosis update(Diagnosis diagnosis) {return repository.update(diagnosis);}
	
	@GetMapping(path="/deleteDiagnosis")
    public void delete(String id) {repository.delete(id);}
}
