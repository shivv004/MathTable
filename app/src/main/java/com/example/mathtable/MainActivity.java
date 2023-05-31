package com.example.mathtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textViewHead2;
    private TextView n1;
    private TextView n2;
    private TextView n3;
    private TextView n4;
    private TextView n5;
    private TextView n6;
    private TextView n7;
    private TextView n8;
    private TextView n9;
    private TextView n10;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textViewHead2 = findViewById(R.id.textViewHead2);
        button = findViewById(R.id.button);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n10 = findViewById(R.id.n10);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int num = 0;
                if (!editText.getText().toString().equals("") && editText.getText().toString().length() > 0) {
                    String s = editText.getText().toString();
                    num = Integer.parseInt(s);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid input!", Toast.LENGTH_SHORT).show();
                }
                for (int i = 0; i < arr.length; i++)
                    arr[i] = arr[i] * num;
                textViewHead2.setText("Result:");
                n1.setText(num + " x 1 = " + arr[0]);
                n2.setText(num + " x 2 = " + arr[1]);
                n3.setText(num + " x 3 = " + arr[2]);
                n4.setText(num + " x 4 = " + arr[3]);
                n5.setText(num + " x 5 = " + arr[4]);
                n6.setText(num + " x 6 = " + arr[5]);
                n7.setText(num + " x 7 = " + arr[6]);
                n8.setText(num + " x 8 = " + arr[7]);
                n9.setText(num + " x 9 = " + arr[8]);
                n10.setText(num + " x 10 = " + arr[9]);
                Toast.makeText(MainActivity.this, "developed by Shiv!", Toast.LENGTH_SHORT).show();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(button.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
            }
        });
    }
}