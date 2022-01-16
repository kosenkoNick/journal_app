package com.example.journal.service;

import com.example.journal.model.dao.AttendanceDao;
import java.rmi.NoSuchObjectException;

public interface AttendanceService {

  AttendanceDao create(AttendanceDao dao);
  AttendanceDao readById(Long id) throws NoSuchObjectException;
//  void update(AttendanceDto dto);
  void delete(Long id) throws NoSuchObjectException;

}
