package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int k = 2;
int i = 1;
    int j = 2;

    public void submitOrder(View view) {
        display(k,i);
        int sum = i + j;
        i = j;
        j = sum;
        k++;
    }

    private void display(int num, int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(num+"th fibonacci number: " + number);
    }
}