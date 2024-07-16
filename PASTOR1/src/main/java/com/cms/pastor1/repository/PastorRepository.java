package com.cms.pastor1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.pastor1.entity.PastorEntity;

public interface PastorRepository extends JpaRepository<PastorEntity,Integer>{

	PastorEntity findByEmailAndPassword(String email,String pwd);
	
	


	


}
