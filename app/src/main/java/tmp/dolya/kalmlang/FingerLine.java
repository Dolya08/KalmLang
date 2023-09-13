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

import java.util.Arrays;

public class FingerLine extends View {
    private final Paint mPaint;
    Level3_2 level3_2 = new Level3_2();
    private float startX;
    private float startY;
    private float endX;
    private float endY;
    public Canvas mCanvas;
    ImageView item1, item2, item3, item4;
    TextView numb1, numb2, numb3, numb4;

    public FingerLine(Context context) {
        this(context, null);
        Bitmap mBitmap = Bitmap.createBitmap(level3_2.width, level3_2.height, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
        item1 = (ImageView)findViewById(level3_2.item1.getId());
        item2 = (ImageView)findViewById(level3_2.item2.getId());
        item3 = (ImageView)findViewById(level3_2.item3.getId());
        item4 = (ImageView)findViewById(level3_2.item4.getId());
        numb1 = (TextView)findViewById(level3_2.numb1.getId());
        numb2 = (TextView)findViewById(level3_2.numb2.getId());
        numb3 = (TextView)findViewById(level3_2.numb3.getId());
        numb4 = (TextView)findViewById(level3_2.numb4.getId());
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
                Log.d("pos_x", Arrays.toString(level3_2.x1));
                if (level3_2.x1[0] < startX && startX < level3_2.x2[0] && level3_2.y1[0] < startY && startY < level3_2.y2[0]) {
                    startX = level3_2.x1[0] + (float)item1.getWidth() / 2;
                    startY = level3_2.y1[0] + item1.getHeight();
                } else if (level3_2.x1[1] < startX && startX < level3_2.x2[1] && level3_2.y1[1] < startY && startY < level3_2.y2[1]) {
                    startX = level3_2.x1[1] + (float)item2.getWidth() / 2;
                    startY = level3_2.y1[1] + item2.getHeight();
                } else if (level3_2.x1[2] < startX && startX < level3_2.x2[2] && level3_2.y1[2] < startY && startY < level3_2.y2[2]) {
                    startX = level3_2.x1[2] + (float)item3.getWidth() / 2;
                    startY = level3_2.y1[2] + item3.getHeight();
                } else if (level3_2.x1[3] < startX && startX < level3_2.x2[3] && level3_2.y1[3] < startY && startY < level3_2.y2[3]) {
                    startX = level3_2.x1[3] + (float)item4.getWidth() / 2;
                    startY = level3_2.y1[3] + item4.getHeight();
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
                if (level3_2.x1[0] < endX && endX < level3_2.x2[0] && level3_2.y1[0] < endY && endY < level3_2.y2[0]) {
                    endX = level3_2.x1[0] + (float)item1.getWidth() / 2;
                    endY = level3_2.y1[0];
                } else if (level3_2.x1[1] < endX && endX < level3_2.x2[1] && level3_2.y1[1] < endY && endY < level3_2.y2[1]) {
                    endX = level3_2.x1[1] + (float)item2.getWidth() / 2;
                    endY = level3_2.y1[1];
                } else if (level3_2.x1[2] < endX && endX < level3_2.x2[2] && level3_2.y1[2] < endY && endY < level3_2.y2[2]) {
                    endX = level3_2.x1[2] + (float)item3.getWidth() / 2;
                    endY = level3_2.y1[2];
                } else if (level3_2.x1[3] < endX && endX < level3_2.x2[3] && level3_2.y1[3] < endY && endY < level3_2.y2[3]) {
                    endX = level3_2.x1[3] + (float)item4.getWidth() / 2;
                    endY = level3_2.y1[3];
                }
                mCanvas.drawLine(startX, startY, endX, endY, mPaint);
                invalidate();
                break;
        }
        return true;
    }
}
