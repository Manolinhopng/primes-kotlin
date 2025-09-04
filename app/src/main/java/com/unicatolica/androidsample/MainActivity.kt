package com.unicatolica.androidsample

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dollarText: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dollarText = findViewById(R.id.dollarText)
        textView = findViewById(R.id.textView)
    }

    fun convertCurrency(view: View) {
        val dollarValueStr = dollarText.text.toString()

        if (dollarValueStr.isNotEmpty()) {
            val dollarValue = dollarValueStr.toFloat()
            val euroValue = dollarValue * 0.85f
            textView.text = euroValue.toString()
        } else {
            textView.text = getString(R.string.no_value_string)
        }
    }
}
