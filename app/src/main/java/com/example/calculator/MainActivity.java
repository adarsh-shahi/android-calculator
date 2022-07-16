package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView outputTv, inputTv;
    private Button oneBt, twoBt, threeBt, fourBt, fiveBt, sixBt, sevenBt, eightVBt, nineBt, zeroBt,
                    addBt, subBt, divBt, mulBt, allClearBt, backBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputTv = findViewById(R.id.output_screen_tv);
        inputTv = findViewById(R.id.input_screen_tv);
        oneBt = findViewById(R.id.one_btn);
        twoBt = findViewById(R.id.two_btn);
        threeBt = findViewById(R.id.three_btn);
        fourBt = findViewById(R.id.four_btn);
        fiveBt = findViewById(R.id.five_btn);
        sixBt = findViewById(R.id.six_btn);
        sevenBt = findViewById(R.id.seven_btn);
        eightVBt = findViewById(R.id.eight_btn);
        nineBt = findViewById(R.id.nine_btn);
        zeroBt = findViewById(R.id.zero_btn);
        addBt = findViewById(R.id.add_btn);
        subBt = findViewById(R.id.sub_btn);
        divBt = findViewById(R.id.div_btn);
        mulBt = findViewById(R.id.mul_btn);
        allClearBt = findViewById(R.id.all_clear_btn);
        backBt = findViewById(R.id.back_btn);




    }
}