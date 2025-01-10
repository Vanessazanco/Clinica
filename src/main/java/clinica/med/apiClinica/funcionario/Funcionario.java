package clinica.med.apiClinica.funcionario;
import clinica.med.apiClinica.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "funcionarios")
@Entity(name = "Funcionario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
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

        public Funcionario(DadosCadastroFuncionario dados) {
                this.nome= dados.nome();
                this.email= dados.email();
                this.crm= dados.crm();
                this.endereco= new Endereco(dados.endereco());
        }
}