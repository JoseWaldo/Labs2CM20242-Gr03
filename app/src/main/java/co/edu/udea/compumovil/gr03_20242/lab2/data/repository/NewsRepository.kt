package co.edu.udea.compumovil.gr03_20242.lab2.data.repository

import co.edu.udea.compumovil.gr03_20242.lab2.data.api.RetrofitInstance
import co.edu.udea.compumovil.gr03_20242.lab2.data.model.Article

class NewsRepository {
    suspend fun getTopHeadlines(apiKey: String): List<Article>? {
        val response = RetrofitInstance.api.getTopHeadlines("us", apiKey)
        return if (response.isSuccessful) {
            response.body()?.articles
        } else {
            emptyList()
        }
    }
}