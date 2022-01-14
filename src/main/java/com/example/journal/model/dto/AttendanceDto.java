package com.example.journal.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class AttendanceDto implements Serializable {
  private  Long id;
  private  LocalDateTime date;
  private  StudentDto student;
  private  boolean isAbsent;
  private  SubjectDto subject;
  private  String type;
}
