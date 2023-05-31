package com.example.laneclosure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    TabLayout tab_layout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tab_layout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.viewPager);

        tab_layout.setupWithViewPager(viewPager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new LaneClosureFragment(),"LanceClosure");
        adapter.addFragment(new SelectLaneFragment(),"SelectedLane");
        viewPager.setAdapter(adapter);
    }
}