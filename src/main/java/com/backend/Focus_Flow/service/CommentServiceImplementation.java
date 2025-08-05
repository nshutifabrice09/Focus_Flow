package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Comment;
import com.backend.Focus_Flow.model.Task;
import com.backend.Focus_Flow.model.User;
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
        User user = userRepository.findUserById(userRepository);
        Task task = taskRepository.findTaskById(taskId);
        comment.setAuthor(user);
        comment.setTask(task);
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getComment(Long id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        Comment existComment = commentRepository.findCommentById(id);
        if(existComment != null){
            existComment.setMessage(comment.getMessage());
            existComment.setCreatedAt(comment.getCreatedAt());
            return commentRepository.save(existComment);
        }
        return null;
    }

    @Override
    public void removeComment(Long id) {
        commentRepository.deleteById(id);
    }
}
