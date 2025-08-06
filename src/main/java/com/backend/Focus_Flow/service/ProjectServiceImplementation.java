package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Project;
import com.backend.Focus_Flow.model.Task;
import com.backend.Focus_Flow.model.User;
import com.backend.Focus_Flow.repository.ProjectRepository;
import com.backend.Focus_Flow.repository.TaskRepository;
import com.backend.Focus_Flow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplementation implements ProjectService{

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public ProjectServiceImplementation(ProjectRepository projectRepository, UserRepository userRepository, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public Project saveProject(Project project, Long createdBy, Long memberId, Long taskId) {
        User user = userRepository.findCreatedById(createdBy);
        User user1 = userRepository.findMemberById(memberId);
        Task task = taskRepository.findTaskById(taskId);
        project.setCreatedBy(user);
        project.setMember(user1);
        project.setTask(task);
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProject(Long id) {
        return projectRepository.findProjectById(id);
    }

    @Override
    public Project updateProject(Long id, Project project) {
        Project existProject= projectRepository.findProjectById(id);
        if(existProject != null){
            existProject.setName(project.getName());
            existProject.setDescription(project.getDescription());
            return projectRepository.save(existProject);
        }
        return null;
    }

    @Override
    public void removeProject(Long id) {

    }
}
