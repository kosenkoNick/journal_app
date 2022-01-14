package com.example.journal.repository;

import com.example.journal.model.dao.TutorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<TutorDao, Long> {
}