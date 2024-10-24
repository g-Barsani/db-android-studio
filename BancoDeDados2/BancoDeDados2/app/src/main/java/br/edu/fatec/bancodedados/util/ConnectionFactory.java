package br.edu.fatec.bancodedados.util;


import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

// Conexão com o banco de dados
public class ConnectionFactory extends SQLiteOpenHelper {  //


    public ConnectionFactory(@Nullable Context context,
                             @Nullable String name,
                             @Nullable SQLiteDatabase.CursorFactory factory,
                             int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table aluno(id integer primary key autoincrement, "+
                "nome varchar(50), cpf varchar(50), telefone varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS aluno";
        db.execSQL(sql);
        onCreate(db);
    }


}
