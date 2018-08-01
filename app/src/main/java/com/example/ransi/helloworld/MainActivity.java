package com.example.ransi.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("msg","The button was clicked");
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    protected void onStart(){
        // The activity is about to become visible.
        super.onStart();
        Log.d("msg","@MainActivity onStart");
    }
    protected void onResume(){
        // The activity has become visible (it is now "resumed").
        super.onResume();
        Log.d("msg","@MainActivity onResume");
    }
    protected void onPause(){
        // Another activity is taking focus (this activity is about to be "paused").
        super.onPause();
        Log.d("msg","@MainActivity onPause");
    }
    protected void onStop(){
        // The activity is no longer visible (it is now "stopped")
        super.onStop();
        Log.d("msg","@MainActivity onStop");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("msg","@MainActivity onRestart");
    }
    protected void onDestroy(){
        // The activity is about to be destroyed.
        super.onDestroy();
        Log.d("msg","@MainActivity onDestory");
    }
}

