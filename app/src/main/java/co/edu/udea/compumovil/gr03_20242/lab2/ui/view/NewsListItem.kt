package com.example.app.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr03_20242.lab2.data.model.Article
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter

@Composable
fun NewsListItem(article: Article) {
    Column(
        modifier = Modifier
            .padding(20.dp) // Padding externo de la Column
            .border(1.dp, MaterialTheme.colorScheme.primary, MaterialTheme.shapes.small).fillMaxWidth()
    ) {
        // Box para añadir padding interno
        Box(modifier = Modifier.padding(10.dp)) {  // Padding interno
            Column {
                // Imagen de artículo
                Image(
                    painter = rememberAsyncImagePainter(model = article.urlToImage),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .clip(RoundedCornerShape(4.dp)) // Ajusta el radio de las esquinas
                        .border(0.dp, Color.Transparent, RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = article.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = article.description ?: "",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
