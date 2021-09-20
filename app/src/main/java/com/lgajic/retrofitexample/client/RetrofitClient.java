package com.lgajic.retrofitexample.client;

import com.lgajic.retrofitexample.api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String API_URL = "https://simplifiedcoding.net/demos/";
    private static RetrofitClient instance = null;

    private Api heroApi;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl(API_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();

        heroApi = retrofit.create(Api.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public Api getHeroApi() {
        return heroApi;
    }
}
