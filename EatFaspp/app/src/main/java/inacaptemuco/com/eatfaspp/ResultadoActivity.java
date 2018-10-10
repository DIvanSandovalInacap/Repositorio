package inacaptemuco.com.eatfaspp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import operaciones.Salud;

public class ResultadoActivity extends AppCompatActivity {

    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        txvResultado = (TextView) findViewById(R.id.txv_resultado);
        Intent intento = getIntent();
        Bundle datosRecibidos = intento.getExtras();
        int edadRecibida = datosRecibidos.getInt("p_edad");
        String nombreRecibido = datosRecibidos.getString("p_nombre");
        Salud salud = new Salud();
        salud.setNombre(nombreRecibido);
        salud.setEdad(edadRecibida);

        txvResultado.setText("Peso ideal de"+ salud.getNombre()+ "es"+salud.calcularPesoIdeal()+ "Su estado de peso es" +salud.calcularEstadoPeso());


    }
}
