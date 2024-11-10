package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private EditText usernameInput; // 用户名输入框
    private EditText passwordInput; // 密码输入框

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 获取输入框的引用
        usernameInput = findViewById(R.id.dialog_username);
        passwordInput = findViewById(R.id.dialog_password);

        // 设置按钮的点击监听
        setButtonListeners();
    }

    // 设置按钮点击监听
    private void setButtonListeners() {
        Button cancelButton = findViewById(R.id.dialog_button);
        cancelButton.setOnClickListener(v -> {
            usernameInput.setText(""); // 清空用户名输入框
            passwordInput.setText(""); // 清空密码输入框
        });

        Button signInButton = findViewById(R.id.secondary_button);
        signInButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString();
            String password = passwordInput.getText().toString();
            if (!username.isEmpty() && !password.isEmpty()) {
                // 处理登录逻辑，例如验证用户名和密码
                Toast.makeText(this, "Signing in as " + username, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
