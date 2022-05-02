package io.split.android.client.service.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public interface HttpFetcher<T> {
    T execute(@NonNull Map<String, Object> map, @Nullable Map<String, String> map2) throws HttpFetcherException;
}
