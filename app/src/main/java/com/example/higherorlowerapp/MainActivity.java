package com.example.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void showToast(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {

        TextView guessNumber = (TextView) findViewById(R.id.guessNumber);
        int guessedNumber = Integer.parseInt(guessNumber.getText().toString());

        // Create a toast
        if (guessedNumber > randomNumber) {
            showToast("Lower!");
        } else if (guessedNumber < randomNumber) {
            showToast("Higher!");
        } else {
            showToast("You guessed right. Play again!");
            // Generate random number on app start
            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generate random number on app start
        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;
    }
}