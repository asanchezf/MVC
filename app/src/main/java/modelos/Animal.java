package modelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myprojects.antonio.mvc.R;


/**
 * Created by Usuario on 26/05/2017.
 */

public class Animal {

    private String nombre;
    private String especie;
    private Context ctx;


    public Animal(Context context) {
        ctx=context;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public ViewGroup renderizarModeloAnimal(){

        ViewGroup viewGroup=null;
        LayoutInflater inflater=(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        viewGroup= (ViewGroup) inflater.inflate(R.layout.activity_main,null,true);
        TextView txtNombre= (TextView) viewGroup.findViewById(R.id.txtNombre);
        TextView txtEspecie= (TextView) viewGroup.findViewById(R.id.txtEspecie);
        txtNombre.setText(nombre);
        txtEspecie.setText(especie);

        return viewGroup;
    }
}
