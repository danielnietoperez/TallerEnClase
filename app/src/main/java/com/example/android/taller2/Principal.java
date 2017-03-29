package com.example.android.taller2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private EditText cajaCantidad;
    private RadioButton r1,r2,r3,r4,r5,r6;
    private Spinner comboDijes;
    private Intent i;
    private Bundle b;
    private ArrayAdapter<String> adapter;
    private String[] opc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cajaCantidad=(EditText) findViewById(R.id.txtCantidad);
        comboDijes=(Spinner) findViewById(R.id.cmbTipos);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        r3=(RadioButton) findViewById(R.id.r3);
        r4=(RadioButton) findViewById(R.id.r4);
        r5=(RadioButton) findViewById(R.id.r5);
        r6=(RadioButton) findViewById(R.id.r6);
        i = new Intent(this,Resultado.class);
        b= new Bundle();
        opc=this.getResources().getStringArray(R.array.dijes);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        comboDijes.setAdapter(adapter);
    }


    public void Resultado(View v){
        String cantidad,material="",dijes="",matdijes="",pago="";
        cantidad=cajaCantidad.getText().toString();
        //material
        if (r1.isChecked())material=getResources().getString(R.string.cuero);
        if (r2.isChecked())material=getResources().getString(R.string.cuerda);
        //dijes
        if (r3.isChecked())dijes=getResources().getString(R.string.martillo);
        if (r4.isChecked())dijes=getResources().getString(R.string.ancla);
        matdijes=comboDijes.getSelectedItem().toString();
        //pago
        if (r5.isChecked())pago=getResources().getString(R.string.dolares);
        if (r6.isChecked())pago=getResources().getString(R.string.pesos);
        b.putString("Cantidad", cantidad);
        b.putString("Material", material);
        b.putString("Dijes", dijes);
        b.putString("matDijes", matdijes);
        b.putString("Pago", pago);
        i.putExtras(b);
        startActivity(i);
    }


}
