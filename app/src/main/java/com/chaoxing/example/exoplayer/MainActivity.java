package com.chaoxing.example.exoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chaoxing.example.exoplayer.demo.SampleChooserActivity;

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
    }

    private void launchDemo() {
        Intent intent = new Intent(this, SampleChooserActivity.class);
        startActivity(intent);
    }

}
