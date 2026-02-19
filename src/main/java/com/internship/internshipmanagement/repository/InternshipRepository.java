package com.internship.internshipmanagement.repository;

import com.internship.internshipmanagement.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {
    // no extra code needed
}
