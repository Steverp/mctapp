package com.apps.koiti.mct.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Steve on 11/3/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    private static final String TAG = DBHelper.class.getSimpleName();

    //Definiendo Caracteristicas de la Base de Datos

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "mctapp";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
