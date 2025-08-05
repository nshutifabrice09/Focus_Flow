package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Comment;
import com.backend.Focus_Flow.repository.CommentRepository;
import com.backend.Focus_Flow.repository.TaskRepository;
import com.backend.Focus_Flow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{

    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public CommentServiceImplementation(CommentRepository commentRepository, UserRepository userRepository, TaskRepository taskRepository) {
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }


    @Override
    public Comment saveComment(Comment comment, Long authorId, Long taskId) {
        return null;
    }

    @Override
    public List<Comment> getAllComments() {
        return null;
    }

    @Override
    public Comment getComment(Long id) {
        return null;
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        return null;
    }

    @Override
    public void removeComment(Long id) {

    }
}
