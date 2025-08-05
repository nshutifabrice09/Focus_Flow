package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplementation implements ProjectService{
    @Override
    public Project saveProject(Project project, Long createdBy, Long memberId, Long taskId) {
        return null;
    }

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    @Override
    public Project getProject(Long id) {
        return null;
    }

    @Override
    public Project updateProject(Long id, Project project) {
        return null;
    }

    @Override
    public void removeProject(Long id) {

    }
}
