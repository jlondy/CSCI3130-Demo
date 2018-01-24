package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up the button

        Button Button = (Button) findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            //click happens
            public void onClick(View view) {
                //grabbing the text from user and replacing it into textview
                input= (EditText) findViewById(R.id.editText);
                output= (TextView) findViewById(R.id.buttonID);
                output.setText(input.getText());
            }
        });
    }
}
