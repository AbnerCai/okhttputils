package com.zhy.http.okhttp.callback;

import java.io.IOException;

import okhttp3.Response;

/**
 * @author zhy
 * @date 15/12/14.
 */
public abstract class StringCallback extends Callback<String> {

    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException {
        return response.body().string();
    }
}
