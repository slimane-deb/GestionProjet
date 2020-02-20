package java.controller;

import java.model.Projet;
import java.service.IProjetService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/projet")
public class ProjetController {
	
	@Autowired
	private IProjetService projetService;
	
	@RequestMapping(value = "/")
	public String projet(Model model) {
		List<Projet> projets = projetService.selectAll();
		if (projets == null) {
			projets = new ArrayList<Projet>();
		}
		model.addAttribute("projets", projets);
		return "/projet/projet";
                
	}
        
     
}
