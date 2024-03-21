package com.example.smartzpay.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.smartzpay.R;

import java.util.ArrayList;
import java.util.Timer;

public class HomeFragment extends Fragment {
    private Context context;
    private ViewPager viewPager;
    private LinearLayout lnrLyt;
    private ArrayList<Integer> offerList;
    private int count  = 0;
    private Timer timer;

    public HomeFragment() {
        // Required empty public constructor
    }
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        
    }

    private void initViews() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}