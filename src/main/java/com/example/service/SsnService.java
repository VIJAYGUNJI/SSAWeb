package com.example.service;

import java.util.List;

import com.example.model.PersonModel;

public interface SsnService {
	
	public String viewSsnPage(PersonModel model);
	
	public List<String> getAllStates();
	
	public String getStateCodes(Long ssnNo);
	
	

}
