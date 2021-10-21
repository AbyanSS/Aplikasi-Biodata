package me.abyanss.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Alamat;
    Button No_Telp;
    Button Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Alamat=findViewById(R.id.alamat);
        No_Telp=findViewById(R.id.telepon);
        Email=findViewById(R.id.email);

        getSupportActionBar().hide();

        Alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(Intent.ACTION_VIEW);
                v.setData(Uri.parse("geo:-7.045296, 110.471391"));

                startActivity(v);
            }
        });

        No_Telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(Intent.ACTION_DIAL);
                v.setData(Uri.parse("tel:081215539880"));

                startActivity(v);
            }
        });

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(Intent.ACTION_SENDTO);
                v.setData(Uri.parse("mailto:abyansurya04@gmail.com"));

                startActivity(v);
            }
        });
    }
}