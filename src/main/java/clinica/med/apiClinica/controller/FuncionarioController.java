package clinica.med.apiClinica.controller;

import clinica.med.apiClinica.funcionario.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFuncionario dados){
        repository.save(new Funcionario(dados));
    }
    @GetMapping
    public Page<DadosListarFuncionario> listar(@PageableDefault(size = 15, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllFuncionarios(paginacao);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtulizarFuncionario dados) {

    }


}
