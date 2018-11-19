package com.keith.sheetbehavior;

import android.os.Bundle;

import com.android.sheetbehavior.BaseSheetActivity;
import com.android.sheetbehavior.SheetBehavior;

/**
 * Create by keithren on 2018/11/18.
 */
public class RightActivity extends BaseSheetActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);
    }

    @Override
    protected int getSlideMode() {
        return SheetBehavior.RIGHT_SHEET;
    }
}
