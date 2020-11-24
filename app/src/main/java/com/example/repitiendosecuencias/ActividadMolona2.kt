package com.example.repitiendosecuencias

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.repitiendosecuencias.MainActivity.Companion.variableCompartida
import java.util.*

class ActividadMolona2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_molona2)

        // tenemos que recibirlo con una constante que es val
        val number = 0
        val diablo = intent.getIntExtra(variableCompartida,number)
        val texto = findViewById<TextView>(R.id.TextV)
        // esto es asi, xq es asi y .
        diablo?.let {
            texto.text = diablo.toString()
        }

        val diablo2 = intent.getStringExtra(variableCompartida)
        diablo2 ?.let {
            texto.text = diablo2.toString().toUpperCase(Locale.ROOT)
        }
    }
}
