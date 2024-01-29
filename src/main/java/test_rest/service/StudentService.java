package test_rest.service;

import test_rest.model.Students;
import test_rest.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
  private final StudentsRepository studentsRepository;

  @Autowired
  public StudentService(StudentsRepository studentsRepository) {
    this.studentsRepository = studentsRepository;
  }

  public List<Students> getAllStudents() {
    return studentsRepository.findAll();
  }

  public Students getStudentById(Long id) {
    return studentsRepository.findById(id).orElse(null);
  }

  public Students addStudent(Students student) {
    studentsRepository.save(student);
    return student;
  }

  public void updateStudent(Students student) {
    studentsRepository.save(student);
  }

  public void deleteStudent(Long id) {
    studentsRepository.deleteById(id);
  }
}
