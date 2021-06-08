package com.example.pagerduty.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagerduty.pojo.CreateTeam;
import com.example.pagerduty.pojo.Team;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/pagerduty")
public class PagerdutyController {
	
	@PostMapping("/createteam")
	public void createTeam(HttpServletRequest request, HttpServletResponse response) {
		
		ObjectMapper mapper = new ObjectMapper();
		CreateTeam createTeam = null;
		try {
			createTeam = mapper.readValue(request.getInputStream(), CreateTeam.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(createTeam != null) {
			// logic to invoke the service layer
		}
		
	}
	
}
