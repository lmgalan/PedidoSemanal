package lmsolutions.es.pedidosemanal.Persistence.DaoImplementation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import lmsolutions.es.pedidosemanal.Domain.Article;
import lmsolutions.es.pedidosemanal.Persistence.DaoInterface.DaoArticleI;
import lmsolutions.es.pedidosemanal.Persistence.SQLiteHelper.ArticlesSQLiteHelper;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public class DaoArticleImpl implements DaoArticleI{

    ArticlesSQLiteHelper articlesSQLiteHelper=null;
    public DaoArticleImpl(Context ctx) {
        if(articlesSQLiteHelper == null){
            articlesSQLiteHelper = new ArticlesSQLiteHelper(ctx, "PedidoSemanalDB", null, 1);
        }
    }

    @Override
    public void insertArticle(Article article) {
        SQLiteDatabase db= articlesSQLiteHelper.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("name",article.getName());
        contentValues.put("unitsPerWeek",article.getUnitsPerWeek());
        contentValues.put("unitsNow",article.getUnitsNow());
        contentValues.put("price", article.getPrice());
        db.insert("Articles",null,contentValues);
        //db.execSQL("INSERT INTO Articles (name, unitsPerWeek, unitsNow, price) VALUES ('"+article.getName()+"',"+article.getUnitsPerWeek()+","+article.getUnitsNow()+","+article.getUnitsPerWeek()+")");
        db.close();

    }

    @Override
    public void deleteArticle(Article article) {
        SQLiteDatabase db = articlesSQLiteHelper.getWritableDatabase();
        String [] args = new String[]{Integer.toString(article.getId())};
        db.delete("Articles", "id=?", args);
    }

    @Override
    public void updateArticle(Article article) {
        SQLiteDatabase db = articlesSQLiteHelper.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("name", article.getName());
        contentValues.put("unitsPerWeek", article.getUnitsPerWeek());
        contentValues.put("unitsNow", article.getUnitsNow());
        contentValues.put("price", article.getPrice());
        String [] args = new String[]{Integer.toString(article.getId())};
        db.update("Articles", contentValues, "id=?", args);
    }

    public List<Article> selectArticles(){
        SQLiteDatabase db = articlesSQLiteHelper.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM Articles", null);
        List<Article> listArticles=null;
        if(cursor.moveToFirst()){
            listArticles = new ArrayList<Article>();
            do{
                Article article = new Article(cursor.getInt(0),cursor.getString(1),cursor.getInt(2),cursor.getInt(3),cursor.getDouble(4));
                listArticles.add(article);
            }while(cursor.moveToNext());
        }
        db.close();
        return listArticles;
    }
}
