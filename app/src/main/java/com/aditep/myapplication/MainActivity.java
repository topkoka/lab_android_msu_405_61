package com.aditep.myapplication;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aditep.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //กำหนด layout ให้กับ Activity
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);



        binding.btnSubmit.setText("Button");
        binding.btnSubmit.setBackgroundColor(Color.parseColor("#4ba3c7"));
        binding.btnSubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String user = binding.edtUser.getText().toString();
        String pass = binding.edtPass.getText().toString();

        // dialog แบบ Toast

        Toast.makeText(MainActivity.this, " user : " + user + "   pass :" + pass, Toast.LENGTH_SHORT).show();

        Intent show = new Intent(MainActivity.this, ShowActivity.class);
        show.putExtra("keyUser",user);
        show.putExtra("keyPass",pass);
        startActivity(show);

    }
}
