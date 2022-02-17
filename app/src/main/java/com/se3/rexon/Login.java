package com.se3.rexon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //used to remove action bar of app
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //getting elements by id
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);

    }

    public void loginUser(View view) {
        //function to login user
        Intent intent = new Intent(getApplicationContext(),EditProfile.class);
        startActivity(intent);
    }

    public void moveToRegister(View view){
        Intent intent = new Intent(getApplicationContext(),Register.class);
        startActivity(intent);
    }
}