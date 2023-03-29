package com.ananjablu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btn_Alien(View view) {
        ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
        imageAlien.setVisibility(View.VISIBLE);

        ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
        imageEinstein.setVisibility(View.INVISIBLE);

        ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
        imageAfro.setVisibility(View.INVISIBLE);

        ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);
        imageElPatrol.setVisibility(View.INVISIBLE);
    }

    public void btn_Einstein(View view) {
        ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
        imageAlien.setVisibility(View.INVISIBLE);

        ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
        imageEinstein.setVisibility(View.VISIBLE);

        ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
        imageAfro.setVisibility(View.INVISIBLE);

        ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);
        imageElPatrol.setVisibility(View.INVISIBLE);
    }

    public void btn_Afro(View view) {
        ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
        imageAlien.setVisibility(View.INVISIBLE);

        ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
        imageEinstein.setVisibility(View.INVISIBLE);

        ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
        imageAfro.setVisibility(View.VISIBLE);

        ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);
        imageElPatrol.setVisibility(View.INVISIBLE);
    }

    public void btn_ElPatrol(View view) {
        ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
        imageAlien.setVisibility(View.INVISIBLE);

        ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
        imageEinstein.setVisibility(View.INVISIBLE);

        ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
        imageAfro.setVisibility(View.INVISIBLE);

        ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);
        imageElPatrol.setVisibility(View.VISIBLE);
    }

    public void btn_Reset(View view) {
        ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
        imageAlien.setVisibility(View.VISIBLE);

        ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
        imageEinstein.setVisibility(View.VISIBLE);

        ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
        imageAfro.setVisibility(View.VISIBLE);

        ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);
        imageElPatrol.setVisibility(View.VISIBLE);


        EditText pickName = (EditText) findViewById(R.id.pickAName);
        pickName.getText().clear();
    }

    public void btn_Introduce(View view) {
        EditText name = (EditText) findViewById(R.id.pickAName);
        if (name.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();

        } else {
            ImageView imageAlien = (ImageView) findViewById(R.id.imgAlien);
            ImageView imageEinstein = (ImageView) findViewById(R.id.imgEinstein);
            ImageView imageAfro = (ImageView) findViewById(R.id.imgAfro);
            ImageView imageElPatrol = (ImageView) findViewById(R.id.imgElPatrol);

            //if (imageAlien.isShown() && imageEinstein.isShown() && image)
            if (imageAlien.isShown()) {
                Toast.makeText(getApplicationContext(), "Hello, " + name.getText().toString() + " The Alien", Toast.LENGTH_SHORT).show();
            } else if (imageEinstein.isShown()) {
                Toast.makeText(getApplicationContext(), "Hello, " + name.getText().toString() + " The Einstein", Toast.LENGTH_SHORT).show();
            } else if (imageAfro.isShown()) {
                Toast.makeText(getApplicationContext(), "Hello, " + name.getText().toString() + " The Afro", Toast.LENGTH_SHORT).show();
            } else if (imageElPatrol.isShown()){
                Toast.makeText(getApplicationContext(), "Hello, " + name.getText().toString() + " The El Patrol", Toast.LENGTH_SHORT).show();

            }

        }
    }
}