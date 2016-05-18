package com.thedevbridge.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represent a patient.
 * Created by dassiorleando on 3/24/16.
 */
@Getter
@Setter
@ToString
@Document(collection = "PATIENT")
public class Patient implements Serializable{

    @Id
    private String id;
    private String name;
    private String adress;
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", adress=" + adress
				+ "]";
	}
}
