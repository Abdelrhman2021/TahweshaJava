package com.geektech.tahwesha.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.tahwesha.R;

public class AccountBankItemAdapter extends RecyclerView.Adapter<AccountBankItemAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View list_item = layoutInflater.inflate(R.layout.bank_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(list_item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AccountBankItemAdapter.ViewHolder holder, int position) {
        int index = holder.getAdapterPosition();

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView bank_name,balance;
        public ImageView logo;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bank_name = itemView.findViewById(R.id.bank_name);
            balance = itemView.findViewById(R.id.balance);
            logo = itemView.findViewById(R.id.bank_logo);
            view = itemView;
        }
    }
}
