package br.com.empresa.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        botao_principal.setOnClickListener { showMessage("Olá Kotlin!") }
//    }
//
    fun showMessage(message: String) {
        Toast.makeText(this,
                message,
                Toast.LENGTH_LONG)
                .show()
    }

    // private List<String> tarefas = new ArrayList();
    var tarefas = mutableListOf<String>()
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tarefas.add("Aprender Android")
        tarefas.add("Aprender Kotlin")

        val adaptador = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                tarefas)
        tarefas_list.adapter = adaptador

        tarefa_add.setOnClickListener {
            tarefas.add("Tarefa ${contador++}")
            adaptador.notifyDataSetChanged()
        }

        tarefas_list.setOnItemClickListener{ _, _, position, _ ->
            val tarefa = tarefas[position]
            showMessage(tarefa)
        }
    }

}