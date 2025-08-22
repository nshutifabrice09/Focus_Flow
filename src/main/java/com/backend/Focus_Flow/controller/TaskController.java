package com.backend.Focus_Flow.controller;

import com.backend.Focus_Flow.model.Task;
import com.backend.Focus_Flow.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/task/{projectId}/{assignedTo}/{createdBy}/{labelId}/{commentId}")
    public Task save(@RequestBody Task task,
                     @PathVariable ("projectId") Long projectId,@PathVariable("assignedTo") Long assignedTo, @PathVariable("createdBy") Long createdBy,
                     @PathVariable("labelId") Long labelId, @PathVariable ("commentId") Long commentId){
        return taskService.saveTask(task, projectId, assignedTo, createdBy, labelId, commentId);
    }

    @GetMapping("/tasks")
    public List<Task> taskList(){
        return taskService.getAllTasks();
    }

    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable ("id") Long id){
        return taskService.getTask(id);
    }

    @PutMapping("/update/task/{id}")
    public Task updateTask(@PathVariable ("id") Long id, @RequestBody Task task){
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/delete/task/{id}")
    public void deleteTask(@PathVariable ("id") Long id){
        taskService.removeTask(id);
    }
}
