package com.example.ayesha_mujeeb.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.fragments.FirstFragment;
import com.example.ayesha_mujeeb.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnFragment1, btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1 = findViewById(R.id.btnFragment1);
        btnFragment2 = findViewById(R.id.btnFragment2);

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
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainFrameLayout, fragment);
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