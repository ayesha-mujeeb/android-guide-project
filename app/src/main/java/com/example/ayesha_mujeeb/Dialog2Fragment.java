package com.example.ayesha_mujeeb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class Dialog2Fragment extends DialogFragment {

    View view;

    Dialog2Fragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.dialog_second_fragment, container, false);
        return view;
    }

    static Dialog2Fragment newInstance(String value1, String value2) {
        Dialog2Fragment f = new Dialog2Fragment();
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
