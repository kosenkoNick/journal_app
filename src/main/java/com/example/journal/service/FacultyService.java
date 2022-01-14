package com.example.journal.service;

import com.example.journal.model.dto.FacultyDto;

public interface FacultyService {

  void create(FacultyDto dto);
  FacultyDto readById(Long id);
  //  void update(AttendanceDto dto);
  void delete(Long id);

}
