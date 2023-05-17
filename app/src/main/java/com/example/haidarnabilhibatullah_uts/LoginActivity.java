package com.example.haidarnabilhibatullah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haidarnabilhibatullah_uts.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent dataMenu = getIntent();

        String namamenu     = dataMenu.getStringExtra("nama");
        String emailmenu    = dataMenu.getStringExtra("email");
        String passwordmenu = dataMenu.getStringExtra("password");

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = binding.etNamaLogin.getText().toString().trim();
                String password = binding.etPasswordLogin.getText().toString().trim();

                if (TextUtils.isEmpty(nama)) {
                    binding.etNamaLogin.setError("Nama harus di isi!");
                } else if (TextUtils.isEmpty(password)) {
                    binding.etPasswordLogin.setError("Password harus di isi!");
                } else {

                    Intent login = new Intent(LoginActivity.this, MenuActivity.class);
                    login.putExtra("nama",nama);
                    login.putExtra("email",emailmenu);
                    login.putExtra("password",password);
                    startActivity(login);
                    finishAffinity();
                }

            }
        });

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainmenu = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(mainmenu);
                finishAffinity();

            }
        });

        binding.etLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Fitur ini belum tersedia", Toast.LENGTH_SHORT).show();
            }
        });
    }
}