package com.example.p1contadorclics;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.p1contadorclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1;
    int contador2;
    int contador3;
    int contador4;
    int contadorglobal;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                binding.contadorDeClics1.setText(String.valueOf(contador1));
                contadorglobal++;
                binding.contadorreset.setText(String.valueOf(contadorglobal));


            }
        });

        binding.button2mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                binding.contadorDeClics2.setText(String.valueOf(contador2));
                contadorglobal++;
                binding.contadorreset.setText(String.valueOf(contadorglobal));

            }
        });

        binding.button3mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                binding.contadorDeClics3.setText(String.valueOf(contador3));
                contadorglobal++;
                binding.contadorreset.setText(String.valueOf(contadorglobal));

            }
        });

        binding.button4mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                binding.contadorDeClics4.setText(String.valueOf(contador4));
                contadorglobal++;
                binding.contadorreset.setText(String.valueOf(contadorglobal));

            }
        });

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorglobal= contadorglobal - contador1;
                binding.contadorreset.setText(String.valueOf(contadorglobal));
                contador1=0;
                binding.contadorDeClics1.setText(String.valueOf(contador1));


            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorglobal= contadorglobal - contador2;
                binding.contadorreset.setText(String.valueOf(contadorglobal));
                contador2=0;
                binding.contadorDeClics2.setText(String.valueOf(contador2));


            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorglobal= contadorglobal - contador3;
                binding.contadorreset.setText(String.valueOf(contadorglobal));
                contador3=0;
                binding.contadorDeClics3.setText(String.valueOf(contador3));


            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorglobal= contadorglobal - contador4;
                binding.contadorreset.setText(String.valueOf(contadorglobal));
                contador4=0;
                binding.contadorDeClics4.setText(String.valueOf(contador4));

            }
        });

        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1=0;
                binding.contadorDeClics1.setText(String.valueOf(contador1));
                contador2=0;
                binding.contadorDeClics2.setText(String.valueOf(contador2));
                contador3=0;
                binding.contadorDeClics3.setText(String.valueOf(contador3));
                contador4=0;
                binding.contadorDeClics4.setText(String.valueOf(contador4));
                contadorglobal=0;
                binding.contadorreset.setText(String.valueOf(contadorglobal));

            }
        });
    }
}