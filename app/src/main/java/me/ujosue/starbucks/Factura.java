package me.ujosue.starbucks;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Factura extends AppCompatActivity {
    private Button btnComprar = null;
    private TextView txtTazas = null;
    private TextView txtTotal = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        //Llama el texto de la cantidad de tazas que se pidieron
        txtTazas = (TextView) findViewById(R.id.txtTazas);
        //Llama al texto que muestra el total de la compra
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        //Llama al botón que se utiliza para comprar
        btnComprar = (Button) findViewById(R.id.btnComprar);
        Bundle bundle = this.getIntent().getExtras();
        txtTazas.setText(" " + bundle.getString("tazas"));
        Double total = Double.parseDouble(bundle.getString("tazas"))*9;
        txtTotal.setText("" + total);
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Nos manda a la main view
                startActivity(new Intent(Factura.this, MainActivity.class));
            }
        });
    }
}
