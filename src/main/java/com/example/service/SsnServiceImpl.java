package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PersonEntity;
import com.example.model.PersonModel;
import com.example.repository.PersonRepository;
import com.example.repository.StatesRepository;

@Service
public class SsnServiceImpl implements SsnService {
	
	@Autowired
	private PersonRepository personrepo;
	
	@Autowired
	private StatesRepository statesrepo;

	@Override
	public String viewSsnPage(PersonModel model) {
		
		PersonEntity entity=new PersonEntity();
		BeanUtils.copyProperties(model, entity);
		
		entity.setState(statesrepo.getStateCode(model.getState()));
		PersonEntity save = personrepo.save(entity);
		if(save!=null)
		{
		String input=String.valueOf(save.getSsnNo()).replaceFirst("(\\d{4})(\\d{3})(\\d{2})", "($1-$2-$3)");
			
			return input;
		}
		return null;
	}
	
	@Override
	public List<String> getAllStates() {
		return statesrepo.getAllStates();
	}
	
	@Override
	public String getStateCodes(Long ssnNo) {
		return personrepo.getStateCodes(ssnNo);
	}
}
