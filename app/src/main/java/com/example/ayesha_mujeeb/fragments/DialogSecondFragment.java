package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.ayesha_mujeeb.R;

public class DialogSecondFragment extends DialogFragment {

    View view;

    public DialogSecondFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_dialog_second, container, false);
        return view;
    }

    public static DialogSecondFragment newInstance(String value1, String value2) {
        DialogSecondFragment f = new DialogSecondFragment();
        Bundle args = new Bundle();
        args.putString("value1", value1);
        args.putString("value2", value2);
        f.setArguments(args);

        return f;
    }

    void sendData() {

    }

    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
