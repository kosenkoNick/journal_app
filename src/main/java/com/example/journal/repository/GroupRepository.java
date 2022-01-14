package com.example.journal.repository;

import com.example.journal.model.dao.GroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupDao, Long> {
}