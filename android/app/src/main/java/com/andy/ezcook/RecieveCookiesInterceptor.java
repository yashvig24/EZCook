package com.andy.ezcook;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by Andy on 3/24/2018.
 */

public class RecieveCookiesInterceptor implements Interceptor {
    private Context context;

    public RecieveCookiesInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            SharedPreferences.Editor memes = PreferenceManager.getDefaultSharedPreferences(context).edit();
            memes.putString("SESSION_STORE", originalResponse.header("Set-Cookie")).apply();
            memes.commit();
        }

        return originalResponse;
    }
}
