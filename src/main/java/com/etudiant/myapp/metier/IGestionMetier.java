package com.etudiant.myapp.metier;

import java.util.List;

import com.etudiant.myapp.dao.Etudiant;

public interface IGestionMetier {
	
	public void ajouterEtudiant(Etudiant e);
	public void supprimerEtudiant(int cin);
	public List<Etudiant> consulterTous();
	public void modifierEtudiant(Etudiant e);
	public List<Etudiant> ConsulterParMotCle(String m);

}
