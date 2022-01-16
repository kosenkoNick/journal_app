package com.example.journal.service.impl;

import com.example.journal.model.dao.StudentDao;
import com.example.journal.repository.StudentRepository;
import com.example.journal.service.StudentService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  @Override
  public StudentDao create(StudentDao dao) {
    return studentRepository.save(dao);
  }

  @Override
  public StudentDao readById(Long id) throws NoSuchObjectException {
    Optional<StudentDao> opt = studentRepository.findById(id);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      throw new NoSuchObjectException("Problem!");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    StudentDao dao = readById(id);
    studentRepository.delete(dao);
  }
}
