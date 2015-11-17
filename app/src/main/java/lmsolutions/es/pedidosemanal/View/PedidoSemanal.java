package lmsolutions.es.pedidosemanal.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import lmsolutions.es.pedidosemanal.Domain.Article;
import lmsolutions.es.pedidosemanal.Persistence.DaoImplementation.DaoArticleImpl;
import lmsolutions.es.pedidosemanal.Persistence.DaoInterface.DaoArticleI;
import lmsolutions.es.pedidosemanal.R;

public class PedidoSemanal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_semanal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pedido_semanal, menu);
        DaoArticleI daoArticleImpl = new DaoArticleImpl(this);
        Article article = new Article();
        article.setId(0);
        article.setName("Producto 1");
        article.setPrice(5.5);
        article.setUnitsNow(3);
        article.setUnitsPerWeek(8);
        daoArticleImpl.insertArticle(article);
        Log.i("Articulos",daoArticleImpl.selectArticles().toString());
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
