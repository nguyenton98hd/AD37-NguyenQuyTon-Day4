package com.example.ad37_nguyenquyton_day04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvcontact;
    List<Contact> contact;
    Adaptercontact adapterContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvcontact=findViewById(R.id.listview);
        contact= new ArrayList<>();

        contact.add(new Contact(true,"0987654321","Việt Nam","12/09/2019",true));
        contact.add(new Contact(true,"0123456789","Việt Nam","10/09/2019",true));
        contact.add(new Contact(false,"0388475832","Di động","12/09/2019",true));
        contact.add(new Contact(true,"0847439324","Việt Nam","11/09/2019",true));
        contact.add(new Contact(false,"0293432134","Di động","13/09/2019",true));
        contact.add(new Contact(true,"0904362979","Việt Nam","15/09/2019",true));
        contact.add(new Contact(true,"1341324321","Di động","12/09/2019",true));

        adapterContact=new Adaptercontact(contact);

        lvcontact.setAdapter(adapterContact);

        lvcontact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                String ten=contact.get(i).getNameornumber();
                String ngay=contact.get(i).getDate();
                String diachi=contact.get(i).getAdress();
                intent.putExtra("name",ten);
                intent.putExtra("date1",ngay);
                intent.putExtra("adress1",diachi);
              startActivity(intent);
            }
        });

    }
}
