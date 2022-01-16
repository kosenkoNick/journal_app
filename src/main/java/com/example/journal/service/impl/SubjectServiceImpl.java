package com.example.journal.service.impl;

import com.example.journal.MapStructMapper;
import com.example.journal.model.dao.SubjectDao;
import com.example.journal.model.dto.SubjectDto;
import com.example.journal.repository.SubjectRepository;
import com.example.journal.service.SubjectService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository subjectRepository;
  private final MapStructMapper mapper;

  public SubjectServiceImpl(SubjectRepository subjectRepository,
                            MapStructMapper mapper) {
    this.subjectRepository = subjectRepository;
    this.mapper = mapper;
  }

  @Override
  public void create(SubjectDto dto) {
    subjectRepository.save(mapper.subjectDtoToDao(dto));
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
  public void delete(Long id) {

  }
}
