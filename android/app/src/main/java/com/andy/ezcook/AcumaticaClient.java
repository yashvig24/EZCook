package com.andy.ezcook;

import android.content.Context;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Andy on 3/24/2018.
 */

public class AcumaticaClient {

    private static String baseUrl = "https://hackathon.acumatica.com/";

    private static AddCookieInterceptor addCookiesInterceptor;
    private static RecieveCookiesInterceptor receivedCookiesInterceptor;
    private static HttpLoggingInterceptor interceptor;
    private static HttpRequest httpRequestService;

    public static HttpRequest getBbcService(Context context) {
        if (httpRequestService == null) {
            OkHttpClient.Builder builder = UnsafeOkHttpClient.getUnsafeOkHttpClientBuilder();
            if (addCookiesInterceptor == null) {
                addCookiesInterceptor = new AddCookieInterceptor(context);
            }

            if (receivedCookiesInterceptor == null) {
                receivedCookiesInterceptor = new RecieveCookiesInterceptor(context);
            }

            if (httpRequestService == null) {
                interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            }

            builder.addInterceptor(addCookiesInterceptor);
            builder.addInterceptor(receivedCookiesInterceptor);
            builder.addInterceptor(interceptor);

            OkHttpClient client = builder.build();

            Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).client(client).addConverterFactory(GsonConverterFactory.create()).build();
            httpRequestService = retrofit.create(HttpRequest.class);
        }
        return httpRequestService;
    }
}
