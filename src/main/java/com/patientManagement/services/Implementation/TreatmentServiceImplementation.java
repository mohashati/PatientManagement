package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Treatment;
import com.patientManagement.repositories.Implementation.TreatmentRepositoryImplementation;
import com.patientManagement.services.TreatmentService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service

/**
 * Created by tmoshasha on 2017/08/13.
 */
@Service
@RequestMapping(path="/patientManagement") 
public class TreatmentServiceImplementation implements TreatmentService{
    @Autowired
	private static TreatmentServiceImplementation service = null;

    TreatmentRepositoryImplementation repository = TreatmentRepositoryImplementation.getInstance();

    public static TreatmentServiceImplementation getInstance(){
        if(service == null)
            service = new TreatmentServiceImplementation();
        return service;
    }

	@GetMapping(path="/createTreatment")
    public Treatment create(Treatment treatment) {return repository.create(treatment);}
	
	@GetMapping(path="/viewTreatment")
    public Treatment read(String id) {return repository.read(id);}
	
	@GetMapping(path="/changeTreatment")
    public Treatment update(Treatment treatment) {return repository.update(treatment);}
	
	@GetMapping(path="/deleteTreatment")
    public void delete(String id) {repository.delete(id);}
}
