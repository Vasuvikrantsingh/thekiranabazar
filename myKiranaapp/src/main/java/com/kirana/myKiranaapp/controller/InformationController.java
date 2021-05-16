package com.kirana.myKiranaapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kirana.myKiranaapp.entity.Information;
import com.kirana.myKiranaapp.service.InformationService;



@Controller
@RequestMapping("/information")
public class InformationController {

	private InformationService informationService;
	
	public InformationController(InformationService theInformationService) {
		informationService = theInformationService;
		}
	
	
	//Mapping for list
	
	@GetMapping("/list")
public String listInformation(Model theModel) {
		
		// get employees from db
		List<Information> theInformation = informationService.findAll();
		
		// add to the spring model
		theModel.addAttribute("information", theInformation);
		
		
		return "information/list-information";
	}
	
	//Mapping to Add item
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Information theInformation = new Information();
		
		theModel.addAttribute("information", theInformation);
		
		return "information/information-form";
	}
	
	//Mapping to Update Stock
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("informationItem") String theItem,
									Model theModel) {
		
		// get the information from the service
		Information theInformation = informationService.findbyItem(theItem);
		
		// set information as a model attribute to pre-populate the form
		theModel.addAttribute("information", theInformation);
		
		// send over to our form
		return "information/information-form";			
	}
	
	
	//Mapping to save
	
	@PostMapping("/save")
	public String saveInformation(@ModelAttribute("information") Information theInformation) {
		
		// save the information
		informationService.save(theInformation);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/information/list";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("informationItem") String theItem) {
		
		// delete the information
		informationService.deletebyItem(theItem);
		
		// redirect to /information/list
		return "redirect:/information/list";
		
	}
	
	
}
