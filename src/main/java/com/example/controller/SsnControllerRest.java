package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SsnServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("This Rest Controller returns the State code with respect to ssn number")
@RestController
public class SsnControllerRest {
	
	@Autowired
	private SsnServiceImpl pservice;
	
	
	@ApiOperation("This Method is used to return the State code based on SSN Number")
	@ApiResponses({
		@ApiResponse(code=200,message="Success"),
		@ApiResponse(code=400,message="Bad Request"),
		@ApiResponse(code=500,message="Internal Server Problem")
	})
	
	
	@GetMapping(value="/getStateCodes/{ssnno}",produces= {"application/json"})
	public String getStateCodes(@ApiParam("sssNumber")@PathVariable(value="ssnno")Long ssnNo)
	{
		String codes = pservice.getStateCodes(ssnNo);
		
		return codes;

	}
	}
	
	
