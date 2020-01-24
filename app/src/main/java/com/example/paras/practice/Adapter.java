package com.example.paras.practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Model;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder>
{

    List<Model> models;

    public Adapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position)
    {
        int resource = models.get(position).getPic_id();
        String title = models.get(position).getTitle_id();

        holder.setData(resource,title);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        public ImageView pic_id;
        public TextView title_id;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);

            pic_id = itemView.findViewById(R.id.pic_id);
            title_id = itemView.findViewById(R.id.title_id);

        }
        public void setData(int resource,String title)
        {
            pic_id.setImageResource(resource);
            title_id.setText(title);
        }
    }
}
