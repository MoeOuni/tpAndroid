package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText a,b ;
    TextView Res ;
    RadioButton plus ,moins ,multip ,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.TxtViewnum1);
        b=findViewById(R.id.TxtViewnum2);
        Res=findViewById(R.id.TxtViewResultat);
        plus=findViewById(R.id.Btnplus);
        moins=findViewById(R.id.Btnmoins);
        multip=findViewById(R.id.Btnfois);
        div=findViewById(R.id.BtnDiv);
    }

    public void calculate(View V){

        String n1=a.getText().toString();
        String n2=b.getText().toString();

        if (plus.isChecked()) {
            Integer s = Integer.valueOf(n1) + Integer.valueOf(n2);
            Res.setText("le résultats est :" + s);
        }
        else if (moins.isChecked()){
            Integer s=Integer.valueOf(n1) -Integer.valueOf(n2);
            Res.setText("le résultats est :" +s);
        }else if (multip.isChecked()){
            Integer s=Integer.valueOf(n1) * Integer.valueOf(n2);
            Res.setText("le résultats est :" +s);
        }else if (div.isChecked()){
            Integer s=Integer.valueOf(n1) / Integer.valueOf(n2);
            Res.setText("le résultats est :" +s);
        }


    }
}