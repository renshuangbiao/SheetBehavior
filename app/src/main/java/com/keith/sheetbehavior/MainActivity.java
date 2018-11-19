package com.keith.sheetbehavior;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.android.sheetbehavior.SheetBehavior;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mGotoRightActivity;
    private Button mButton2;
    private Button mButton3;
    private Button mButton1;
    private LinearLayout mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGotoRightActivity = findViewById(R.id.goto_RightActivity);
        mGotoRightActivity.setOnClickListener(this);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton1 = findViewById(R.id.button1);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mContent = findViewById(R.id.content);
        SheetBehavior sheetBehavior = SheetBehavior.from(mContent);
        sheetBehavior.setSheetCallback(new SheetBehavior.SheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mGotoRightActivity.getId()) {
            Intent intent = new Intent(this, RightActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button1) {
            new MyDialog(this, SheetBehavior.BOTTOM_SHEET).show();
        } else if (v.getId() == R.id.button2) {
            new MyDialog(this, SheetBehavior.TOP_SHEET).show();
        } else if (v.getId() == R.id.button3) {
            new MyDialog(this, SheetBehavior.LEFT_SHEET).show();
        }
    }
}
