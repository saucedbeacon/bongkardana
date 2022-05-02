package io.split.android.client.network;

import java.io.BufferedReader;
import org.jetbrains.annotations.Nullable;

public interface HttpStreamResponse extends BaseHttpResponse {
    @Nullable
    BufferedReader getBufferedReader();
}
