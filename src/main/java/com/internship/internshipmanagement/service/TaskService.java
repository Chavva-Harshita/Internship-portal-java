package com.internship.internshipmanagement.service;

import com.internship.internshipmanagement.model.Task;
import com.internship.internshipmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) { this.taskRepository = taskRepository; }

    public List<Task> getAllTasks() { return taskRepository.findAll(); }
    public List<Task> getTasksByStudentId(Long studentId) { return taskRepository.findByStudentId(studentId); }
    public List<Task> getTasksByInternshipId(Long internshipId) { return taskRepository.findByInternshipId(internshipId); }
    public Task saveTask(Task task) { return taskRepository.save(task); }
    public void deleteTask(Long id) { taskRepository.deleteById(id); }
}
