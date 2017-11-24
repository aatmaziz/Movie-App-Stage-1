package com.ahmedaziz.Project1.data;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;



public interface MoviesApiService
{


    @GET("/3/movie/{sort_by}")
    void getResponse(@Path("sort_by") String sort_Type, @Query("api_key") String keyVal, Callback<MovieResponse> pojo);


}
