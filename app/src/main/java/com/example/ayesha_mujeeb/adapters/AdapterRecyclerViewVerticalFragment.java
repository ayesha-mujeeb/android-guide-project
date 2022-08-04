package com.example.ayesha_mujeeb.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.models.ModelRecyclerViewVerticalFragment;

import java.util.List;

public class AdapterRecyclerViewVerticalFragment extends RecyclerView.Adapter<AdapterRecyclerViewVerticalFragment.ViewHolder> {

    private List<ModelRecyclerViewVerticalFragment> appList;
    View view;

    public AdapterRecyclerViewVerticalFragment(List<ModelRecyclerViewVerticalFragment> appList) {
        this.appList = appList;
    }

    @NonNull
    @Override
    public AdapterRecyclerViewVerticalFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_vertical_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = appList.get(position).getImageViewAppIcon();
        String name = appList.get(position).getTextViewAppName();
        String desc = appList.get(position).getTextViewAppDesc();

        holder.imageViewAppIcon.setImageResource(resource);
        holder.textViewAppName.setText(name);
        holder.textViewAppDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        if (appList.size() == 0) {
            return 1;
        } else {
            return appList.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewAppIcon;
        private TextView textViewAppName;
        private TextView textViewAppDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewAppIcon = itemView.findViewById(R.id.imageViewAppIcon);
            textViewAppName = itemView.findViewById(R.id.textViewAppName);
            textViewAppDesc = itemView.findViewById(R.id.textViewAppDesc);

        }
    }
}
