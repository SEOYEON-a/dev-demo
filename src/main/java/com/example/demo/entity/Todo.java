package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

	private String content;
	
	private boolean done;
	
	// 생성자
    public Todo() {}

    public Todo(String content) {
        this.content = content;
        this.done = false;
    }
    
    // Getter, Setter
    public Long getId() {
    	return id; 
    }
    
    public String getContent() { 
    	return content; 
    }
    
    public void setContent(String content) { 
    	this.content = content; 
    }

    public boolean isDone() { 
    	return done; 
    }
    
    public void setDone(boolean done) { 
    	this.done = done; 
    }
}
