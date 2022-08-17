package com.example.fragmentsaugust17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class GmailApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_app);
    }

    public void org(View view) {
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.frid,new BlankFragment()).commit();
    }

    public void gre(View view) {
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.frid,new BlankFragment2()).commit();
    }

    public void whi(View view) {
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.frid,new BlankFragment3()).commit();

    }
}