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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendance")
@AllArgsConstructor
@NoArgsConstructor
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

  public Long getId() {
    return id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public StudentDao getStudent() {
    return student;
  }

  public void setStudent(StudentDao student) {
    this.student = student;
  }

  public boolean isAbsent() {
    return isAbsent;
  }

  public void setAbsent(boolean absent) {
    isAbsent = absent;
  }

  public SubjectDao getSubject() {
    return subject;
  }

  public void setSubject(SubjectDao subject) {
    this.subject = subject;
  }

  public ClassType getType() {
    return type;
  }

  public void setType(ClassType type) {
    this.type = type;
  }
}
