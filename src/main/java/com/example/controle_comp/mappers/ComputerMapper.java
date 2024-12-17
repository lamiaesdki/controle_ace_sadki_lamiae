package com.example.controle_comp.mappers;

import com.example.controle_comp.dao.entities.Computer;
import com.example.controle_comp.dtos.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto  fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }
}
