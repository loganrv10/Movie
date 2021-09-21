package com.example.movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    ArrayList<ComingSoonDTO> comeMovieList;

    public MovieAdapter(ArrayList<ComingSoonDTO> comeMovieList) {
        this.comeMovieList = comeMovieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
    ComingSoonDTO comingSoonDTO = comeMovieList.get(position);
    holder.setData(comingSoonDTO);
    }

    @Override
    public int getItemCount() {
        return comeMovieList.size();
    }
}
