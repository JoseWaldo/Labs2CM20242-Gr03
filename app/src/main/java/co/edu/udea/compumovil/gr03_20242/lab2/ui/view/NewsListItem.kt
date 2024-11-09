package com.example.app.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr03_20242.lab2.data.model.Article

@Composable
fun NewsListItem(article: Article) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = article.title, style = MaterialTheme.typography.headlineMedium)
        Text(text = article.description ?: "", style = MaterialTheme.typography.bodyMedium)
    }
}
