package co.edu.udea.compumovil.gr03_20242.lab2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import co.edu.udea.compumovil.gr03_20242.lab2.data.worker.NewsUpdateWorker
import co.edu.udea.compumovil.gr03_20242.lab2.ui.theme.Labs20242Gr03Theme
import com.example.app.ui.view.NewsListScreen
import java.util.concurrent.TimeUnit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configura el Worker para actualizar las noticias cada 15 minutos
        val newsUpdateRequest = PeriodicWorkRequestBuilder<NewsUpdateWorker>(15, TimeUnit.MINUTES).build()
        WorkManager.getInstance(this).enqueue(newsUpdateRequest)
        setContent {
            NewsListScreen()
        }
        Log.d("MainActivity", "setContent executed")  // Agrega esta línea
    }
}
