package com.example.mainactivitytogoother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showGreetings(View view){

        String button_text;
        //get text on the button and convert to string
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Open CheckBox Activity")){
            Intent intent = new Intent(this,Check_boxes.class);
            startActivity(intent);
        }
        else if(button_text.equals("Open Radio Button Activity")){
            Intent intent = new Intent(this,RadioButton.class);
            startActivity(intent);
        }
    }
}
