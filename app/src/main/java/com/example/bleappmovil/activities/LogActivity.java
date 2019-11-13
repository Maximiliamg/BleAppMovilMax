package com.example.bleappmovil.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bleappmovil.adapters.LogAdapter;
import com.example.bleappmovil.R;

public class LogActivity extends AppCompatActivity {

    LogAdapter adapter;
    ListView logView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        try {
            adapter = new LogAdapter(this);

            logView = ((ListView)findViewById(R.id.log_view));
            logView.setAdapter(adapter);
        } catch(Exception e) {
            doToast(e.getMessage());
        }

        Button backBtn = (Button) findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

    protected void doToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
