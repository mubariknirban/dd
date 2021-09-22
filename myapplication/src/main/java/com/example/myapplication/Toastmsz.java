package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Toastmsz {

    public static void s(Context c,String msz){

        Toast.makeText(c,msz,Toast.LENGTH_SHORT).show();
    }
}
