package coder.navidad.gestioncoder.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoderRepository extends CrudRepository<Coder, Long> { }

