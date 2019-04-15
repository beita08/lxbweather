package com.mliuxb.lxbweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/4/15 15:49
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String url, okhttp3.Callback callback) {
        //OkHttp之GET异步请求
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
}

        /*
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.w(TAG, "onFailure: call =" + call.toString() + ", e = " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String responseContent = response.body().string();
                    Log.w(TAG, "run: response.code() = " + response.code());
                    Log.w(TAG, "run: response.message() = " + response.message());
                    Log.w(TAG, "run: response.body().string() = " + responseContent);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            webView.loadData(responseContent, "text/html", "UTF-8");
                        }
                    });
                } else {
                    Log.w(TAG, "onResponse: fail");
                }
            }
        });
        */