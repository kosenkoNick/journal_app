package com.example.journal.model.dao;

import com.example.journal.model.enums.ClassType;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "attendance")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AttendanceDao {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  private LocalDate date;

  @OneToOne
  private StudentDao student;

  private boolean isAbsent;

  @OneToOne
  private SubjectDao subject;

  private ClassType type;

}
