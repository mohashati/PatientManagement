package com.patientManagement.repositories.Implementation;

import com.patientManagement.domain.Appointment;
import com.patientManagement.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmoshasha on 2017/08/13.
 */
@Controller
@Repository
public class AppointmentRepositoryImplementation implements AppointmentRepository {
    @Autowired
    private static AppointmentRepositoryImplementation repository = null;
    private Map<String, Appointment> appointmentTable;
    private AppointmentRepositoryImplementation(){appointmentTable = new HashMap<String, Appointment>();}

    public static AppointmentRepositoryImplementation getInstance(){
        if(repository ==null)
            repository = new AppointmentRepositoryImplementation();
        return repository;
    }
    @RequestMapping(path="/add")
    public Appointment create(Appointment appointment) {
        appointmentTable.put(appointment.getId(),appointment);
        Appointment addAppointment = appointmentTable.get(appointment.getId());
        return addAppointment;
    }

    @RequestMapping(path="/read")
    public Appointment read(String id) {
        Appointment appointment = appointmentTable.get(id);
        return appointment;
    }
    @RequestMapping(path="/update")
    public Appointment update(Appointment appointment) {
        appointmentTable.put(appointment.getId(),appointment);
        Appointment updateAppointment = appointmentTable.get(appointment.getId());
        return updateAppointment;
    }

    @RequestMapping(path="/delete")
    public void delete(String id) {
        appointmentTable.remove(id);
    }
}
