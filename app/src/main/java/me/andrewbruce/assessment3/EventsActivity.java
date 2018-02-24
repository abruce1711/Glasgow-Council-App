package me.andrewbruce.assessment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        setTitle(name + "'s Events");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void event1(View v) {
        Intent i = new Intent(this, Event1Activity.class);
        startActivity(i);
    }

    public void event2(View v) {
        Intent i = new Intent(this, Event2Activity.class);
        startActivity(i);
    }

    public void event3(View v) {
        Intent i = new Intent(this, Event3Activity.class);
        startActivity(i);
    }
}
