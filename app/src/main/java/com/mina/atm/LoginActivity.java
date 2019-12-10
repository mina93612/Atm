package com.mina.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


     public void  login (View view) {
         EditText ed_username = findViewById(R.id.username);
         EditText ed_password = findViewById(R.id.password);
         String username = ed_username.getText().toString();
         String password = ed_password.getText().toString();
         if ("jack".equals(username) && "1234".equals(password)) {
             setResult(RESULT_OK);
             finish();
         } else {
             new AlertDialog.Builder(this)
                     .setTitle("登入訊息")
                     .setMessage("登入失敗")
                     .setPositiveButton("Ok", null)
                     .show();
            }
         }
 }