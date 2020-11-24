package com.example.repitiendosecuencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // creación de una constante rapida
    companion object{const val variableCompartida="variableEstatica"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // una vez realizado el ImageView , ajustado las constraint y asignarle un ID

        // creamos una constante de EditText
        val EditText = findViewById<EditText>(R.id.Edit2)

        // crear funcionalidad al boton
        val boton1 = findViewById<Button>(R.id.boton1)
        // darle funcionalidad al pulsarlo
        boton1.setOnClickListener {
            // Asignación de la variable intent a la variablecompartida / class static
            val intent = Intent(this,ActividadMolona::class.java)
            intent.putExtra(variableCompartida,1)
            startActivity(intent)
        }

        // creación de 2 boton, hemos de tener en cuenta que el R.id.boton2 se ha debido de
        // asignar anteriormente

        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val intent = Intent(this,ActividadMolona2::class.java)
            // lo que queremos hacer es "decirle al boton" cuantas letras tenemos en el editText
            // con esto sacamos la longitud de la cadena

            // pasar de main activity la actividadmolona2
            /*
            el putExtra --> sirve para mandar / enviar información a otro activity Main
            el get"XXXX"Extra --> sirve para recibir ese dato en otro activity main
            es decir un getter y un setter
             */
            intent.putExtra(variableCompartida,EditText.text.toString().length)
            startActivity(intent)
        }

        val boton3 =  findViewById<Button>(R.id.buton3)
        boton3.setOnClickListener {
            val random = Random.nextInt(1, 10) // me lo ha pasado javi xd
            if (random > 4) {

                val intent = Intent(this, ActividadMolona::class.java)
                intent.putExtra(variableCompartida, random)
                startActivity(intent)

            } else {
                val intent = Intent(this, ActividadMolona2::class.java)
                intent.putExtra(variableCompartida, EditText.text.toString())
                startActivity(intent)
            }
        }
    }
}