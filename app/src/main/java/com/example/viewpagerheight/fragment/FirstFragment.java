package com.example.viewpagerheight.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagerheight.R;
import com.example.viewpagerheight.base.BaseFragment;

/**
 * Created by ysx on 2017/8/29.
 */

public class FirstFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.frament_first, container, false);

        return view;
    }
}
