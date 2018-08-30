package com.dycode.edu.tripboss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private Button sign_in;
    private Button sign_up;
    private Button explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in = (Button)findViewById(R.id.sign_in);
        sign_up = (Button)findViewById(R.id.sign_up);
        explore = (Button)findViewById(R.id.explore);


        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MainActivity.this, MainmenuActivity.class);
                startActivity(l);
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SigninActivity.class);
                startActivity(i);
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(i);

            }
        });
    }
}
