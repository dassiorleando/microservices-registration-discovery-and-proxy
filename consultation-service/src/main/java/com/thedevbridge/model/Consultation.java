package com.thedevbridge.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Represent a consultation as in an hospital.
 * Created by dassiorleando on 3/24/16.
 */
@Getter
@Setter
@ToString
@Document(collection = "CONSULTATION")
public class Consultation implements Serializable{

    @Id
    private String id;
    private String motif;
    private String conclusion;
    @DBRef
    private Patient patient;
    
	public String getMotif() {
		return motif;
	}
	
	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Consultation [id=" + id + ", motif=" + motif + ", conclusion="
				+ conclusion + ", patient=" + patient + "]";
	}
	
}
