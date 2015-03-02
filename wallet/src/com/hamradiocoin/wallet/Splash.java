package com.hamradiocoin.wallet;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, com.hamradiocoin.wallet.ui.WalletActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);

    }
}
