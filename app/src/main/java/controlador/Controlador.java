package controlador;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.myprojects.antonio.mvc.R;

/**
 * Created by Usuario on 26/05/2017.
 */

public class Controlador implements View.OnClickListener {

    private AppCompatActivity miactivity;

    public Controlador(AppCompatActivity activity) {
        miactivity= activity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnRespirar:
                    Toast.makeText(miactivity,"El gato ha maullado",Toast.LENGTH_SHORT).show();
        }
    }
}
