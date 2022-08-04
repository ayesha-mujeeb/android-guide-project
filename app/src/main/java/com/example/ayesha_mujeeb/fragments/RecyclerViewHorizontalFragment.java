package com.example.ayesha_mujeeb.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.adapters.AdapterRecyclerViewHorizontalFragment;
import com.example.ayesha_mujeeb.models.ModelRecyclerViewHorizontalFragment;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewHorizontalFragment extends Fragment {

    RecyclerView recyclerViewHorizontal;
    LinearLayoutManager layoutManager;
    List<ModelRecyclerViewHorizontalFragment> appPreviewList;
    AdapterRecyclerViewHorizontalFragment adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_recycler_view_horizontal, container, false);
        initData();
        initRecyclerView(view);
        return view;

    }

    private void initRecyclerView(View view) {
        recyclerViewHorizontal = view.findViewById(R.id.recyclerViewHorizontal);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerViewHorizontal.setLayoutManager(layoutManager);
        adapter = new AdapterRecyclerViewHorizontalFragment(appPreviewList);
        recyclerViewHorizontal.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        appPreviewList = new ArrayList<>();

        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));
        appPreviewList.add(new ModelRecyclerViewHorizontalFragment("Featured", "Canva: Design, Photo and Video", "Beautiful design templates", R.drawable.canva_layout, R.drawable.canva_logo, "Canva: Design, Photo and Video", "Edit photos, videos and logos"));

    }
}