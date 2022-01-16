package com.example.journal.service;

import com.example.journal.model.dao.FacultyDao;
import java.rmi.NoSuchObjectException;

public interface FacultyService {

  FacultyDao create(FacultyDao dao);
  FacultyDao readById(Long id) throws NoSuchObjectException;
  //  void update(AttendanceDto dto);
  void delete(Long id) throws NoSuchObjectException;

}
