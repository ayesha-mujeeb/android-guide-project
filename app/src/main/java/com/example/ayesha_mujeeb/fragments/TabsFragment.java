package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ayesha_mujeeb.R;


public class TabsFragment extends Fragment implements View.OnClickListener {


    View view;
    Button btnFragment1, btnFragment2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tab, container, false);

        btnFragment1 = view.findViewById(R.id.btnFragment1);
        btnFragment2 = view.findViewById(R.id.btnFragment2);

        btnFragment1.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);

      /*  btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FirstFragment());
            }
        });


        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new SecondFragment());
            }
        });*/

        return view;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainTabFrameLayout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnFragment1:
                replaceFragment(new FirstFragment());
                break;
            case R.id.btnFragment2:
                replaceFragment(new SecondFragment());
                break;
        }

    }
}