import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.filmsandseries.Cast
import com.example.filmsandseries.MainViewModel
import com.example.filmsandseries.Tracks

@Composable
fun MusiqueScreen(viewModel: MainViewModel) {
    val musicsplay by viewModel.tracks.collectAsState()

    if (musicsplay.isEmpty()) {
        viewModel.getFilmsInitiaux()
    }

    if (musicsplay != null) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            // Affichage de l'affiche du film
                val imageUrl = "file:///android_asset/images/2.jpg"
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(imageUrl)
                        .crossfade(true)
                        .build(),
                    contentDescription = "Affiche du film",
                    modifier = Modifier
                        .height(200.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
            // Affichage des détails du film
            Text("Titre : ${musicsplay?.title}")

            // Affichage des acteurs
            musicsplay?.tracks?.data?.let {
                if (it.isNotEmpty()) {
                    Text("Acteurs principaux :", style = MaterialTheme.typography.bodyLarge)
                    LazyRow {
                        it.forEach { musics ->
                            item {
                                Sons(musics)}
                        }
                    }
                }
            }


        }
    } else {
        Text("Chargement de la playlist...", Modifier.padding(16.dp))
    }
}


@Composable
fun Sons(musics: Tracks) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(8.dp)) {
        val imageUrl = "file:///android_asset/images/2.jpg"
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = actor.name ?: "Acteur",
            modifier = Modifier.size(100.dp)
        )
        Text(text = musics.name ?: "Nom inconnu", textAlign = TextAlign.Center)
        Text(text = musics.character ?: "Rôle inconnu", textAlign = TextAlign.Center)
    }
}
