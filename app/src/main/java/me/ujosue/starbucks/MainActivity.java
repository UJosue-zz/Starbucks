package me.ujosue.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Llama el controlador en donde escribimos la cantidad de tazas deseadas
    private EditText tazas = null;
    //Llama al boton para pedir
    private Button btnPedir = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tazas = (EditText) findViewById(R.id.etPedir);
        btnPedir = (Button) findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Declara que queremos ir a la vista de factura
                Intent intent = new Intent(MainActivity.this, Factura.class);
                //Le enviamos la cantidad de tazas que se pidieron
                intent.putExtra("tazas", tazas.getText().toString());
                //Nos manda a la vista de la factura
                startActivity(intent);
            }
        });
    }
}
