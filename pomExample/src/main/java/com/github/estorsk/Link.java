package com.github.estorsk;

import retrofit2.Call;
import retrofit2.http.GET;


public class Link {

    public interface request {
        @GET("/")
        Call<String> getPage();
    }

}
