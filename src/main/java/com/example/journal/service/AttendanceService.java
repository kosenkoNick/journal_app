package com.example.journal.service;

import com.example.journal.model.dto.AttendanceDto;

public interface AttendanceService {

  void create(AttendanceDto dto);
  AttendanceDto readById(Long id);
//  void update(AttendanceDto dto);
  void delete(Long id);

}
