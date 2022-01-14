package com.example.journal.model.dao;

import com.example.journal.model.enums.ClassType;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "attendance")
public class AttendanceDao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime date;

  @OneToOne
  private StudentDao student;

  private boolean isAbsent;

  @OneToOne
  private SubjectDao subject;

  private ClassType type;

}
