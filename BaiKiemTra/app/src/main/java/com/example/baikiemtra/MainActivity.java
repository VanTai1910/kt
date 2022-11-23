package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RelativeLayout logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rcv_list);
        logout = (RelativeLayout) findViewById(R.id.logout);

        ArrayList<ThuocNam> thuocNamArrayList = new ArrayList<>();
        thuocNamArrayList.add(new ThuocNam(R.drawable.lalot,"Nguyễn Thị Mai", "Thiếu úy", "Đà Nẵng", "Việt Nam","5 sao"));

        thuocNamArrayList.add(new ThuocNam(R.drawable.nhadam,"Nguyễn Văn Long", "Thiếu úy", "Quảng Nam", "Việt Nam","5 sao"));
        thuocNamArrayList.add(new ThuocNam(R.drawable.thucquy,"Trần Văn Thời", "Trung úy", "Quảng Ngãi", "Việt Nam","5 sao"));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ThuocNamAdapter(thuocNamArrayList, this));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DangNhap.class));
            }
        });
    }
}