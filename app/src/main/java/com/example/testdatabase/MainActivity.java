package com.example.testdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);

    }
    public void OnLogin(View view){
        String user = username.getText().toString();
        String pass = password.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker= new BackgroundWorker(this);
        backgroundWorker.execute(type,user,pass);


    }
}
