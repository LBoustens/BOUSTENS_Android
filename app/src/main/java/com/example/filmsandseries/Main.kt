package com.example.filmsandseries

open class Piece(val largeur: Double, val longueur: Double, val nom: String) {
    open fun surface() {
        val result = largeur * longueur
        println("${nom} : ${result} m2")
    }
}

class Cuisine(largeur: Double, longueur: Double, nom: String) : Piece(largeur, longueur, nom) {

}

class Salon(largeur: Double, longueur: Double, nom: String) : Piece(largeur, longueur, nom) {

}

class Etudiant(val name: String, val promo: String, val matieres: List<String>)

val cuisine = Cuisine(5.0, 8.0, "Cuisine Equipe")
val salon = Salon(10.0, 20.0, "Salon Principal")

fun main() {
    println("coucou")
    fun afficherPiece(items: List<Piece>) {
        for (item in items) item.surface()
    }
    afficherPiece(listOf(cuisine, salon))
    val etudiants = listOf(
        Etudiant("Paul", "2025", listOf("mobile", "web", "BDD")),
        Etudiant("Yazid", "2024", listOf("mobile", "Android", "Réseau")),
        Etudiant("Caroline", "2025", listOf("SE", "Anglais")),
    )
    val etupromo2024 = etudiants.filter { it.promo == "2024" }.forEach { println(it.name) }
    val etuplus2mat = etudiants.filter { it.matieres.size > 2  }.forEach { println(it.name) }
    val nbmat = etudiants.fold(0){acc, etudiant -> acc + etudiant.matieres.size }
    println(nbmat)
}




