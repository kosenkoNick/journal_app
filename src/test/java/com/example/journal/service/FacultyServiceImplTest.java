package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.journal.model.dao.FacultyDao;
import com.example.journal.repository.FacultyRepository;
import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacultyServiceImplTest {

  @Autowired
  FacultyRepository repository;

  @Autowired
  FacultyService facultyService;

  @Test
  void create() {
    assertDoesNotThrow(this::getExample);
  }

  @Test
  void createAndSearch() throws NoSuchObjectException {
    FacultyDao expected = getExample();
    FacultyDao actual = facultyService.readById(expected.getId());
    assertEquals(expected.getName(), actual.getName());
  }

  @Test
  void delete() {
    assertThrows(NoSuchObjectException.class, () -> facultyService.delete(25000L));
  }

  FacultyDao getExample() {
    FacultyDao dao = new FacultyDao();
    dao.setName("l;kfanv");
    return facultyService.create(dao);
  }
}