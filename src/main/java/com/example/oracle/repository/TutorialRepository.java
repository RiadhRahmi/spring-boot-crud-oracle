package com.example.oracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oracle.model.Tutorial;



public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	
	// custom method
	List<Tutorial> findByPublished(boolean published);
	
	// custom method
	List<Tutorial> findByTitleContaining(String title);
}