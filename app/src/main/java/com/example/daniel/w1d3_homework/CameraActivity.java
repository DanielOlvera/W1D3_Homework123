package com.example.daniel.w1d3_homework;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

    Button cButton;
    ImageView camImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        //Doing the lookup
        cButton = (Button) findViewById(R.id.c_button);
        camImage = (ImageView) findViewById(R.id.c_imageView);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bmap = (Bitmap) data.getExtras().get("data");
        camImage.setImageBitmap(bmap);
    }
}

/*
Reference: https://www.tutorialspoint.com/android/android_camera.htm
 */
