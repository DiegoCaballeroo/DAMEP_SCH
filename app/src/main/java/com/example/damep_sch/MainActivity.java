package com.example.damep_sch;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.ingresar);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Ingresó correctamente", Toast.LENGTH_SHORT).show());
        TextView tv2 = findViewById(R.id.olvidastecontra);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Olvidó su contraseña", Toast.LENGTH_SHORT).show());
        Button btn2 = findViewById(R.id.crearcuenta);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Creó su cuenta correctamente", Toast.LENGTH_SHORT).show());

    }
}