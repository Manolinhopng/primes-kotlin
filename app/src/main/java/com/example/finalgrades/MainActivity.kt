package com.example.finalgrades

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.finalgrades.R.id

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note1= findViewById<EditText>(id.note1)
        val note2= findViewById<EditText>(id.note2)
        val note3= findViewById<EditText>(id.note3)
        val btnCalculate =findViewById<Button>(id.btnCalculate)
        val txtResult= findViewById<TextView>(id.txtResult)
        val btnClean = findViewById<Button>(id.btnClean)

        btnCalculate.setOnClickListener {
            val n1 =note1.text.toString().toDoubleOrNull()?:0.0
            val n2 =note2.text.toString().toDoubleOrNull()?:0.0
            val n3 =note3.text.toString().toDoubleOrNull()?:0.0

            val prom =(n1+n2+n3)/3

            val message = if (prom >= 3) {
                "Promedio: %.2f Melo👍👍".format(prom)
            } else {
                "Promedio: %.2f un patico 👎👎".format(prom)
            }
            txtResult.text = message

        }

        btnClean.setOnClickListener {
            note1.text.clear()
            note2.text.clear()
            note3.text.clear()
            txtResult.text = "Aqui ves el resultado"
        }
    }

}