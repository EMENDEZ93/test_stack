package test.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepositorio extends JpaRepository<Modelo,Long> {

}
