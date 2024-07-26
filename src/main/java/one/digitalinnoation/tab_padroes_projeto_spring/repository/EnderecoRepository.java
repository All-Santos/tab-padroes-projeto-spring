package one.digitalinnoation.tab_padroes_projeto_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import one.digitalinnoation.tab_padroes_projeto_spring.model.Endereco;



@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}

