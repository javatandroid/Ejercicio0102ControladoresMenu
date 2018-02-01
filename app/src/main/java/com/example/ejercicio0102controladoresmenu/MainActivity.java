package com.example.ejercicio0102controladoresmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPedido;
    CheckBox cbExterior, cbCubiertos, cbPan, cbCafé, cbPostre;
    RadioGroup rgPrimero, rgSegundo, rgBebida;
    TextView tvPrimero, tvSegundo, tvExtra, tvBebida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPedido = (Button)findViewById(R.id.btnPedido);
        cbExterior = (CheckBox)findViewById(R.id.cbExterior);
        cbCubiertos = (CheckBox)findViewById(R.id.cbCubiertos);
        cbPan = (CheckBox)findViewById(R.id.cbPan);
        cbCafé = (CheckBox)findViewById(R.id.cbCafe);
        cbPostre = (CheckBox)findViewById(R.id.cbPostre);
        rgPrimero = (RadioGroup)findViewById(R.id.rgPrimero);
        rgSegundo = (RadioGroup)findViewById(R.id.rgSegundo);
        rgBebida = (RadioGroup)findViewById(R.id.rgBebida);
        tvPrimero = (TextView)findViewById(R.id.tvPrimero);
        tvSegundo = (TextView)findViewById(R.id.tvSegundo);
        tvExtra = (TextView)findViewById(R.id.tvExtra);
        tvBebida = (TextView)findViewById(R.id.tvBebida);

    }//FIN ON CREATE

  public void pulsarPedido (View view){


      int id=rgPrimero.getCheckedRadioButtonId();

      RadioButton rbSeleccionado1 = (RadioButton)findViewById(id);
      String textoRbSeleccionado1 = rbSeleccionado1.getText().toString();

      Toast.makeText(getApplicationContext(), "Has elegido "+textoRbSeleccionado1+" como primer plato",Toast.LENGTH_SHORT).show();

      id = rgSegundo.getCheckedRadioButtonId();

      RadioButton rbSeleccionado2 = (RadioButton)findViewById(id);
      String textoRbSeleccionado2 = rbSeleccionado2.getText().toString();

      Toast.makeText(getApplicationContext(), "Has elegido "+textoRbSeleccionado2+" como segundo plato",Toast.LENGTH_SHORT).show();

      id=rgBebida.getCheckedRadioButtonId();

      RadioButton rbSeleccionado3 = (RadioButton)findViewById(id);
      String textoRbSeleccionado3 = rbSeleccionado3.getText().toString();

      Toast.makeText(getApplicationContext(), "Has elegido "+textoRbSeleccionado3+" para beber",Toast.LENGTH_SHORT).show();

      String extras="";
      if (cbExterior.isChecked()){
          extras+="Exterior";
      }
      if (cbCubiertos.isChecked()){
          extras+="Cubiertos";
      }
      if (cbPan.isChecked()){
          extras+="Pan";
      }
      if (cbCafé.isChecked()){
          extras+="Café";
      }
      if (cbPostre.isChecked()){
          extras+="Postre";
      }

      Toast.makeText(getApplicationContext(), "Has seleccionado: "+extras, Toast.LENGTH_SHORT).show();

      tvPrimero.setText("Primero: "+textoRbSeleccionado1);
      tvSegundo.setText("Segundo: "+textoRbSeleccionado2);
      tvExtra.setText("Como extras: "+extras);
      tvBebida.setText("Para beber: "+textoRbSeleccionado3);



  }

}//FIN MAIN
