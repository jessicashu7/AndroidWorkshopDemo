package com.example.android.workshopdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String NAME = "name";
    private static final String COUNT = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button subtract_button = (Button) findViewById(R.id.subtract_button);
        Button add_button = (Button) findViewById(R.id.add_button);
        Button send_button = (Button) findViewById(R.id.send_button);

        subtract_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtractOne();
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addOne();

            }
        });

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });

    }

    public void addOne(){
        TextView count = (TextView) findViewById(R.id.count_text);
        count.setText(String.valueOf(Integer.valueOf(count.getText().toString()) + 1));
    }

    public void subtractOne(){
        TextView count = (TextView) findViewById(R.id.count_text);
        if (Integer.parseInt(count.getText().toString()) > 0){
            count.setText(String.valueOf(Integer.valueOf(count.getText().toString()) - 1));
        }
    }
    public void sendMessage(){
        EditText name_view = (EditText) findViewById(R.id.name_edittext);
        TextView count_view = (TextView) findViewById(R.id.count_text);

        String name = name_view.getText().toString();
        String count = count_view.getText().toString();

        Intent sendMessage = new Intent(this, SentMessageActivity.class);
        sendMessage.putExtra(NAME, name);
        sendMessage.putExtra(COUNT, count);

        startActivity(sendMessage);
    }


}
