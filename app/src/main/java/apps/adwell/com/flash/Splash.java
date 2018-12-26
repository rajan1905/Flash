package apps.adwell.com.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private final int waitTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final long startTime = System.currentTimeMillis();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread(new Runnable() {
            @Override
            public void run() {

                if(startTime + waitTime == System.currentTimeMillis()){
                    Intent gotoMainScreen = new Intent(Splash.this, Main.class);
                    startActivity(gotoMainScreen);
                    finish();
                }
            }
        }).start();

    }
}
