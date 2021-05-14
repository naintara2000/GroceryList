package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView gList;
    String groceryList[] = {"Milk", "Eggs", "Cheese", "Tomatoes", "Onions", "Butter", "Garlic", "Chili", "Lemon", "Paneer", "Apple", "Orange", "Grapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gList = (ListView)findViewById(R.id.list_view);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, R.id.text_view, groceryList);
        gList.setAdapter(arrayAdapter);
        ListView button = findViewById(R.id.list_view);
        button.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value = arrayAdapter.getItem(position);
                TextView groceryText = findViewById(R.id.grocery_text);
                String temp = groceryText.getText().toString();
                temp = temp + value;
                groceryText.setText(temp);
            }
        });
    }
}