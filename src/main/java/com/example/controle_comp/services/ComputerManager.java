package com.example.controle_comp.services;

import com.example.controle_comp.dao.entities.Computer;
import com.example.controle_comp.dao.repositories.ComputerRepository;
import com.example.controle_comp.dtos.ComputerDto;
import com.example.controle_comp.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    private ComputerMapper computerMapper;
    private ComputerRepository computerRepository;
    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        return computerDto;
    }

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }

}
