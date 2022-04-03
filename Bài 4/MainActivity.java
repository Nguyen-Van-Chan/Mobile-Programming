package com.example.lab6_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lab6_bt4.adapter.DSNhacAdapter;
import com.example.lab6_bt4.model.DSNhac;

public class MainActivity extends AppCompatActivity {

    ListView lvPhim;
    DSNhacAdapter dsNhacAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        fakeData();
    }
    private void addEvents() {
       lvPhim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               DSNhac nc = dsNhacAdapter.getItem(i);
               Toast.makeText(MainActivity.this,"Trang Đăng Khải "+nc.getTenCaSi()+" "+nc.getTenBaiHat(),Toast.LENGTH_LONG).show();
           }
       });



    }

    private void addControls() {
        lvPhim = findViewById(R.id.lvPhim);
        dsNhacAdapter = new DSNhacAdapter(MainActivity.this, R.layout.item);
        lvPhim.setAdapter(dsNhacAdapter);
    }
    private void fakeData() {
        dsNhacAdapter.add(new DSNhac(R.drawable.buomxuan, "Con Bướm Xuân", "Hồ Quang Hiếu", "1245 ", "    1034","     20"));
        
    }



}
