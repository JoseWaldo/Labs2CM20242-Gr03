package co.edu.udea.compumovil.gr03_20242.lab2.data.api;

import co.edu.udea.compumovil.gr03_20242.lab2.data.model.NewsResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface NewsApiService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): Response<NewsResponse>
}