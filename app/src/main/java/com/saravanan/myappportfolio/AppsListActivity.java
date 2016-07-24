package com.saravanan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppsListActivity extends AppCompatActivity implements View.OnClickListener{

    Button popularMovies, stockHawk, buildItBigger, appMaterial, ubiquitous, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_list);

        popularMovies = (Button) findViewById(R.id.btnPopularMovies);
        stockHawk = (Button) findViewById(R.id.btnStockhawk);
        buildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        appMaterial = (Button) findViewById(R.id.btnMakeAppBigger);
        ubiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        capstone = (Button) findViewById(R.id.btnCapstone);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnPopularMovies:

                Toast.makeText(getApplicationContext(), "Popular movies app will be launching", Toast.LENGTH_LONG).show();

                break;

            case R.id.btnStockhawk:

                Toast.makeText(getApplicationContext(), "Stock Hawk app will be launching", Toast.LENGTH_LONG).show();

                break;

            case  R.id.btnBuildItBigger:

                Toast.makeText(getApplicationContext(), "Built it Bigger app will be launching", Toast.LENGTH_LONG).show();

                break;

            case R.id.btnMakeAppBigger:

                Toast.makeText(getApplicationContext(), "Make app material will be launching", Toast.LENGTH_LONG).show();

                break;

            case R.id.btnGoUbiquitous:

                Toast.makeText(getApplicationContext(), "Go ubiquitous app will be launching", Toast.LENGTH_LONG).show();

                break;

            case R.id.btnCapstone:

                Toast.makeText(getApplicationContext(), "My capstone app will be launching", Toast.LENGTH_LONG).show();

                break;


        }
    }
}
