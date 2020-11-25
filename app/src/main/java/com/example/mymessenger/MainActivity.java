package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText message = findViewById(R.id.message);
        String messageCreate = message.getText().toString();
        Intent intent = new Intent(this, ReceiveActivity.class);
        intent.putExtra(ReceiveActivity.EXTRA_MESSAGE, messageCreate);
        startActivity(intent);
    }

}