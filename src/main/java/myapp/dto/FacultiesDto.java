package myapp.dto;

import java.io.Serializable;

/**
 * DTO for {@link myapp.model.Faculties}
 */

public record FacultiesDto(Long id,String facultyName, String deanName, int foundationYear) implements Serializable {

  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" +
        "facultyName = " + facultyName + ", " +
        "deanName = " + deanName + ", " +
        "foundationYear = " + foundationYear + ")";
  }
}