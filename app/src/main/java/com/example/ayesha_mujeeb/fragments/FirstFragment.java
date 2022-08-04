package com.example.ayesha_mujeeb.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.activities.SecondActivity;

public class FirstFragment extends Fragment implements View.OnClickListener {

    View view;
    Button btnFirstFragDialog, btnFirstFragSend;
    EditText editTextData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first, container, false);

        editTextData = view.findViewById(R.id.editTextData);

        btnFirstFragDialog = view.findViewById(R.id.btnFirstFragDialog);
        btnFirstFragDialog.setOnClickListener(this);

        btnFirstFragSend = view.findViewById(R.id.btnFirstFragSend);
        btnFirstFragSend.setOnClickListener(this);

        return view;
    }

    void showDialog() {

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        DialogFirstFragment newFragment = DialogFirstFragment.newInstance("Ayesha", "Mujeeb");
        newFragment.show(ft, "dialog");
    }

    void sendData() {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra("text", editTextData.getText().toString());
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFirstFragDialog:
                showDialog();
                break;
            case R.id.btnFirstFragSend:
                sendData();
                break;
        }
    }
}