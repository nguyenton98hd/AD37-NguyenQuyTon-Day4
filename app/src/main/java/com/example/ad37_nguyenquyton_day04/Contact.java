package com.example.ad37_nguyenquyton_day04;

import java.util.Date;

public class Contact {
    Boolean imagefirst;
    String nameornumber;
    String adress;
    String date;
    Boolean imagelate;

    public Contact(Boolean imagefirst, String nameornumber, String adress, String date, Boolean imagelate) {
        this.imagefirst = imagefirst;
        this.nameornumber = nameornumber;
        this.adress = adress;
        this.date = date;
        this.imagelate = imagelate;
    }

    public void setImagefirst(Boolean imagefirst) {
        this.imagefirst = imagefirst;
    }

    public void setNameornumber(String nameornumber) {
        this.nameornumber = nameornumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImagelate(Boolean imagelate) {
        this.imagelate = imagelate;
    }

    public Boolean getImagefirst() {
        return imagefirst;
    }

    public String getNameornumber() {
        return nameornumber;
    }

    public String getAdress() {
        return adress;
    }

    public String getDate() {
        return date;
    }

    public Boolean getImagelate() {
        return imagelate;
    }
}
