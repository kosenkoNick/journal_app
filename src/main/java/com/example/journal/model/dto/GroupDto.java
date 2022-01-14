package com.example.journal.model.dto;

import com.example.journal.model.Subject;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class GroupDto implements Serializable {
  private final Long id;
  private final String name;
  private final List<Subject> subjects;
}
