package com.example.phy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView image_m1, image_m2, image_m3, image_m4;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_m1 = (ImageView) findViewById(R.id.image_m1);
        image_m2 = (ImageView) findViewById(R.id.image_m2);
        image_m3 = (ImageView) findViewById(R.id.image_m3);
        image_m4 = (ImageView) findViewById(R.id.image_m4);

        image_m1.setOnClickListener(this);
        image_m2.setOnClickListener(this);
        image_m3.setOnClickListener(this);
        image_m4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.close_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_m1:
                intent = new Intent(this, Mechanics.class);
                startActivity(intent);
                break;
            case R.id.image_m2:
                intent = new Intent(this, Mft.class);
                startActivity(intent);
                break;
            case R.id.image_m3:
                intent = new Intent(this, Eam.class);
                startActivity(intent);
                break;
            case R.id.image_m4:
                intent = new Intent(this, Vaw.class);
                startActivity(intent);
                break;
        }
    }
}
