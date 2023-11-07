package com.api.spring.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.spring.model.Tutorial;
import com.api.spring.model.UserDetails;
import com.api.spring.repository.TutorialRepository;
import com.api.spring.requestBody.ExampleRequestBody;
import com.api.spring.services.CreateRegisterService;



@Service
//When our service catches an exception, they will automatically revert the changes even if we already save it with JPA
@Transactional(rollbackFor = { Exception.class})
public class CreateRegisterImplementation implements CreateRegisterService {
	private Optional<Tutorial> userDetails;
	private Optional<Tutorial> tutorial;
	private  ExampleRequestBody serviceExampleRequestBody;
	@Autowired
	private TutorialRepository tutorialRepository;
	
	public void setServiceExampleRequestBody(ExampleRequestBody serviceExampleRequestBody) {
		this.serviceExampleRequestBody = serviceExampleRequestBody;
	}

	
	private void findTutorialRegister() throws Exception {
		tutorial = tutorialRepository.findById(1L);
		if (!tutorial.isPresent())throw new Exception("Register not found");
	}
	private void updateTutorial() {
		tutorial.ifPresent(null);
	}

	private void findUserDetailsRegister() throws Exception {
		userDetails = tutorialRepository.findById(serviceExampleRequestBody.getCui());
		if (tutorial==null)throw new Exception("Theres no register ");
		System.out.println("Error passed");
		System.out.println("Error passed");
		System.out.println("Error passed");
		System.out.println("Error passed");
		System.out.println("Error passed");
		System.out.println("Error passed");
		System.out.println("Error passed");
		
	}
	
	private void updateUserDetails() {

	}
	
	public void updateRegisters() throws Exception {
	findTutorialRegister();
	updateTutorial();
	findUserDetailsRegister();
	updateUserDetails();
	}
	
}
