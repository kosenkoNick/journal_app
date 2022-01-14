package com.example.journal.service;

import com.example.journal.model.dto.StudentDto;

public interface StudentService {

  void create(StudentDto dto);
  StudentDto readById(Long id);
  //  void update(AttendanceDto dto);
  void delete(Long id);

}
