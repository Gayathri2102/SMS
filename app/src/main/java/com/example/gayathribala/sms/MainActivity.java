
package com.example.gayathribala.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSendSMS = (Button) findViewById(R.id.button_sms);
        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendSMS("9029894202", "Guess what !! I am Safe!");
           /*here i can send message to emulator 5556. In Real device
            *you can change number*/
            }
        });}

