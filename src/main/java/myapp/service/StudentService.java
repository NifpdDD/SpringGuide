package myapp.service;

import java.util.List;
import myapp.dto.StudentsDto;
import myapp.mapper.StudentsMapper;
import myapp.model.Students;
import myapp.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    private final StudentsRepository studentsRepository;
    private final StudentsMapper studentsMapper;

    @Autowired
    public StudentService(StudentsRepository studentsRepository, StudentsMapper studentsMapper) {
        this.studentsRepository = studentsRepository;
        this.studentsMapper = studentsMapper;
    }

    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    public Students getStudentById(Long id) {
        return studentsRepository.findById(id).orElse(null);
    }

    @Transactional()
    public void addStudent(StudentsDto student) {
        studentsRepository.save(studentsMapper.toEntity(student));
    }

    public void updateStudent(StudentsDto updatedStudentDto) {
        var existingStudent = studentsRepository.findById(updatedStudentDto.id())
            .orElseThrow(() -> new RuntimeException("Student not found"));
        existingStudent.setBirthDate(updatedStudentDto.birthDate());
        existingStudent.setStudentName(updatedStudentDto.studentName());
        existingStudent.setEnrollmentYear(updatedStudentDto.enrollmentYear());
        existingStudent.setMajor(updatedStudentDto.major());
        studentsRepository.save(existingStudent);
    }

    public void deleteStudent(Long id) {
        studentsRepository.deleteById(id);
    }
}
