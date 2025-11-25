package com.example.netflixapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class SimulacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulacion);

        EditText edtPrecio = findViewById(R.id.edtPrecio);
        EditText edtDescuento = findViewById(R.id.edtDescuento);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        TextView txtResultado = findViewById(R.id.txtResultado);
        Button regresar = findViewById(R.id.btnRegresarSimulacion);

        btnCalcular.setOnClickListener(v -> {
            String precioStr = edtPrecio.getText().toString();
            String descStr = edtDescuento.getText().toString();

            if (precioStr.isEmpty() || descStr.isEmpty()) {
                txtResultado.setText("Por favor ingresa todos los valores.");
                return;
            }

            double precio = Double.parseDouble(precioStr);
            double descuento = Double.parseDouble(descStr);

            double valorDescuento = precio * (descuento / 100);
            double totalFinal = precio - valorDescuento;

            txtResultado.setText(
                    "Precio original: $" + precio +
                            "\nDescuento: " + descuento + "%" +
                            "\nTotal a pagar: $" + totalFinal
            );
        });

        regresar.setOnClickListener(v ->
                startActivity(new Intent(this, MenuActivity.class))
        );
    }
}
