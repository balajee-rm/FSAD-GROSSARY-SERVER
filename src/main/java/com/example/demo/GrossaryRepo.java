package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GrossaryRepo extends JpaRepository<Grossary, Long> {
	public Grossary findByPid(int pid);

}
