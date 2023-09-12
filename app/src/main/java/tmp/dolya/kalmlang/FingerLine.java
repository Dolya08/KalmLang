package tmp.dolya.kalmlang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class FingerLine extends View {
    private final Paint mPaint;
    Level3_2 level3_2 = new Level3_2();
    private float startX;
    private float startY;
    private float endX;
    private float endY;
    public Canvas mCanvas;
    int[] pos = new int[2];
    float[] x1, y1, x2, y2;
    ImageView item1, item2, item3, item4;
    TextView numb1, numb2, numb3, numb4;

    public FingerLine(Context context) {
        this(context, null);
        Bitmap mBitmap = Bitmap.createBitmap(level3_2.width, level3_2.height, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
        item1 = (ImageView)findViewById(R.id.imgItem1);
        item2 = (ImageView)findViewById(R.id.imgItem2);
        item3 = (ImageView)findViewById(R.id.imgItem3);
        item4 = (ImageView)findViewById(R.id.imgItem4);
        numb1 = (TextView)findViewById(R.id.numbItem1);
        numb2 = (TextView)findViewById(R.id.numbItem2);
        numb3 = (TextView)findViewById(R.id.numbItem3);
        numb4 = (TextView)findViewById(R.id.numbItem4);
        x1[0] = pos[0];
        y1[0] = pos[1];
        x2[0] = x1[0] + item1.getWidth();
        y2[0] = y1[0] + item1.getHeight();
        Log.d("x1", String.valueOf(x1[0]));
        Log.d("x2", String.valueOf(x2[0]));
        Log.d("y1", String.valueOf(y1[0]));
        Log.d("y2", String.valueOf(y2[0]));

        item2.getLocationOnScreen(pos);
        x1[1] = pos[0];
        y1[1] = pos[1];
        x2[1] = x1[1] + item2.getWidth();
        y2[1] = y1[1] + item2.getHeight();

        item3.getLocationOnScreen(pos);
        x1[2] = pos[0];
        y1[2] = pos[1];
        x2[2] = x1[2] + item3.getWidth();
        y2[2] = y1[2] + item3.getHeight();

        item4.getLocationOnScreen(pos);
        x1[3] = pos[0];
        y1[3] = pos[1];
        x2[3] = x1[3] + item4.getWidth();
        y2[3] = y1[3] + item4.getHeight();

        numb1.getLocationOnScreen(pos);
        x1[0] = pos[0];
        y1[0] = pos[1];
        x2[0] = x1[0] + numb1.getWidth();
        y2[0] = y1[0] + numb1.getHeight();

        numb2.getLocationOnScreen(pos);
        x1[1] = pos[0];
        y1[1] = pos[1];
        x2[1] = x1[1] + numb2.getWidth();
        y2[1] = y1[1] + numb2.getHeight();

        numb3.getLocationOnScreen(pos);
        x1[2] = pos[0];
        y1[2] = pos[1];
        x2[2] = x1[2] + numb3.getWidth();
        y2[2] = y1[2] + numb3.getHeight();

        numb4.getLocationOnScreen(pos);
        x1[3] = pos[0];
        y1[3] = pos[1];
        x2[3] = x1[3] + numb4.getWidth();
        y2[3] = y1[3] + numb4.getHeight();
    }

    public FingerLine(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(startX, startY, endX, endY, mPaint);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = event.getX();
                startY = event.getY();
                if (x1[0] < startX && startX < x2[0] && y1[0] < startY && startY < y2[0]) {
                    startX = x1[0] + (float)item1.getWidth() / 2;
                    startY = y1[0] + item1.getHeight();
                } else if (x1[1] < startX && startX < x2[1] && y1[1] < startY && startY < y2[1]) {
                    startX = x1[1] + (float)item2.getWidth() / 2;
                    startY = y1[1] + item2.getHeight();
                } else if (x1[2] < startX && startX < x2[2] && y1[2] < startY && startY < y2[2]) {
                    startX = x1[2] + (float)item3.getWidth() / 2;
                    startY = y1[2] + item3.getHeight();
                } else if (x1[3] < startX && startX < x2[3] && y1[3] < startY && startY < y2[3]) {
                    startX = x1[3] + (float)item4.getWidth() / 2;
                    startY = y1[3] + item4.getHeight();
                }
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                endX = event.getX();
                endY = event.getY();
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                endX = event.getX();
                endY = event.getY();
                if (x1[0] < endX && endX < x2[0] && y1[0] < endY && endY < y2[0]) {
                    endX = x1[0] + (float)item1.getWidth() / 2;
                    endY = y1[0];
                } else if (x1[1] < endX && endX < x2[1] && y1[1] < endY && endY < y2[1]) {
                    endX = x1[1] + (float)item2.getWidth() / 2;
                    endY = y1[1];
                } else if (x1[2] < endX && endX < x2[2] && y1[2] < endY && endY < y2[2]) {
                    endX = x1[2] + (float)item3.getWidth() / 2;
                    endY = y1[2];
                } else if (x1[3] < endX && endX < x2[3] && y1[3] < endY && endY < y2[3]) {
                    endX = x1[3] + (float)item4.getWidth() / 2;
                    endY = y1[3];
                }
                mCanvas.drawLine(startX, startY, endX, endY, mPaint);
                invalidate();
                break;
        }
        return true;
    }
}
