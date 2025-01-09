package clinica.med.apiClinica.controller;

import clinica.med.apiClinica.funcionario.DadosCadastroFuncionario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @PostMapping
    public void cadastrar(@ResponseBody DadosCadastroFuncionario dados){


    }

}
