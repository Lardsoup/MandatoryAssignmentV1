package com.example.lardman.mandatoryassignmentv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    //TODO: login button skal laves.. den er bare copy past pt.
    public void LoginButtonClicked(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText nameView = findViewById(R.id.mainEditName);
        String name = nameView.getText().toString();
        intent.putExtra("navn", name);
        //startActivity(intent);
        startActivityForResult(intent, 31415);
    }
}
