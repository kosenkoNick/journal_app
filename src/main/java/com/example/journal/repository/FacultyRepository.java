package com.example.journal.repository;

import com.example.journal.model.dao.FacultyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyDao, Long> {
}