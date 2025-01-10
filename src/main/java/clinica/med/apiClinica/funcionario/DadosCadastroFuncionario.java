package clinica.med.apiClinica.funcionario;

import clinica.med.apiClinica.endereco.DadosEndereco;

public record DadosCadastroFuncionario(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco
                                       ) {
}
