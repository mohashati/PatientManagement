package com.patientManagement.services.Implementation;

import com.patientManagement.domain.Treatment;
import com.patientManagement.repositories.Implementation.TreatmentRepositoryImplementation;
import com.patientManagement.services.TreatmentService;

/**
 * Created by tmoshasha on 2017/08/13.
 */
public class TreatmentServiceImplementation implements TreatmentService{
    private static TreatmentServiceImplementation service = null;

    TreatmentRepositoryImplementation repository = TreatmentRepositoryImplementation.getInstance();

    public static TreatmentServiceImplementation getInstance(){
        if(service == null)
            service = new TreatmentServiceImplementation();
        return service;
    }

    public Treatment create(Treatment treatment) {return repository.create(treatment);}

    public Treatment read(String id) {return repository.read(id);}

    public Treatment update(Treatment treatment) {return repository.update(treatment);}

    public void delete(String id) {repository.delete(id);}
}
