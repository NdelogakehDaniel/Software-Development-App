package com.se3.rexon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private EditText name;
    private EditText username;
    private EditText email;
    private EditText password;
    private EditText city;
    private EditText country;
    private EditText tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //removing top bar view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        name = findViewById(R.id.name);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.r_password);
        city = findViewById(R.id.city);
        country = findViewById(R.id.country);
        tel = findViewById(R.id.tel);
    }

    public void moveToLogin(View view) {
        Intent intent = new Intent(getApplicationContext(),Login.class);
        startActivity(intent);
    }
}