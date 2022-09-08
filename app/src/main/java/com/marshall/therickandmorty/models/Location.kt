package com.marshall.therickandmorty.models

data class Location(
    var id: Int,
    var name: String,
    var type: String,
    var dimension: String,
    var residents: ArrayList<String>,
    var url: ArrayList<String>,
    var created: String
)
