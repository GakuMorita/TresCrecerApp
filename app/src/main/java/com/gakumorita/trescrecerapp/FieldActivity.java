package com.gakumorita.trescrecerapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FieldActivity extends AppCompatActivity {
    // ボタンの宣言
    private Button wPlusButton;
    private Button wMinusButton;
    private Button hPlusButton;
    private Button hMinusButton;

    // フィールドの宣言
    private NumericView fieldHeight;
    private NumericView fieldWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);

        // ボタンの設定
        wPlusButton =  findViewById(R.id.WPlusBtn);
        wMinusButton =  findViewById(R.id.WMinusBtn);
        hPlusButton =  findViewById(R.id.HPlusBtn);
        hMinusButton =  findViewById(R.id.HMinusBtn);

        // フィールドの設定
        fieldHeight = findViewById(R.id.ValueHeight);
        fieldWidth = findViewById(R.id.ValueWidth);

        // ボタンが押された事を示すリスナー登録
        wPlusButton.setOnClickListener((View v) -> fieldWidth.up());

        wMinusButton.setOnClickListener((View v) -> fieldWidth.down());

        hPlusButton.setOnClickListener((View v) -> fieldHeight.up());

        hMinusButton.setOnClickListener((View v) -> fieldHeight.down());
    }


}

