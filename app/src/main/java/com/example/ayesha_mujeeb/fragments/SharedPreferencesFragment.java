package com.example.ayesha_mujeeb.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ayesha_mujeeb.R;


public class SharedPreferencesFragment extends Fragment implements View.OnClickListener {

    View view;
    Button btnSaveSharedPref, btnSendSharedPref;
    Switch switchSharedPref;
    EditText editTextNewtext;
    TextView textViewNewText;

    public static final String SHARED_PREFS = "shared prefs";
    public static final String TEXT = "text";
    public static final String SWITCH = "switch shared prefs";

    String text;
    Boolean switchOnOff;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shared_preferences, container, false);

        btnSendSharedPref = view.findViewById(R.id.btnSharedPrefSend);
        btnSaveSharedPref = view.findViewById(R.id.btnSharedPrefSave);

        editTextNewtext = view.findViewById(R.id.editTextSharedData);
        textViewNewText = view.findViewById(R.id.textViewNewText);

        switchSharedPref = view.findViewById(R.id.switchSharedPref);

        btnSendSharedPref.setOnClickListener(this);
        btnSaveSharedPref.setOnClickListener(this);

        return view;
    }

    public void applyText() {
        textViewNewText.setText(editTextNewtext.getText().toString());
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, textViewNewText.getText().toString());
        editor.putBoolean(SWITCH, switchSharedPref.isChecked());

        editor.apply();

        Toast.makeText(getContext(), "Data is saved", Toast.LENGTH_SHORT).show();
    }

    public void loadData() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        switchOnOff = sharedPreferences.getBoolean(SWITCH, false);

    }

    public void updateViews() {
        textViewNewText.setText(text);
        switchSharedPref.setChecked(switchOnOff);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSharedPrefSend:
                applyText();
                break;
            case R.id.btnSharedPrefSave:
                saveData();
                break;
        }
    }
}