package com.example.rmp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.rmp4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("names", new NameSender(
                ((EditText)findViewById(R.id.editTextTextFName)).getText().toString(),
                ((EditText)findViewById(R.id.editTextTextLName)).getText().toString()));
        startActivity(intent);
    }
}