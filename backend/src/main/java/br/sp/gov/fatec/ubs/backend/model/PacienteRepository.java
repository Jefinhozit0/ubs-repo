package br.sp.gov.fatec.ubs.backend.model;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
 
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
     
        public List<Paciente> findByNomeContainsIgnoreCase(String nome);
     
        @Query("select p from paciente p where p.nome = :nome")
        public List<Paciente> buscaPorNome(@Param("nome") String nome);
     
        @Query("select p from paciente p where p.nome = :nome and p.cpf = :cpf")
        public List<Paciente> buscaPorNomeECpf(@Param("nome") String nome, @Param("cpf") String cpf);
     
        @Query("select p from paciente p where p.nome = :nome or p.cpf = :cpf")
        public List<Paciente> buscaPorNomeOuCpf(@Param("nome") String nome, @Param("cpf") String cpf);
     
        @Query(value = "select * from paciente where nome = :nome", nativeQuery = true)
        public List<Paciente> buscaPorNomeNativo(@Param("nome") String nome);
     

}
 