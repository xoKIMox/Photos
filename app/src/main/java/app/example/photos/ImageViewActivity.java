package app.example.photos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView fullImageView = findViewById(R.id.imageView8);

        // รับข้อมูล URI ของรูปที่ถูกส่งมาจาก BehindActivity
        Intent intent = getIntent();
        Uri imageUri = intent.getParcelableExtra("imageUri");

        if (imageUri != null) {
            fullImageView.setImageURI(imageUri);
        }
    }
}
