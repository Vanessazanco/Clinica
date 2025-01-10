package clinica.med.apiClinica.controller;

import clinica.med.apiClinica.funcionario.DadosCadastroFuncionario;
import clinica.med.apiClinica.funcionario.Funcionario;
import clinica.med.apiClinica.funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroFuncionario dados){
        repository.save(new Funcionario(dados);
    }

}
