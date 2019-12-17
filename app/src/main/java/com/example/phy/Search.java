package com.example.phy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class Search extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private ListView list;
    private ArrayList<String> arrayList;
    private SearchView searchView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        String[] kin = {
                getString(R.string.kin_1), getString(R.string.kin_2), getString(R.string.kin_3),
                getString(R.string.kin_4), getString(R.string.kin_5), getString(R.string.kin_6),
                getString(R.string.kin_7), getString(R.string.kin_8), getString(R.string.kin_9),
                getString(R.string.kin_10), getString(R.string.kin_11), getString(R.string.kin_12),
                getString(R.string.kin_13), getString(R.string.kin_14), getString(R.string.kin_15),
                getString(R.string.kin_16), getString(R.string.kin_17), getString(R.string.kin_18),
                getString(R.string.kin_19), getString(R.string.kin_20), getString(R.string.kin_21),
                getString(R.string.kin_22), getString(R.string.kin_23), getString(R.string.kin_24),
                getString(R.string.kin_25), getString(R.string.kin_26), getString(R.string.kin_27),
                getString(R.string.kin_28), getString(R.string.kin_29), getString(R.string.kin_30),
                getString(R.string.kin_31), getString(R.string.kin_32)
        };

        list = findViewById(R.id.listView);
        searchView = findViewById(R.id.search);

        arrayList = new ArrayList<>(Arrays.asList(kin));

        list.setAdapter((ListAdapter) arrayList);

        searchView.setOnQueryTextListener(this);

    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {

        return false;
    }
}