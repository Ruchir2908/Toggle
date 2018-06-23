package com.example.caatulgupta.a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int flag1 = 0,flag2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        int id = view.getId();
        Button b1 = (Button) view;
        Button b11 = findViewById(R.id.b1);
        if(id==R.id.b2 && flag1==0){
            b11.setText("ON");
            b11.setEnabled(true);
            flag1 =1;
        }else if(id==R.id.b2 && flag1==1){
            b11.setText("OFF");
            b11.setEnabled(false);
            flag1 = 0;
        }

        Button b22 = findViewById(R.id.b2);
        if(id==R.id.b1 && flag2==0){
            b22.setText("ON");
            b22.setEnabled(true);
            flag2 =1;
        }else if(id==R.id.b1 && flag2==1){
            b22.setText("OFF");
            b22.setEnabled(false);
            flag2 = 0;
        }

    }
}
