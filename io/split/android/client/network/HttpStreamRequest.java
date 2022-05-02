package io.split.android.client.network;

public interface HttpStreamRequest {
    void addHeader(String str, String str2);

    void close();

    HttpStreamResponse execute() throws HttpException;
}
