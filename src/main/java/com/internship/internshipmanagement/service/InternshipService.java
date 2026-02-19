package com.internship.internshipmanagement.service;

import com.internship.internshipmanagement.model.Internship;
import com.internship.internshipmanagement.repository.InternshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {

    private final InternshipRepository internshipRepository;

    // Constructor injection
    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    // CRUD methods
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    public Internship getInternshipById(Long id) {
        return internshipRepository.findById(id).orElse(null);
    }

    public Internship saveInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    public void deleteInternship(Long id) {
        internshipRepository.deleteById(id);
    }
}
