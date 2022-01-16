package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.journal.model.dao.TutorDao;
import com.example.journal.model.enums.Role;
import com.example.journal.repository.TutorRepository;
import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TutorServiceImplTest {

  @Autowired
  TutorRepository repository;

  @Autowired
  TutorService tutorService;

  @Test
  void create() {
    assertDoesNotThrow(this::getExample);
  }

  @Test
  void readById() throws NoSuchObjectException {
    TutorDao exp = getExample();
    TutorDao act = tutorService.readById(exp.getId());
    assertEquals(exp.getName(), act.getName());
    assertEquals(exp.getPassword(), act.getPassword());
    assertEquals(exp.getRole(), act.getRole());
    assertEquals(exp.getSurname(), act.getSurname());
    assertEquals(exp.getUsername(), act.getUsername());
  }

  @Test
  void delete() {
    assertThrows(NoSuchObjectException.class, () -> tutorService.readById(25000L));
  }

  TutorDao getExample(){
    TutorDao dao = new TutorDao();
    dao.setName("smbd");
    dao.setPassword("csEV");
    dao.setRole(Role.TUTOR);
    dao.setSurname("djwb");
    dao.setUsername("lkwqhbf");
    return tutorService.create(dao);
  }
}