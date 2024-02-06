package myapp.controller;

import myapp.dto.FacultiesDto;
import myapp.mapper.FacultiesMapper;
import myapp.service.FacultiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultiesController {
  private final FacultiesService facultiesService;
  private final FacultiesMapper facultiesMapper;

  @Autowired
  public FacultiesController(FacultiesService facultiesService, FacultiesMapper facultiesMapper) {
    this.facultiesService = facultiesService;
    this.facultiesMapper = facultiesMapper;
  }

  @GetMapping
  public List<FacultiesDto> getAllFaculties() {
    return facultiesService.getAllFaculties().stream().map(facultiesMapper::toDto).toList();
  }

  @GetMapping("/{id}")
  public FacultiesDto getFacultiesById(@PathVariable Long id) {
    return facultiesMapper.toDto(facultiesService.getFacultiesById(id).orElse(null));
  }

  @PostMapping
  public void addFaculties(@RequestBody FacultiesDto faculties) {
    facultiesService.addFaculties(faculties);
  }

  @PutMapping("/{id}")
  public void updateFaculties(@RequestBody FacultiesDto faculties) {
    facultiesService.updateFaculties(faculties);
  }

  @DeleteMapping("/{id}")
  public void deleteFaculties(@PathVariable Long id) {
    facultiesService.deleteFaculties(id);
  }
}
