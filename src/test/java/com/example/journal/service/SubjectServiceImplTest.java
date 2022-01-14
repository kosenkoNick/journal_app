package com.example.journal.service;

import com.example.journal.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SubjectServiceImplTest {

  @Autowired
  SubjectService service;

  @Autowired
  SubjectRepository subjectRepository;

}