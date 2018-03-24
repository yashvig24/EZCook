package com.andy.ezcook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button updateImageButton = findViewById(R.id.updateImageButton);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
    }
}
