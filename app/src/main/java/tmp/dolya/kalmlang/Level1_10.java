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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Level1_10 extends AppCompatActivity {

    Dialog dialog;

    public int numPic;
    private MediaPlayer wavPic;
    Array array = new Array();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universallvl1);

        final ImageView img_main = (ImageView)findViewById(R.id.img_main);

        img_main.setClipToOutline(true);

        final TextView textWords = findViewById(R.id.text_words);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

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

        Button btn_back = (Button)findViewById(R.id.btn_back_lvl1);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level1_10.this, Level1_9.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        Button btn_next = (Button)findViewById(R.id.btn_next_lvl1);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level1_10.this, Level1_11.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignored) {

                }
            }
        });

        numPic = 9;
        img_main.setImageResource(array.images1[numPic]);
        img_main.setAdjustViewBounds(true);
        textWords.setText(array.texts1[numPic]);
        wavPic = MediaPlayer.create(this, array.raw1[numPic]);

        img_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayBtn(wavPic);
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
            Intent intent = new Intent(Level1_10.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception ignored) {

        }
    }

}