package com.example.journal.repository;

import com.example.journal.model.dao.SubjectDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectDao, Long> {
}