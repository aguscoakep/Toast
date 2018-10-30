package com.example.agussantoso.toast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Pesan metu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Method OnCreate Bekerja ");
        Button btn1 =(Button)findViewById(R.id.button1);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent pindah = new Intent(MainActivity.this,Home.class);
                startActivity(pindah);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Method OnStart Bekerja ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Method OnResume Bekerja ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Method OnPause Bekerja ");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Method OnStop Bekerja ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Method OnRestart Bekerja ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Method OnDestroy Bekerja ");

    }
}
