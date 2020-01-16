package com.example.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PersonModel {
	

	public Long ssnNo;
	public String fname;
	public String lname;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	public Date dob;
	public String gender;
	public String state;

}
