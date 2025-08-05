package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Label;
import com.backend.Focus_Flow.model.Task;
import com.backend.Focus_Flow.repository.LabelRepository;
import com.backend.Focus_Flow.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImplementation implements LabelService{

    private final LabelRepository labelRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public LabelServiceImplementation(LabelRepository labelRepository, TaskRepository taskRepository) {
        this.labelRepository = labelRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public Label saveLabel(Label label, Long taskId) {
        Task task = taskRepository.findTaskById(taskId);
        label.setTask(task);
        return labelRepository.save(label);
    }

    @Override
    public List<Label> getAllLabels() {
        return labelRepository.findAll();
    }

    @Override
    public Label getLabel(Long id) {
        return labelRepository.findLabelById(id);
    }

    @Override
    public Label updateLabel(Long id, Label label) {
        Label existLabel = labelRepository.findLabelById(id);
        if(existLabel != null) {
            existLabel.setName(label.getName());
            return labelRepository.save(existLabel);
        }
        return null;
    }

    @Override
    public void removeLabel(Long id) {
        labelRepository.deleteById(id);
    }
}
