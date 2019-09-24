package com.example.ad37_nguyenquyton_day04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtnumber,txtadress,txtnumber2,txtdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        txtnumber=findViewById(R.id.ten1);
        txtadress=findViewById(R.id.diachi1);
        txtnumber2=findViewById(R.id.sdt1);
        txtdate=findViewById(R.id.ngay1);
        txtnumber.setText(intent.getStringExtra("name"));
        txtadress.setText(intent.getStringExtra("adress1"));
        txtdate.setText(intent.getStringExtra("date1"));
        txtnumber2.setText(intent.getStringExtra("name"));
    }
}
