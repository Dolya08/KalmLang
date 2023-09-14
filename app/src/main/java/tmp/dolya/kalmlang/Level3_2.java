package tmp.dolya.kalmlang;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Level3_2 extends AppCompatActivity {
    Dialog dialog;
    private long backPressedTime;
    private Toast backToast;
    String[] numb = {"негн", "хойр", "һурвн", "дөрвн", "тавн", "зурһан", "долан", "нәәмн", "йисн", "арвн"};
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl3_2);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialoglvl3_2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

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

        NumberPicker numb1 = (NumberPicker)findViewById(R.id.numb1);
        numb1.setMinValue(1);
        numb1.setMaxValue(10);
        numb1.setDisplayedValues(numb);

        NumberPicker numb2 = (NumberPicker)findViewById(R.id.numb2);
        numb2.setMinValue(1);
        numb2.setMaxValue(10);
        numb2.setDisplayedValues(numb);

        NumberPicker numb3 = (NumberPicker)findViewById(R.id.numb3);
        numb3.setMinValue(1);
        numb3.setMaxValue(10);
        numb3.setDisplayedValues(numb);

        NumberPicker numb4 = (NumberPicker)findViewById(R.id.numb4);
        numb4.setMinValue(1);
        numb4.setMaxValue(10);
        numb4.setDisplayedValues(numb);

        TextView btnQuest = (TextView)this.findViewById(R.id.btnquest);
        btnQuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.show();
                } catch (Exception ignored) {

                }
            }
        });

        Button check = (Button)findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Log.d("deb_tmp", numb[numb1.getValue()]);
                    Log.d("deb_tmp", String.valueOf(numb1.getValue()));
                    Log.d("deb_tmp", numb[numb2.getValue()]);
                    Log.d("deb_tmp", String.valueOf(numb2.getValue()));
                    Log.d("deb_tmp", numb[numb3.getValue()]);
                    Log.d("deb_tmp", String.valueOf(numb3.getValue()));
                    Log.d("deb_tmp", numb[numb4.getValue()]);
                    Log.d("deb_tmp", String.valueOf(numb4.getValue()));
                    if (Objects.equals(numb[numb1.getValue() - 1], "тавн") && Objects.equals(numb[numb2.getValue() - 1], "һурвн") && Objects.equals(numb[numb3.getValue() - 1], "негн") && Objects.equals(numb[numb4.getValue() - 1], "хойр")) {
                        backToast = Toast.makeText(getBaseContext(), "Ответ верный", Toast.LENGTH_SHORT);
                        backToast.show();
                        Intent intent = new Intent(Level3_2.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    } else {
                        if (backPressedTime + 2000 > System.currentTimeMillis()) {
                            backToast.cancel();
                            return;
                        } else {
                            backToast = Toast.makeText(getBaseContext(), "Ответ не верный", Toast.LENGTH_SHORT);
                            backToast.show();
                        }
                        backPressedTime = System.currentTimeMillis();
                    }
                } catch (Exception ignore) {}
            }
        });
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
