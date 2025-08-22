package com.backend.Focus_Flow.controller;

import com.backend.Focus_Flow.model.Project;
import com.backend.Focus_Flow.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/project/{createdBy}/{memberId}/{taskId}")
    public Project save(@RequestBody Project project,
                        @PathVariable ("createdBy") Long createdBy, @PathVariable ("memberId") Long memberId, @PathVariable ("taskId") Long taskId){
        return projectService.saveProject(project, createdBy, memberId, taskId);
    }

    @GetMapping("/projects")
    public List <Project> projectList(){
        return projectService.getAllProjects();
    }

    @GetMapping("/project/{id}")
    public Project getProject(@PathVariable("id") Long id){
        return projectService.getProject(id);
    }

    @PutMapping("/update/project/{id}")
    public Project updateProject(@PathVariable ("id") Long id, @RequestBody Project project){
        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable ("id") Long id){
        projectService.removeProject(id); 
    }
}
