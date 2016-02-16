package com.etudiant.myapp.dao;

import java.util.List;

public interface IGestionDAO {
	
	public void ajouterEtudiant(Etudiant e);
	public void supprimerEtudiant(int cin);
	public List<Etudiant> consulterTous();
	public void modifierEtudiant(Etudiant e);
	public List<Etudiant> ConsulterParMotCle(String mc);

}
