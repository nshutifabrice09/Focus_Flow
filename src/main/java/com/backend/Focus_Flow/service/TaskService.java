package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Task;

import java.util.List;

public interface TaskService {
    Task saveTask(Task task, Long projectId, Long assignedTo, Long createdBy, Long labelId, Long commentId);
    List<Task> getAllTasks();
    Task getTask(Long id);
    Task updateTask(Long id, Task task);
    void removeTask(Long id);
}
