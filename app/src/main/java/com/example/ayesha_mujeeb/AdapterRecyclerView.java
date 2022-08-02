package com.example.ayesha_mujeeb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>{

    private List<ModelRecyclerView> appList;
    View view;

    public AdapterRecyclerView (List<ModelRecyclerView> appList) { this.appList = appList; }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = appList.get(position).getImageViewAppIcon();
        String name = appList.get(position).getTextViewAppName();
        String desc = appList.get(position).getTextViewAppDesc();

        holder.setData(resource, name, desc);
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewAppIcon;
        private TextView textViewAppName;
        private TextView textViewAppDesc;
//        private TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewAppIcon = itemView.findViewById(R.id.imageViewAppIcon);
            textViewAppName = itemView.findViewById(R.id.textViewAppName);
            textViewAppDesc = itemView.findViewById(R.id.textViewAppDesc);

        }

        public void setData(int resource, String name, String desc) {
            imageViewAppIcon.setImageResource(resource);
            textViewAppName.setText(name);
            textViewAppDesc.setText(desc);

        }
    }
}
