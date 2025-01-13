package clinica.med.apiClinica.funcionario;

public record DadosListarFuncionario(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListarFuncionario(String nome, String email, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
    }

}
