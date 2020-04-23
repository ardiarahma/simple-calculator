package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, clear;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.et_Angka1);
        angka_kedua = findViewById(R.id.et_Angka2);
        tambah = findViewById(R.id.btn_Tambah);
        kurang = findViewById(R.id.btn_Kurang);
        kali = findViewById(R.id.btn_Kali);
        bagi = findViewById(R.id.btn_Bagi);
        clear = findViewById(R.id.btn_Clear);
        hasil = findViewById(R.id.tv_Result);

        operasiTambah();
        operasiKurang();
        operasiKali();
        operasiBagi();
        clearAll();
    }

    public void operasiTambah(){
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void operasiKurang(){
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void operasiKali(){
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void operasiBagi(){
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void clearAll(){
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("0");
                angka_pertama.requestFocus();
            }
        });
    }
}
