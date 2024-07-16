

package com.cms.pastor1.serviceimplementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.pastor1.dto.LoginDto;
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
		pastorRepository.deleteById(id);
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
	@Override
	public String loginpastor(LoginDto dto) {
		PastorEntity pastorEntity = pastorRepository.findByEmailAndPassword(dto.getEmail(), dto.getPassword());
		if(pastorEntity.getEmail().equals(dto.getEmail())&&pastorEntity.getPassword().equals(dto.getPassword())) {
			return "login success";
		}
		return "failed success";
	}
	}