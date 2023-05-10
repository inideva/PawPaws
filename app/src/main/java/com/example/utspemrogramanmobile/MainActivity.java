package com.example.utspemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ImageButton XButton1, XButton2, XButton3, XButton4, XButton5, XButton6, XButton7, XButton8, XButton9, XButton10, XButton11, XButton12;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XButton1 = findViewById(R.id.imageButton1);
        XButton2 = findViewById(R.id.imageButton2);
        XButton3 = findViewById(R.id.imageButton3);
        XButton4 = findViewById(R.id.imageButton4);
        XButton5 = findViewById(R.id.imageButton5);
        XButton6 = findViewById(R.id.imageButton6);
        XButton7 = findViewById(R.id.imageButton7);
        XButton8 = findViewById(R.id.imageButton8);
        XButton9 = findViewById(R.id.imageButton9);
        XButton10 = findViewById(R.id.imageButton10);
        XButton11 = findViewById(R.id.imageButton11);
        XButton12 = findViewById(R.id.imageButton12);

        XButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat1);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 1", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat1);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 1", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat2);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 2", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat3);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 3", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat4);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 4", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat5);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 5", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat6);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 6", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat7);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 7", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat8);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 8", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat9);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 9", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat10);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 10", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat11);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 11", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });

        XButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.soundcat12);
                Snackbar snackbar = Snackbar.make(view,"Anda Menekan Tombol Kucing 12", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary));
                snackbar.show();
            }
        });
    }
    private void playSound(int soundId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }
}