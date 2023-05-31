package com.example.laneclosure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusLaneAdapter extends RecyclerView.Adapter<StatusLaneAdapter.ViewHolder> {
     Context context;
    List<Selected> Lists;

    public StatusLaneAdapter(Context context, List<Selected> lists) {
        this.context = context;
        Lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row_type,null);
        return new StatusLaneAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(Lists.get(position).getImage());
        holder.textView.setText(Lists.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return Lists.size();
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
