package com.mongo.example.mongodbexample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pollslist")
public class Polls {
	private int pollid;
	private String pollname;
	private String pollcreateby;
	private String category;
	public Polls(String category) {
		
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	private String question;
	
	private String option1;
	private String option2;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public Polls(int pollid, String pollname, String pollcreateby,String question, String option1, String option2,String category) {
		//super();
		this.pollid = pollid;
		this.pollname = pollname;
		this.pollcreateby = pollcreateby;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.category = category;
	}
	
	public int getPollid() {
		return pollid;
	}
	public void setPollid(int pollid) {
		this.pollid = pollid;
	}
	public String getPollname() {
		return pollname;
	}
	public void setPollname(String pollname) {
		this.pollname = pollname;
	}
	public String getPollcreateby() {
		return pollcreateby;
	}
	public void setPollcreateby(String pollcreateby) {
		this.pollcreateby = pollcreateby;
	}

}
