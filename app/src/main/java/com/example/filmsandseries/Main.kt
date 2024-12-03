package com.example.filmsandseries

open class Piece(val largeur: Double, val longueur: Double, val nom: String) {
    open fun surface() {
        val result = largeur * longueur
        println("${nom} : ${result} m2")
    }
}

class Cuisine(largeur: Double, longueur: Double, nom: String) : Piece(largeur,longueur,nom){

}

class Salon(largeur: Double, longueur: Double, nom: String) : Piece(largeur, longueur, nom) {

}

val cuisine = Cuisine(5.0, 8.0, "Cuisine Equipe" )
val salon = Salon(10.0,20.0, "Salon Principal" )

fun main() {
    println("coucou")
    fun afficherPiece(items: List<Piece>) {
        for (item in items) item.surface()
    }
    afficherPiece(listOf(cuisine,salon))
}