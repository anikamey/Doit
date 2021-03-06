package com.example.Doit;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class tasks extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.Tasks);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.Tasks:
                        return true;
                    case R.id.calender:
                        startActivity(new Intent(getApplicationContext(), calender.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext(), settings.class));
                        overridePendingTransition(0, 0);
                        return true;

                }

                return false;
            }

        });
    }

    public void event(View view) {
        startActivity(new Intent(getApplicationContext(), event.class));
    }

    public void reminder(View view) {
        startActivity(new Intent(getApplicationContext(), reminder.class));
    }

    public void groceries(View view) {
        startActivity(new Intent(getApplicationContext(), groceries.class));
    }

    public void notes(View view) {
        startActivity(new Intent(getApplicationContext(), note.class));
    }

    public void bill(View view) {
        startActivity(new Intent(getApplicationContext(), Bill.class));
    }

    public void othertasks(View view) {
        startActivity(new Intent(getApplicationContext(), othertasks.class));
    }
}



