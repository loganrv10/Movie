package com.example.movie;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    LinearLayout linearLayout;
    ImageView imageView;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
     linearLayout = itemView.findViewById(R.id.linearLayout);
     imageView = itemView.findViewById(R.id.MovieImage);
    }


    public void setData(ComingSoonDTO comingSoonDTO){
        Glide.with(imageView).load(comingSoonDTO.getPosterurl()).into(imageView);

    }
}
