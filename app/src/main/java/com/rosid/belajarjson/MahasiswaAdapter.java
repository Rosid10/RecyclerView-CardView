package com.rosid.belajarjson;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @Override

    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override

    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtID.setText(dataList.get(position).getId());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtEmail.setText(dataList.get(position).getEmail());

    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtID, txtNama, txtEmail;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtID = (TextView) itemView.findViewById(R.id.textID);
            txtNama = (TextView) itemView.findViewById(R.id.textNama);
            txtEmail = (TextView) itemView.findViewById(R.id.textEmail);
        }
    }
}
