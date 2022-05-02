package com.alipay.imobile.network.quake.cache;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public interface Cache {

    public static class Entry {
        public byte[] data;
        public String dataVersion;
        public Map<String, String> extData = Collections.emptyMap();
        public long finalExpireTime;
        public long lastModified;
        public long softExpireTime;

        public boolean isExpired() {
            return this.finalExpireTime < System.currentTimeMillis();
        }

        public boolean refreshNeeded() {
            return this.softExpireTime < System.currentTimeMillis();
        }
    }

    void clear();

    Entry get(String str) throws IOException;

    void initialize();

    boolean isInitialized();

    void put(String str, Entry entry) throws IOException;

    void remove(String str);

    void setMaxSizeInBytes(int i);
}
