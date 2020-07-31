package com.example.mainactivitytogoother;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Check_boxes extends AppCompatActivity {

    private CheckBox check1,check2,check3;
    private Button button_sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_boxes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addListenerOnButton();

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    public void addListnerToCheckBox() {
        check1 = (CheckBox)findViewById(R.id.checkBox4);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Check_boxes.this,
                                    "Dog is selected",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void addListenerOnButton() {
        check1 = (CheckBox)findViewById(R.id.checkBox4);
        check2 = (CheckBox)findViewById(R.id.checkBox6);
        check3 = (CheckBox)findViewById(R.id.checkBox7);
        button_sel = (Button) findViewById(R.id.button);

        button_sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog : ").append(check1.isChecked());
                result.append("\nCat : ").append(check2.isChecked());
                result.append("\nCow : ").append(check3.isChecked());

                Toast.makeText(Check_boxes.this,result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
