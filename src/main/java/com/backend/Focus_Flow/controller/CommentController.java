package com.backend.Focus_Flow.controller;

import com.backend.Focus_Flow.model.Comment;
import com.backend.Focus_Flow.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/commnet/{authorId}/{taskId}")
    public Comment saveComment(@RequestBody Comment comment, @PathVariable ("authorId") Long authorId,
                               @PathVariable("taskId") Long taskId){
        return commentService.saveComment(comment, authorId, taskId);
    }
}
