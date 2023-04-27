package com.modul.my.services;

import com.modul.my.models.Article;
import com.modul.my.models.Comment;
import com.modul.my.repos.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
    public List<Comment> findByArticle(Article article) {
        return commentRepository.findByArticle(article);
    }
    public Optional<Comment> findCommentById(Long id) {
        return commentRepository.findCommentById(id);
    }
    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }


}