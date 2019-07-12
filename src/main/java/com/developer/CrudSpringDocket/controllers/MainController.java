package com.developer.CrudSpringDocket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.developer.CrudSpringDocket.models.Cartorio;
import com.developer.CrudSpringDocket.models.CartorioRepo;

@Controller
public class MainController {
	
	@Autowired
	CartorioRepo carRepo;
	
	@RequestMapping("/")
	public ModelAndView doHome() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("lists", carRepo.findAll());
		return mv;
		
	}
	
	@PostMapping( value = "/save")
	public ModelAndView doSave(@RequestParam("id")String id, @RequestParam ("name") String name) {
		ModelAndView mv = new ModelAndView("redirect:/");
		Cartorio cartorio;
		if(!id.isEmpty()) {
			cartorio = (Cartorio)carRepo.findOne(Integer.parseInt(id));
		}else {
			cartorio = new Cartorio();
		}
		cartorio.setName(name);
		carRepo.save(cartorio);
		return mv;
	}
	
	@GetMapping(value = "/view/{id}")
	public ModelAndView doView(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("lists",carRepo.findOne(id));
		return mv;
	}
	
	
	@GetMapping( value = "/delete/{id}")
	public ModelAndView doDelete(@PathVariable ("id") int id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		carRepo.delete(id);
		return mv;
	}
	
	@GetMapping(value ="/edit/{id}")
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",carRepo.findOne(id));
        return mv;
    }

	@RequestMapping("/cartorios")
	public ModelAndView doCartorios() {
		ModelAndView mv = new ModelAndView("cartorios");
		mv.addObject("lists", carRepo.findAll());
		return mv;
		}
}
