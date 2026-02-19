package com.internship.internshipmanagement.service;

import com.internship.internshipmanagement.model.Feedback;
import com.internship.internshipmanagement.repository.FeedbackRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;
    public FeedbackService(FeedbackRepository feedbackRepository) { this.feedbackRepository = feedbackRepository; }

    public List<Feedback> getAllFeedbacks() { return feedbackRepository.findAll(); }
    public List<Feedback> getFeedbacksByStudentId(Long studentId) { return feedbackRepository.findByStudentId(studentId); }
    public List<Feedback> getFeedbacksByInternshipId(Long internshipId) { return feedbackRepository.findByInternshipId(internshipId); }
    public Feedback saveFeedback(Feedback feedback) { return feedbackRepository.save(feedback); }
    public void deleteFeedback(Long id) { feedbackRepository.deleteById(id); }
}
