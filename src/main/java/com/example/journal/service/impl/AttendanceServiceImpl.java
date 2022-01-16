package com.example.journal.service.impl;

import com.example.journal.model.dao.AttendanceDao;
import com.example.journal.repository.AttendanceRepository;
import com.example.journal.service.AttendanceService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {

  private final AttendanceRepository attendanceRepository;

  public AttendanceServiceImpl(
      AttendanceRepository attendanceRepository) {
    this.attendanceRepository = attendanceRepository;
  }

  @Override
  public AttendanceDao create(AttendanceDao dao) {
    return attendanceRepository.save(dao);
  }

  @Override
  public AttendanceDao readById(Long id) throws NoSuchObjectException {
    Optional<AttendanceDao> opt = attendanceRepository.findById(id);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      throw new NoSuchObjectException("Problem!");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    AttendanceDao dao = readById(id);
    attendanceRepository.delete(dao);
  }
}
