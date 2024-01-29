package test_rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Faculties {

  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  @Column(name = "faculty_id")
  private Long id;
  @Column(name = "faculty_name")
  private String facultyName;

  @Column(name = "dean_name")
  private String deanName;

  @Column(name = "foundation_year")
  private int foundationYear;

  public void setFoundationYear(int foundationYear) {
    this.foundationYear = foundationYear;
  }

  public int getFoundationYear() {
    return foundationYear;
  }

  public void setFacultyName(String facultyName) {
    this.facultyName = facultyName;
  }

  public String getFacultyName() {
    return facultyName;
  }

  public void setDeanName(String deanName) {
    this.deanName = deanName;
  }

  public String getDeanName() {
    return deanName;
  }
}
