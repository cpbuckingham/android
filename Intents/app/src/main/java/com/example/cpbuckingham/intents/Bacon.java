package com.example.cpbuckingham.intents;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle applesData = getIntent().getExtras();
        if(applesData==null) {
            return;
        }
        String appleMessage = applesData.getString("applesMessage");
        final TextView baconText = (TextView) findViewById(R.id.baconText);
        baconText.setText(appleMessage);

    }
    
    public void onClick(View view){
    Intent i = new Intent(this, Apples.class);
        final EditText baconInput = (EditText) findViewById(R.id.baconInput);
        String userMessage = baconInput.getText().toString();
        i.putExtra("baconMessage", userMessage);
    startActivity(i);
    }
}

    
