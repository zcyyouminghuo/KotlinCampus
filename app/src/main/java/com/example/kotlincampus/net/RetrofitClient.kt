package com.example.kotlincampus.net

import com.example.network.RetrofitManager
import okhttp3.OkHttpClient

/**
 * @Description:
 * @CreateDate: 2021/12/3 11:27
 */
object RetrofitClient : RetrofitManager() {
    val service by lazy { getService(ApiService::class.java) }

    override fun handleBuilder(builder: OkHttpClient.Builder) = Unit
}