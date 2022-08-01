package com.example.ayesha_mujeeb.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.fragments.FragmentDialogSecond;
import com.example.ayesha_mujeeb.fragments.FragmentSharedPreferences;
import com.example.ayesha_mujeeb.fragments.FragmentTab;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    Button btnMainFragment, btnMainActivity, btnMainFragDialog, btnMainSharedPref;
    String str1, str2, str3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainFragment = findViewById(R.id.ButtonFragmentMain);
        btnMainFragment.setOnClickListener(this);

        btnMainActivity = findViewById(R.id.ButtonActivityMain);
        btnMainActivity.setOnClickListener(this);

        btnMainFragDialog = findViewById(R.id.ButtonDialogFragMain);
        btnMainFragDialog.setOnClickListener(this);

        btnMainSharedPref = findViewById(R.id.ButtonPreferMain);
        btnMainSharedPref.setOnClickListener(this);

        str1 = "String 1";
        str2 = str1;
        str3 = str2 + " new part";
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.priorFrameLayout, fragment);
        fragmentTransaction.commit();

    }

    public void startSecondActivity() {
        Intent intent = new Intent(ActivityMain.this, SecondActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
//        String message = editText.getText().toString();
        intent.putExtra("text", "This message is from Main Activity");
        startActivity(intent);
    }

    public void showDialog(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        FragmentDialogSecond newFragment = FragmentDialogSecond.newInstance("new", "name");
        newFragment.show(ft, "dialog");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ButtonFragmentMain:
                replaceFragment(new FragmentTab());
                break;
            case R.id.ButtonActivityMain:
                startSecondActivity();
                break;
            case R.id.ButtonDialogFragMain:
                showDialog();
                break;
            case R.id.ButtonPreferMain:
                replaceFragment(new FragmentSharedPreferences());
        }
    }
}
