package clinica.med.apiClinica.funcionario;
import clinica.med.apiClinica.endereco.Endereco;
import jakarta.persistence.*;


@Table(name = "funcionarios")
@Entity(name = "Funcionario")
public class Funcionario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private String crm;

        @Enumerated(EnumType.STRING)
        private Especialidade especialidade;

        @Embedded
        private Endereco endereco;
}
