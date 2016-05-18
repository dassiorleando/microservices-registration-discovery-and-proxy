package com.thedevbridge.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.thedevbridge.model.Consultation;
import com.thedevbridge.repository.ConsultationRepository;

/**
 * Created by dassiorleando on 3/24/16.
 */
@Service
public class ConsultationService {

    @Inject
    private ConsultationRepository consultationRepository;

    public Consultation save(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    public Page<Consultation> getConsultations(int page) {
    	return consultationRepository.findAll(new PageRequest(page, 2));
    }
    
    public void remove(String id) {
		consultationRepository.delete(id);
	}

	public List<Consultation> getAllConsultations() {
		return consultationRepository.findAll();
	}
}
