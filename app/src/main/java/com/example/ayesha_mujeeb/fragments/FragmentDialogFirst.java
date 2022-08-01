package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.DialogFragment;

import com.example.ayesha_mujeeb.R;

public class FragmentDialogFirst extends DialogFragment {

    View view;

    static FragmentDialogFirst newInstance(String value1, String value2) {
        FragmentDialogFirst f = new FragmentDialogFirst();
        Bundle args = new Bundle();
        args.putString("value1", value1);
        args.putString("value2", value2);
        f.setArguments(args);

        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dialog_first, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

}