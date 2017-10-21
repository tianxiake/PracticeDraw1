package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int halfHeight = getMeasuredHeight() / 2;
        int halfWidth = getMeasuredWidth() / 2;
        Paint paint = new Paint();
        canvas.drawOval(halfWidth - 300, halfHeight - 150, halfWidth + 300, halfHeight + 150, paint);
//        练习内容：使用 canvas.drawOval() 方法画椭圆
    }
}
