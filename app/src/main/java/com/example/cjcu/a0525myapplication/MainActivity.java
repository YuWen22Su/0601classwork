package com.example.cjcu.a0525myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] fruit = {"Apple","Banana","Pineapple","Kiwi","Blueberry","qqqqq","eeeeeee","Lemon","Rose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = (ListView) findViewById(R.id.list);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,fruit);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.fruit,R.layout.support_simple_spinner_dropdown_item);
        //list.setAdapter(adapter);
        spinner.setAdapter(adapter2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, list.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,spinner.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
