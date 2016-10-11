package com.example.johnnie.golfstarter;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TableFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();
        TableFragment tableFragment = new TableFragment();

        fragmentManager.beginTransaction().add(R.id.container,tableFragment).commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
