package com.se3.rexon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Slider extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private TextView nextText;
    private TextView backText;
    private static int counter=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        imageView = findViewById(R.id.slider_image);
        textView = findViewById(R.id.slider_text);
        nextText = findViewById(R.id.nextText);
        backText = findViewById(R.id.backText);

    }

    public void changeSlide(View view) {
        incrementCounter();
    }

    public void backSlide(View view) {
        Slider.counter=0;
        System.out.println("Decrement Counter: "+Slider.counter);
        incrementCounter();
    }

    public void incrementCounter(){
        if(Slider.counter==0){
            imageView.setImageResource(R.drawable.logins_one);
            textView.setText("Welcome to the way for project management\n\nThe best in the domain of Project follow up\n\nDone by Rexon");
            nextText.setText("next");
            backText.setVisibility(View.INVISIBLE);
            Slider.counter+=1;
        }
        else if(Slider.counter==1){
            imageView.setImageResource(R.drawable.logins_three);
            textView.setText("Program a meeting to present to project,\n\nFollow up in real-time the advancement\n\nView Charts rate");
            nextText.setText("next");
            backText.setVisibility(View.VISIBLE);
            Slider.counter+=1;
        }

        else if(Slider.counter==2){
            imageView.setImageResource(R.drawable.logins_four);
            textView.setText("Issue payment and get a visual of its development,\n\nChat with the professionals through our platform\n\nView Real-time Notification");
            nextText.setText("next");
            backText.setVisibility(View.VISIBLE);
            Slider.counter+=1;
        }
        else if(Slider.counter==3){
            imageView.setImageResource(R.drawable.logins_one);
            textView.setText("Rexon is the best solution for you and your projects\n\n Bear the risk and enjoy the Success !!!\n\nTrust the process ...");
            nextText.setText("next");
            backText.setVisibility(View.VISIBLE);
            Slider.counter+=1;
        }else{
            Intent intent = new Intent(getApplicationContext(),Register.class);
            startActivity(intent);
        }
    }
}