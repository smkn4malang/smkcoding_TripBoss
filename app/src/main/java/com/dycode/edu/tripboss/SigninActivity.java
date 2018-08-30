package com.dycode.edu.tripboss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    private EditText txt_email, txt_pass;
    private TextView lupa;
    private Button btn_msk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btn_msk = (Button) findViewById(R.id.btn_msk);
        txt_pass = (EditText) findViewById(R.id.txt_pass);
        txt_email = (EditText) findViewById(R.id.txt_email);
        lupa = (TextView)findViewById(R.id.lupa);

        btn_msk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }public void login() {
        String user = txt_email.getText().toString().trim();
        String word = txt_pass.getText().toString().trim();
        if (user.equals("ryck") && word.equals("270601")) {
            Intent i = new Intent(this, MainmenuActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Username dan Password tidak cocok!!", Toast.LENGTH_LONG).show();
        }
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SigninActivity.this, LupapassActivity.class);
                startActivity(i);
            }
        });
    }
}
