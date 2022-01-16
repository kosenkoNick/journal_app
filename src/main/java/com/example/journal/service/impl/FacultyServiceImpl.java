package com.example.journal.service.impl;

import com.example.journal.model.dao.FacultyDao;
import com.example.journal.repository.FacultyRepository;
import com.example.journal.service.FacultyService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FacultyServiceImpl implements FacultyService {

  private final FacultyRepository facultyRepository;

  public FacultyServiceImpl(FacultyRepository facultyRepository) {
    this.facultyRepository = facultyRepository;
  }

  @Override
  public FacultyDao create(FacultyDao dao) {
    return facultyRepository.save(dao);
  }

  @Override
  public FacultyDao readById(Long id) throws NoSuchObjectException {
    Optional<FacultyDao> opt = facultyRepository.findById(id);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      throw new NoSuchObjectException("Problem!");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    FacultyDao dao = readById(id);
    facultyRepository.delete(dao);
  }
}
