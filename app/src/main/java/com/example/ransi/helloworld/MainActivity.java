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

//        Button btn1 = findViewById(R.id.btn1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("msg","The button was clicked");
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
//            }
//        });
    }

//    protected void onCreate(Bundle savedInstanceState) {
//        // The activity is being created.
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        System.out.println("@MainActivity onCreate");
//
//        button1= (Button)findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //move from MainActivity to ActivityTwo
//                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
//                intent.putExtra("activityOne","hello world!");
//                startActivity(intent);
//            }
//        });
//    }
//
    protected void onStart(){
        // The activity is about to become visible.
        super.onStart();
        System.out.println("@MainActivity onStart");
    }
    protected void onResume(){
        // The activity has become visible (it is now "resumed").
        super.onResume();
        System.out.println("@MainActivity onResume");
    }
    protected void onPause(){
        // Another activity is taking focus (this activity is about to be "paused").
        super.onPause();
        System.out.println("@MainActivity onPause");
    }
    protected void onStop(){
        // The activity is no longer visible (it is now "stopped")
        super.onStop();
        System.out.println("@MainActivity onStop");
    }
    protected void onRestart(){
        super.onRestart();
        System.out.println("@MainActivity onRestart");
    }
    protected void onDestroy(){
        // The activity is about to be destroyed.
        super.onDestroy();
        System.out.println("@MainActivity onDestory");
    }
}

//public class ActivityTwo extends Activity {
//    TextView textView;
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_two_layout);
//        textView = (TextView)findViewById(R.id.tvMessage);
//        String message = getIntent().getStringExtra("activityOne");
//        textView.setText(message);
//    }
//}