package com.example.app;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {
    @POST("studentapp/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
