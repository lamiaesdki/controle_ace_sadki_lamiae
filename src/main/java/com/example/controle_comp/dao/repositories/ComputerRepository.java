package com.example.controle_comp.dao.repositories;

import com.example.controle_comp.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

    List<Computer> findByProce(String proce);
}
