package com.example.android.taller2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView resultado;
    private Bundle b;
    private String aux,cantidad,material,dijes,matdijes,pago;
    private Resources res;
    private int cien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultado=(TextView)findViewById(R.id.lblResultado);
        b= getIntent().getExtras();
        cantidad=b.getString("Cantidad");
        material=b.getString("Material");
        dijes=b.getString("Dijes");
        matdijes=b.getString("matDijes");
        pago=b.getString("Pago");
        res = this.getResources();
        cien=100;

        if (material=="cuero" && dijes=="martillo" && matdijes=="oro"&&pago=="dolares"){
            aux=" su saldo a pagar es:"+Integer.parseInt(cantidad)*cien;
            resultado.setText(aux);
        }else if (material=="cuero" && dijes=="martillo" && matdijes=="plata"&&pago=="dolares"){
            aux="su saldo a pagar es:"+Integer.parseInt(cantidad)*cien;
            resultado.setText(aux);
        }if (material=="cuero" && dijes=="martillo" && matdijes=="oroRosa"&&pago=="dolares") {
            aux="su saldo a pagar es:"+Integer.parseInt(cantidad)*cien;
            resultado.setText(aux);
        }

    }




}
