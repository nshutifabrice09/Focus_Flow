package com.backend.Focus_Flow.model.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
        private Long id;
        private String fullName;
        private String email;
        private String role;  // from Role enum

        // Instead of embedding entities, just reference their IDs
        private List<Long> assignedTaskIds;
        private List<Long> createdProjectIds;
        private List<Long> createdTaskIds;
        private List<Long> commentIds;

        // getters & setters
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }

        public List<Long> getAssignedTaskIds() {
            return assignedTaskIds;
        }
        public void setAssignedTaskIds(List<Long> assignedTaskIds) {
            this.assignedTaskIds = assignedTaskIds;
        }

        public List<Long> getCreatedProjectIds() {
            return createdProjectIds;
        }
        public void setCreatedProjectIds(List<Long> createdProjectIds) {
            this.createdProjectIds = createdProjectIds;
        }

        public List<Long> getCreatedTaskIds() {
            return createdTaskIds;
        }
        public void setCreatedTaskIds(List<Long> createdTaskIds) {
            this.createdTaskIds = createdTaskIds;
        }

        public List<Long> getCommentIds() {
            return commentIds;
        }
        public void setCommentIds(List<Long> commentIds) {
            this.commentIds = commentIds;
        }
    }

