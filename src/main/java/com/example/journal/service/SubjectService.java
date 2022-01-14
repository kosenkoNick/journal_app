package com.example.journal.service;

import com.example.journal.model.dao.SubjectDao;
import com.example.journal.model.dto.SubjectDto;
import java.rmi.NoSuchObjectException;

public interface SubjectService {

  void create(SubjectDto dto);

  SubjectDao readById(Long id) throws NoSuchObjectException;

  //  void update(AttendanceDto dto);

  void delete(Long id);

}
