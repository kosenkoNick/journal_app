package com.example.journal.service.impl;

import com.example.journal.model.dao.SubjectDao;
import com.example.journal.repository.SubjectRepository;
import com.example.journal.service.SubjectService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository subjectRepository;

  @Override
  public SubjectDao create(SubjectDao dao) {
    return subjectRepository.save(dao);
  }

  @Override
  public SubjectDao readById(Long id) throws NoSuchObjectException {
    Optional<SubjectDao> opt = subjectRepository.findById(id);
    if(opt.isPresent()){
      return opt.get();
    }else{
      throw new NoSuchObjectException("There is a problem");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    SubjectDao dao = readById(id);
    subjectRepository.delete(dao);
  }
}
