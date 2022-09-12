package com.marshall.therickandmorty.network

import com.marshall.therickandmorty.models.Character
import com.marshall.therickandmorty.models.Episode
import com.marshall.therickandmorty.models.Location
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ApiService {
    //Character
    @GET("/api/character")
    suspend fun getCharacters(): Response<MutableList<Character>>

    @GET("/api/character/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): Response<Character>

    @GET("/api/character/")
    suspend fun getCharactersByFilters(@QueryMap filters: Map<String, String>)

    //Location
    @GET("/api/location")
    suspend fun getLocations(): Response<MutableList<Location>>

    @GET("/api/location/{id}")
    suspend fun getLocationById(@Path("id") id: Int): Response<Location>


    //Episode
    @GET("/api/episode")
    suspend fun getEpisodes(): Response<MutableList<Episode>>

    /**
     * Get a single episode
        You can get a single episode by adding the id as a parameter: /episode/28
     */
    @GET("/api/episode/{id}")
    suspend fun getEpisodeById(@Path("id") id: Int): Response<Episode>

    /**
     * Available parameters:
        name: filter by the given name.
        episode: filter by the given episode code.
     */
    @GET("/api/character/")
    suspend fun getEpisodeByFilter(@QueryMap filters: Map<String, String>): Response<Episode>
}