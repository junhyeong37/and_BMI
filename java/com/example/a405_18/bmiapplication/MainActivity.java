package com.example.a405_18.bmiapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText n1 = findViewById(R.id.n1);
        final EditText n2 = findViewById(R.id.n2);
        Button btn1 = findViewById(R.id.btn1);
        final TextView res = findViewById(R.id.res);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(n1.getText().toString());
                double b = Double.parseDouble(n2.getText().toString());
                double c = a / ((b*0.01)*(b*0.01));
                //18.5 이하면 저체중, 18.5~23은 정상,
                // 23~25는 과체중, 25~30은 비만, 30이상은 고도비만으로 나누어진다.
                if(c<=18.5){
                    res.setText("결과: "+ String.format("%.1f",c) + "\n저체중입니다.");
                }else if(18.5<c & c<=23){
                    res.setText("결과: "+ String.format("%.1f",c) + "\n정상입니다.");
                }else if(23<c & c<=25){
                    res.setText("결과: "+ String.format("%.1f",c) + "\n과체중입니다.");
                }else if(25<c & c<=30){
                    res.setText("결과: "+ String.format("%.1f",c) + "\n비만입니다.");
                }else{
                    res.setText("결과: "+ String.format("%.1f",c) + "\n고도비만입니다.");
                }


            }
        });
    }
}
