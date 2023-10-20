package com.example.myislamicapp.data.pojo;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quran")
public class Aya {
    @PrimaryKey
    private  int id;
    private int joza;
    private int soraa;
    private int page;
    private int line_start;
    private int line_end;
    @NonNull
     private String sora_namr_ar;
    @NonNull
    private String sora_namr_en;
    @NonNull
    private String aya_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJoza() {
        return joza;
    }

    public void setJoza(int joza) {
        this.joza = joza;
    }

    public int getSoraa() {
        return soraa;
    }

    public void setSoraa(int soraa) {
        this.soraa = soraa;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLine_start() {
        return line_start;
    }

    public void setLine_start(int line_start) {
        this.line_start = line_start;
    }

    public int getLine_end() {
        return line_end;
    }

    public void setLine_end(int line_end) {
        this.line_end = line_end;
    }

    @NonNull
    public String getSora_namr_ar() {
        return sora_namr_ar;
    }

    public void setSora_namr_ar(@NonNull String sora_namr_ar) {
        this.sora_namr_ar = sora_namr_ar;
    }

    @NonNull
    public String getSora_namr_en() {
        return sora_namr_en;
    }

    public void setSora_namr_en(@NonNull String sora_namr_en) {
        this.sora_namr_en = sora_namr_en;
    }

    @NonNull
    public String getAya_text() {
        return aya_text;
    }

    public void setAya_text(@NonNull String aya_text) {
        this.aya_text = aya_text;
    }

    @NonNull
    public String getAya_text_emalay() {
        return aya_text_emalay;
    }

    public void setAya_text_emalay(@NonNull String aya_text_emalay) {
        this.aya_text_emalay = aya_text_emalay;
    }

    @NonNull
    private String aya_text_emalay;
}
