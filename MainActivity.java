package com.linet.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button add, subtract, multiple, divide, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.button);
        subtract = (Button) findViewById(R.id.button2);
        multiple = (Button) findViewById(R.id.button3);
        divide = (Button) findViewById(R.id.button4);
        clear = (Button) findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnum = (EditText) findViewById(R.id.editText2);
                EditText secondnum = (EditText) findViewById(R.id.editText3);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(secondnum.getText().toString());
                int result2 = num1 + num2;
                result.setText(result2 + "");
                TextView previous = (TextView) findViewById(R.id.textView2);
                String before = num1 + "+" + num2 + "=" + result2;
                previous.setText(before);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnum = (EditText) findViewById(R.id.editText2);
                EditText secondnum = (EditText) findViewById(R.id.editText3);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(secondnum.getText().toString());
                int result2 = num1 - num2;
                result.setText(result2 + "");
                TextView previous = (TextView) findViewById(R.id.textView2);
                String before = num1 + "-" + num2 + "=" + result2;
                previous.setText(before);

            }
        });

        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnum = (EditText) findViewById(R.id.editText2);
                EditText secondnum = (EditText) findViewById(R.id.editText3);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(secondnum.getText().toString());
                int result2 = num1 * num2;
                result.setText(result2 + "");
                TextView previous = (TextView) findViewById(R.id.textView2);
                String before = num1 + "*" + num2 + "=" + result2;
                previous.setText(before);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnum = (EditText) findViewById(R.id.editText2);
                EditText secondnum = (EditText) findViewById(R.id.editText3);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(firstnum.getText().toString());
                int num2 = Integer.parseInt(secondnum.getText().toString());
                int result2 = num1 / num2;
                result.setText(result2 + "");
                TextView previous = (TextView) findViewById(R.id.textView2);
                String before = num1 + "/" + num2 + "=" + result2;
                previous.setText(before);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnum = (EditText) findViewById(R.id.editText2);
                EditText secondnum = (EditText) findViewById(R.id.editText3);
                TextView result = (TextView) findViewById(R.id.textView);
                String num1 = "";
                String num2 = "";
                String result2 ="0";
                firstnum.setText(num1 + "");
                secondnum.setText(num2 + "");
                result.setText(result2 + "");
                TextView previous = (TextView) findViewById(R.id.textView2);
                String before = "Empty";
                previous.setText(before);

            }
        });
    }
}
