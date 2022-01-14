package com.example.journal.model.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubjectDto implements Serializable {
  private Long id;
  private String name;
  private List<GroupDto> groups;
  private List<TutorDto> tutors;

}
