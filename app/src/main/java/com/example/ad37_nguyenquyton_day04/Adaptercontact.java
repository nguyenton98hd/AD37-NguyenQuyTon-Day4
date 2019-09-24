package com.example.ad37_nguyenquyton_day04;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;



public class Adaptercontact extends BaseAdapter {
    List<Contact> contacts;
    public Adaptercontact(List<Contact> contact) {
        this.contacts = contact;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        view = inflater.inflate(R.layout.item_contact, viewGroup, false);

        ImageView image1 = view.findViewById(R.id.imagefirst);
        TextView nameornumber = view.findViewById(R.id.nameornumber);
        TextView adress = view.findViewById(R.id.adress);
        TextView date = view.findViewById(R.id.date);
        ImageView image2 = view.findViewById(R.id.imagelast);

        Contact contact = contacts.get(i);

        nameornumber.setText(contact.getNameornumber());
        adress.setText(contact.getAdress());
        date.setText(contact.getDate());
        if (contact.imagelate == true) {
            image2.setImageResource(R.drawable.image2);
        }
        if (contact.imagefirst == true) {
            image1.setImageResource(R.drawable.phone);

        }
            return view;

    }
}
