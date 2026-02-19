package com.internship.internshipmanagement.repository;

import com.internship.internshipmanagement.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByStudentId(Long studentId);
    List<Feedback> findByInternshipId(Long internshipId);
}
