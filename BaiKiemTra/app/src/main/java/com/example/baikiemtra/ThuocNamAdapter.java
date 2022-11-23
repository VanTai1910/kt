package com.example.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThuocNamAdapter extends RecyclerView.Adapter<ThuocNamAdapter.DataViewHolder>{
    private List<ThuocNam> ThuocNamList;
    private Context context;

    public ThuocNamAdapter(List<ThuocNam> ThuocNamlist, Context context) {
        this.ThuocNamList = ThuocNamlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ThuocNamAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ThuocNamAdapter.DataViewHolder holder, int position) {
        ThuocNam thuocnam = ThuocNamList.get(position);
        if(thuocnam == null){
            return;
        }
        holder.TenKhoaHoc.setText(thuocnam.getTenkhoahoc());
        holder.TenThuongGoi.setText(thuocnam.getTenthuonggoi());
        holder.DacTinh.setText(thuocnam.getDactinh());
        holder.CongDung.setText(thuocnam.getCongdung());
        holder.DuocTinh.setText(thuocnam.getDuoctinh());
        holder.anh.setImageResource(thuocnam.getAnh());
    }

    @Override
    public int getItemCount() {
        return ThuocNamList == null ? 0 : ThuocNamList.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView TenKhoaHoc, TenThuongGoi, DacTinh, CongDung, DuocTinh;
        private ImageView anh;

        public DataViewHolder(View itemView) {
            super(itemView);

            TenKhoaHoc = (TextView) itemView.findViewById(R.id.tenkhoahoc);
            TenThuongGoi = (TextView)  itemView.findViewById(R.id.tenthuonggoi);
            DacTinh = (TextView)  itemView.findViewById(R.id.noiCongTac);
            CongDung = (TextView)  itemView.findViewById(R.id.congdung);
            DuocTinh = (TextView)  itemView.findViewById(R.id.duoctinh);
            anh = (ImageView) itemView.findViewById(R.id.anh);
        }
    }
}
