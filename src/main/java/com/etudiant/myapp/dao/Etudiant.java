package com.etudiant.myapp.dao;

import java.io.Serializable;



import org.hibernate.validator.constraints.NotEmpty;


public class Etudiant implements Serializable{
	@NotEmpty
		private String nom;
	@NotEmpty
	private String prenom;
	
	private int telephone;
	
		private int cin;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public Etudiant(String nom, String prenom, int telephone, int cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.cin = cin;
	}
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	
	

}
