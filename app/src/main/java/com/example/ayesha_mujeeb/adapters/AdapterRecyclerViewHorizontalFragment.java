package com.example.ayesha_mujeeb.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ayesha_mujeeb.R;
import com.example.ayesha_mujeeb.models.ModelRecyclerViewHorizontalFragment;

import java.util.List;

public class AdapterRecyclerViewHorizontalFragment extends RecyclerView.Adapter<AdapterRecyclerViewHorizontalFragment.ViewHolder>{

    List<ModelRecyclerViewHorizontalFragment> appPreviewList;
    View view;

    public AdapterRecyclerViewHorizontalFragment (List<ModelRecyclerViewHorizontalFragment> appPreviewList) {
        this.appPreviewList = appPreviewList;
    }

    @NonNull
    @Override
    public AdapterRecyclerViewHorizontalFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_horizontal_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerViewHorizontalFragment.ViewHolder holder, int position) {

        String tag = appPreviewList.get(position).getTextViewTag();
        String name = appPreviewList.get(position).getTextViewAppFullName();
        String desc = appPreviewList.get(position).getTextViewAppFullDesc();

        int preview = appPreviewList.get(position).getImageViewAppPrev();
        int logo = appPreviewList.get(position).getImageViewAppFramelogo();

        String appFrameName = appPreviewList.get(position).getTextViewAppFrameName();
        String appFrameDesc = appPreviewList.get(position).getTextViewAppFrameDesc();

        holder.setData(tag, name, desc, preview, logo, appFrameName, appFrameDesc);

    }

    @Override
    public int getItemCount() {
        if (appPreviewList.size() == 0) {
            return 1;
        } else {
            return appPreviewList.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewTag;
        private TextView textViewAppFullName;
        private TextView textViewAppFullDesc;

        private ImageView imageViewAppPrev;
        private ImageView imageViewAppFrameLogo;

        private TextView textViewAppFrameName;
        private TextView textViewAppFrameDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewTag = itemView.findViewById(R.id.textViewTag);
            textViewAppFullName = itemView.findViewById(R.id.textViewAppFullName);
            textViewAppFullDesc = itemView.findViewById(R.id.textViewAppFullDesc);

            imageViewAppPrev = itemView.findViewById(R.id.imageViewAppPrev);
            imageViewAppFrameLogo = itemView.findViewById(R.id.imageViewAppFrameLogo);

            textViewAppFrameName = itemView.findViewById(R.id.textViewAppFrameName);
            textViewAppFrameDesc = itemView.findViewById(R.id.textViewAppFrameDesc);
        }

        public void setData(String tag, String name, String desc, int preview, int logo, String appFrameName, String appFrameDesc) {
            textViewTag.setText(tag);
            textViewAppFullName.setText(name);
            textViewAppFullDesc.setText(desc);

            imageViewAppPrev.setImageResource(preview);
            imageViewAppFrameLogo.setImageResource(logo);

            textViewAppFrameName.setText(appFrameName);
            textViewAppFrameDesc.setText(appFrameDesc);
        }
    }
}
