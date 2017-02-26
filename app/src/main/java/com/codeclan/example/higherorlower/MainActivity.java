package com.codeclan.example.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private int randomNumber;
    private Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNum();
    }

    private int randomNum() {
        rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
        return randomNumber;
    }

    public void makeToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        if (guessInt > randomNumber) {
            makeToast("Lower!");
        } else if (guessInt < randomNumber) {
            makeToast("Higher");
        } else {
            makeToast("That's right! Have Another Go!");
            randomNum();
        }
    }
}
