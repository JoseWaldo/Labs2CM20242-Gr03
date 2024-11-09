package com.example.app.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.edu.udea.compumovil.gr03_20242.lab2.data.model.Article
import co.edu.udea.compumovil.gr03_20242.lab2.data.repository.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    private val repository = NewsRepository()
    var articles = mutableStateOf<List<Article>>(emptyList())
        private set

    init {
        loadTopHeadlines()
    }

    private fun loadTopHeadlines() {
        viewModelScope.launch {
            articles.value = repository.getTopHeadlines("5aaa5f25f0b74cd1b26ac4be9f27d60d") ?: emptyList()
        }
    }
}
