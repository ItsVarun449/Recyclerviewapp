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

public class FragmentAndroid extends Fragment {

    View v;
    public RecyclerView myrecyclerview;
    public List<Android> lstContact;

    public FragmentAndroid() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.android_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.android_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Android("Alpha 1.0", "23rd Sept 2008", R.drawable._alpha ));
        lstContact.add(new Android("Beta 1.1", "9th Feb 2009", R.drawable._beta));
        lstContact.add(new Android("Cupcake 1.5", "27th April 2009", R.drawable._cupcake));
        lstContact.add(new Android("Donut 1.6", "15th Sept 2009", R.drawable._donut));
        lstContact.add(new Android("Eclair 2.0", "27th Oct 2009", R.drawable._eclair));
        lstContact.add(new Android("Froyo 2.2", "20th May 2010", R.drawable._froyo));
        lstContact.add(new Android("Gingerbread 2.3", "6th Dec 2010", R.drawable._gingerbread));
        lstContact.add(new Android("Honeycomb 3.0", "22nd Feb 2011", R.drawable._honeycomb));
        lstContact.add(new Android("Ice Cream Sandwich 4.0", "18th Oct 2011", R.drawable._icecreamsandwich));
        lstContact.add(new Android("Jelly Bean 4.1", "9th July 2012", R.drawable._jellybean));
        lstContact.add(new Android("KitKat 4.4", "31st Oct 2013", R.drawable._kitkat));
        lstContact.add(new Android("Lollipop 5.0", "4th Nov 2014", R.drawable._lollipop));
        lstContact.add(new Android("Marshmallow 6.0", "2nd Oct 2015", R.drawable._marshmallow));
        lstContact.add(new Android("Nougat 7.0", "22nd Aug 2016", R.drawable._nougat));
        lstContact.add(new Android("Oreo 8.0", "21st Aug 2017", R.drawable._oreo));
    }
}
