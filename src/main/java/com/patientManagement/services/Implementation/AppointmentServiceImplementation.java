package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Appointment;
import com.patientManagement.repositories.Implementation.AppointmentRepositoryImplementation;
import com.patientManagement.services.AppointmentService;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class AppointmentServiceImplementation implements AppointmentService{

    private static AppointmentServiceImplementation service = null;

    AppointmentRepositoryImplementation repository = AppointmentRepositoryImplementation.getInstance();

    public static AppointmentServiceImplementation getInstance(){
        if(service == null)
            service = new AppointmentServiceImplementation();
        return service;
    }

    public Appointment create(Appointment appointment) {return  repository.create(appointment);}

    public Appointment read(String id) {return repository.read(id);}

    public Appointment update(Appointment appointment) {return repository.update(appointment);}

    public void delete(String id) { repository.delete(id);}
}
