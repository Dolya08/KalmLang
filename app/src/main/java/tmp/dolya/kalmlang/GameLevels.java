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
    Dialog dialog1, dialog2, dialog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog1 = new Dialog(this);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog1.setContentView(R.layout.levels1);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

        dialog2 = new Dialog(this);
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog2.setContentView(R.layout.levels2);
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog2.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

        dialog3 = new Dialog(this);
        dialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog3.setContentView(R.layout.levels3);
        dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog3.setCancelable(true); //можно ли закрыть диалоговое окно кнопкой назад

        TextView btnClose = (TextView) dialog1.findViewById(R.id.btncloselevels1);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });

        TextView btnlvl1 = (TextView)this.findViewById(R.id.caption1);
        btnlvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.show();
                } catch (Exception ignored) {

                }
            }
        });

        TextView btnlvl2 = (TextView)this.findViewById(R.id.caption2);
        btnlvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog2.show();
                } catch (Exception ignored) {

                }
            }
        });

        TextView btnlvl3 = (TextView)this.findViewById(R.id.caption3);
        btnlvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog3.show();
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

        // level 1
        TextView lvl1_1 = (TextView) dialog1.findViewById(R.id.textView1);
        lvl1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_1.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_2 = (TextView) dialog1.findViewById(R.id.textView2);
        lvl1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_2.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_3 = (TextView) dialog1.findViewById(R.id.textView3);
        lvl1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_3.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_4 = (TextView) dialog1.findViewById(R.id.textView4);
        lvl1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_4.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_5 = (TextView) dialog1.findViewById(R.id.textView5);
        lvl1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_5.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_6 = (TextView) dialog1.findViewById(R.id.textView6);
        lvl1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_6.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_7 = (TextView) dialog1.findViewById(R.id.textView7);
        lvl1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_7.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_8 = (TextView) dialog1.findViewById(R.id.textView8);
        lvl1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_8.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_9 = (TextView) dialog1.findViewById(R.id.textView9);
        lvl1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_9.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_10 = (TextView) dialog1.findViewById(R.id.textView10);
        lvl1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_10.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_11 = (TextView) dialog1.findViewById(R.id.textView11);
        lvl1_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_11.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_12 = (TextView) dialog1.findViewById(R.id.textView12);
        lvl1_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_12.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_13 = (TextView) dialog1.findViewById(R.id.textView13);
        lvl1_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_13.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        TextView lvl1_14 = (TextView) dialog1.findViewById(R.id.textView14);
        lvl1_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog1.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level1_14.class);
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){

                }
            }
        });

        // level 2
        TextView lvl2_1 = (TextView) dialog2.findViewById(R.id.textView1);
        lvl2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog2.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level2_1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignore) {  }
            }
        });
        TextView lvl2_2 = (TextView) dialog2.findViewById(R.id.textView2);
        lvl2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog2.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level2_2_1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignore) {  }
            }
        });

        // level 3
        TextView lvl3_1 = (TextView) dialog3.findViewById(R.id.textView1);
        lvl3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog3.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level3_1_1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignore) {  }
            }
        });
        TextView lvl3_2 = (TextView) dialog3.findViewById(R.id.textView2);
        lvl3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog3.dismiss();
                    Intent intent = new Intent(GameLevels.this, Level3_2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception ignore) {  }
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
        } catch (Exception ignored){

        }
    }
}