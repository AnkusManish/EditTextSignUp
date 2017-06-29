package com.example.android.edittextsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout manishlayout =new RelativeLayout(this);

    }
    public void onClick(View view){
        Intent i=new Intent(this,OpenActivity.class);
       EditText nameedit=(EditText) findViewById(R.id.nameedit);
        EditText emailedit=(EditText) findViewById(R.id.emailedit);
        EditText passwordedit=(EditText) findViewById(R.id.passwordedit);
        String username=nameedit.getText().toString();
        i.putExtra("name",username);
        startActivity(i);
    }
}
