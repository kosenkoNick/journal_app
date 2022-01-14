package com.example.journal.model.dto;

import com.example.journal.model.Group;
import com.example.journal.model.enums.Role;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDto implements Serializable {
  private final Long id;
  @NotNull
  @NotBlank(message = "There should be a name")
  @Size(min = 2, max = 12, message = "Name should be more between 2 and 15 characters length")
  private final String name;
  @NotNull
  @NotBlank(message = "There should be a last name")
  @Size(min = 2, max = 12, message = "Last name should be more between 2 and 15 characters length")
  private final String surname;
  @NotNull
  @Size(min = 1, max = 7)
  private final int course;
  private final Group group;
  private final String username;
  private final String password;
  private final Role role;
}
