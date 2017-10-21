package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int halfHeight = getMeasuredHeight() / 2;
        int halfWidth = getMeasuredWidth() / 2;
        Paint paint = new Paint();
        canvas.drawRect(halfWidth - 200, halfHeight - 200, halfWidth + 200, halfHeight + 200, paint);
//        练习内容：使用 canvas.drawRect() 方法画矩形
    }
}
