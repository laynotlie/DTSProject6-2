package com.example.aplikasimobile_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;
    Button bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText) findViewById(R.id.txtAngka1);
        angka2 = (EditText) findViewById(R.id.txtAngka2);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        bagi = (Button) findViewById(R.id.bagi);
        kali = (Button) findViewById(R.id.kali);
        bersihkan = (Button) findViewById(R.id.bersih);
        hasil = (TextView) findViewById(R.id.lblResult);

        tambah.setOnClickListener(view -> {
                if (angka1.getText().length() > 0 && angka2.getText().length() > 0){
                    double input1 = Double.parseDouble(angka1.getText().toString());
                    double input2 = Double.parseDouble(angka2.getText().toString());
                    hasil.setText("" + (input1 + input2));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
                }
            });

        kurang.setOnClickListener(view -> {
            if (angka1.getText().length() > 0 && angka2.getText().length() > 0){
                double input1 = Double.parseDouble(angka1.getText().toString());
                double input2 = Double.parseDouble(angka2.getText().toString());
                hasil.setText("" + (input1 - input2));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
            }
        });

        kali.setOnClickListener(view -> {
            if (angka1.getText().length() > 0 && angka2.getText().length() > 0){
                double input1 = Double.parseDouble(angka1.getText().toString());
                double input2 = Double.parseDouble(angka2.getText().toString());
                hasil.setText("" + (input1 * input2));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
            }
        });

        bagi.setOnClickListener(view -> {
            if (angka1.getText().length() > 0 && angka2.getText().length() > 0){
                double input1 = Double.parseDouble(angka1.getText().toString());
                double input2 = Double.parseDouble(angka2.getText().toString());
                hasil.setText("" + (input1 / input2));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
            }
        });

        bersihkan.setOnClickListener(view -> {
            angka1.setText("");
            angka2.setText("");
            hasil.setText("");
            angka1.requestFocus();
        });

    }
}