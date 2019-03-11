package com.example.getservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonRaj, buttonRan, buttonDha, buttonSyl, buttonKhu, buttonBar, buttonCho, buttonMym;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hide all the titlebar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttonRaj = (Button) findViewById(R.id.Rajshahi);

        buttonRaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Rajshahi.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "রাজশাহীতে আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonRan = (Button) findViewById(R.id.Rangpur) ;
        buttonRan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Rangpur.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "রংপুরে আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDha = (Button) findViewById(R.id.Dhaka) ;
        buttonDha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dhaka.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ঢাকায় আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonSyl = (Button) findViewById(R.id.Sylhet) ;
        buttonSyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sylhet.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "িলেটে আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBar = (Button) findViewById(R.id.Barishal) ;
        buttonBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Barishal.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "বরিশালে আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonKhu = (Button) findViewById(R.id.Khulna) ;
        buttonKhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Khulna.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "খুলনা আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonCho = (Button) findViewById(R.id.Chottogram) ;
        buttonCho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chottogram.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "চট্টগ্রাম আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonMym = (Button) findViewById(R.id.Mymensingh) ;
        buttonMym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mymensingh.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ময়মনসিংহে আপনি যেসকল সেবা পেতে পারেন", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
