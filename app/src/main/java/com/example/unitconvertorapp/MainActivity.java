/**
 ** Section 8
 ** video no 74,75,76,77

 ** Make changes in java xml and drawable only

 ** how to get input from user in sepefic form only like numaric floating etc
        go to edittext int xml file and type input type and choose one option


 ** How to convert input from string to double
  */
package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    EditText et1;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);
        et1=findViewById(R.id.editText);
        bt1=findViewById(R.id.button);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //convert the given ans in double form
                double val=Double.parseDouble(et1.getText().toString());

                tv2.setText(" "+convert(val)+" lb");

            }
        });

    }

    public static double convert(double val)
    {
        double res=val*2.20462;
        return  res;
    }
}