package com.example.a611activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        Log.d("Lifecycle", "onCreate");
        textView.append("\n" + "onCreate");
        if (savedInstanceState != null) {
            Toast.makeText(this, "Bundle не равен null", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Bundle равен null!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "onSaveInstanceState");
        textView.append("\n" + "onSaveInstanceState");
        outState.putString(KEY, textView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Lifecycle", "onRestoreInstanceState");
        textView.append("\n" + "onRestoreInstanceState");
        if (savedInstanceState != null) {
           textView.setText(savedInstanceState.getString(KEY, ""));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume");
        textView.append("\n" + "onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState,
                             @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d("Lifecycle", "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }
}
