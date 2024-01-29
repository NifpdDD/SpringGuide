package test_rest.controller;

import test_rest.model.Students;
import test_rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

  private final StudentService StudentService;

  @Autowired
  public StudentsController(test_rest.service.StudentService studentService) {
    StudentService = studentService;
  }

  @GetMapping
  public List<Students> getAllStudents() {
    return StudentService.getAllStudents();
  }

  @GetMapping("/{id}")
  public Students getStudentById(Long id) {
    return StudentService.getStudentById(id);
  }

  @PostMapping
  public Students addStudent(Students student) {
    return StudentService.addStudent(student);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(Long id) {
    StudentService.deleteStudent(id);
  }
}
