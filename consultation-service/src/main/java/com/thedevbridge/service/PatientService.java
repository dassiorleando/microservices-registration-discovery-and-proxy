package com.thedevbridge.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.thedevbridge.model.Patient;
import com.thedevbridge.repository.PatientRepository;

/**
 * Created by dassiorleando on 3/24/16.
 */
@Service
public class PatientService {

    @Inject
    private PatientRepository patientRepository;

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public Page<Patient> getPatients(int page) {
    	return patientRepository.findAll(new PageRequest(page, 2));
    }

	public void remove(String id) {
		patientRepository.delete(id);
	}

	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
}
