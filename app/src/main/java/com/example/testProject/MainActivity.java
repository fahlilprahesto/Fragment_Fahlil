package com.example.testProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar() .hide();

        setContentView(R.layout.activity_main);

        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);

        imageButton2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "081322749749";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone));
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.id/maps/place/Klinik+GRIYA+HUSADA+Bumi+Waringin+Indah+1/@-6.2597875,107.2399181,17.3z/data=!4m5!3m4!1s0x2e69831dd799a3cb:0x8f2849b4f087b68b!8m2!3d-6.2592453!4d107.2402665?hl=en&authuser=0"));
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"fahlilaziz0109@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Testing");
                i.putExtra(Intent.EXTRA_TEXT   , "Isi Test Email");
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        }));

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/fahlil.slluwtetappsemangatt/"));
                startActivity(intent);
            }
        });
    }
}