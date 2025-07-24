package com.backend.Focus_Flow.repository;

import com.backend.Focus_Flow.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Long> {
}
