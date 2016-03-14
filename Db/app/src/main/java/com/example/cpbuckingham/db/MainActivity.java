package com.example.cpbuckingham.db;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText camsInput;
    TextView camsText;
    MyDBHandler dbHandler;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camsInput = (EditText) findViewById(R.id.camsInput);
        camsText = (TextView) findViewById(R.id.camsText);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a product to the database
    public void addButtonClicked(View view){
        Product product = new Product(camsInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = camsInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    //Print the database
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        camsText.setText(dbString);
        camsInput.setText("");
    }

}
