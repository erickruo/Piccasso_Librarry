package com.picassolibrary;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView = findViewById(R.id.imageView);
 String rl="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0ZkVva4nbVMltpvhDpM1C_QU7w-SpzCH7Tof5Kmmd9Q&s";
    Picasso.get().load(rl).into(imageView);

    }
}
