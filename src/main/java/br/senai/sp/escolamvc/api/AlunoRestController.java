package br.senai.sp.escolamvc.api;

import br.senai.sp.escolamvc.model.Aluno;
import br.senai.sp.escolamvc.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class AlunoRestController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/listar")
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }

    @PostMapping("/inserir")
    public void  inserir(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @PutMapping("/alterar")
    public void  alterar(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}

