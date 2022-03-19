package br.com.fiap.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.danielamaral.calculadora.R

class MainActivity : AppCompatActivity() {

    private lateinit var btSomar: Button
    private lateinit var btSubtrair: Button
    private lateinit var btMultiplicar: Button
    private lateinit var btDividir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSomar = findViewById(R.id.btSomar)
        btSubtrair = findViewById(R.id.btSubtrair)
        btMultiplicar = findViewById(R.id.btMultiplicar)
        btDividir = findViewById(R.id.btDividir)

        val etValor1: EditText = findViewById(R.id.etValor1)
        val etValor2: EditText = findViewById(R.id.etValor2)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btSomar.setOnClickListener {
            tvResultado.text = calcular2(btSomar.id,etValor1,etValor2).toString()
        }

        btSubtrair.setOnClickListener {
            tvResultado.text = calcular2(btSubtrair.id,etValor1,etValor2).toString()
        }

        btMultiplicar.setOnClickListener {
            tvResultado.text = calcular2(btMultiplicar.id,etValor1,etValor2).toString()
        }

        btDividir.setOnClickListener {
            tvResultado.text = calcular2(btDividir.id,etValor1,etValor2).toString()
        }
    }

    fun calcular(idBotao: Int, entrada1: EditText, entrada2: EditText): Double {
        val valor1 = entrada1.text.toString().toDouble()
        val valor2 = entrada2.text.toString().toDouble()

        if (idBotao == btSomar.id) return valor1 + valor2
        else if (idBotao == btSubtrair.id) return valor1 - valor2
        else if (idBotao == btMultiplicar.id) return valor1 * valor2
        else return valor1 / valor2
    }


    fun calcular2(idBotao: Int, entrada1: EditText, entrada2: EditText): Double {
        val valor1 = entrada1.text.toString().toDouble()
        val valor2 = entrada2.text.toString().toDouble()

        when (idBotao) {
            btSomar.id -> return valor1 + valor2
            btSubtrair.id -> return valor1 - valor2
            btMultiplicar.id -> return valor1 * valor2
            else -> return valor1 / valor2
        }

    }
}