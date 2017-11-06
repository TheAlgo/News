package com.dhirajkumarcoder.android.newsfeed;

/**
 * Created by DHIRAJ KUMAR JAIN on 07-11-2017.
 */


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestInterface {

    @GET("articles?apiKey=" + "d7d05286211d4d84b5c92853490021bb")
    Call<NewsResponse> getJson(@Query("source") String source, @Query("sortBy") String sortBy);
}