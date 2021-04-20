package com.digitalinnovation.calculodenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = btnCalcular
        val resultado = txtResultado

        calcular.setOnClickListener {

            val nota1 = Integer.parseInt(editTextNota01.text.toString())
            val nota2 = Integer.parseInt(editTextNota02.text.toString())
            val nota3 = Integer.parseInt(editTextNota03.text.toString())
            val nota4 = Integer.parseInt(editTextNota04.text.toString())
            val media = (nota1 + nota2 + nota3 + nota4) / 4

            val faltas = Integer.parseInt(editTextQtdeFaltas.text.toString())

            if(media >= 6 && faltas <=10 ){
                resultado.setText("Aluno foi aprovado!" + "\n" + "Média: " + media +
                        "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno foi reprovado!" + "\n" + "Média: " + media +
                        "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }
}