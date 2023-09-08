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

import androidx.appcompat.app.AppCompatActivity;

public class Level2_2_3 extends AppCompatActivity {
    int numPic;
    ImageView imgMain;
    LinearLayout obj1, obj2;
    ArrayLvl2_1 arrayLvl2_1 = new ArrayLvl2_1();
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl2_1);

        imgMain = (ImageView)findViewById(R.id.img_main2);
        numPic = 2;
        imgMain.setImageResource(arrayLvl2_1.images2[numPic]);
        imgMain.setAdjustViewBounds(true);

        obj1 = (LinearLayout)findViewById(R.id.objective1);
        obj2 = (LinearLayout)findViewById(R.id.objective2);

        imgMain = (ImageView)findViewById(R.id.img_main2);
        imgMain.setTag("The Android Logo");
        imgMain.setOnLongClickListener(new MyClickListener());

        obj1.setOnDragListener(new MyDragListener());
        obj2.setOnDragListener(new MyDragListener());

        Button btn_back = (Button)findViewById(R.id.btn_back_lvl);
        btn_back.setText("Меню");
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_2_3.this, GameLevels.class);
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
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    startPos = (View) event.getLocalState();
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    if (v.getId() == obj1.getId()) {
                        if (arrayLvl2_1.answer2[numPic] == 1) {
                            v.setBackground(check_circle);
                        } else {
                            v.setBackground(wrong_circle);
                        }
                    } else if (v.getId() == obj2.getId()) {
                        if (arrayLvl2_1.answer2[numPic] == 2) {
                            v.setBackground(check_oval);
                        } else {
                            v.setBackground(wrong_oval);
                        }
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                case DragEvent.ACTION_DRAG_ENDED:
                    if (v.getId() == obj1.getId()) {
                        v.setBackground(normal_circle);
                    } else if (v.getId() == obj2.getId()) {
                        v.setBackground(normal_oval);
                    }
                    break;
                case DragEvent.ACTION_DROP:
                    View view = (View) event.getLocalState();
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (v.getId() == obj1.getId() && arrayLvl2_1.answer2[numPic] == 1) {
                        try {
                            Intent intent = new Intent(Level2_2_3.this, Level2_2_4.class);
                            startActivity(intent);
                            finish();
                        } catch (Exception ignored) {

                        }
                    } else if (v.getId() == obj2.getId() && arrayLvl2_1.answer2[numPic] == 2) {
                        try {
                            Intent intent = new Intent(Level2_2_3.this, Level2_2_4.class);
                            startActivity(intent);
                            finish();
                        } catch (Exception ignored) {

                        }
                    } else {
                        startPos.setVisibility(View.VISIBLE);
                    }
                    break;
                default:
                    break;
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
            Intent intent = new Intent(Level2_2_3.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception ignored) {

        }
    }

}
