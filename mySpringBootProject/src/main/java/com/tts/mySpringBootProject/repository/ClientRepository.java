package com.tts.mySpringBootProject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.mySpringBootProject.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
	List<Client> findByRepLastName(String repLastName);
}
