package co.edu.udea.compumovil.gr03_20242.lab2.data.model

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
