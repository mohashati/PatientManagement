package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Appointment;
import com.patientManagement.repositories.Implementation.AppointmentRepositoryImplementation;
import com.patientManagement.services.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class AppointmentServiceImplementation implements AppointmentService{
	@Autowired
    private static AppointmentServiceImplementation service = null;

    AppointmentRepositoryImplementation repository = AppointmentRepositoryImplementation.getInstance();

    public static AppointmentServiceImplementation getInstance(){
        if(service == null)
            service = new AppointmentServiceImplementation();
        return service;
    }
    @GetMapping(path="/makeAppointment")
    public Appointment create(Appointment appointment) {return  repository.create(appointment);}
	@GetMapping(path="/viewAppointment")
    public Appointment read(String id) {return repository.read(id);}
	@GetMapping(path="/changeAppointment")
    public Appointment update(Appointment appointment) {return repository.update(appointment);}
	@GetMapping(path="/cancelAppointment")
    public void delete(String id) { repository.delete(id);}
}
