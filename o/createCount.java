package o;

import java.io.EOFException;

final class createCount implements put {
    public final maxSize getMin = new maxSize();
    public final safeSizeOf setMax;
    boolean setMin;

    createCount(safeSizeOf safesizeof) {
        if (safesizeof != null) {
            this.setMax = safesizeof;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final maxSize setMax() {
        return this.getMin;
    }

    public final long length(maxSize maxsize, long j) {
        if (maxsize == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.setMin) {
            throw new IllegalStateException("closed");
        } else if (this.getMin.setMax == 0 && this.setMax.length(this.getMin, 8192) == -1) {
            return -1;
        } else {
            return this.getMin.length(maxsize, Math.min(j, this.getMin.setMax));
        }
    }

    public final boolean length() {
        if (!this.setMin) {
            return this.getMin.length() && this.setMax.length(this.getMin, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void length(long j) {
        if (!setMax(j)) {
            throw new EOFException();
        }
    }

    private boolean setMax(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.setMin) {
            while (this.getMin.setMax < j) {
                if (this.setMax.length(this.getMin, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final byte[] FastBitmap$CoordinateSystem() {
        this.getMin.length(this.setMax);
        return this.getMin.FastBitmap$CoordinateSystem();
    }

    public final void setMin(long j) {
        if (!this.setMin) {
            while (j > 0) {
                if (this.getMin.setMax == 0 && this.setMax.length(this.getMin, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.getMin.setMax);
                this.getMin.setMin(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final long toDoubleRange() {
        return setMax((byte) 0, 0);
    }

    private long setMax(byte b, long j) {
        if (!this.setMin) {
            while (true) {
                long max = this.getMin.getMax(b, j);
                if (max != -1) {
                    return max;
                }
                long j2 = this.getMin.setMax;
                if (this.setMax.length(this.getMin, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.setMin) {
            this.setMin = true;
            this.setMax.close();
            maxSize maxsize = this.getMin;
            try {
                maxsize.setMin(maxsize.setMax);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final loadParameters setMin() {
        return this.setMax.setMin();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final byte getMin() {
        if (setMax(1)) {
            return this.getMin.getMin();
        }
        throw new EOFException();
    }

    public final evictAll getMax(long j) {
        if (setMax(j)) {
            return new evictAll(this.getMin.equals(j));
        }
        throw new EOFException();
    }

    public final byte[] equals(long j) {
        if (setMax(j)) {
            return this.getMin.equals(j);
        }
        throw new EOFException();
    }

    public final String values() {
        long max = setMax((byte) 10, 0);
        if (max != -1) {
            return this.getMin.IsOverlapping(max);
        }
        maxSize maxsize = new maxSize();
        maxSize maxsize2 = this.getMin;
        maxsize2.getMax(maxsize, 0, Math.min(32, maxsize2.setMax));
        StringBuilder sb = new StringBuilder("\\n not found: size=");
        sb.append(this.getMin.setMax);
        sb.append(" content=");
        sb.append(new evictAll(maxsize.FastBitmap$CoordinateSystem()).g());
        sb.append("…");
        throw new EOFException(sb.toString());
    }

    public final short IsOverlapping() {
        if (setMax(2)) {
            return this.getMin.IsOverlapping();
        }
        throw new EOFException();
    }

    public final short equals() {
        if (setMax(2)) {
            return this.getMin.equals();
        }
        throw new EOFException();
    }

    public final int toIntRange() {
        if (setMax(4)) {
            return this.getMin.toIntRange();
        }
        throw new EOFException();
    }

    public final int isInside() {
        if (setMax(4)) {
            return setPaddingLeft.length(this.getMin.toIntRange());
        }
        throw new EOFException();
    }

    public final long toFloatRange() {
        if (setMax(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!setMax((long) i2)) {
                    break;
                }
                byte intRange = this.getMin.toIntRange((long) i);
                if ((intRange >= 48 && intRange <= 57) || ((intRange >= 97 && intRange <= 102) || (intRange >= 65 && intRange <= 70))) {
                    i = i2;
                } else if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(intRange)}));
                }
            }
            return this.getMin.toFloatRange();
        }
        throw new EOFException();
    }
}
