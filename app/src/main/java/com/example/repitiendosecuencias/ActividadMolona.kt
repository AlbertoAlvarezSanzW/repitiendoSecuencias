package com.example.repitiendosecuencias

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.repitiendosecuencias.MainActivity.Companion.variableCompartida

class ActividadMolona : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_molona)
        val number = 0
        // crear la constante
        val ViewImagen = findViewById<ImageView>(R.id.imageView)
        /*
        basicamente lo que estamos haciendo con este bloque es asignar un random que nos mostrara la imagen de boss o en mayusculas
         */
        val image = intent.getIntExtra(variableCompartida,number)
        image?.let {
            if(image == 1){
                ViewImagen.setImageResource(R.mipmap.ic_boss_foreground)
            }else{
                ViewImagen.setImageResource(R.mipmap.ic_bos_foreground)
            }
        }


    }
}