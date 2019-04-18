package com.zhy.http.okhttp.callback;

/**
 * @author JimGong
 * @date 2016/6/23.
 */
public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
