package com.andy.ezcook;

import android.content.Context;
import android.preference.PreferenceManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Andy on 3/24/2018.
 */

public class AddCookieInterceptor implements Interceptor {
    public static final String PREF_COOKIES = "SESSION_STORE";

    private Context context;

    public AddCookieInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();

        String cookie = PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_COOKIES, "");

        builder.addHeader("Cookie", cookie);

        return chain.proceed(builder.build());
    }
}
