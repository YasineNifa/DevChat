package yassine.com.devchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch(Exception e){
                    e.printStackTrace();

                }
                finally{
                    Intent mainIntent = new Intent(WelcomeActivity.this, StartPageActivity.class);
                    startActivity(mainIntent);
                    finish();

                }
            }
        };
        thread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
