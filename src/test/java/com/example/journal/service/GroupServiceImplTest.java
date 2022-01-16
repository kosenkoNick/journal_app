package com.example.journal.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.journal.model.dao.GroupDao;
import com.example.journal.repository.GroupRepository;
import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GroupServiceImplTest {

  @Autowired
  GroupRepository repository;

  @Autowired
  GroupService groupService;

  @Test
  void createAndSearch() throws NoSuchObjectException {
    GroupDao exp = getExample();
    GroupDao act = groupService.readById(exp.getId());
    assertEquals(exp.getName(), act.getName());
  }

  @Test
  void readById() {
    assertThrows(NoSuchObjectException.class, () -> groupService.readById(25000L));
  }

  @Test
  void delete() {
    assertDoesNotThrow(this::getExample);
  }

  GroupDao getExample(){
    GroupDao dao = new GroupDao();
    dao.setName("Name");
    return groupService.create(dao);
  }
}