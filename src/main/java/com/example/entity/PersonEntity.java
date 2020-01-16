package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PERSON_MASTER")
public class PersonEntity {
	
	@Id
	@SequenceGenerator(name="SSN_SEQ",sequenceName="SSN_NUM_SEQ",initialValue=987456123,allocationSize=1)
	@GeneratedValue(generator="SSN_SEQ")
	@Column(name="SSN_NO")
	public Long ssnNo;
	@Column(name="FIRST_NAME", length=30)
	public String fname;
	@Column(name="LAST_NAME", length=30)
	public String lname;
	@Column(name="DOB")
	public Date dob;
	@Column(name="GENDER", length=10)
	public String gender;
	
	
	@Column(name="STATE", length=20)
	public String state;
	
	

	

}
