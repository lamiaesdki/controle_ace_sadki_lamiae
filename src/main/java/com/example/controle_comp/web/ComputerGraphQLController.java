package com.example.controle_comp.web;


import com.example.controle_comp.dtos.ComputerDto;
import com.example.controle_comp.services.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(ComputerDto computerDto){
        return  computerService.saveComputer(computerDto);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
}
}
