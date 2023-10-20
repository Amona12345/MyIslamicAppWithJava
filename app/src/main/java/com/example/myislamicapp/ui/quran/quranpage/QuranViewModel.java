package com.example.myislamicapp.ui.quran.quranpage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.myislamicapp.data.PageManger;

public class QuranViewModel extends AndroidViewModel {
    public QuranViewModel(@NonNull Application application) {
        super(application);
    }

    public Drawable getQuranImageByPageNumber(int pageNumber) {
        return PageManger.getQuranImageByPageNumber(getApplication(),pageNumber);
    }
}