package com.example.viewpagerheight.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ysx on 2017/8/29.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<String> mTitles;
    private List<Fragment> mFragmentList;

    public TabFragmentPagerAdapter(FragmentManager fm, List<String> titles, List<Fragment> fragmentList) {
        super(fm);
        mTitles = titles;
        mFragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return mFragmentList == null ? 0 : mFragmentList.size();
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
