package com.example.josefrenzranopa_ceng319lab1_ex1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TopFragment extends ListFragment {
    //
    String[] aiactivity = new String[]
            {
                    "AI Activity",
                    "VR Activity"};
    //
    String[] vractivity = new String[]
            {
                    "\nMain Activity: \n onCreate executed \n onStart executed",
                    "\nMain Activity: \n onCreate executed \n onStart executed"
            };




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_top, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,aiactivity);

        setListAdapter(adapter);

        return view;

    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        BottomFragment fragment = (BottomFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.display(aiactivity[position],""+vractivity[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}