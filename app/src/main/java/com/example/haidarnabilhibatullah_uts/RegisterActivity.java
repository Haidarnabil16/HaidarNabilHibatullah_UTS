package com.example.haidarnabilhibatullah_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.haidarnabilhibatullah_uts.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {


    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = binding.etNamaRegister.getText().toString().trim();
                String email = binding.etEmailRegister.getText().toString().trim();
                String password = binding.etPassRegister.getText().toString().trim();

                if (TextUtils.isEmpty(nama)) {
                    binding.etNamaRegister.setError("Nama harus di isi1");
                } else if (TextUtils.isEmpty(email)) {
                    binding.etEmailRegister.setError("Email harus di isi!");
                } else if (TextUtils.isEmpty(password)) {
                    binding.etPassRegister.setError("Password harus di isi!");
                } else {
                    Intent register = new Intent(RegisterActivity.this, RegistrasiSuksesActivity.class);
                    register.putExtra("nama",nama);
                    register.putExtra("email",email);
                    register.putExtra("password",password);
                    startActivity(register);
                    finishAffinity();
                }
            }
        });

        binding.tvSudahPunyaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sudahpunyaakun = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(sudahpunyaakun);
                finishAffinity();
            }
        });

    }
}