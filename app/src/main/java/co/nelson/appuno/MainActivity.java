package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2,btn3;

   String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn2 = findViewById(R.id.btn3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton UNO");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarInformacion();
            }
        });


    }
    private void pasarInformacion(){
        String textoActual = nombreUsuario.getText().toString();
        String nombre = "juan carlos";
        Intent pasarInfo = new Intent(this,Pantalla_2.class);
        pasarInfo.putExtra("name", nombre);
        startActivity(pasarInfo);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(Tag, "ESTOY EN ONSTART");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(Tag, "ESTOY EN onResume");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("BIENVENIDO");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("HOLLLAA");

            }
        });


    }

    @Override
    protected void onPause(){
        super.onResume();
        Log.i(Tag, "ESTOY EN onPause");

    }



    @Override
    protected void onStop(){
        super.onPause();
        Log.i(Tag, "ESTOY EN onStop");


    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(Tag, "ESTOY EN onDestroy");


    }


    public double calcularArea(int l1,int l2){
        return l1*l2;
    }

}