package io.split.android.client.dtos;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class ChunkHeader {
    public static final Type CHUNK_HEADER_TYPE = new TypeToken<List<ChunkHeader>>() {
    }.getType();
    private int attempt;

    /* renamed from: id  reason: collision with root package name */
    private String f11085id;
    private long timestamp;

    public ChunkHeader(String str, int i, long j) {
        this.f11085id = str;
        this.attempt = i;
        this.timestamp = j;
    }

    public ChunkHeader(String str, int i) {
        this(str, i, 0);
    }

    public String getId() {
        return this.f11085id;
    }

    public int getAttempt() {
        return this.attempt;
    }

    public int getTimestamp() {
        return this.attempt;
    }
}
