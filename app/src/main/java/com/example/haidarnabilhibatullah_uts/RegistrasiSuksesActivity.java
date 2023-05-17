package com.example.haidarnabilhibatullah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.haidarnabilhibatullah_uts.databinding.ActivityRegistrasiSuksesBinding;

public class    RegistrasiSuksesActivity extends AppCompatActivity {


    ActivityRegistrasiSuksesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrasiSuksesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent register = getIntent();

        String dataNama = register.getStringExtra("nama");
        String dataEmail = register.getStringExtra("email");
        String dataPassword = register.getStringExtra("password");

        binding.btnLoginRegisSukses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent registersukses = new Intent(RegistrasiSuksesActivity.this, LoginActivity.class);
            registersukses.putExtra("nama",dataNama);
            registersukses.putExtra("email",dataEmail);
            registersukses.putExtra("nama",dataPassword);
            startActivity(registersukses);
            finishAffinity();


            }
        });


    }
}