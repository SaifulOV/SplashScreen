package com.tong.siful.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progreess;
    private ProgressBar mProgrssBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        mProgrssBar = findViewById(R.id.progressBarId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                dowork();
            }
        });
        thread.start();
    }

    public void dowork() {

        for (progreess = 20; progreess <= 100; progreess = progreess + 20) {
            try {
                Thread.sleep(1000);
                mProgrssBar.setProgress(progreess);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
