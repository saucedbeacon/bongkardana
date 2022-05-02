package com.ta.audid.c;

public class c {
    private boolean g = false;
    private long timestamp;
    private int version;

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public boolean isValid() {
        return this.g;
    }

    public void b(boolean z) {
        this.g = z;
    }
}
