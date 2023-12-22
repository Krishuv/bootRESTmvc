package com.sr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.entities.AssistantS;

public interface Repo extends JpaRepository<AssistantS, Integer> {
	

}
