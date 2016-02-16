package com.etudiant.myapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ImplGestionDAO implements IGestionDAO {

	private Map<Integer, Etudiant> listetudiant=new HashMap<Integer, Etudiant>();
	Logger logger=Logger.getLogger(ImplGestionDAO.class);
	
	@Override
	public void ajouterEtudiant(Etudiant e) {
		listetudiant.put(e.getCin(), e);
	}

	@Override
	public void supprimerEtudiant(int cin) {
			listetudiant.remove(cin);
	}

	@Override
	public List<Etudiant> consulterTous() {
		Collection<Etudiant> colect=listetudiant.values();
		
		return new ArrayList<Etudiant>(colect);
	}

	@Override
	public void modifierEtudiant(Etudiant e) {
			listetudiant.replace(e.getCin()	, e);
	}

	@Override
	public List<Etudiant> ConsulterParMotCle(String mc) {
		List<Etudiant> l=new ArrayList<Etudiant>();
		for(Etudiant e:listetudiant.values()){
			if(e.getNom().contains(mc)==true){
				l.add(e);
			}
			
		}
		return l;
	}
	
	public void init(){
		logger.info("test Si l'injection de dépendance marche");
		this.ajouterEtudiant(new Etudiant("HARRATHI", "Yahya", 22300400, 123421));
		this.ajouterEtudiant(new Etudiant("Mohamed", "Ali", 90200400, 329572));

		this.ajouterEtudiant(new Etudiant("SADKAOUI", "Bechir", 50111222, 123421));
		this.ajouterEtudiant(new Etudiant("Ben khira", "Karima", 50300400, 123421));

		
	}

}
