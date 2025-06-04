package com.example.aninterface.online;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @POST("points/save")
    Call<Void> addDataToServer(@Body DrawingItemOnline dataToServer);

    @GET("points/getAll")
    Call<List<DrawingItemOnline>> getDataFromServer();

    @DELETE("points/clear")
    Call<Void> clearAllData();
}
