package com.example.prince.hsamp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {
    RecyclerView recyclerView;
    RecyclerView.Adapter myadapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        //layoutManager = new LinearLayoutManager(this);
        //layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        layoutManager = new GridLayoutManager(this,4,GridLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.add(new Person("Sumit","Harsh","plane"));
                myadapter.notifyDataSetChanged();
            }
        });

        people = new ArrayList<Person>();
        people.add(new Person("Prince","Raj","bus"));
        people.add(new Person("Priyanshu","Raj","plane"));
        people.add(new Person("Pratush","Raj","bus"));
        people.add(new Person("Prateek","Raj","plane"));
        people.add(new Person("Prem","Raj","plane"));
        people.add(new Person("Prashun","Raj","bus"));
        people.add(new Person("Priyanka","Raj","plane"));
        people.add(new Person("Prince","Raj","bus"));
        people.add(new Person("Priyanshu","Raj","plane"));
        people.add(new Person("Pratush","Raj","bus"));
        people.add(new Person("Prateek","Raj","plane"));
        people.add(new Person("Prem","Raj","plane"));
        people.add(new Person("Prashun","Raj","bus"));
        people.add(new Person("Priyanka","Raj","plane"));
        people.add(new Person("Prince","Raj","bus"));
        people.add(new Person("Priyanshu","Raj","plane"));
        people.add(new Person("Pratush","Raj","bus"));
        people.add(new Person("Prateek","Raj","plane"));
        people.add(new Person("Prem","Raj","plane"));
        people.add(new Person("Prashun","Raj","bus"));
        people.add(new Person("Priyanka","Raj","plane"));
        people.add(new Person("Prince","Raj","bus"));
        people.add(new Person("Priyanshu","Raj","plane"));
        people.add(new Person("Pratush","Raj","bus"));
        people.add(new Person("Prateek","Raj","plane"));
        people.add(new Person("Prem","Raj","plane"));
        people.add(new Person("Prashun","Raj","bus"));
        people.add(new Person("Priyanka","Raj","plane"));

        myadapter = new PersonAdapter(this,people);

        recyclerView.setAdapter(myadapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, "Name: "+people.get(index).getName(), Toast.LENGTH_SHORT).show();
    }
}
