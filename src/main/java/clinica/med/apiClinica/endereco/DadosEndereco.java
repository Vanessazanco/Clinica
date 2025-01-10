package clinica.med.apiClinica.endereco;

public record DadosEndereco(
        String logadouro,
        String bairro,
        String cep,
        String uf,
        String complemento,
        String numero
) {
}
