package clinica.med.apiClinica.controller;

import clinica.med.apiClinica.funcionario.DadosCadastroFuncionario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroFuncionario dados){

    }

}
