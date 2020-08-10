package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1=(ListView) findViewById(R.id.listView);
        final ArrayList<String> friends=new ArrayList<>();
        friends.add("Anusha");
        friends.add("Rahul");
        friends.add("Sanak");
        friends.add("Risav");
        friends.add("Souradeep");
        friends.add("Satyam");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        list1.setAdapter(arrayAdapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, friends.get(i), Toast.LENGTH_SHORT).show();
            }
        });


    }
}