package com.example.Doit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;



public class settings extends AppCompatActivity {

    FirebaseAuth lFirebaseAuth;
     Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        logout=findViewById(R.id.logout);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.calender);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.Tasks:
                    startActivity(new Intent(getApplicationContext(), tasks.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.calender:
                    startActivity(new Intent(getApplicationContext(), calender.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), LOGIN.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.settings:
                    return true;

            }

            return false;
        });
    }



    public void profile(View view) {
        Intent ie =new Intent(this,activityprofile.class);
        startActivity(ie);
    }

    public void changepass(View view) {
        Intent ic =new Intent(this,activityprofile.class);
        startActivity(ic);
    }

    public void logout(View view) {
        startActivity(new Intent(getApplicationContext(), LOGIN.class));
    }
}