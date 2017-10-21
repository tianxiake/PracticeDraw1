package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {
    private static final String LYJ_TAG = "LYJ_HistogramView";
    private int histogramWidth = 100;
    private int histogramInterval = 20;
    private int startPointX = 100;
    private int startPointY = 700;
    //直方图的高度
    private int[] histogramHeights = new int[]{0, 100, 60, 200, 100, 400, 500};
    private String[] texts = new String[]{"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        for (int i = 0; i < histogramHeights.length; i++) {
            int drawLeft = startPointX + (i + 1) * histogramInterval + (i) * histogramWidth;
            int drawTop = startPointY - histogramHeights[i];
            int drawRight = drawLeft + histogramWidth;
            int drawBottom = startPointY;
            Log.v(LYJ_TAG, "[i=" + i + "]left:" + drawLeft + ",top:" + drawTop + ",right:" + drawRight + ",bottom:" + drawBottom);
            paint.setColor(Color.GRAY);
            if (drawBottom - drawTop <= 0) {
                drawTop = drawTop - 1;
                paint.setColor(Color.GREEN);
            }
            canvas.drawRect(drawLeft, drawTop, drawRight, drawBottom, paint);
            //文字的大小
            float textSize = 30;
            paint.setTextSize(textSize);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(Color.WHITE);
            canvas.drawText(texts[i], drawLeft + histogramWidth / 2, startPointY + textSize, paint);
        }
        canvas.drawLine(startPointX, startPointY, startPointX, 500, paint);
        canvas.drawLine(startPointX, startPointY, startPointX + 1000, startPointY, paint);
        paint.setTextSize(50);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("直方图", (startPointX + 1000) / 2, startPointY + 100, paint);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
