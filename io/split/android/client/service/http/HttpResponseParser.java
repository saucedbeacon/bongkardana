package io.split.android.client.service.http;

public interface HttpResponseParser<T> {
    T parse(String str) throws HttpResponseParserException;
}
