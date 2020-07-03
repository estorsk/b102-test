package com.github.estorsk;


import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;


import java.io.IOException;


public class Controller {

    private String value;

    public void run() throws IOException {

        String URL = "http://ya.ru";


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        Link.request linkRequest = retrofit.create(Link.request.class);

        Call<String> call = linkRequest.getPage();
        Response<String> response = call.execute();
        value = response.body();

    }

    public void output() {
        System.out.println(value);
    }

}
