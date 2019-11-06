package com.example.caro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn1);
                checkWin();



            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn2);
                checkWin();
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn3);
                checkWin();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn4);
                checkWin();
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn5);
                checkWin();
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn6);
                checkWin();
            }
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn7);
                checkWin();
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn8);
                checkWin();
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn9);
                checkWin();
            }
        });

    }

    int count =0;
    public void checkXO(Button btn){
        if(count % 2 ==0){
            btn.setText("X");
        }
        else btn.setText("O");
        count++;

    }

    public void checkWin(){
        String btn1Text = btn1.getText().toString();
        String btn2Text = btn2.getText().toString();
        String btn3Text = btn3.getText().toString();
        String btn4Text = btn4.getText().toString();
        String btn5Text = btn5.getText().toString();
        String btn6Text = btn6.getText().toString();
        String btn7Text = btn7.getText().toString();
        String btn8Text = btn8.getText().toString();
        String btn9Text = btn9.getText().toString();

        if (btn1Text.equals(btn2Text) && btn2Text.equals(btn3Text) && (!btn1Text.equals("") || !btn2Text.equals("") || !btn3Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if (btn3Text.equals(btn4Text) && btn4Text.equals(btn5Text) && (!btn4Text.equals("") || !btn5Text.equals("") || !btn6Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if (btn7Text.equals(btn8Text) && btn8Text.equals(btn9Text) && (!btn7Text.equals("") || !btn8Text.equals("") || !btn9Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if (btn1Text.equals(btn4Text) && btn4Text.equals(btn7Text) && (!btn1Text.equals("") || !btn4Text.equals("") || !btn7Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

        }

        if (btn2Text.equals(btn5Text) && btn5Text.equals(btn8Text) && (!btn2Text.equals("") || !btn5Text.equals("") || !btn8Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }

        if (btn3Text.equals(btn6Text) && btn6Text.equals(btn9Text) && (!btn3Text.equals("") || !btn6Text.equals("") || !btn9Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }

        if (btn1Text.equals(btn5Text) && btn5Text.equals(btn9Text) && (!btn1Text.equals("") || !btn5Text.equals("") || !btn9Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }

        if (btn3Text.equals(btn5Text) && btn5Text.equals(btn7Text) && (!btn3Text.equals("") || !btn5Text.equals("") || !btn7Text.equals(""))){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }

    }

}
