package co.edu.udea.compumovil.gr03_20242.lab2.data.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import co.edu.udea.compumovil.gr03_20242.lab2.data.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsUpdateWorker(appContext: Context, workerParams: WorkerParameters) :
    CoroutineWorker(appContext, workerParams) {
        private val repository = NewsRepository()

        override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
            return@withContext try {
                repository.getTopHeadlines("5aaa5f25f0b74cd1b26ac4be9f27d60d")
                Result.success()
            } catch (e: Exception) {
                Result.retry()
            }
        }
}