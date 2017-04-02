package com.example.xuanhong.gradlebuildprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvFlavor = (TextView) findViewById(R.id.textView2);

        tvFlavor.setText(BuildConfig.BUILD_TYPE + " " + BuildConfig.BUILD_FLAVOR);
    }
}
