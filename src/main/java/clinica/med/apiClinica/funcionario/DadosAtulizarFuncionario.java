package clinica.med.apiClinica.funcionario;

import clinica.med.apiClinica.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtulizarFuncionario(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco)
      {
}
