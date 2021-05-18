package com.esnapeyekushal.myconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fahren;
    TextView result;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahren = findViewById(R.id.input);
        result = findViewById(R.id.output);
        convert = findViewById(R.id.button);

        //On button click
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //things to do after clicking button

                //get temperature from the input in fahrenheit
                String fstr = fahren.getText().toString();

                double fdbl = Double.parseDouble(fstr);

                //convert into celsius
                double celsius = (fdbl - 32.0)*(5.0/9.0);

                //display the output
                result.setText("In celsius: " + celsius);
            }
        });

    }
}