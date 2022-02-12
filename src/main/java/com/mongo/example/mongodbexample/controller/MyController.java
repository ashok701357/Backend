package com.mongo.example.mongodbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.mongodbexample.model.Polls;


@RestController


//@CrossOrigin(origins="http://localhost:3000/")
@RequestMapping("/poll")
public class MyController {
	
	@Autowired
	private PollRepository pollRepository;
	@PostMapping("/")
	public ResponseEntity<?> addPoll(@RequestBody Polls polls){
		Polls save =this.pollRepository.save(polls);
				return ResponseEntity.ok(save);
				}
	
//	@GetMapping("/getpollslist")
//	public ResponseEntity<?> getPolls(){
//		
//				return ResponseEntity.ok(this.pollRepository.findAll());
//				}
	@GetMapping("/getpollslist")
	public List<Polls> getPolls(){
		
				return  pollRepository.findAll();
				}


}
