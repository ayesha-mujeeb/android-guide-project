package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.adapters.AdapterRecyclerViewVerticalFragment;
import com.example.ayesha_mujeeb.models.ModelRecyclerViewVerticalFragment;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewVerticalFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelRecyclerViewVerticalFragment> appList;
    AdapterRecyclerViewVerticalFragment adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_recycler_view, container, false);

        View view = inflater.inflate(R.layout.fragment_recycler_view_vertical, container, false);
        initData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AdapterRecyclerViewVerticalFragment(appList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        appList = new ArrayList<>();

        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_skype, "Skype", "Talk. Chat. Collaborate."));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_snapchat_logo_svgrepo_com, "Snapchat", "Capture the moment"));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_whatsapp, "WhatsApp", "Messaging & Video Call"));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_skype, "Skype", "Talk. Chat. Collaborate."));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_snapchat_logo_svgrepo_com, "Snapchat", "Capture the moment"));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_whatsapp, "WhatsApp", "Messaging & Video Call"));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_skype, "Skype", "Talk. Chat. Collaborate."));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_snapchat_logo_svgrepo_com, "Snapchat", "Capture the moment"));
        appList.add(new ModelRecyclerViewVerticalFragment(R.drawable.ic_icons8_whatsapp, "WhatsApp", "Messaging & Video Call"));
    }
}