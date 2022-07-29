package com.example.ayesha_mujeeb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.DialogFragment;

public class Dialog1Fragment extends DialogFragment {

    View view;

    static Dialog1Fragment newInstance(String value1, String value2) {
        Dialog1Fragment f = new Dialog1Fragment();
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
        view = inflater.inflate(R.layout.dialog_first_fragment, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

}