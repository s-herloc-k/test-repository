package com.modul.my.services;

import com.modul.my.models.Article;
import com.modul.my.models.User;
import com.modul.my.repos.ArticleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }
    public List<Article> findByAuthor(User author) {
        return articleRepository.findByAuthor(author);
    }
    public Optional<Article> findArticleById(Long id) {return articleRepository.findArticleById(id);}
    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

}