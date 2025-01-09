package clinica.med.apiClinica.endereco;

public record Endereco(
        String logadouro,
        String Bairro,
        String cep,
        String uf,
        String complemento,
        String numero
) {
}
