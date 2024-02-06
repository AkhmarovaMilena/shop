package com.example.shop;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class contacts_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);
    }
    public void sendBtn(View view) {
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText message = findViewById(R.id.message);

        String n = name.getText().toString();
        String e = email.getText().toString();
        String m = message.getText().toString();

        if(!n.equals("") && !e.equals("") && !m.equals("")){
            Toast.makeText(this, "Отправлено!", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
    }

    public void aboutUs(View view) {
        Intent intent = new Intent(this, abou_us.class);
        startActivity(intent);
    }
    public void mainActivity(View v) {
        finish();
    }
}