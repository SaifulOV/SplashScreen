package com.tong.siful.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progreess;
    private ProgressBar mProgrssBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        for (progreess = 10; progreess <= 100; progreess = progreess + 10) {
            try {
                Thread.sleep(1000);
                mProgrssBar.setProgress(progreess);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
