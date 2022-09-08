package com.marshall.therickandmorty.models

data class Episode(
    var id: Int,
    var name: String,
    var air_date: String,
    var episode: String,
    var characters: ArrayList<String>,
    var url: String,
    var created: String
)
