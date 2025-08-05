package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Label;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImplementation implements LabelService{

    @Override
    public Label saveLabel(Label label, Long taskId) {
        return null;
    }

    @Override
    public List<Label> getAllLabels() {
        return null;
    }

    @Override
    public Label getLabel(Long id) {
        return null;
    }

    @Override
    public Label updateLabel(Long id, Label label) {
        return null;
    }

    @Override
    public void removeLabel(Long id) {

    }
}
