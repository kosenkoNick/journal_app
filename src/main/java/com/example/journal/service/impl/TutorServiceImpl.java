package com.example.journal.service.impl;

import com.example.journal.model.dao.TutorDao;
import com.example.journal.repository.TutorRepository;
import com.example.journal.service.TutorService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TutorServiceImpl implements TutorService {

  private final TutorRepository tutorRepository;

  @Override
  public TutorDao create(TutorDao dao) {
    return tutorRepository.save(dao);
  }

  @Override
  public TutorDao readById(Long id) throws NoSuchObjectException {
    Optional<TutorDao> opt = tutorRepository.findById(id);
    if(opt.isPresent()){
      return opt.get();
    }else{
      throw new NoSuchObjectException("There is a problem");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    TutorDao dao = readById(id);
    tutorRepository.delete(dao);
  }
}
