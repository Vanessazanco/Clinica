package clinica.med.apiClinica.funcionario;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FuncionarioRepository  extends JpaRepository<Funcionario,Long> {

    @Query("SELECT new clinica.med.apiClinica.funcionario.DadosListarFuncionario(f) FROM Funcionario f")
    Page<DadosListarFuncionario> findAllFuncionarios(Pageable pageable);

}
