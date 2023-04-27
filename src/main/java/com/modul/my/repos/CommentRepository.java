package com.modul.my.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.modul.my.models.Comment;
import com.modul.my.models.Article;
import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArticle(Article article);
    Optional<Comment> findCommentById(Long id);

}
