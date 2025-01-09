package clinica.med.apiClinica.funcionario;

import clinica.med.apiClinica.endereco.Endereco;

public record DadosCadastroFuncionario(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco
                                       ) {
}
