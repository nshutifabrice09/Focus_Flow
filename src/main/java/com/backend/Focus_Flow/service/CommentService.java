package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.Comment;

import java.util.List;

public interface CommentService {

    Comment saveComment(Comment comment,Long authorId, Long taskId);
    List<Comment> getComments();
    Comment getComment(Long id);
    Comment updateComment(Long id, Comment comment);
    void removeComment(Long id);

}
