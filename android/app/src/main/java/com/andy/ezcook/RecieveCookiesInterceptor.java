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
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < originalResponse.headers().values("Set-Cookie").size(); i++) {
                String cookie = originalResponse.headers().values("Set-Cookie").get(i);
                String[] pieces = cookie.split("path=/");
                sb.append(pieces[0]);
            }

            SharedPreferences.Editor sharedpref = PreferenceManager.getDefaultSharedPreferences(context).edit();
            sharedpref.putString("SESSION_STORE", sb.toString()).apply();
            sharedpref.commit();
        }

        return originalResponse;
    }
}
