package com.example.journal.service.impl;

import com.example.journal.model.dao.GroupDao;
import com.example.journal.repository.GroupRepository;
import com.example.journal.service.GroupService;
import java.rmi.NoSuchObjectException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

  private final GroupRepository groupRepository;

  @Override
  public GroupDao create(GroupDao dao) {
    return groupRepository.save(dao);
  }

  @Override
  public GroupDao readById(Long id) throws NoSuchObjectException {
    Optional<GroupDao> opt = groupRepository.findById(id);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      throw new NoSuchObjectException("Problem!");
    }
  }

  @Override
  public void delete(Long id) throws NoSuchObjectException {
    GroupDao dao = readById(id);
    groupRepository.delete(dao);
  }
}
