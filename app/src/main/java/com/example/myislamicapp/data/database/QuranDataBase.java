package com.example.myislamicapp.data.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myislamicapp.data.pojo.Aya;

@Database(entities = {Aya.class},version = 1)
public abstract class QuranDataBase extends RoomDatabase {
    public static QuranDataBase instance=null;
    public abstract QuranDao quranDao();
    public static QuranDataBase
    getInstance(Context context){
        if(instance==null){
            synchronized (QuranDataBase.class){
                if(instance==null){
                    try{
                        String DATA_BASE_NAME="quran.db";
                        instance= Room.databaseBuilder(context.getApplicationContext(),
                                QuranDataBase.class,DATA_BASE_NAME)
                                .createFromAsset("quran/database/quran.db")
                                .allowMainThreadQueries().build();

                    }catch (Exception e){
                        return null;
                    }
                }
            }

        }
        return instance;
    }
}
