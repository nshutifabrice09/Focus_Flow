package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Project;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project project, Long createdBy, Long memberId, Long taskId);
    List<Project> getAllProjects();
    Project getProject(Long id);
    Project updateProject(Long id, Project project);
    void removeProject(Long id);
}
