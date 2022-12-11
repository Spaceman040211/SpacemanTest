package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgHead;
    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState)   {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImgHead=findViewById(R.id.img_main_head);
        mEtPassword=findViewById(R.id.et_main_password);
        mEtUsername=findViewById((R.id.editText));
        mBtnLogin=findViewById(R.id.button);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    //执行登录操作
    private void login(){
        String username=mEtUsername.getText().toString();
        String password=mEtPassword.getText().toString();
        if(username.equals("123456")&&password.equals("123456")){
            Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
        }
    }

}