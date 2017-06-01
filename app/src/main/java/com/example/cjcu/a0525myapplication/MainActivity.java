package com.example.cjcu.a0525myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] fruit = {"Apple","Banana","Pineapple","Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, list.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                
            }
        });

    }
}
