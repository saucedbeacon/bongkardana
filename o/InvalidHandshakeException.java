package o;

import java.io.Closeable;
import java.util.Collections;
import javax.annotation.Nullable;
import o.Draft_75;
import okhttp3.Protocol;

public final class InvalidHandshakeException implements Closeable {
    @Nullable
    public volatile translateHandshake FastBitmap$CoordinateSystem;
    @Nullable
    public final InvalidHandshakeException IsOverlapping;
    @Nullable
    public final InvalidHandshakeException equals;
    public final int getMax;
    public final InvalidDataException getMin;
    public final long hashCode;
    @Nullable
    final InvalidHandshakeException isInside;
    public final String length;
    final Protocol setMax;
    @Nullable
    public final createBuffer setMin;
    public final long toDoubleRange;
    @Nullable
    public final NotSendableException toFloatRange;
    public final Draft_75 toIntRange;

    InvalidHandshakeException(getMin getmin) {
        this.getMin = getmin.setMin;
        this.setMax = getmin.getMax;
        this.getMax = getmin.getMin;
        this.length = getmin.setMax;
        this.setMin = getmin.length;
        this.toIntRange = new Draft_75(getmin.equals);
        this.toFloatRange = getmin.toIntRange;
        this.IsOverlapping = getmin.toFloatRange;
        this.isInside = getmin.isInside;
        this.equals = getmin.IsOverlapping;
        this.toDoubleRange = getmin.toString;
        this.hashCode = getmin.values;
    }

    public final boolean setMax() {
        int i = this.getMax;
        return i >= 200 && i < 300;
    }

    public final void close() {
        NotSendableException notSendableException = this.toFloatRange;
        if (notSendableException != null) {
            notSendableException.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.setMax);
        sb.append(", code=");
        sb.append(this.getMax);
        sb.append(", message=");
        sb.append(this.length);
        sb.append(", url=");
        sb.append(this.getMin.setMin);
        sb.append('}');
        return sb.toString();
    }

    public static class getMin {
        @Nullable
        public InvalidHandshakeException IsOverlapping;
        public Draft_75.length equals;
        @Nullable
        public Protocol getMax;
        public int getMin;
        @Nullable
        public InvalidHandshakeException isInside;
        @Nullable
        public createBuffer length;
        public String setMax;
        @Nullable
        public InvalidDataException setMin;
        @Nullable
        public InvalidHandshakeException toFloatRange;
        @Nullable
        public NotSendableException toIntRange;
        public long toString;
        public long values;

        public getMin() {
            this.getMin = -1;
            this.equals = new Draft_75.length();
        }

        public getMin(InvalidHandshakeException invalidHandshakeException) {
            this.getMin = -1;
            this.setMin = invalidHandshakeException.getMin;
            this.getMax = invalidHandshakeException.setMax;
            this.getMin = invalidHandshakeException.getMax;
            this.setMax = invalidHandshakeException.length;
            this.length = invalidHandshakeException.setMin;
            Draft_75 draft_75 = invalidHandshakeException.toIntRange;
            Draft_75.length length2 = new Draft_75.length();
            Collections.addAll(length2.setMin, draft_75.length);
            this.equals = length2;
            this.toIntRange = invalidHandshakeException.toFloatRange;
            this.toFloatRange = invalidHandshakeException.IsOverlapping;
            this.isInside = invalidHandshakeException.isInside;
            this.IsOverlapping = invalidHandshakeException.equals;
            this.toString = invalidHandshakeException.toDoubleRange;
            this.values = invalidHandshakeException.hashCode;
        }

        public final getMin getMax(String str, String str2) {
            this.equals.getMax(str, str2);
            return this;
        }

        public static void setMax(String str, InvalidHandshakeException invalidHandshakeException) {
            if (invalidHandshakeException.toFloatRange != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (invalidHandshakeException.IsOverlapping != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (invalidHandshakeException.isInside != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (invalidHandshakeException.equals != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public final InvalidHandshakeException length() {
            if (this.setMin == null) {
                throw new IllegalStateException("request == null");
            } else if (this.getMax == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.getMin < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.getMin);
                throw new IllegalStateException(sb.toString());
            } else if (this.setMax != null) {
                return new InvalidHandshakeException(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    @Nullable
    public final String getMax(String str) {
        String length2 = this.toIntRange.length(str);
        if (length2 != null) {
            return length2;
        }
        return null;
    }
}
