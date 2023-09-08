package tmp.dolya.kalmlang;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Level3_1_8 extends AppCompatActivity {
    int numPic;
    ImageView imgMain;
    LinearLayout obj1, obj2, obj3;
    ArrayLvl3 arrayLvl3 = new ArrayLvl3();
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl3_1);

        imgMain = (ImageView)findViewById(R.id.img_main2);
        numPic = 7;
        imgMain.setImageResource(arrayLvl3.images3_1[numPic]);
        imgMain.setAdjustViewBounds(true);

        obj1 = (LinearLayout)findViewById(R.id.objective1);
        obj2 = (LinearLayout)findViewById(R.id.objective2);
        obj3 = (LinearLayout)findViewById(R.id.objective3);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(arrayLvl3.texts3_1[numPic]);

        imgMain = (ImageView)findViewById(R.id.img_main2);
        imgMain.setTag("The Android Logo");
        imgMain.setOnLongClickListener(new MyClickListener());

        obj1.setOnDragListener(new MyDragListener());
        obj2.setOnDragListener(new MyDragListener());
        obj3.setOnDragListener(new MyDragListener());

        Button btn_back = (Button)findViewById(R.id.btn_back_lvl);
        btn_back.setText("Меню");
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level3_1_8.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        Button btn_next = (Button)findViewById(R.id.btn_next_lvl);
        btn_next.setVisibility(View.INVISIBLE);
//        btn_next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent = new Intent(Level2_2_1.this, Level1_2.class);
//                    startActivity(intent);
//                    finish();
//                } catch (Exception ignored) {
//
//                }
//            }
//        });
    }

    private static final class MyClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            ClipData.Item item = new ClipData.Item((CharSequence)v.getTag());

            String [] mimeTypes = { ClipDescription.MIMETYPE_TEXT_PLAIN };
            ClipData data = new ClipData(v.getTag().toString(), mimeTypes, item);
            DragShadowBuilder shadowBuilder = new DragShadowBuilder(v);

            v.startDrag(data, shadowBuilder, v, 0);
            v.setVisibility(View.VISIBLE);
            return true;
        }
    }

    class MyDragListener implements View.OnDragListener {
        Drawable normal_circle = getResources().getDrawable(R.drawable.circle);
        Drawable wrong_circle = getResources().getDrawable(R.drawable.circle_red);
        Drawable check_circle = getResources().getDrawable(R.drawable.circle_green);
        Drawable normal_oval = getResources().getDrawable(R.drawable.oval);
        Drawable wrong_oval= getResources().getDrawable(R.drawable.oval_red);
        Drawable check_oval= getResources().getDrawable(R.drawable.oval_green);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            View startPos = (View) event.getLocalState();
            if (event.getAction() == DragEvent.ACTION_DROP) {
                View view = (View) event.getLocalState();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (v.getId() == obj1.getId() && arrayLvl3.answer3_1[numPic] == 1) {
                    try {
                        Intent intent = new Intent(Level3_1_8.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception ignored) {

                    }
                } else if (v.getId() == obj2.getId() && arrayLvl3.answer3_1[numPic] == 2) {
                    try {
                        Intent intent = new Intent(Level3_1_8.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception ignored) {

                    }
                } else if (v.getId() == obj2.getId() && arrayLvl3.answer3_1[numPic] == 3) {
                    try {
                        Intent intent = new Intent(Level3_1_8.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception ignored) {

                    }
                } else {
                    startPos.setVisibility(View.VISIBLE);
                }
            }
            return true;
        }
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
            Intent intent = new Intent(Level3_1_8.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception ignored) {

        }
    }

}
