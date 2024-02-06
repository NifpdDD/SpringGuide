package myapp.repository;

import myapp.model.Faculties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultiesRepository extends JpaRepository<Faculties, Long> {

    public Faculties findByFacultyName(String facultyName);
}
