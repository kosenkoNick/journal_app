package com.example.journal.model.dto;

import com.example.journal.model.Group;
import com.example.journal.model.Tutor;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class SubjectDto implements Serializable {
  private final Long id;
  private final String name;
  private final List<Group> groups;
  private final List<Tutor> tutors;
}
