package com.example.dongvan.clonegooglemap.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dongvan.clonegooglemap.FragmentDiBo;
import com.example.dongvan.clonegooglemap.FragmentDiBuyt;
import com.example.dongvan.clonegooglemap.FragmentDiXe;
import com.example.dongvan.clonegooglemap.FragmentDiXeDap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VoNga on 17-Apr-17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public List<Fragment> listFragment = new ArrayList<Fragment>();
    public List<String> titleFragment = new ArrayList<String>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment.add(new FragmentDiXe());
        listFragment.add(new FragmentDiBuyt());
        listFragment.add(new FragmentDiBo());
        listFragment.add(new FragmentDiXeDap());


        titleFragment.add("Đi xe");
        titleFragment.add("Đi buýt");
        titleFragment.add("Đi bộ");
        titleFragment.add("Đi xe đạp");
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragment.get(position);
    }
}

