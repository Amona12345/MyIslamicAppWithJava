package com.example.myislamicapp.ui.quran.quranpage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myislamicapp.R;
import com.example.myislamicapp.ui.quran.quranpage.QuranViewModel;


public class QuranPageFragment extends Fragment {
   private ImageView imageView;
   private int numOfPage;

    public QuranPageFragment(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    private QuranViewModel quranViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_quran_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        quranViewModel=new ViewModelProvider(this).get(quranViewModel.getClass());
          imageView=view.findViewById(R.id.quran_page);
           Drawable page =quranViewModel.getQuranImageByPageNumber(numOfPage);
     imageView.setImageDrawable(page);
    }
}