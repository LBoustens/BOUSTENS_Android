import com.example.filmsandseries.FilmDetaille
import com.example.filmsandseries.SerieDetaille
import com.example.filmsandseries.TmdbActeur
import com.example.filmsandseries.TmdbFilms
import com.example.filmsandseries.TmdbSeries
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("trending/movie/week")
    suspend fun lastmovies(@Query("api_key") apiKey: String): TmdbFilms

    // Nouvelle méthode pour rechercher des films par mot clé
    @GET("search/movie")
    suspend fun searchMovies(
        @Query("api_key") apiKey: String,
        @Query("query") query: String
    ): TmdbFilms

    @GET("trending/tv/week")
    suspend fun latestSeries(@Query("api_key") apiKey: String): TmdbSeries

    @GET("trending/person/week")
    suspend fun latestPersons(@Query("api_key") apiKey: String): TmdbActeur

    @GET("search/tv")
    suspend fun searchSeries(
        @Query("api_key") apiKey: String,
        @Query("query") query: String
    ): TmdbSeries

    @GET("search/person")
    suspend fun searchPersons(
        @Query("api_key") apiKey: String,
        @Query("query") query: String
    ): TmdbActeur

    // Détails d'un film avec le cast
    @GET("movie/{movie_id}?append_to_response=credits")
    suspend fun getFilmDetails(
        @Path("movie_id") filmId: String,
        @Query("api_key") apiKey: String,
    ): FilmDetaille

    // Détails d'une série avec le cast
    @GET("tv/{tv_id}?append_to_response=credits")
    suspend fun getSerieDetails(
        @Path("tv_id") serieId: String,
        @Query("api_key") apiKey: String,
    ): SerieDetaille
}


