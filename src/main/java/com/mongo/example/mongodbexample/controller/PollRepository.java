package com.mongo.example.mongodbexample.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.mongodbexample.model.Polls;
 

public interface PollRepository extends MongoRepository<Polls , Integer>{

}
