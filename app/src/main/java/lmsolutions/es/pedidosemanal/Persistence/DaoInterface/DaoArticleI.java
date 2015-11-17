package lmsolutions.es.pedidosemanal.Persistence.DaoInterface;

import java.util.List;

import lmsolutions.es.pedidosemanal.Domain.Article;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public interface DaoArticleI {

    public void insertArticle(Article article);
    public void deleteArticle(Article article);
    public void updateArticle(Article article);
    public List<Article> selectArticles();
}
