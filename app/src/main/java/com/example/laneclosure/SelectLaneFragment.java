package com.example.laneclosure;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SelectLaneFragment extends Fragment {

    RecyclerView typesRecyclerView;
    RecyclerView recyclerView;
    List<Selected> Lists;
    List<Selected>list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_select_lane, container, false);
        typesRecyclerView=view.findViewById(R.id.typesRecyclerView);
        recyclerView=view.findViewById(R.id.RecyclerView);
        Lists=new ArrayList<>();
        list=new ArrayList<>();
        typesRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),4));
        list.add(new Selected(R.drawable.ic_shoulder,"Shoulder"));
        list.add(new Selected(R.drawable.ic_hov,"Hov"));
        list.add(new Selected(R.drawable.ic_median,"Median"));
        list.add(new Selected(R.drawable.ic_ramp,"Ramp"));
        list.add(new Selected(R.drawable.ic_gore,"Gore"));
        typesRecyclerView.setAdapter(new SelectLaneAdapter(list,getContext()));

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),4));
        Lists.add(new Selected(R.drawable.ic_closed,"Closed"));
        Lists.add(new Selected(R.drawable.ic_unknown,"Unknown"));
        Lists.add(new Selected(R.drawable.ic_rolling,"Rolling"));
        Lists.add(new Selected(R.drawable.ic_blocked,"Blocked"));
        Lists.add(new Selected(R.drawable.ic_alternating,"Alternating"));
        Lists.add(new Selected(R.drawable.ic_intermittent,"Intermittent"));
        Lists.add(new Selected(R.drawable.ic_lanesaffected,"Lanes Affected"));
        recyclerView.setAdapter(new StatusLaneAdapter(getContext(),Lists));

        return view;
    }
}