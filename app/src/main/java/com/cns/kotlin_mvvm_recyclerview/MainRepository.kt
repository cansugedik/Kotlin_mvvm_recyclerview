package com.cns.kotlin_mvvm_recyclerview

import retrofit2.Call

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()

}