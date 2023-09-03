package tmp.dolya.kalmlang;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.levels1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

        TextView btnClose = (TextView)dialog.findViewById(R.id.btncloselevels1);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        TextView btnlvl1 = (TextView)this.findViewById(R.id.caption1);
        btnlvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.show();
                } catch (Exception ignored) {

                }
            }
        });

        Button btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_1 = (TextView)dialog.findViewById(R.id.textView1);
        lvl1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_1.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_2 = (TextView)dialog.findViewById(R.id.textView2);
        lvl1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_2.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_3 = (TextView)dialog.findViewById(R.id.textView3);
        lvl1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_3.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_4 = (TextView)dialog.findViewById(R.id.textView4);
        lvl1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_4.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_5 = (TextView)dialog.findViewById(R.id.textView5);
        lvl1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_5.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_6 = (TextView)dialog.findViewById(R.id.textView6);
        lvl1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_6.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_7 = (TextView)dialog.findViewById(R.id.textView7);
        lvl1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_7.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_8 = (TextView)dialog.findViewById(R.id.textView8);
        lvl1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_8.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_9 = (TextView)dialog.findViewById(R.id.textView9);
        lvl1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_9.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_10 = (TextView)dialog.findViewById(R.id.textView10);
        lvl1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_10.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_11 = (TextView)dialog.findViewById(R.id.textView11);
        lvl1_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_11.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_12 = (TextView)dialog.findViewById(R.id.textView12);
        lvl1_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_12.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_13 = (TextView)dialog.findViewById(R.id.textView13);
        lvl1_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_13.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_14 = (TextView)dialog.findViewById(R.id.textView14);
        lvl1_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_14.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

    }
    //  Системная кнопка назад
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception ignored){

        }
    }
}