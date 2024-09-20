package app.example.photos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BehindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behind);

        // ตัวอย่างการทำงานกับรูปภาพหนึ่งรูป (cat.jpg)

        ImageView imageView2 = findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.building);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        ImageView imageView3 = findViewById(R.id.imageView3);  // ID ของรูป cat.jpg

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.cat);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        ImageView imageView4 = findViewById(R.id.imageView4);  // ID ของรูป cat.jpg

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.sunflowers);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        ImageView imageView5 = findViewById(R.id.imageView5);  // ID ของรูป cat.jpg

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.trees);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        ImageView imageView6 = findViewById(R.id.imageView6);  // ID ของรูป cat.jpg

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.western);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        ImageView imageView7 = findViewById(R.id.imageView7);  // ID ของรูป cat.jpg

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อไปยัง ImageViewActivity
                Intent intent = new Intent(BehindActivity.this, ImageViewActivity.class);

                // ส่ง URI ของรูปภาพที่ต้องการแสดงไปด้วย
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.tufted);
                intent.putExtra("imageUri", imageUri);

                startActivity(intent);
            }
        });
        // ทำซ้ำโค้ดข้างบนกับรูปภาพอื่น ๆ ที่ต้องการ
    }
}
