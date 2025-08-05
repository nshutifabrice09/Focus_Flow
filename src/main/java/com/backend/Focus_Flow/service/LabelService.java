package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Label;

import java.util.List;

public interface LabelService {

    Label saveLabel(Label label, Long taskId);
    List<Label> getAllLabels();
    Label getLabel(Long id);
    Label updateLabel(Long id, Label label);
    void removeLabel(Long id);
}
