package myapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "student_name")
    private String studentName;

    @Column(name = "birth_date")
    private String birthDate;
    @ManyToOne
    @JoinColumn(name = "faculty_id", referencedColumnName = "faculty_id")
    private Faculties facultyId;

    @Column(name = "enrollment_year")
    private int enrollmentYear;

    @Column(name = "major")
    private String major;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Faculties getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Faculties facultyId) {
        this.facultyId = facultyId;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
