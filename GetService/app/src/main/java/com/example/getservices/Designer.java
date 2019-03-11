package com.example.getservices;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Designer extends AppCompatActivity {

    Button CallButton, MailButton;

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designer);

        CallButton = (Button) findViewById(R.id.buttonCall);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("+8801706864892");
            }
        });

        MailButton = (Button) findViewById(R.id.buttonMail);

        MailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // dialContactPhone("+8801706864892");
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "mozid.13@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Service Hunting");
                intent.putExtra(Intent.EXTRA_TEXT, "I have some problem that you can solve.I need your service.");
                startActivity(intent);
            }
        });
        CallButton = (Button) findViewById(R.id.buttonCall2);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("+8801794784646");
            }
        });

        MailButton = (Button) findViewById(R.id.buttonMail2);

        MailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // dialContactPhone("+8801706864892");
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "rajunahidhasan0@gmail.com@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Service Hunting");
                intent.putExtra(Intent.EXTRA_TEXT, "I have some problem that you can solve.I need your service.");
                startActivity(intent);
            }
        });
        CallButton = (Button) findViewById(R.id.buttonCall3);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("+8801706764891");
            }
        });

        MailButton = (Button) findViewById(R.id.buttonMail3);

        MailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // dialContactPhone("+8801706864892");
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "roktim15@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Service Hunting");
                intent.putExtra(Intent.EXTRA_TEXT, "I have some problem that you can solve.I need your service.");
                startActivity(intent);
            }
        });
    }
}
