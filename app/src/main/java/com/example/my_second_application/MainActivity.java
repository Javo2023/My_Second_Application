package com.example.my_second_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("MainActivity", "estamos en el método onCreate");
        setContentView(R.layout.activity_main);


        TextView text = findViewById(R.id.mainText);
        int result = calcular("3,6");

        text.setText("el resultado es " + String.valueOf(result));

    }

    private int calcular(String numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }
        String[] num = numeros.split(",");
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += Integer.valueOf(num[i]);
        }
        return sum;
    }
}