package com.example.kotlincampus.view

import com.example.kotlincampus.entity.LoginEntity
import com.example.kotlincampus.net.ApiService
import com.example.kotlincampus.net.RetrofitClient
import com.example.network.ApiResponse
import com.example.network.BaseRepository

/**
 * @Description:
 * @CreateDate: 2021/12/3 14:06
 */
class LoginRepository : BaseRepository() {
    private val mService by lazy {
        RetrofitClient.service
    }


    suspend fun login(username: String, password: String, clientType: String, clientVersion: String): ApiResponse<LoginEntity> {
        return executeHttp {
            mService.login(username, password, clientType, clientVersion)
        }
    }
}