package com.example.catur.learnconsumeapi.data.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by catur on 1/2/18.
 */

public interface Api {

    @GET("cars")
    Call<JsonObject> getCarAll();
}
