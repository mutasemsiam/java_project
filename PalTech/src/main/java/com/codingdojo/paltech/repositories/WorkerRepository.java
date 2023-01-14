package com.codingdojo.paltech.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.paltech.models.Review;
import com.codingdojo.paltech.models.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Long> {
//	List<Worker> findAll();
//	Optional<User> findByEmail(String email);
//	Optional<Worker> findById(Long id);
//
//	Worker findByEmail(String email);
	
	List<Worker> findAll();
	Optional<Worker> findByEmail(String email);
	Optional<Worker> findById(Long id);

	 @Query(value = "SELECT * FROM java_worker.workers where pic is not NULL", 
			  nativeQuery = true)
	List<Worker> getTopThree();


}
