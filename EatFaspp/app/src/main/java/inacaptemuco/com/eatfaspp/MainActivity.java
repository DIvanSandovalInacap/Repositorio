package inacaptemuco.com.eatfaspp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtEdad;
    EditText edtNombre;
    EditText edtPesoActual;
    Button btnCalcular;
    Button btnInstrucciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEdad       = (EditText) findViewById(R.id.edt_edad);
        edtNombre     = (EditText) findViewById(R.id.edt_nombre);
        edtPesoActual = (EditText) findViewById(R.id.edt_PesoActual);
        btnCalcular   = (Button)   findViewById(R.id.btn_calcular);
        btnInstrucciones = (Button) findViewById(R.id.btn_instrucciones);
        btnCalcular.setOnClickListener(this);
        btnInstrucciones.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_calcular:
                abrirResultado();
                break;
            case R.id.btn_instrucciones:
                abrirInstrucciones();
                break;
        }

    }
    public void abrirResultado(){
        int edadIngresada = Integer.parseInt(edtEdad.getText().toString());
        String nombreIngresado = edtNombre.getText().toString();
        Intent intento = new Intent(MainActivity.this,ResultadoActivity.class);
        intento.putExtra("p_edad",edadIngresada);
        intento.putExtra("p_nombre",nombreIngresado);
        startActivity(intento);
    }
    public void abrirInstrucciones(){
        Intent intento = new Intent( MainActivity.this,InstruccionesActivity.class);
        startActivity(intento);
    }
}
