package com.example.journal.repository;

import com.example.journal.model.dao.AttendanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceDao, Long> {
}