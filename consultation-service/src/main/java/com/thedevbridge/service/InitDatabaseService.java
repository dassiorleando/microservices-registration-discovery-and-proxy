package com.thedevbridge.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.thedevbridge.model.Consultation;
import com.thedevbridge.model.Patient;
import com.thedevbridge.repository.ConsultationRepository;
import com.thedevbridge.repository.PatientRepository;

/**
 * Initialisation of the mongo database: consultation.
 * 
 * Created by dassiorleando on 3/24/16.
 */
@Service
public class InitDatabaseService {

	private Patient patientOne;
	private Patient patientTwo;
	
	@Inject
    private PatientRepository patientRepository;
	@Inject
    private ConsultationRepository consultationRepository;
    

    @PostConstruct
    public void initDb() {
    	boolean initPatients = initPatients();
    	
    	if(initPatients){
    		initConsultations();
    	}
    }

	private boolean initPatients() {
		// Create patients
    	patientOne = new Patient();
    	patientOne.setName("Active Spaces");
    	patientOne.setAdress("Cameroon");

    	patientTwo = new Patient();
    	patientTwo.setName("Github");
    	patientTwo.setAdress("London");
    	
    	List<Patient> patients = patientRepository.findAll();
    	
    	if (patients.isEmpty()) {
    		patientRepository.save(patientOne);
    		patientRepository.save(patientTwo);
    		return true;
		}
    	
    	return false;
	}
	
	private void initConsultations() {
		// Create consultations
		Consultation consultationOne = new Consultation();
		consultationOne.setPatient(patientOne);
		consultationOne.setMotif("Malaria");
		
		consultationRepository.save(consultationOne);
		
		Consultation consultationTwo = new Consultation();
		consultationTwo.setPatient(patientTwo);
		consultationTwo.setMotif("Malaria");
		
		consultationRepository.save(consultationTwo);
	}
}
