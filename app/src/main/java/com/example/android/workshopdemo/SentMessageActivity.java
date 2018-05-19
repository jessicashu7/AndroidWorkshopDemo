package com.example.android.workshopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SentMessageActivity extends AppCompatActivity {

    private static final String NAME = "name";
    private static final String COUNT = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_message);
        showMessage();


    }

    public void showMessage(){
        TextView message = (TextView) findViewById(R.id.message);

        String name = getIntent().getStringExtra(NAME);
        String count = getIntent().getStringExtra(COUNT);

        message.setText(getString(R.string.message, name,count));
    }
}
