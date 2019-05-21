package com.example.projekt;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentA fragmentA;
    private FragmentA1 fragmentA1;
    private FragmentB fragmentB;
    private FragmentB1 fragmentB1;
    private FragmentB2 fragmentB2;
    private FragmentB3 fragmentB3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();

        fragmentA = new FragmentA();
        fragmentA1 = new FragmentA1();
        fragmentB = new FragmentB();
        fragmentB1 = new FragmentB1();
        fragmentB2 = new FragmentB2();
        fragmentB3 = new FragmentB3();


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB)
                .commit();
    }

    public void male_menu(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA1)
                .commit();
    }

    public void strona_startowa(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB)
                .commit();
    }

    public void menu_glowne(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .commit();
    }


    public void pierwszy(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB1)
                .commit();
    }

    public void drugi(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB2)
                .commit();
    }

    public void trzeci(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB3)
                .commit();
    }


    public void informacja(View view) {
        Snackbar.make(view, "Powrót do zdrowia za 2 tygodnie", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }

    public void przeniesienie(View view) {
        String google = "https://www.nike.com/pl/pl_pl/c/fcbarcelona?cp=EUNS_AFF_FCB_WG_GB_196133&wgu=6373_196133_15583615854528_e989748715&wgexpiry=1566137585";
        Uri webaddress = Uri.parse(google);

        Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
        if(gotoGoogle.resolveActivity(getPackageManager()) != null ){
            startActivity(gotoGoogle);
        }
    }
}
