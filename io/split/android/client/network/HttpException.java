package io.split.android.client.network;

public class HttpException extends Exception {
    public HttpException(String str) {
        super("HttpException: ".concat(String.valueOf(str)));
    }
}
