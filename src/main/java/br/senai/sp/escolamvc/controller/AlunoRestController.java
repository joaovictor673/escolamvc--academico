package br.senai.sp.escolamvc.controller;

import br.senai.sp.escolamvc.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aluno")
public class AlunoRestController {

    @Autowired
    private AlunoRepository alunoRepository;

}
