package com.example.myislamicapp.ui.quran.qurancontainer;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myislamicapp.R;


public class QuranContainerFragment extends Fragment {

private static final int NUM_PAGE=604;
private ViewPager2 viewPager2;
private FragmentStateAdapter pagerAdapter;

    public QuranContainerFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_quran_container, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager2=view.findViewById(R.id.quran_pager);
        pagerAdapter= new ScreenSlidePagerAdapter(getActivity());
        viewPager2.setAdapter(pagerAdapter);
        viewPager2.setCurrentItem(604);
    }
}