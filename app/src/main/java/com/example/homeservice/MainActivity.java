package com.example.homeservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Show SignUp view
    public void ShowSignUp(View view){
        Intent show = new Intent(this, SignUpActivity.class);
        startActivity(show);
    }
}
