package com.example.juancarlosmilena.exemplerecyclerview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sql extends SQLiteOpenHelper {

    public static class EduEntrada {
        public static final String TABLE_id = "id";
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }


    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EduEntrada.TABLE_NAME + " (" +
                    EduEntrada.TABLE_id + " INTEGER PRIMARY KEY," +
                    EduEntrada.COLUMN_NAME_TITLE + " TEXT," +
                    EduEntrada.COLUMN_NAME_SUBTITLE + " TEXT)";

    // If you change the database schema, you must increment the database version.

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";

    public Sql(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);//Creamos la tabla
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over

    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}