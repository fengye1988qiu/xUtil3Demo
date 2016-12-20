package com.leo.xutil3demo.util;

import android.content.Context;
import android.util.DisplayMetrics;


/**
 * Created by Administrator on 12/20/2016.
 */
public class Screen {
    private  int width;
    private  int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Screen(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        width = dm.widthPixels;
        height = dm.heightPixels;
    }
}
