package com.everis.bootcamp.threading

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //18 - fazer o handle do clique do botão
        button_load_data.setOnClickListener {
            lauchAstrosTask()
        }
    }


    //13 - Criar função para exibir os dados carregados
    fun showData(list: List<AstrosPeople>?) {
        textview_data.text = ""
        list?.forEach { people ->
            textview_data.append("${people.name} - ${people.craft} \n\n")
        }
    }


    //14 - Criar função para exibir a ProgressBar
    fun showLoadingIndicator() {
        progressbar_load_indicator.visibility = View.VISIBLE
    }


    //Criar função para esconder a ProgressBar
    fun hideLoadingIndicator() {
        progressbar_load_indicator.visibility = View.GONE
    }


    //17 - Criar função para lançar a Task
    fun lauchAstrosTask() {
        val task = TaskAstros()
        task.execute()
    }


    //16 - Criar classe interna para rodar a tarefa assincrona
    inner class TaskAstros() : AsyncTask<Void, Int, List<AstrosPeople>>() {

        private val repository = AstrosRepository()

        override fun onPreExecute() {
            super.onPreExecute()
            showLoadingIndicator()
        }

        override fun doInBackground(vararg params: Void?): List<AstrosPeople> {
            return repository.loadData()
        }

        override fun onPostExecute(result: List<AstrosPeople>?) {
            super.onPostExecute(result)
            hideLoadingIndicator()
            showData(result)
        }
    }

}
