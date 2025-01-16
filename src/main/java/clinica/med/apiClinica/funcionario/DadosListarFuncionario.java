package clinica.med.apiClinica.funcionario;

public record DadosListarFuncionario(

        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListarFuncionario(Funcionario funcionario) {
        this(
                funcionario.getNome(),
                funcionario.getEmail(),
                funcionario.getCrm(),
                funcionario.getEspecialidade());
    }

}
