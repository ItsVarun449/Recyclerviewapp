package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleriosAdapter extends RecyclerView.Adapter<RecycleriosAdapter.MyViewHolder> {

    Context mContext;
    List<Ios> mData;

    public RecycleriosAdapter(Context mContext, List<Ios> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_ios, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_number.setText(mData.get(position).getNumber());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_number;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.name_ios);
            tv_name = (TextView) itemView.findViewById(R.id.number_ios);
            img = (ImageView) itemView.findViewById(R.id.img_ios);

        }
    }
}
