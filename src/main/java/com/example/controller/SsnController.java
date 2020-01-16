package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.PersonModel;
import com.example.service.SsnServiceImpl;

@Controller
public class SsnController {
	
	
	@Autowired
	private  SsnServiceImpl ssnservice;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getAllDetails(Model model)
	{
		PersonModel smodel=new PersonModel();
		ssnservice.viewSsnPage(smodel);
		
		List<String> stateList=ssnservice.getAllStates();
		model.addAttribute("states", stateList);
		model.addAttribute("ssaweb", smodel);
		
		return "ssaDisplay";
		
	}
	
	@RequestMapping(value="/handleSunbmit",method=RequestMethod.POST)
	public String handleSubmitButton(@ModelAttribute("ssaweb")PersonModel pmodel,Model model)
	{
		
		String page = ssnservice.viewSsnPage(pmodel);
	/*	 String viewSsnPage = ssnservice.viewSsnPage(pmodel);*/
		model.addAttribute("sMsg", "Details are added successfully");
		return "ssaDisplay";
	}

}
