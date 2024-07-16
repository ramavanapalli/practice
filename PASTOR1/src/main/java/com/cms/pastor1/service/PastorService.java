package com.cms.pastor1.service;

import java.util.List;

import com.cms.pastor1.dto.LoginDto;
import com.cms.pastor1.entity.PastorEntity;

public interface PastorService {

	public String savePastor(PastorEntity entity);
	
	public String loginpastor(LoginDto  dto);
	
	public String deletePastor(Integer id);
	
	public List<PastorEntity> getAllPastor();
	
	public PastorEntity updatePastorData(Integer id,PastorEntity request);

	
	

	

}

