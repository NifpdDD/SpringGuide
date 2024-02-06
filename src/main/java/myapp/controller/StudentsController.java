package myapp.controller;

import myapp.dto.StudentsDto;
import myapp.mapper.StudentsMapper;
import myapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

  private final StudentService studentService;
  private final StudentsMapper studentsMapper;

  @Autowired
  public StudentsController(StudentService studentService,
                            StudentsMapper studentsMapper) {
    this.studentService = studentService;
    this.studentsMapper = studentsMapper;
  }

  @GetMapping
  public List<StudentsDto> getAllStudents() {
    return studentService.getAllStudents().stream().map(studentsMapper::toDto).toList();
  }

  @GetMapping("/{id}")
  public StudentsDto getStudentById(Long id) {
    return studentsMapper.toDto(studentService.getStudentById(id));
  }

  @PutMapping("/{id}")
  public void updateStudent(StudentsDto student) throws ChangeSetPersister.NotFoundException {
     studentService.updateStudent(student);
  }

  @PostMapping
  public void addStudent(StudentsDto student) {
   studentService.addStudent(student);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(Long id) {
    studentService.deleteStudent(id);
  }
}
