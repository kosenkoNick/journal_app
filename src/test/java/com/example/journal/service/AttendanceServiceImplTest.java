package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.journal.model.dao.AttendanceDao;
import com.example.journal.model.enums.ClassType;
import com.example.journal.repository.AttendanceRepository;
import java.rmi.NoSuchObjectException;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AttendanceServiceImplTest {

  @Autowired
  AttendanceRepository repository;

  @Autowired
  AttendanceService attendanceService;

  @Test
  void createAndSearch() throws NoSuchObjectException {
    AttendanceDao expected = getExample();
    AttendanceDao actual = attendanceService.readById(expected.getId());
    assertEquals(expected.getDate(), actual.getDate());
    assertEquals(expected.getId(), actual.getId());
    assertEquals(expected.getType(), actual.getType());
  }

  @Test
  void delete() {
    assertThrows(NoSuchObjectException.class, () -> attendanceService.delete(25000L));
  }

  @Test
  void create(){
    assertDoesNotThrow(this::getExample);
  }

  AttendanceDao getExample() {
    AttendanceDao dao = new AttendanceDao();
    dao.setAbsent(true);
    dao.setDate(LocalDate.of(2012, 12, 12));
    dao.setType(ClassType.LECTURE);
    return attendanceService.create(dao);
  }

}