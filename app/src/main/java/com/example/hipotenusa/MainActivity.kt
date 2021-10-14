package com.example.hipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{calcularHipotenusaClick()}
        btnLimpiar.setOnClickListener{limpiarClick()}

    }

    private fun limpiarClick() {
        txtResultado.text = ""
        txtLadoA.text = null
        txtLadoB.text = null
    }

    private fun calcularHipotenusaClick(){
        if(txtLadoA.text.isEmpty() || txtLadoB.text.isEmpty()){
            txtResultado.text = "SYNTAX ERROR"
        } else {
            val ladoA = txtLadoA.text.toString().toDouble()
            val ladoB = txtLadoB.text.toString().toDouble()
            var result = 0.0
            result = sqrt(pow(ladoA,2.0) + pow(ladoB,2.0))
            txtResultado.text = result.toString()
        }

    }
}