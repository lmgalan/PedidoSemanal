package lmsolutions.es.pedidosemanal.Persistence.SQLiteHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public class SalesPersonSQLiteHelper extends SQLiteOpenHelper {

    private final String SQL_CREATION = "create table SalesPersons (id INTEGER PRIMARY KEY AUTOINCREMENT, nameOfSalesPerson TEXT, telephoneNumber TEXT)";


    public SalesPersonSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Se elimina la versión anterior de la tabla, habrá que cambiar esto*******
        db.execSQL("DROP TABLE IF EXISTS SalesPersons");

        //Se crea la nueva versión de la tabla
        db.execSQL(SQL_CREATION);
    }
}
