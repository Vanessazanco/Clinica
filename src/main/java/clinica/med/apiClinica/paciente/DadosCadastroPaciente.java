package clinica.med.apiClinica.paciente;

import clinica.med.apiClinica.endereco.Endereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        Endereco endereco
) {
}
