package com.codeclan.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private int randdomNumber;
    public void makeToast(String s){

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        if (guessInt > randdomNumber){
            makeToast("Lower!");

        }else if (guessInt < randdomNumber ){
            makeToast("Higher");
        }else{
            makeToast("That's right! Have Another Go!");
            Random rand = new Random();
            randdomNumber = rand.nextInt(20)+1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randdomNumber = rand.nextInt(20)+1;
    }
}
