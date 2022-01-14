package com.example.journal.service;

import com.example.journal.model.dto.TutorDto;

public interface TutorService {

  void create(TutorDto dto);
  TutorDto readById(Long id);
  //  void update(AttendanceDto dto);
  void delete(Long id);

}
