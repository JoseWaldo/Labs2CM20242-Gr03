package com.example.app.ui.view

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.app.ui.viewmodel.NewsViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NewsListScreen(viewModel: NewsViewModel = viewModel()) {
    val articles = viewModel.articles
   Column {
        Text(
            text = "Últimas Noticias",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )
       LazyColumn {
           items(articles.value.size) { index ->
               NewsListItem(article = articles.value[index])
           }
       }
   }

}