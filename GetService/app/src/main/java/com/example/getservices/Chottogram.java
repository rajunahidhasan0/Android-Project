package com.example.getservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Chottogram<buttonEle> extends AppCompatActivity {


    Button buttonEle, buttonBri, buttonPlu, buttonHom, buttonDes, buttonLib, buttonGar, buttonSof,
            buttonDen, buttonDoc, buttonPol, buttonLab, buttonFar, buttonBro, buttonEme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chottogram);

        buttonEle = (Button) findViewById(R.id.Electrician);
        buttonEle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Electrician.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBri = (Button) findViewById(R.id.Bricklayer);
        buttonBri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, BricksLayer.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonPlu = (Button) findViewById(R.id.Plumber);
        buttonPlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Plumber.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonHom = (Button) findViewById(R.id.HomeTutor);
        buttonHom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, HomeTutor.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDes = (Button) findViewById(R.id.Designer);
        buttonDes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Designer.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonLib = (Button) findViewById(R.id.Librarian);
        buttonLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Librarian.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });
        buttonGar = (Button) findViewById(R.id.Gardener);
        buttonGar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Gardener.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonSof = (Button) findViewById(R.id.SoftwareDeveloper);
        buttonSof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, SoftwareDeveloper.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDen = (Button) findViewById(R.id.Dentist);
        buttonDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Dentist.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDoc = (Button) findViewById(R.id.Doctor);
        buttonDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Doctor.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonPol = (Button) findViewById(R.id.Police);
        buttonPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Police.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonLab = (Button) findViewById(R.id.Labour);
        buttonLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Labour.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonFar = (Button) findViewById(R.id.Farmer);
        buttonFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Farmer.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBro = (Button) findViewById(R.id.Broker);
        buttonBro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Broker.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });

        buttonEme = (Button) findViewById(R.id.Emergency);
        buttonEme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chottogram.this, Emergency.class);
                startActivity(intent);
                Toast.makeText(Chottogram.this, "আপনার পছন্দমতো সেবা প্রদানকারীর সাথে যোগাযোগ করুন", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
