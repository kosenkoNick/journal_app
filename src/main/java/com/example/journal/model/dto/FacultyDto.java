package com.example.journal.model.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class FacultyDto implements Serializable {
  private  Long id;
  private  String name;
  private  List<GroupDto> groups;
  private  List<TutorDto> tutors;
}
