package myapp.dto;

import java.io.Serializable;

/**
 * DTO for {@link myapp.model.Students}
 */
public record StudentsDto(Long id,String studentName, String birthDate, int enrollmentYear,
                          String major) implements Serializable {

  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" +
        "studentName = " + studentName + ", " +
        "birthDate = " + birthDate + ", " +
        "enrollmentYear = " + enrollmentYear + ", " +
        "major = " + major + ")";
  }
}