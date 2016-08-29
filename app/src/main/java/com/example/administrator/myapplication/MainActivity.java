package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO sdadsadasd
    TextView Ev1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ev1 = (TextView) findViewById(R.id.textView);

    }

    public void MyClick(View v) {
        String strTmp="大好人\r\n!!!!!!!!!!!!";
        Ev1.setText(strTmp);
    }

    public void MyClick1(View v) {
        String strTmp="王立家";
        Ev1.setText(strTmp);
    }
}
