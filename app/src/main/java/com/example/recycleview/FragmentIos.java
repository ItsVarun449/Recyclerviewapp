package com.example.recycleview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentIos extends Fragment {

    View v;
    public RecyclerView myrecyclerview;
    public List<Ios> lstIos;


    public FragmentIos() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =inflater.inflate(R.layout.ios_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.ios_recyclerview);
       // RecyclerViewAdapter recyclerAdapter =new RecyclerViewAdapter(getContext(), lstIos);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        //myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstIos = new ArrayList<>();
        lstIos.add(new Ios("Iphone 1", "29th June 2007", R.drawable._apple));
        lstIos.add(new Ios("Iphone 3G", "11th July 2008", R.drawable._apple));
        lstIos.add(new Ios("Iphone 3GS", "19th June 2009", R.drawable._apple));
        lstIos.add(new Ios("Iphone 4", "24th June 2010", R.drawable._apple));
        lstIos.add(new Ios("Iphone 4S", "14th Oct 2011", R.drawable._apple));
        lstIos.add(new Ios("Iphone 5", "21st Sept 2012", R.drawable._apple));
        lstIos.add(new Ios("Iphone 5S", "20th Sept 2013", R.drawable._apple));
        lstIos.add(new Ios("Iphone 6", "19th Sept 2014", R.drawable._apple));
        lstIos.add(new Ios("Iphone 6S", "25th Sept 2015", R.drawable._apple));



    }
}
