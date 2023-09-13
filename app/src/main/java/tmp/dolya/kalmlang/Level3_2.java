package tmp.dolya.kalmlang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class Level3_2 extends AppCompatActivity {
    ImageView item1, item2, item3, item4;
    TextView numb1, numb2, numb3, numb4;
    float startX, startY, endX, endY;
    int width, height;
    int[] pos = new int[2];
    float[] x1, y1, x2, y2;
    LinearLayout container1lvl;
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl3_2);
        container1lvl = (LinearLayout)findViewById(R.id.container1lvl);

        Button btn_back = (Button)findViewById(R.id.btn_back_lvl);
        btn_back.setText("Меню");
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level3_2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        Button btn_next = (Button)findViewById(R.id.btn_next_lvl);
        btn_next.setVisibility(View.INVISIBLE);
    }
    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        item1 = (ImageView)findViewById(R.id.imgItem1);
        item2 = (ImageView)findViewById(R.id.imgItem2);
        item3 = (ImageView)findViewById(R.id.imgItem3);
        item4 = (ImageView)findViewById(R.id.imgItem4);
        numb1 = (TextView)findViewById(R.id.numbItem1);
        numb2 = (TextView)findViewById(R.id.numbItem2);
        numb3 = (TextView)findViewById(R.id.numbItem3);
        numb4 = (TextView)findViewById(R.id.numbItem4);

        item1.getLocationOnScreen(pos);
        Log.d("pos_x", String.valueOf(item1.getX()));
        Log.d("pos_y", String.valueOf(item1.getY()));
        x1[0] = (float)pos[0];
        y1[0] = (float)pos[1];
        x2[0] = x1[0] + (float)item1.getWidth();
        y2[0] = y1[0] + (float)item1.getHeight();

        item2.getLocationOnScreen(pos);
        x1[1] = (float)pos[0];
        y1[1] = (float)pos[1];
        x2[1] = x1[1] + (float)item2.getWidth();
        y2[1] = y1[1] + (float)item2.getHeight();

        item3.getLocationOnScreen(pos);
        x1[2] = (float)pos[0];
        y1[2] = (float)pos[1];
        x2[2] = x1[2] + (float)item3.getWidth();
        y2[2] = y1[2] + (float)item3.getHeight();

        item4.getLocationOnScreen(pos);
        x1[3] = (float)pos[0];
        y1[3] = (float)pos[1];
        x2[3] = x1[3] + (float)item4.getWidth();
        y2[3] = y1[3] + (float)item4.getHeight();

        numb1.getLocationOnScreen(pos);
        x1[0] = (float)pos[0];
        y1[0] = (float)pos[1];
        x2[0] = x1[0] + (float)numb1.getWidth();
        y2[0] = y1[0] + (float)numb1.getHeight();

        numb2.getLocationOnScreen(pos);
        x1[1] = (float)pos[0];
        y1[1] = (float)pos[1];
        x2[1] = x1[1] + (float)numb2.getWidth();
        y2[1] = y1[1] + (float)numb2.getHeight();

        numb3.getLocationOnScreen(pos);
        x1[2] = (float)pos[0];
        y1[2] = (float)pos[1];
        x2[2] = x1[2] + (float)numb3.getWidth();
        y2[2] = y1[2] + (float)numb3.getHeight();

        numb4.getLocationOnScreen(pos);
        x1[3] = (float)pos[0];
        y1[3] = (float)pos[1];
        x2[3] = x1[3] + (float)numb4.getWidth();
        y2[3] = y1[3] + (float)numb4.getHeight();

        width = getWindowManager().getDefaultDisplay().getWidth();
        height = getWindowManager().getDefaultDisplay().getHeight();
    }
    private void soundPlayBtn(MediaPlayer sound) {
        if (sound.isPlaying()) {
            sound.stop();
        }
        sound.start();
    }
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception ignored) {

        }
    }


}
