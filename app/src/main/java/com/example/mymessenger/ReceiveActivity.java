package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.received_message);
        messageView.setText(messageText);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}