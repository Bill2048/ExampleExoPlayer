package com.chaoxing.example.exoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chaoxing.example.exoplayer.demo.SampleChooserActivity;
import com.chaoxing.example.exoplayer.example.ExoPlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDemo();
            }
        });

        findViewById(R.id.btn_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchExample();
            }
        });
    }

    private void launchDemo() {
        Intent intent = new Intent(this, SampleChooserActivity.class);
        startActivity(intent);
    }

    private void launchExample() {
        Intent intent = new Intent(this, ExoPlayerActivity.class);
        startActivity(intent);
    }

}
