package com.example.journal.model.dto;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class TutorDto implements Serializable {
  private Long id;
  @NotNull
  @NotBlank(message = "There should be a name")
  @Size(min = 2, max = 12, message = "Name should be more between 2 and 15 characters length")
  private  String name;
  @NotNull
  @NotBlank(message = "There should be a last name")
  @Size(min = 2, max = 12, message = "Last name should be more between 2 and 15 characters length")
  private  String surname;
  private  List<FacultyDto> faculties;
  private  List<SubjectDto> subjects;
  private  String username;
  private  String password;
  private  String role;
}
