package com.example.josefrenzranopa_ceng319lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {
    TextView tvAIactivity,tvVRactivity;


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        tvAIactivity= (TextView) view.findViewById(R.id.aiactivity);
        tvVRactivity= (TextView)view.findViewById(R.id.vractivity);

        return view;

    }

    public void display(String concept, String definition){
        tvAIactivity.setText(concept);
        tvVRactivity.setText(definition);

    }
}