package com.example.journal.service;

import com.example.journal.model.dao.SubjectDao;
import java.rmi.NoSuchObjectException;

public interface SubjectService {

  SubjectDao create(SubjectDao dao);

  SubjectDao readById(Long id) throws NoSuchObjectException;

  //  void update(AttendanceDto dto);

  void delete(Long id) throws NoSuchObjectException;

}
