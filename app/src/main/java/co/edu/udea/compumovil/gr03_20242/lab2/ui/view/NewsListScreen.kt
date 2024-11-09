package com.example.app.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.app.ui.viewmodel.NewsViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NewsListScreen(viewModel: NewsViewModel = viewModel()) {
    val articles = viewModel.articles
    println("Articles: $articles")
    LazyColumn {
        items(articles.value.size) { index ->
            NewsListItem(article = articles.value[index])
        }
    }
}