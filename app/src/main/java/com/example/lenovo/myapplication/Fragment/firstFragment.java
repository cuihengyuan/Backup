package com.example.lenovo.myapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.adapter.RecyclerView_adapter;

public class firstFragment extends Fragment {
public View view;
public  RecyclerView recyclerView;
public RecyclerView_adapter recyclerViewAdapter;
@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.firstfragment_layout,container,false);
recyclerView=view.findViewById(R.id.Rec);
//recyclerViewAdapter=new RecyclerView_adapter()





        return  view;
    }


}