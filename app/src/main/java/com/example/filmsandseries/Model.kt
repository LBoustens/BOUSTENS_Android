package com.example.filmsandseries

data class TmdbFilms(
    val page: Int? = 0,
    val results: List<FilmLight> = listOf(),
    val total_pages: Int? = 0,
    val total_results: Int? = 0
)

data class FilmLight(
    val adult: Boolean? = false,
    val backdrop_path: String? = "",
    val genre_ids: List<Int?>? = listOf(),
    val id: Int? = 0,
    val media_type: String? = "",
    val original_language: String? = "",
    val original_title: String? = "",
    val overview: String? = "",
    val popularity: Double? = 0.0,
    val poster_path: String? = "",
    val release_date: String? = "",
    val title: String? = "",
    val video: Boolean? = false,
    val vote_average: Double? = 0.0,
    val vote_count: Int? = 0
)

data class TmdbActeur(
    val page: Int? = 0,
    val results: List<ActeurLight> = listOf(),
    val total_pages: Int? = 0,
    val total_results: Int? = 0
)

data class ActeurLight(
    val adult: Boolean? = false,
    val gender: Int? = 0,
    val id: Int? = 0,
    val known_for_department: String? = "",
    val media_type: String? = "",
    val name: String? = "",
    val original_name: String? = "",
    val popularity: Double? = 0.0,
    val profile_path: String? = ""
)

data class TmdbSeries(
    val page: Int? = 0,
    val results: List<SeriesLight> = listOf(),
    val total_pages: Int? = 0,
    val total_results: Int? = 0
)

data class SeriesLight(
    val adult: Boolean? = false,
    val backdrop_path: String? = "",
    val first_air_date: String? = "",
    val genre_ids: List<Int?>? = listOf(),
    val id: Int? = 0,
    val media_type: String? = "",
    val name: String? = "",
    val origin_country: List<String?>? = listOf(),
    val original_language: String? = "",
    val original_name: String? = "",
    val overview: String? = "",
    val popularity: Double? = 0.0,
    val poster_path: String? = "",
    val vote_average: Double? = 0.0,
    val vote_count: Int? = 0
)

data class FilmDetaille(
    val adult: Boolean? = false,
    val backdrop_path: String? = "",
    val belongs_to_collection: BelongsToCollection? = BelongsToCollection(),
    val budget: Int? = 0,
    val credits: Credits? = Credits(),
    val genres: List<Genre?>? = listOf(),
    val homepage: String? = "",
    val id: Int? = 0,
    val imdb_id: String? = "",
    val origin_country: List<String?>? = listOf(),
    val original_language: String? = "",
    val original_title: String? = "",
    val overview: String? = "",
    val popularity: Double? = 0.0,
    val poster_path: String? = "",
    val production_companies: List<ProductionCompany?>? = listOf(),
    val production_countries: List<ProductionCountry?>? = listOf(),
    val release_date: String? = "",
    val revenue: Int? = 0,
    val runtime: Int? = 0,
    val spoken_languages: List<SpokenLanguage?>? = listOf(),
    val status: String? = "",
    val tagline: String? = "",
    val title: String? = "",
    val video: Boolean? = false,
    val vote_average: Double? = 0.0,
    val vote_count: Int? = 0
)

data class BelongsToCollection(
    val backdrop_path: Any? = Any(),
    val id: Int? = 0,
    val name: String? = "",
    val poster_path: Any? = Any()
)

data class Credits(
    val cast: List<Cast>? = listOf(),
)

data class Genre(
    val id: Int? = 0,
    val name: String? = ""
)

data class ProductionCompany(
    val id: Int? = 0,
    val logo_path: Any? = Any(),
    val name: String? = "",
    val origin_country: String? = ""
)

data class ProductionCountry(
    val iso_3166_1: String? = "",
    val name: String? = ""
)

data class SpokenLanguage(
    val english_name: String? = "",
    val iso_639_1: String? = "",
    val name: String? = ""
)

data class Cast(
    val adult: Boolean? = false,
    val cast_id: Int? = 0,
    val character: String? = "",
    val credit_id: String? = "",
    val gender: Int? = 0,
    val id: Int? = 0,
    val known_for_department: String? = "",
    val name: String? = "",
    val order: Int? = 0,
    val original_name: String? = "",
    val popularity: Double? = 0.0,
    val profile_path: String? = ""
)


data class SerieDetaille(
    val adult: Boolean? = false,
    val backdrop_path: String? = "",
    val credits: Credits? = Credits(),
    val episode_run_time: List<Int?>? = listOf(),
    val first_air_date: String? = "",
    val genres: List<Genre?>? = listOf(),
    val homepage: String? = "",
    val id: Int? = 0,
    val in_production: Boolean? = false,
    val languages: List<String?>? = listOf(),
    val last_air_date: String? = "",
    val name: String? = "",
    val next_episode_to_air: Any? = Any(),
    val number_of_episodes: Int? = 0,
    val number_of_seasons: Int? = 0,
    val origin_country: List<String?>? = listOf(),
    val original_language: String? = "",
    val original_name: String? = "",
    val overview: String? = "",
    val popularity: Double? = 0.0,
    val poster_path: String? = "",
    val production_companies: List<ProductionCompany?>? = listOf(),
    val production_countries: List<ProductionCountry?>? = listOf(),
    val spoken_languages: List<SpokenLanguage?>? = listOf(),
    val status: String? = "",
    val tagline: String? = "",
    val type: String? = "",
    val vote_average: Double? = 0.0,
    val vote_count: Int? = 0
)

data class Playlist(
    val checksum: String? = "",
    val collaborative: Boolean? = false,
    val cover: String? = "",
    val creation_date: String? = "",
    val creator: Creator? = Creator(),
    val description: String? = "",
    val duration: Int? = 0,
    val fans: Int? = 0,
    val id: Int? = 0,
    val is_loved_track: Boolean? = false,
    val link: String? = "",
    val md5_image: String? = "",
    val nb_tracks: Int? = 0,
    val picture_type: String? = "",
    val `public`: Boolean? = false,
    val share: String? = "",
    val title: String? = "",
    val tracklist: String? = "",
    val tracks: Tracks? = Tracks(),
    val type: String? = ""
)

data class Creator(
    val id: Int? = 0,
    val name: String? = "",
    val tracklist: String? = "",
    val type: String? = ""
)

data class Tracks(
    val checksum: String? = "",
    val `data`: List<Data?>? = listOf()
)

data class Data(
    val album: Album? = Album(),
    val artist: Artist? = Artist(),
    val duration: Int? = 0,
    val explicit_content_cover: Int? = 0,
    val explicit_content_lyrics: Int? = 0,
    val explicit_lyrics: Boolean? = false,
    val id: Long? = 0,
    val isrc: String? = "",
    val link: String? = "",
    val md5_image: String? = "",
    val preview: String? = "",
    val rank: Int? = 0,
    val readable: Boolean? = false,
    val time_add: Int? = 0,
    val title: String? = "",
    val title_short: String? = "",
    val title_version: String? = "",
    val type: String? = ""
)

data class Album(
    val cover: String? = "",
    val id: Int? = 0,
    val md5_image: String? = "",
    val title: String? = "",
    val tracklist: String? = "",
    val type: String? = "",
    val upc: String? = ""
)

data class Artist(
    val id: Int? = 0,
    val link: String? = "",
    val name: String? = "",
    val tracklist: String? = "",
    val type: String? = ""
)