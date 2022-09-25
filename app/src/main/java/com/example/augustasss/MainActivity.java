package com.example.augustasss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewByID(R.id.tvMain)
    }
    public void onBtnChangeTextClick(View view) {
        tvMain.setText("Textas Pakeistas");
    }
}