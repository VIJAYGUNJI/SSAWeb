package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	
	@Query("select  state from PersonEntity where ssnNo=:ssNum")
	public String getStateCodes(Long ssNum);

}
