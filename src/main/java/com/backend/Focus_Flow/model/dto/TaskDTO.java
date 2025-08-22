package com.backend.Focus_Flow.model.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskDTO {

    private Long id;
    private String title;
    private String description;
    private String status;       // from TaskStatus enum
    private String priority;     // from PriorityLevel enum
    private LocalDate dueDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    // Reference IDs instead of entities
    private Long projectId;
    private Long assignedToId;
    private Long createdById;
    private Long labelId;
    private Long commentId;
}
