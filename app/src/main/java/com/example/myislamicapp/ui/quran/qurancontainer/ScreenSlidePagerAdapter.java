package com.example.myislamicapp.ui.quran.qurancontainer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myislamicapp.ui.quran.quranpage.QuranPageFragment;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    private static final int NUM_PAGE=604;
    public ScreenSlidePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new QuranPageFragment(NUM_PAGE-position);
    }

    @Override
    public int getItemCount() {
        return NUM_PAGE;
    }
}
