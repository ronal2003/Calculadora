package com.example.calculadora


import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.R.*



class MainActivity : AppCompatActivity() {

    lateinit var btn_uno: TextView
    lateinit var btn_dos: TextView
    lateinit var btn_tres: TextView
    lateinit var btn_cuatro: TextView
    lateinit var btn_cinco: TextView
    lateinit var btn_seis: TextView
    lateinit var btn_siete: TextView
    lateinit var btn_ocho: TextView
    lateinit var btn_nueve: TextView
    lateinit var txtview_resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        btn_uno.setOnClickListener{numeroPresionado("1")}
        btn_dos.setOnClickListener{numeroPresionado("2")}
        btn_tres.setOnClickListener{numeroPresionado("3")}
        btn_cuatro.setOnClickListener{numeroPresionado("4")}
        btn_cinco.setOnClickListener{numeroPresionado("5")}
        btn_seis.setOnClickListener{numeroPresionado("6")}
        btn_siete.setOnClickListener{numeroPresionado("7")}
        btn_ocho.setOnClickListener{numeroPresionado("8")}
        btn_nueve.setOnClickListener{numeroPresionado("9")}

    }

    fun numeroPresionado(digito:String){
        txtview_resultado.text = "${txtview_resultado.text}$digito"
    }
}