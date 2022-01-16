package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.journal.model.dao.SubjectDao;
import com.example.journal.repository.SubjectRepository;
import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SubjectServiceImplTest {

  @Autowired
  SubjectRepository repository;

  @Autowired
  SubjectService subjectService;

  @Test
  void create() {
    assertDoesNotThrow(this::getExample);
  }

  @Test
  void readAndSearch() throws NoSuchObjectException {
    SubjectDao exp = getExample();
    SubjectDao act = subjectService.readById(exp.getId());
    assertEquals(exp.getName(), act.getName());
  }

  @Test
  void delete() {
    assertThrows(NoSuchObjectException.class, () -> subjectService.readById(25000L));
  }

  SubjectDao getExample(){
    SubjectDao dao = new SubjectDao();
    dao.setName("name");
    return subjectService.create(dao);
  }
}