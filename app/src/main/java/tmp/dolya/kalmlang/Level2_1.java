package tmp.dolya.kalmlang;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level2_1 extends AppCompatActivity {

    Dialog dialog;

    public int numPic;
    private MediaPlayer wavPic;
    ArrayLvl2 array = new ArrayLvl2();
    public boolean lang;
    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl2);

        final ImageView img_main = (ImageView)findViewById(R.id.img_main);

        img_main.setClipToOutline(true);

        final TextView textWords = findViewById(R.id.text_words);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialoglvl1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        TextView textSeekBar = (TextView)findViewById(R.id.textSeekBar);
        textSeekBar.setText("1");
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textSeekBar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        TextView btnClose = (TextView)dialog.findViewById(R.id.btnclose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

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

        //  dialog.show();

        Button btn_back = (Button)findViewById(R.id.btn_back_lvl);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        Button btn_next = (Button)findViewById(R.id.btn_next_lvl);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_1.this, Level2_2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        Button answer = (Button)findViewById(R.id.answer);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Integer.parseInt(textSeekBar.getText().toString()) == array.answer2[numPic]) {
                        backToast = Toast.makeText(getBaseContext(), "Ответ верный", Toast.LENGTH_SHORT);
                        backToast.show();
                        Intent intent = new Intent(Level2_1.this, Level2_2.class);
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

        numPic = 0;
        img_main.setImageResource(R.drawable.lvl2_1);
        img_main.setAdjustViewBounds(true);
        textWords.setText(array.texts2[numPic]);
        lang = true;
        wavPic = MediaPlayer.create(this, array.raw2[numPic]);
        soundPlayBtn(wavPic);

        img_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayBtn(wavPic);
            }
        });

        textWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (lang) {
                        textWords.setText(array.texts2ru[numPic]);
                    } else {
                        textWords.setText(array.texts2[numPic]);
                    }
                    lang = !lang;
                } catch (Exception ignored) {

                }
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
            Intent intent = new Intent(Level2_1.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception ignored) {

        }
    }

}