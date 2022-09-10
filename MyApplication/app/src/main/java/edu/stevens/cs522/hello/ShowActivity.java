package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    public static final String MESSAGE_KEY = "message";

    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        String message = getIntent().getStringExtra(MESSAGE_KEY);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        txtMessage.setText(message);

    }
}