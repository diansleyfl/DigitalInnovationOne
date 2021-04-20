package com.digitalinnovation.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "ON CREATE - Estou criando a tela!")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "START - Deixei a tela visível para você!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "RESUME - Agora você pode interagir com a tela!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - A tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "STOP - A tela não está mais visível, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "RESTART - A tela está retomando o foco!")
    }

    override fun onDestroy() {
        Log.w("lifecycle", "DESTROY - Oh não! A tela foi destruída!")
        super.onDestroy()
    }

}