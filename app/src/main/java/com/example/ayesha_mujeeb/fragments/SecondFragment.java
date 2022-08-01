package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ayesha_mujeeb.R;

public class SecondFragment extends Fragment implements View.OnClickListener{

    View view;
    Button btnSecondFragDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        btnSecondFragDialog = view.findViewById(R.id.btnSecondFragDialog);
        btnSecondFragDialog.setOnClickListener(this);

        return view;
    }

    public void showDialog(){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        Dialog2Fragment newFragment = Dialog2Fragment.newInstance("Alish", "Reem");
        newFragment.show(ft, "dialog");
    }

    @Override
    public void onClick(View view) {
        showDialog();
    }
}