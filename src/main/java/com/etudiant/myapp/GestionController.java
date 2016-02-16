package com.etudiant.myapp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etudiant.myapp.dao.Etudiant;
import com.etudiant.myapp.metier.IGestionMetier;

@Controller
public class GestionController {
	@Autowired // pour l'injection de dépendence entre couche presentation et metier
	private IGestionMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants",metier.consulterTous());
		return "index";
	}
	
	@RequestMapping(value="/saveEtudiant")
	public String saveEtudiant(@Valid Etudiant e,BindingResult bindingresult,Model model){
		if(bindingresult.hasErrors()==true)
		{
			model.addAttribute("etudiants", metier.consulterTous());
			return "index";
		}
		metier.ajouterEtudiant(e);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", metier.consulterTous());
		return "index";
	}
	
	@RequestMapping(value="/Supprimer")
	public String  Supprimer(@RequestParam int cin,Model model){
		metier.supprimerEtudiant(cin);
		model.addAttribute("etudiants", metier.consulterTous());
		model.addAttribute("etudiant", new Etudiant());
		return "index";
	}
	
	@RequestMapping(value="Modifier")
	public  String modifier(@Valid Etudiant e,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors())
		{
			model.addAttribute("etudiant", metier.consulterTous());
			return "index";
		}
		metier.modifierEtudiant(e);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiant", metier.consulterTous());
		return "index";
	}
}
