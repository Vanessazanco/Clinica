package clinica.med.apiClinica.funcionario;

public record DadosCadastroFuncionario(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
                                       ) {
}
