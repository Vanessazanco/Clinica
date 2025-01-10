package clinica.med.apiClinica.controller;

import clinica.med.apiClinica.funcionario.DadosCadastroFuncionario;
import clinica.med.apiClinica.funcionario.DadosListarFuncionario;
import clinica.med.apiClinica.funcionario.Funcionario;
import clinica.med.apiClinica.funcionario.FuncionarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<DadosListarFuncionario> listar(){
        return repository.findAll();
    }

}
