package com.topvision.baseselectactivity;

import android.widget.Toast;

import com.topvision.baseselectlibrary.BaseSelectActivity;


public class MainActivity extends BaseSelectActivity {

    @Override
    protected int[] setOnImageLoad() {
        int[] icons = {R.drawable.a1, R.mipmap.ic_launcher};
        return icons;
    }

    @Override
    protected String[] setOnTitleLoad() {
        String[] titls = {"条目1", "条目2"};
        return titls;
    }

    @Override
    protected void setOnItemClicked(int position) {
        Toast.makeText(this, "点击了:" + position, Toast.LENGTH_SHORT).show();
    }
}
