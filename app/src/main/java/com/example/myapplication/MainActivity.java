package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1;
        EditText message,num;
        message=findViewById(R.id.editTextTextPersonName4);
        b1=findViewById(R.id.button);
        num=findViewById(R.id.editTextTextPersonName2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Message= message.getText().toString();
                String Num= num.getText().toString();
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.putExtra("sms_body",Message);
                sendIntent.setType("vnd.android-dir/mms-sms");
                sendIntent.putExtra("address",Num);

                startActivity(sendIntent);
            }
        });
    }

}