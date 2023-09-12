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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
        item1 = (ImageView)findViewById(R.id.imgItem1);
        item2 = (ImageView)findViewById(R.id.imgItem2);
        item3 = (ImageView)findViewById(R.id.imgItem3);
        item4 = (ImageView)findViewById(R.id.imgItem4);
        numb1 = (TextView)findViewById(R.id.numbItem1);
        numb2 = (TextView)findViewById(R.id.numbItem2);
        numb3 = (TextView)findViewById(R.id.numbItem3);
        numb4 = (TextView)findViewById(R.id.numbItem4);
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
        onPostCreate();

    }
    @SuppressLint("ClickableViewAccessibility")
    public void onPostCreate() {
        item1.getLocationOnScreen(pos);

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
