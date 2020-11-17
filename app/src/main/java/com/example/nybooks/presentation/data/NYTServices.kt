package com.example.nybooks.presentation.data

import com.example.nybooks.presentation.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NYTServices {
    @GET("lists.json")
    fun getBooks(
            @Query("api-key") apiKey: String = "8cR7F9RnQ2jWWPW59tGlweKIctOydoEj4",
            @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}