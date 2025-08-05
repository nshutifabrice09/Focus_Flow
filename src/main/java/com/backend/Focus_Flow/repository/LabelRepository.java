package com.backend.Focus_Flow.repository;

import com.backend.Focus_Flow.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends JpaRepository <Label, Long> {
    Label findLabelById(Long id);
}
