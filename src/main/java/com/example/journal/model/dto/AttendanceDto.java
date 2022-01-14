package com.example.journal.model.dto;

import com.example.journal.model.Student;
import com.example.journal.model.Subject;
import com.example.journal.model.enums.ClassType;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class AttendanceDto implements Serializable {
  private final Long id;
  private final LocalDateTime date;
  private final Student student;
  private final boolean isAbsent;
  private final Subject subject;
  private final ClassType type;
}
