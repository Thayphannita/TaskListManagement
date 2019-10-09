package com.example.asus.tasklistmanagement.bottomItem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.asus.tasklistmanagement.MainActivity;
import com.example.asus.tasklistmanagement.R;
import com.example.asus.tasklistmanagement.addingTask.AddTaskActivity;

public class TodayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        TextView title = (TextView) findViewById(R.id.activityTitle2);
        title.setText("Today Activity");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all_task:
                        Intent a = new Intent(TodayActivity.this, MainActivity.class);
                        startActivity(a);

                        break;
                    case R.id.yesterday:
                        Intent b = new Intent(TodayActivity.this, YesterdayActivity.class);
                        startActivity(b);

                        break;
                    case R.id.today:
                        Intent c = new Intent(TodayActivity.this,TodayActivity.class);
                        startActivity(c);

                        break;
                    case R.id.tomorrow:
                        Intent d = new Intent(TodayActivity.this,TomorrowTaskActivity.class);
                        startActivity(d);

                        break;
                    case R.id.add_task:
                        Intent e = new Intent(TodayActivity.this,AddTaskActivity.class);
                        startActivity(e);

                        break;

                }
                return false;
            }
        });


    }
}

