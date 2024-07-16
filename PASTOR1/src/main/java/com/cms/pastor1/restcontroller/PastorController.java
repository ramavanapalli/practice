package com.cms.pastor1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.pastor1.dto.LoginDto;
import com.cms.pastor1.entity.PastorEntity;
import com.cms.pastor1.service.PastorService;

@RestController
@RequestMapping("pastor")
@CrossOrigin("*")
public class PastorController {
	
	@Autowired
	private  PastorService pastorService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> savePastor(@RequestBody  PastorEntity entity ){
		String savePastor1 = pastorService.savePastor(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savePastor1);
	
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> savePastor(@RequestBody  LoginDto entity ){
		String savePastor1 = pastorService.loginpastor(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savePastor1);
	
	
	}
	@DeleteMapping("/deletepastor/{id}")
	public ResponseEntity<String> deletePastor(@PathVariable Integer id){
	 String deletepastor = pastorService.deletePastor(id);
		return ResponseEntity.status(HttpStatus.OK).body(deletepastor);
		
	}
	@GetMapping("/getAll")
	public ResponseEntity< List<PastorEntity>> getAllPastor( ){
	 List<PastorEntity> allPastor = pastorService.getAllPastor();
		return ResponseEntity.status(HttpStatus.OK).body(allPastor);
		
	}
	@PutMapping("/updatePastor/{id}")
	public ResponseEntity<PastorEntity> updatePastor(@PathVariable  Integer id, @RequestBody PastorEntity dto){
	PastorEntity status = pastorService.updatePastorData(id, dto);
		return ResponseEntity.status(HttpStatus.OK).body(status);
		
	}
}
