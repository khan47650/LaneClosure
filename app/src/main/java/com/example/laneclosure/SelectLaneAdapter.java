package com.example.laneclosure;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SelectLaneAdapter extends RecyclerView.Adapter<SelectLaneAdapter.ViewHolder> {
    List<Selected>selectedList;
    Context context;

    public SelectLaneAdapter(List<Selected> selectedList, Context context) {
        this.selectedList = selectedList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row_type,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(selectedList.get(position).getImage());
        holder.textView.setText(selectedList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return selectedList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.tvTitle);

        }
    }
}
