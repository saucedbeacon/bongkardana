package io.split.android.client.network;

import java.net.URI;
import java.util.Map;

public interface HttpClient {
    void addHeaders(Map<String, String> map);

    void addStreamingHeaders(Map<String, String> map);

    void close();

    HttpRequest request(URI uri, HttpMethod httpMethod);

    HttpRequest request(URI uri, HttpMethod httpMethod, String str);

    HttpRequest request(URI uri, HttpMethod httpMethod, String str, Map<String, String> map);

    void setHeader(String str, String str2);

    void setStreamingHeader(String str, String str2);

    HttpStreamRequest streamRequest(URI uri);
}
