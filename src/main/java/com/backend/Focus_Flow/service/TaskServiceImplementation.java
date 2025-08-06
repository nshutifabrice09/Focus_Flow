package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Task;
import com.backend.Focus_Flow.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImplementation implements TaskService{

    private final TaskRepository taskRepository;
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final LabelRepository labelRepository;
    private final CommentRepository commentRepository;


    @Autowired
    public TaskServiceImplementation(TaskRepository taskRepository, ProjectRepository projectRepository, UserRepository userRepository, LabelRepository labelRepository, CommentRepository commentRepository) {
        this.taskRepository = taskRepository;
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
        this.labelRepository = labelRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public Task saveTask(Task task, Long projectId, Long assignedTo, Long createdBy, Long labelId, Long commentId) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Task getTask(Long id) {
        return null;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        return null;
    }

    @Override
    public void removeTask(Long id) {

    }
}
