package com.example.haidarnabilhibatullah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView tvNama, tvEmail, tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvNama  = findViewById(R.id.tv_nama_menu);
        tvEmail = findViewById(R.id.tv_email_menu);
        tvPass  = findViewById(R.id.tv_pass_menu);

        Intent getData = getIntent();
        String dataNama = getData.getStringExtra("nama");
        String dataEmail = getData.getStringExtra("email");
        String dataPassword = getData.getStringExtra("password");

        tvNama.setText(dataNama);
        tvEmail.setText(dataEmail);
        tvPass.setText(dataPassword);





    }
}