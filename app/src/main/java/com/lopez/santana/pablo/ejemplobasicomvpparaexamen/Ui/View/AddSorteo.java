package com.lopez.santana.pablo.ejemplobasicomvpparaexamen.Ui.View;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lopez.santana.pablo.ejemplobasicomvpparaexamen.R;


public class AddSorteo extends Fragment {

    public static final String TAG ="AddSorteo";



    public AddSorteo() {

    }

    // TODO: Rename and change types and number of parameters
    public static AddSorteo newInstance(Bundle args) {
        AddSorteo fragment = new AddSorteo();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_sorteo, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
