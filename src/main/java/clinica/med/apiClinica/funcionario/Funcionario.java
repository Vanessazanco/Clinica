package clinica.med.apiClinica.funcionario;
import clinica.med.apiClinica.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "funcionarios")
@Entity(name = "Funcionario")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Funcionario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private String crm;
        private String telefone;

        @Enumerated(EnumType.STRING)
        private Especialidade especialidade;

        @Embedded
        private Endereco endereco;

        public Funcionario(DadosCadastroFuncionario dados) {
                this.nome= dados.nome();
                this.email= dados.email();
                this.crm= dados.crm();
                this.telefone = dados.telefone();
                this.especialidade = dados.especialidade();
                this.endereco= new Endereco(dados.endereco());
        }

        public void atualizar(DadosAtulizarFuncionario dados) {
                if (dados.nome() != null) {
                        this.nome = dados.nome();
                }

                if (dados.telefone() != null) {
                        this.telefone = dados.telefone();
                }
               /* if (dados.endereco() != null) {
                        this.endereco = new Endereco(dados.endereco());
                }*/
                if (dados.endereco() != null) {
                        this.endereco.atualizarInformacoes(dados.endereco());
                }
        }
}
