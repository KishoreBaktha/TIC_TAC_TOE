package com.example.kishorebaktha.tic_tac_toe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by KISHORE BAKTHA on 7/7/2017.
 */

public class Game extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int end=0;
    int turn,m;
    MediaPlayer play,play2;
    Context context=this;
    final Handler mHandler = new Handler();
    // Create runnable for posting
    final Runnable mUpdateResults = new Runnable() {
        public void run() {
            AlertDialog.Builder a_builder = new AlertDialog.Builder(Game.this);
            a_builder.setMessage("do you want to exit the game?")
                    .setCancelable(false)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            play.stop();
                            play2.stop();
                            finish();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    turn = m;
                    b8.setBackgroundColor(Color.RED);
                    b7.setBackgroundColor(Color.GREEN);
                    b6.setBackgroundColor(Color.BLUE);
                    b5.setBackgroundColor(Color.LTGRAY);
                    b1.setBackgroundColor(Color.YELLOW);
                    b4.setBackgroundColor(Color.CYAN);
                    b3.setBackgroundColor(Color.GRAY);
                    b9.setBackgroundColor(Color.DKGRAY);
                    b2.setBackgroundColor(Color.WHITE);
                    b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true);
                    b6.setEnabled(true); b5.setEnabled(true); b4.setEnabled(true);
                    b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
                    end=0;
                    play2.stop();
                    play = MediaPlayer.create(context, R.raw.fmusic);
                    play.start();
                }
            });
            AlertDialog ab = a_builder.create();
            ab.setTitle("Alert");
            ab.show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        turn=intent.getIntExtra("turn",1);
        m=turn;
        play = MediaPlayer.create(context, R.raw.fmusic);
        play.start();
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        b1.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                b4.setBackgroundColor(Color.RED);
                b8.setBackgroundColor(Color.GREEN);
                b6.setBackgroundColor(Color.BLUE);
                b9.setBackgroundColor(Color.LTGRAY);
                b2.setBackgroundColor(Color.YELLOW);
                b1.setBackgroundColor(Color.CYAN);
                b3.setBackgroundColor(Color.GRAY);
                b5.setBackgroundColor(Color.DKGRAY);
                b7.setBackgroundColor(Color.WHITE);
                //bgcolor(turn);
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        b2.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                b9.setBackgroundColor(Color.RED);
                b3.setBackgroundColor(Color.GREEN);
                b1.setBackgroundColor(Color.BLUE);
                b7.setBackgroundColor(Color.LTGRAY);
                b4.setBackgroundColor(Color.YELLOW);
                b5.setBackgroundColor(Color.CYAN);
                b2.setBackgroundColor(Color.GRAY);
                b8.setBackgroundColor(Color.DKGRAY);
                b6.setBackgroundColor(Color.WHITE);
                //bgcolor(turn);
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        b3.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                b7.setBackgroundColor(Color.RED);
                b5.setBackgroundColor(Color.GREEN);
                b9.setBackgroundColor(Color.BLUE);
                b8.setBackgroundColor(Color.LTGRAY);
                b1.setBackgroundColor(Color.YELLOW);
                b3.setBackgroundColor(Color.CYAN);
                b4.setBackgroundColor(Color.GRAY);
                b6.setBackgroundColor(Color.DKGRAY);
                b2.setBackgroundColor(Color.WHITE);
               // bgcolor(turn);
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        b4.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                b2.setBackgroundColor(Color.RED);
                b8.setBackgroundColor(Color.GREEN);
                b5.setBackgroundColor(Color.BLUE);
                b3.setBackgroundColor(Color.LTGRAY);
                b1.setBackgroundColor(Color.YELLOW);
                b4.setBackgroundColor(Color.CYAN);
                b7.setBackgroundColor(Color.GRAY);
                b9.setBackgroundColor(Color.DKGRAY);
                b6.setBackgroundColor(Color.WHITE);
                //bgcolor(turn);
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        b5.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                b8.setBackgroundColor(Color.RED);
                b7.setBackgroundColor(Color.GREEN);
                b6.setBackgroundColor(Color.BLUE);
                b5.setBackgroundColor(Color.LTGRAY);
                b1.setBackgroundColor(Color.YELLOW);
                b4.setBackgroundColor(Color.CYAN);
                b3.setBackgroundColor(Color.GRAY);
                b9.setBackgroundColor(Color.DKGRAY);
                b2.setBackgroundColor(Color.WHITE);
               // bgcolor(turn);
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        b6.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                b5.setBackgroundColor(Color.RED);
                b8.setBackgroundColor(Color.GREEN);
                b4.setBackgroundColor(Color.BLUE);
                b1.setBackgroundColor(Color.LTGRAY);
                b7.setBackgroundColor(Color.YELLOW);
                b2.setBackgroundColor(Color.CYAN);
                b9.setBackgroundColor(Color.GRAY);
                b3.setBackgroundColor(Color.DKGRAY);
                b6.setBackgroundColor(Color.WHITE);
               // bgcolor(turn);
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        b7.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                b6.setBackgroundColor(Color.RED);
                b4.setBackgroundColor(Color.GREEN);
                b8.setBackgroundColor(Color.BLUE);
                b7.setBackgroundColor(Color.LTGRAY);
                b1.setBackgroundColor(Color.YELLOW);
                b3.setBackgroundColor(Color.CYAN);
                b2.setBackgroundColor(Color.GRAY);
                b9.setBackgroundColor(Color.DKGRAY);
                b5.setBackgroundColor(Color.WHITE);
                //bgcolor(turn);
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        b8.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                //bgcolor(turn);
                b3.setBackgroundColor(Color.RED);
                b5.setBackgroundColor(Color.GREEN);
                b6.setBackgroundColor(Color.BLUE);
                b7.setBackgroundColor(Color.LTGRAY);
                b8.setBackgroundColor(Color.YELLOW);
                b1.setBackgroundColor(Color.CYAN);
                b9.setBackgroundColor(Color.GRAY);
                b2.setBackgroundColor(Color.DKGRAY);
                b4.setBackgroundColor(Color.WHITE);
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        b9.setText("X");
                        turn = 2;
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                //bgcolor(turn);
                b1.setBackgroundColor(Color.RED);
                b2.setBackgroundColor(Color.GREEN);
                b3.setBackgroundColor(Color.BLUE);
                b4.setBackgroundColor(Color.LTGRAY);
                b5.setBackgroundColor(Color.YELLOW);
                b6.setBackgroundColor(Color.CYAN);
                b7.setBackgroundColor(Color.GRAY);
                b8.setBackgroundColor(Color.DKGRAY);
                b9.setBackgroundColor(Color.WHITE);
                endGame();
            }
        });
    }
    public void bgcolor(int turn)
    {
        if(turn==1)
        {
            b1.setBackgroundColor(Color.RED);
            b2.setBackgroundColor(Color.RED);
            b3.setBackgroundColor(Color.RED);
            b4.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
        }
        else
        {
            b1.setBackgroundColor(Color.YELLOW);
            b2.setBackgroundColor(Color.YELLOW);
            b3.setBackgroundColor(Color.YELLOW);
            b4.setBackgroundColor(Color.YELLOW);
            b5.setBackgroundColor(Color.YELLOW);
            b6.setBackgroundColor(Color.YELLOW);
            b7.setBackgroundColor(Color.YELLOW);
            b8.setBackgroundColor(Color.YELLOW);
            b9.setBackgroundColor(Color.YELLOW);
        }
    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        if (a.equals(b) && a.equals(c) && a.equals("X"))
        {
           DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b2.setBackgroundColor(Color.MAGENTA);
            b3.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if (a.equals(d) && a.equals(g) && a.equals("X")) {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b4.setBackgroundColor(Color.MAGENTA);
            b7.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(a.equals(e) && a.equals(i) && a.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(b.equals(e) && b.equals(h) && b.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b2.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b8.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(c.equals(f) && c.equals(i) && c.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b3.setBackgroundColor(Color.MAGENTA);
            b6.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(c.equals(e) && c.equals(g) && c.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b3.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b7.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(d.equals(e) && d.equals(f) && d.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b4.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b6.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(g.equals(h) && g.equals(i) && g.equals("X"))
        {
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b7.setBackgroundColor(Color.MAGENTA);
            b8.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        if (a.equals(b) && a.equals(c) && a.equals("O"))
        {
            if(m==1)
            DISPLAY2();
            else
            DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b2.setBackgroundColor(Color.MAGENTA);
            b3.setBackgroundColor(Color.MAGENTA);
            end=1;
            end=1;
            startTestThread();
        }
        else if (a.equals(d) && a.equals(g) && a.equals("O")) {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b4.setBackgroundColor(Color.MAGENTA);
            b7.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(a.equals(e) && a.equals(i) && a.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b1.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(b.equals(e) && b.equals(h) && b.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b2.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b8.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(c.equals(f) && c.equals(i) && c.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b3.setBackgroundColor(Color.MAGENTA);
            b6.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(c.equals(e) && c.equals(g) && c.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b3.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b7.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(d.equals(e) && d.equals(f) && d.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b4.setBackgroundColor(Color.MAGENTA);
            b5.setBackgroundColor(Color.MAGENTA);
            b6.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if(g.equals(h) && g.equals(i) && g.equals("O"))
        {
            if(m==1)
                DISPLAY2();
            else
                DISPLAY();
            DISABLE();
            play.stop();
            play2 = MediaPlayer.create(context, R.raw.success);
            play2.start();
            b7.setBackgroundColor(Color.MAGENTA);
            b8.setBackgroundColor(Color.MAGENTA);
            b9.setBackgroundColor(Color.MAGENTA);
            end=1;
            startTestThread();
        }
        else if (!((a.equals("")) || (b.equals("")) || (c.equals("")) || (d.equals("")) || (e.equals("")) || (f.equals("")) || (g.equals("")) || (h.equals("")) || (i.equals("")))) {
            if(end!=1)
            {
                DISABLE();
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.equal,null);
                Toast toast=new Toast(this);
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP,0,100);
                toast.show();
                play.stop();
                play2 = MediaPlayer.create(context, R.raw.success);
                play2.start();

                startTestThread();
            }

        }
    }
    protected void startTestThread() {
        Thread t = new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mHandler.postDelayed(mUpdateResults,500);
            }
        };
        t.start();
    }
    public void DISPLAY()
    {
        LayoutInflater layoutInflater=getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.green_toast,null);
        Toast toast=new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,100);
        toast.show();
    }
    public void DISPLAY2()
    {
        LayoutInflater layoutInflater=getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.yellow_toast,null);
        Toast toast=new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,100);
        toast.show();
    }
    public void DISABLE()
    {
        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
        b6.setEnabled(false); b5.setEnabled(false); b4.setEnabled(false);
        b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
    }
}
