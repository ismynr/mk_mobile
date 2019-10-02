package com.ismynr.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ismynr.submission1.activity.GoFood;
import com.ismynr.submission1.activity.InstantCourier;
import com.ismynr.submission1.activity.Shopping;
import com.ismynr.submission1.activity.Transport;

public class Menu extends BaseMenu {
    Button btnInstantCourier, btnGofood, btnTransport, btnShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViews();
        initListeners();
    }

    @Override
    public void findViews() {
        btnInstantCourier = findViewById(R.id.btn_instantcourier);
        btnGofood = findViewById(R.id.btn_gofood);
        btnTransport = findViewById(R.id.btn_transport);
        btnShopping = findViewById(R.id.btn_shopping);
    }

    @Override
    public void initListeners() {
        btnInstantCourier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Menu.this, "Sedang berada di menu Instant Courier", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(Menu.this, InstantCourier.class);
                startActivity(move);
            }
        });
        btnGofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Menu.this, "Sedang berada di menu Go Food", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(Menu.this, GoFood.class);
                startActivity(move);
            }
        });
        btnTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Menu.this, "Sedang berada di menu Transport", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(Menu.this, Transport.class);
                startActivity(move);
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Menu.this, "Sedang berada di menu Shopping", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(Menu.this, Shopping.class);
                startActivity(move);
            }
        });
    }
}
