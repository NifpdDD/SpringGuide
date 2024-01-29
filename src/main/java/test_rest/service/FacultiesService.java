package test_rest.service;

import test_rest.model.Faculties;
import test_rest.repository.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultiesService {
  private final FacultiesRepository facultiesRepository;

  @Autowired
  public FacultiesService(FacultiesRepository facultiesRepository) {
    this.facultiesRepository = facultiesRepository;
  }

  public List<Faculties> getAllFaculties() {
    return facultiesRepository.findAll();
  }

  public Faculties getFacultiesById(Long id) {
    return facultiesRepository.findById(id).orElse(null);
  }

  public Faculties addFaculties(Faculties faculties) {
    facultiesRepository.save(faculties);
    return faculties;
  }

  public Faculties updateFaculties(Faculties faculties) {
    facultiesRepository.save(faculties);
    return faculties;
  }

  public void deleteFaculties(Long id) {
    facultiesRepository.deleteById(id);
  }

}
