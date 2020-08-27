package com.example.optionmenuwithsubmenus;

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


    //Creating Options Menu---->
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }


    //Handling Option Menu Items Clicks---->
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(this, "You clicked SEARCH", Toast.LENGTH_LONG).show();
                break;
            case R.id.favourite:
                Toast.makeText(this, "You clicked FAVOURITE", Toast.LENGTH_LONG).show();
                break;
            case R.id.shopping:
                Toast.makeText(this, "You clicked SHOPPING", Toast.LENGTH_LONG).show();
                break;
            case R.id.pay_now:
                Toast.makeText(this, "You clicked PAY NOW", Toast.LENGTH_LONG).show();
                break;
            case R.id.pay_later:
                Toast.makeText(this, "You clicked PAY LATER", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}