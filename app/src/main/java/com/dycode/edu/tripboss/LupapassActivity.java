package com.dycode.edu.tripboss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

public class LupapassActivity extends AppCompatActivity {

    private Button btn_krm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapass);

        btn_krm = (Button)findViewById(R.id.btn_krm);

        btn_krm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LupapassActivity.this, SigninActivity.class);
                startActivity(i);
            }
        });
    }
}
