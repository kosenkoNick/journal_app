package com.example.journal.model.dao;

import com.example.journal.model.enums.Role;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TutorDao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @NotBlank(message = "There should be a name")
  @Size(min = 2, max = 12, message = "Name should be more between 2 and 15 characters length")
  private String name;

  @NotNull
  @NotBlank(message = "There should be a last name")
  @Size(min = 2, max = 12, message = "Last name should be more between 2 and 15 characters length")
  private String surname;

  @ManyToMany(mappedBy = "tutors")
  private List<FacultyDao> faculties;

  @ManyToMany(mappedBy = "tutors")
  private List<SubjectDao> subjects;

  //  Security details
  private String username;
  private String password;
  private Role role;

}
