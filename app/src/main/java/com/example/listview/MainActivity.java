package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.ListView);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Ánh Nắng Của Anh");
        arrayCourse.add("Túy âm");
        arrayCourse.add("Bạc Phận");
        arrayCourse.add("Hồng Nhan");
        arrayCourse.add("Sóng Gió");
        arrayCourse.add("Hoa Hải Đường");

        ArrayAdapter adapter = new ArrayAdapter (MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayCourse.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}