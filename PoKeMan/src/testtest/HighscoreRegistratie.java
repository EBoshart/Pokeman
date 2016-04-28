package testtest;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HighscoreRegistratie {

	/**
	 * Toon een overzicht van alle scores
	 */
	@RequestMapping("/")
	public String overzicht(Model model) {
		model.addAttribute("scores", HighscoreDao.all());
		return "overzicht";
	}

	
	/**
	 * Toon een detail-view van een enkele rit
	 */
	@RequestMapping(value="/rit/{id}")
	public String detailView(@PathVariable String id, Model model){
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		highscore rit = HighscoreDao.find(key);
		if(rit == null){
			// geen rit met gegeven id? error 404
			return null;
		} else {
			model.addAttribute("rit", rit);
			return "detail";
		}
	}
	
	
	/**
	 * Verwijdert gegeven rit -- zonder om bevestiging te vragen ;)
	 */
	/*@RequestMapping(value="/delete/{id}")
	public String deleteView(@PathVariable String id){
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}

		RitDao.remove(key);
		return "redirect:/";
	}*/
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String nieuw(String naam, String start){
		HighscoreDao.create(naam, start);
		return "redirect:/";
	}
}
