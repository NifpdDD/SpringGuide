package test_rest.model;

import jakarta.persistence.*;


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

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setFacultyId(Faculties facultyId) {
    this.facultyId = facultyId;
  }

  public Faculties getFacultyId() {
    return facultyId;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getMajor() {
    return major;
  }

}
