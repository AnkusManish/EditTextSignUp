package com.example.android.edittextsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class OpenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        Bundle previousdata=getIntent().getExtras();
        if(previousdata==null){
            return;
        }
        else{
            String name=previousdata.getString("username");
        }
    }
}
