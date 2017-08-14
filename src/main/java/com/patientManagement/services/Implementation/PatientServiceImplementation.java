package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Patient;
import com.patientManagement.repositories.Implementation.PatientRepositoryImplementation;
import com.patientManagement.services.PatientService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

/**
 * Created by tmoshasha on 2017/08/13.
 */
 
@Service
@RequestMapping(path="/patientManagement")
public class PatientServiceImplementation implements PatientService{
	@Autowired
    private static PatientServiceImplementation service = null;

    PatientRepositoryImplementation repository = PatientRepositoryImplementation.getInstance();

    public static PatientServiceImplementation getInstance(){
        if(service == null)
            service = new PatientServiceImplementation();
        return service;
    }
	
	@GetMapping(path="/createPatient")
    public Patient create(Patient patient) {return repository.create(patient);}
	
	@GetMapping(path="/viewPatient")
    public Patient read(String id) {return repository.read(id);}
	
	@GetMapping(path="/editPatient")
    public Patient update(Patient patient) {return repository.update(patient);}
	
	@GetMapping(path="/deletePatient")
    public void delete(String id) {repository.delete(id);}
}
