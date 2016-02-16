package com.etudiant.myapp.metier;

import java.util.List;

import com.etudiant.myapp.dao.Etudiant;
import com.etudiant.myapp.dao.IGestionDAO;

public class ImplGestionMetier implements IGestionMetier {
	
	private IGestionDAO dao;
	
	

	public IGestionDAO getDao() {
		return dao;
	}

	public void setDao(IGestionDAO dao) {
		this.dao = dao;
	}

	@Override
	public void ajouterEtudiant(Etudiant e) {
		dao.ajouterEtudiant(e);
	}

	@Override
	public void supprimerEtudiant(int cin) {
			dao.supprimerEtudiant(cin);
	}

	@Override
	public List<Etudiant> consulterTous() {
		return dao.consulterTous();
	}

	@Override
	public void modifierEtudiant(Etudiant e) {
			dao.modifierEtudiant(e);
	}

	@Override
	public List<Etudiant> ConsulterParMotCle(String mc) {
		return dao.ConsulterParMotCle(mc);
	}

}
