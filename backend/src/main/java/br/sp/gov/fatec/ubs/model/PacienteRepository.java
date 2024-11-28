package br.sp.gov.fatec.ubs.model;
 
import java.util.List;
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Integer> {
 
    Optional<PacienteEntity> findById(long codigo);
 
    void deleteById(long codigo);
 
    @Query(value = "SELECT * FROM paciente WHERE codigo = :codigo", nativeQuery = true)
    List<PacienteEntity> findByCodigo(@Param("codigo") Long codigo);
 
   
 
}
 
