package br.sp.gov.fatec.ubs.backend.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/pacientes"})
public class PacienteController {
    @Autowired
    PacienteRepository bd;

    @GetMapping
    public Iterable<Paciente> buscarPacientes(){
        return bd.findAll();
    }

    @GetMapping("/{idPaciente}")
    public Paciente buscarPacientePorId(@PathVariable Long idPaciente){
        return bd.findById(idPaciente).get();
    }

    @PostMapping
    public ResponseEntity<?> cadastrarPaciente(@RequestBody Paciente paciente){
        try {
            bd.save(paciente);
            return new ResponseEntity<>(paciente, HttpStatus.OK);
        } catch (Exception e) {
            Paciente pac = bd.buscaPorNomeOuCpf("", paciente.getCpf()).get(0);
            return new ResponseEntity<>(pac, HttpStatus.CONFLICT);
        }
    }

    @PutMapping(value="/{idPaciente}")
    public Paciente atualizarPaciente(@PathVariable("idPaciente") long id, @RequestBody Paciente paciente){
        return bd.findById(id).map(record->{
            record.setNome(paciente.getNome());
            return bd.save(record);
        }).orElseGet(()->{
            paciente.setId(id);
            return bd.save(paciente);
        }
        );
    }

    @DeleteMapping(path="/{idPaciente}")
    public ResponseEntity<?> deletarPaciente(@PathVariable("idPaciente") long id){
        return bd.findById(id).map(record->{
            bd.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
