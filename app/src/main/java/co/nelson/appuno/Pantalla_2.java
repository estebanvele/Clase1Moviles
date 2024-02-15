package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {

    TextView usuario_2, textoAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        usuario_2 = findViewById(R.id.usuario_2);
        textoAnterior = findViewById(R.id.textoAnterior);

        String name = getIntent().getStringExtra("name");
        usuario_2.setText(name);

    }
}