package com.myprojects.antonio.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;

import controlador.Controlador;
import modelos.Animal;

public class MainActivity extends AppCompatActivity {

    Controlador miControlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Creamos un ejemplar del modelo
        Animal animal=new Animal(this);
        animal.setNombre("Petete");
        animal.setEspecie("Gato");
        animal.renderizarModeloAnimal();
        //Preparamos la view que va a tener el modelo
        ViewGroup vistaAnimal=animal.renderizarModeloAnimal();
        setContentView(vistaAnimal);

        Button button=(Button)findViewById(R.id.btnRespirar);
        miControlador=new Controlador(this);
        button.setOnClickListener(miControlador);

    }
}
