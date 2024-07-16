package com.cms.pastor1.serviceimplementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.pastor1.entity.PastorEntity;
import com.cms.pastor1.repository.PastorRepository;
import com.cms.pastor1.service.PastorService;

@Service
public class PastorServiceimplementation implements PastorService {

	@Autowired
	private PastorRepository pastorRepository;

	@Override
	public String savePastor(PastorEntity entity) {
			pastorRepository.save(entity);
			return "success";
		}

	@Override
	public String deletePastor(Integer id) {
		pastorRepository.deleteById(4);
		 return "deleted";
	
	}


	@Override
	public List<PastorEntity> getAllPastor() {
		// TODO Auto-generated method stub
		return pastorRepository.findAll() ;
	}

	@Override
	public PastorEntity updatePastorData(Integer id, PastorEntity request) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}