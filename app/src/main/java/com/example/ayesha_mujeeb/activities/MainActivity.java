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
import com.example.ayesha_mujeeb.fragments.DialogSecondFragment;
import com.example.ayesha_mujeeb.fragments.RecyclerViewHorizontalFragment;
import com.example.ayesha_mujeeb.fragments.RecyclerViewVerticalFragment;
import com.example.ayesha_mujeeb.fragments.SharedPreferencesFragment;
import com.example.ayesha_mujeeb.fragments.TabsFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMainFragment, btnMainActivity, btnMainFragDialog, btnMainSharedPref, btnMainRecyclerView, btnMainLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainFragment = (Button) findViewById(R.id.ButtonFragmentMain);
        btnMainFragment.setOnClickListener(this);

        btnMainActivity = (Button) findViewById(R.id.ButtonActivityMain);
        btnMainActivity.setOnClickListener(this);

        btnMainFragDialog = (Button) findViewById(R.id.ButtonDialogFragMain);
        btnMainFragDialog.setOnClickListener(this);

        btnMainSharedPref = (Button) findViewById(R.id.ButtonPreferMain);
        btnMainSharedPref.setOnClickListener(this);

        btnMainRecyclerView = (Button) findViewById(R.id.ButtonRecyclerMain);
        btnMainRecyclerView.setOnClickListener(this);

        btnMainLayout = (Button) findViewById(R.id.ButtonLayoutMain);
        btnMainLayout.setOnClickListener(this);

    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.priorFrameLayout, fragment);
        fragmentTransaction.commit();

    }

    public void startSecondActivity() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
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

        DialogSecondFragment newFragment = DialogSecondFragment.newInstance("new", "name");
        newFragment.show(ft, "dialog");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ButtonFragmentMain:
                replaceFragment(new TabsFragment());
                break;
            case R.id.ButtonActivityMain:
                startSecondActivity();
                break;
            case R.id.ButtonDialogFragMain:
                showDialog();
                break;
            case R.id.ButtonPreferMain:
                replaceFragment(new SharedPreferencesFragment());
                break;
            case R.id.ButtonRecyclerMain:
                replaceFragment(new RecyclerViewVerticalFragment());
                break;
            case R.id.ButtonLayoutMain:
                replaceFragment(new RecyclerViewHorizontalFragment());
                break;
        }
    }
}
