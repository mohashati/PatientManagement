package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Doctor;
import com.patientManagement.repositories.Implementation.DoctorRepositoryImplementation;
import com.patientManagement.services.DoctorService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service

/**
 * Created by tmoshasha on 2017/08/13.
 */
 
@Service
@RequestMapping(path="/patientManagement")
public class DoctorServiceImplementation implements DoctorService {
	
	@Autowired
    private static DoctorServiceImplementation service = null;

    DoctorRepositoryImplementation repository = DoctorRepositoryImplementation.getInstance();

    public static DoctorServiceImplementation getInstance(){
        if(service == null)
            service = new DoctorServiceImplementation();
        return service;
    }
	
	@GetMapping(path="/createDoctor")
    public Doctor create(Doctor doctor) {return repository.create(doctor);}
	
	@GetMapping(path="/viewDoctor")
    public Doctor read(String id) {return repository.read(id);}
	
	@GetMapping(path="/updateDoctor")
    public Doctor update(Doctor doctor) {return repository.update(doctor);}

	@GetMapping(path="/deleteDoctor")
    public void delete(String id) {repository.delete(id);}
}
