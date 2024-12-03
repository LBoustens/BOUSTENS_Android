import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.filmsandseries.FilmsDest

import com.example.filmsandseries.R


@Composable
fun ProfileScreen(
    classes: WindowSizeClass,
    innerPadding: PaddingValues,
    navController: NavHostController
) {
    val classeLargeur = classes.windowWidthSizeClass
    when (classeLargeur) {
        WindowWidthSizeClass.COMPACT -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(0.dp, 100.dp, 0.dp, 0.dp),
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Profile("Lucas Boustens")
                ProfileStatus("3ème Année BUT MMI", "Responsable SI chez LA CAPE")
                ContactInfo("lucasboustens@gmail.com", "linkedin.com/in/lucas_boustens")
                StartButton(navController)
            }
        }

        else -> {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.padding(end = 100.dp)
                ) {
                    Profile("Lucas Boustens")
                }
                Column() {
                    ProfileStatus("3ème Année BUT MMI", "Responsable SI chez LA CAPE")
                    Spacer(modifier = Modifier.height(15.dp))
                    ContactInfo("lucasboustens@gmail.com", "linkedin.com/in/lucas_boustens")
                    StartButton(navController)
                }
            }
        }
    }
}

@Composable
fun Profile(name: String) {
    Image(
        painterResource(R.drawable.pp),
        contentDescription = "Profile Image",
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
    Text(
        text = name,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable

fun ProfileStatus(status1: String, status2: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(status1, fontSize = 16.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(4.dp))
        Text(status2, fontSize = 16.sp, color = Color.Gray)
    }
}

@Composable

fun ContactInfo(email: String, linkedin: String) {
    Column(horizontalAlignment = Alignment.Start) {
        Row() {
            Image(
                painterResource(R.drawable.baseline_email_24),

                contentDescription = "email Image",
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text("$email", fontSize = 16.sp, color = Color.Gray)
        }
        Row() {
            Image(
                painterResource(R.drawable.linkedin),
                modifier = Modifier.size(24.dp),
                contentDescription = "Profile Image",
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text("$linkedin", fontSize = 16.sp, color = Color.Gray)
        }
    }
}

@Composable

fun StartButton(navController: NavHostController) {
    Button(
        modifier = Modifier.padding(0.dp, 30.dp, 0.dp, 0.dp),
        onClick = { navController.navigate(FilmsDest()) }) {
        Text("Démarrer")
    }
}
