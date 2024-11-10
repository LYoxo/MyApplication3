package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public class ThirdActivity extends AppCompatActivity {
    private TextView testText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // 设置 Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        testText = findViewById(R.id.text_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 加载菜单资源文件
        getMenuInflater().inflate(R.menu.menu_third, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.font_small) {
            testText.setTextSize(10);
            return true;
        } else if (id == R.id.font_medium) {
            testText.setTextSize(16);
            return true;
        } else if (id == R.id.font_large) {
            testText.setTextSize(20);
            return true;
        } else if (id == R.id.menu_normal) {
            Toast.makeText(this, "普通菜单项点击", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.color_red) {
            testText.setTextColor(ContextCompat.getColor(this, R.color.red));
            return true;
        } else if (id == R.id.color_black) {
            testText.setTextColor(ContextCompat.getColor(this, R.color.black));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
