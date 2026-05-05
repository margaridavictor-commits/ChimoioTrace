package com.example.chimoiotrace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import com.example.chimoiotrace.api.WeatherApiService
import com.example.chimoiotrace.api.WeatherResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class IntelligentConsultantActivity : AppCompatActivity() {

    private lateinit var tipTextView: TextView
    private lateinit var weatherTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intelligent_consultant)

        val category = intent.getStringExtra("category") ?: "general"
        tipTextView = findViewById(R.id.tipTextView)
        weatherTextView = findViewById(R.id.weatherTextView)
        val getTipButton = findViewById<Button>(R.id.getTipButton)
        val getWeatherButton = findViewById<Button>(R.id.getWeatherButton)

        getTipButton.setOnClickListener {
            val tip = getTipForCategory(category)
            tipTextView.text = tip
        }

        getWeatherButton.setOnClickListener {
            getWeatherForChimoio()
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

    private fun getWeatherForChimoio() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(WeatherApiService::class.java)
        val call = service.getWeather("Chimoio", "YOUR_API_KEY") // Replace with actual key

        call.enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if (response.isSuccessful) {
                    val weather = response.body()
                    val temp = weather?.main?.temp?.minus(273.15)?.toInt() ?: 0
                    val desc = weather?.weather?.firstOrNull()?.description ?: "Unknown"
                    weatherTextView.text = "Clima em Chimoio: $temp°C, $desc"
                } else {
                    weatherTextView.text = "Erro ao obter clima"
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                weatherTextView.text = "Falha na conexão"
            }
        })
    }
}