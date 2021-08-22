package com.camera.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.MediaStore;
import android.os.Bundle;
import android.provider.MediaStore;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_CAMERA = 20210822;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(detPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_CAMERA);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CAMERA) {
            if(data.getExtras() != null) {

            }
        }
    }
}