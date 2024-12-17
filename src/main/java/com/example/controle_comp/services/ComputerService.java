package com.example.controle_comp.services;

import com.example.controle_comp.dao.entities.Computer;
import com.example.controle_comp.dtos.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer(ComputerDto computerDto);

    public List<ComputerDto> getComputerByProce(String proce);


}
