package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class Encoding {
    private final String name;

    public static Encoding of(@NonNull String str) {
        return new Encoding(str);
    }

    public final String getName() {
        return this.name;
    }

    private Encoding(@NonNull String str) {
        if (str != null) {
            this.name = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.name.equals(((Encoding) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.name);
        sb.append("\"}");
        return sb.toString();
    }
}
