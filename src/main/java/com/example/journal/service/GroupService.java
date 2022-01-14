package com.example.journal.service;

import com.example.journal.model.dto.GroupDto;

public interface GroupService {

  void create(GroupDto dto);
  GroupDto readById(Long id);
  //  void update(AttendanceDto dto);
  void delete(Long id);

}
