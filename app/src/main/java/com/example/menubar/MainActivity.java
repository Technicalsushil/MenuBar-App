package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.title1:
                Toast.makeText(getApplicationContext(),"Clicked item 1",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.title2:
                Toast.makeText(getApplicationContext(),"Clicked item 2",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.title3:
                Toast.makeText(getApplicationContext(),"Clicked item 3",Toast.LENGTH_SHORT).show();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}