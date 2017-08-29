package com.example.viewpagerheight;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.viewpagerheight.adapter.TabFragmentPagerAdapter;
import com.example.viewpagerheight.base.BaseActivity;
import com.example.viewpagerheight.fragment.FirstFragment;
import com.example.viewpagerheight.fragment.FourthFragment;
import com.example.viewpagerheight.fragment.SecondFragment;
import com.example.viewpagerheight.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> mFragments = new ArrayList<>();
    private List<String> mTitles;
    private FragmentPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
    }


    private void initData() {
        mTitles = Arrays.asList(getResources().getStringArray(R.array.fragments_titles));

        mFragments.add(new FirstFragment());
        mFragments.add(new SecondFragment());
        mFragments.add(new ThirdFragment());
        mFragments.add(new FourthFragment());

        mPagerAdapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), mTitles, mFragments);
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
