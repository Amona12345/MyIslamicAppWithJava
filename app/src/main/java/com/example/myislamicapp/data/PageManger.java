package com.example.myislamicapp.data;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class PageManger {

    public  static Drawable getQuranImageByPageNumber(Context context, int pageNumber){
        DecimalFormat formater =new DecimalFormat("000");
        String drawbleName="images/page"+formater.format(pageNumber)+".png";
    InputStream istr=null;
        try {
            istr=context.getAssets().open(drawbleName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Drawable.createFromStream(istr,null);

    }
}
