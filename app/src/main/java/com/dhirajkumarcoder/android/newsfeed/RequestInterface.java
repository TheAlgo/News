package com.dhirajkumarcoder.android.newsfeed;

/**
 * Created by DHIRAJ KUMAR JAIN on 07-11-2017.
 */


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestInterface {

    @GET("v1/articles")
    Call<NewsResponse> getJson(@Query("api_key") String apiKey);
}