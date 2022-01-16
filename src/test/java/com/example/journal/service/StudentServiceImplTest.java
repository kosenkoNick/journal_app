package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.journal.model.dao.StudentDao;
import com.example.journal.model.enums.Role;
import com.example.journal.repository.StudentRepository;
import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentServiceImplTest {

  @Autowired
  StudentRepository repository;

  @Autowired
  StudentService studentService;

  @Test
  void create() {
    assertDoesNotThrow(this::getExample);
  }

  @Test
  void readAndSearch() throws NoSuchObjectException {
    StudentDao exp = getExample();
    StudentDao act = studentService.readById(exp.getId());
    assertEquals(exp.getCourse(), act.getCourse());
    assertEquals(exp.getName(), act.getName());
    assertEquals(exp.getPassword(), act.getPassword());
    assertEquals(exp.getRole(), act.getRole());
    assertEquals(exp.getSurname(), act.getSurname());
    assertEquals(exp.getUsername(), act.getUsername());
  }

  @Test
  void delete() {
    assertThrows(NoSuchObjectException.class, () -> studentService.readById(25000L));
  }

  StudentDao getExample(){
    StudentDao dao = new StudentDao();
    dao.setCourse(2);
    dao.setName("nick");
    dao.setPassword("qwerty");
    dao.setRole(Role.ADMIN);
    dao.setSurname("kose");
    dao.setUsername("nickos");
    return studentService.create(dao);
  }
}