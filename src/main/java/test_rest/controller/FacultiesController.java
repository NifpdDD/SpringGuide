package test_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test_rest.model.Faculties;
import test_rest.service.FacultiesService;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultiesController {
  private final FacultiesService facultiesService;

  @Autowired
  public FacultiesController(FacultiesService facultiesService) {
    this.facultiesService = facultiesService;
  }

  @GetMapping
  public List<Faculties> getAllFaculties() {
    return facultiesService.getAllFaculties();
  }

  @GetMapping("/{id}")
  public Faculties getFacultiesById(Long id) {
    return facultiesService.getFacultiesById(id);
  }

  @PostMapping
  public Faculties addFaculties(Faculties faculties) {
    return facultiesService.addFaculties(faculties);
  }

  @PutMapping("/{id}")
  public Faculties updateFaculties(Faculties faculties) {
    return facultiesService.updateFaculties(faculties);
  }

  @DeleteMapping("/{id}")
  public void deleteFaculties(Long id) {
    facultiesService.deleteFaculties(id);
  }

}
