package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.*;
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
        Project project = projectRepository.findProjectById(projectId);
        User user = userRepository.findAssignedById(assignedTo);
        User user1= userRepository.findCreatedById(createdBy);
        Label label = labelRepository.findLabelById(labelId);
        Comment comment = commentRepository.findCommentById(commentId);
        task.setProject(project);
        task.setAssignedTo(user);
        task.setCreatedBy(user1);
        task.setLabel(label);
        task.setComment(comment);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTask(Long id) {
        return taskRepository.findTaskById(id);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task existTask = taskRepository.findTaskById(id);
        if(existTask != null){
            existTask.setTitle(task.getTitle());
            existTask.setDescription(task.getDescription());
            existTask.setPriority(task.getPriority());
            existTask.setDueDate(task.getDueDate());
            existTask.setCreatedAt(task.getCreatedAt());
            existTask.setUpdatedAt(task.getUpdatedAt());
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public void removeTask(Long id) {
        taskRepository.deleteById(id);
    }
}
