package com.example.journal.service;

import com.example.journal.model.dao.GroupDao;
import java.rmi.NoSuchObjectException;

public interface GroupService {

  GroupDao create(GroupDao dao);
  GroupDao readById(Long id) throws NoSuchObjectException;
  //  void update(AttendanceDto dto);
  void delete(Long id) throws NoSuchObjectException;

}
