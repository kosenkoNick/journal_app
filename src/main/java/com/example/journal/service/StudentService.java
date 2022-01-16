package com.example.journal.service;

import com.example.journal.model.dao.StudentDao;
import java.rmi.NoSuchObjectException;

public interface StudentService {

  StudentDao create(StudentDao dao);
  StudentDao readById(Long id) throws NoSuchObjectException;
  //  void update(AttendanceDto dto);
  void delete(Long id) throws NoSuchObjectException;

}
