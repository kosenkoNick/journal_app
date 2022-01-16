package com.example.journal.service;

import com.example.journal.model.dao.TutorDao;
import java.rmi.NoSuchObjectException;

public interface TutorService {

  TutorDao create(TutorDao dto);
  TutorDao readById(Long id) throws NoSuchObjectException;
  //  void update(AttendanceDto dto);
  void delete(Long id) throws NoSuchObjectException;

}
