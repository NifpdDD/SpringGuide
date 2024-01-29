package test_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test_rest.controller.FacultiesController;
import test_rest.controller.StudentsController;
@SpringBootApplication
public class Demo1Application {
  private final FacultiesController facultiesController;
  private final StudentsController studentsController;

  @Autowired
  public Demo1Application(FacultiesController facultiesController, StudentsController studentsController) {
    this.facultiesController = facultiesController;
    this.studentsController = studentsController;
  }

  public static void main(String[] args) {
    SpringApplication.run(Demo1Application.class, args);
  }

}
