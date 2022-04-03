package com.example.lab6_bt4.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lab6_bt4.R;
import com.example.lab6_bt4.model.DSNhac;

public class DSNhacAdapter extends ArrayAdapter<DSNhac> {
    Activity context;
    int resource;
    public DSNhacAdapter(Activity context,int resource){
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View customView = inflater.inflate(this.resource, null);
        ImageView imgHinh = customView.findViewById(R.id.imgHinh);
        TextView txtTenCaSi = customView.findViewById(R.id.txtCaSi);
        TextView txttenBaiHat = customView.findViewById(R.id.txtTenBaiHat);
        TextView txtLuotXem = customView.findViewById(R.id.txtLuotXem);
        TextView txtLike = customView.findViewById(R.id.txtThich);
        TextView txtdisLike = customView.findViewById(R.id.txtKhongThich);
        DSNhac nc = getItem(position);
        imgHinh.setImageResource(nc.getHinh());
        txtTenCaSi.setText(nc.getTenCaSi());
        txttenBaiHat.setText(nc.getTenBaiHat());
        txtLuotXem.setText(nc.getLuotXem());
        txtLike.setText(nc.getThich());
        txtdisLike.setText(nc.getKhongThich());
        return customView;
    }


}
