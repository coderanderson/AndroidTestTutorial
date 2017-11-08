package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by dranderson on 11/6/17.
 */

public class ResultActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent intent = getIntent();
        TextView textView = (TextView)findViewById(R.id.textView);
        Bundle extras = intent.getExtras();
        String fahrenheitValue = extras.getString("fahrenheitValue");
        String celsiusValue = extras.getString("celsiusValue");
        Boolean direction = extras.getBoolean("direction");
        if(direction)
            textView.setText(fahrenheitValue + "F is " + celsiusValue + "C");
        else
            textView.setText(celsiusValue + "C is " + fahrenheitValue + "F");
    }

}
