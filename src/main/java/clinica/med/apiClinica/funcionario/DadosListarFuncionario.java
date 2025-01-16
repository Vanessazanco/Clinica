package clinica.med.apiClinica.funcionario;

public record DadosListarFuncionario(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListarFuncionario(Funcionario funcionario) {
        this(   funcionario.getId(),
                funcionario.getNome(),
                funcionario.getEmail(),
                funcionario.getCrm(),
                funcionario.getEspecialidade());
    }

}
