package test_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test_rest.model.Faculties;

@Repository
public interface FacultiesRepository extends JpaRepository<Faculties, Long> {
}
