package com.example.hellotoastenhancements;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.textView_number);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showZiro(View view){
        count = 0;
        textView.setText(String.valueOf("" + count));
    }
    public void showCount(View view){
        count++;
        textView.setText(String.valueOf("" + count));
    }
}