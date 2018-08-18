package com.aditep.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;


import com.aditep.myapplication.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {
        ActivityShowBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show);

        String user = getIntent().getStringExtra("keyUser");
        String pass = getIntent().getStringExtra("keyPass");
        binding.tvUser.setText(user);
        binding.tvPass.setText(pass);

        Intent main = new Intent(ShowActivity.this,MainActivity.class);
        startActivity(main);

    }
}
