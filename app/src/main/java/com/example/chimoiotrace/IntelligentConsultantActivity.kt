package com.example.chimoiotrace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class IntelligentConsultantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intelligent_consultant)

        val category = intent.getStringExtra("category") ?: "general"
        val tipTextView = findViewById<TextView>(R.id.tipTextView)
        val getTipButton = findViewById<Button>(R.id.getTipButton)

        getTipButton.setOnClickListener {
            val tip = getTipForCategory(category)
            tipTextView.text = tip
        }
    }

    private fun getTipForCategory(category: String): String {
        return when (category.lowercase()) {
            "milho" -> "Para milho: Regue regularmente nas primeiras semanas. Evite pragas com rotação de culturas."
            "tomate" -> "Para tomate: Mantenha solo bem drenado. Use fertilizantes ricos em potássio para melhor sabor."
            "batata" -> "Para batata: Plante em solo solto. Monitore para doenças fúngicas e use fungicidas se necessário."
            else -> "Dica geral: Monitore o clima e ajuste a irrigação conforme necessário. Consulte preços de mercado para otimizar vendas."
        }
    }
}