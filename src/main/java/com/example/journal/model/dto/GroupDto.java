package com.example.journal.model.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupDto implements Serializable {
  private Long id;
  private String name;
  private List<SubjectDto> subjects;
}
