package com.marshall.therickandmorty.models

data class Character(
    var id: Int,
    var name: String,
    var status: String,
    var species: String,
    var type: String,
    var gender: String,
    var origin: String,
    var location: Location,
    var image: String,
    var episode: ArrayList<String>,
    var url: String,
    var created: String
)


