package com.example.myislamicapp.data.database;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myislamicapp.data.pojo.Aya;
import com.example.myislamicapp.data.pojo.Sora;

import java.util.List;

@Dao
public interface QuranDao {

@Query("SELECT * FROM quran WHERE page = :page")
    List<Aya> getAyaByPage(int page);
@Query("SELECT  soraa as soraNumber, Min(page) as startpage,Max(page) as endpage,sora_namr_ar as arabicName,sora_namr_en as englishName   FROM quran WHERE soraa=:soraNumber ")
Sora getSoraByNumber(int soraNumber);
}
