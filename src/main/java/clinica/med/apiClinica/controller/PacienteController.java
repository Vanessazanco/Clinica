package clinica.med.apiClinica.controller;


import clinica.med.apiClinica.paciente.DadosCadastroPaciente;
import clinica.med.apiClinica.paciente.Paciente;
import clinica.med.apiClinica.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
       repository.save((new Paciente(dados)));
    }

    @GetMapping
    public Iterable<Paciente> listar(){
        return repository.findAll();
    }
}
