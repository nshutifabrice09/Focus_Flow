package com.backend.Focus_Flow.repository;

import com.backend.Focus_Flow.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
    Task findTaskById(Long taskId);
}
