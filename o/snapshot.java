package o;

final class snapshot implements resize {
    public final maxSize getMin = new maxSize();
    public final entryRemoved setMax;
    boolean setMin;

    snapshot(entryRemoved entryremoved) {
        if (entryremoved != null) {
            this.setMax = entryremoved;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final maxSize setMax() {
        return this.getMin;
    }

    public final void setMax(maxSize maxsize, long j) {
        if (!this.setMin) {
            this.getMin.setMax(maxsize, j);
            getMax();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final resize getMin(String str) {
        if (!this.setMin) {
            this.getMin.setMax(str);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize setMax(byte[] bArr) {
        if (!this.setMin) {
            maxSize maxsize = this.getMin;
            if (bArr != null) {
                maxsize.setMin(bArr, 0, bArr.length);
                return getMax();
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    public final resize setMin(byte[] bArr, int i, int i2) {
        if (!this.setMin) {
            this.getMin.setMin(bArr, i, i2);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize getMin(int i) {
        if (!this.setMin) {
            this.getMin.getMin(i);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize getMax(int i) {
        if (!this.setMin) {
            this.getMin.getMax(i);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize setMax(int i) {
        if (!this.setMin) {
            this.getMin.setMax(i);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize getMin(long j) {
        if (!this.setMin) {
            this.getMin.getMin(j);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize setMax(long j) {
        if (!this.setMin) {
            this.getMin.setMax(j);
            return getMax();
        }
        throw new IllegalStateException("closed");
    }

    public final resize getMax() {
        if (!this.setMin) {
            long invoke = this.getMin.invoke();
            if (invoke > 0) {
                this.setMax.setMax(this.getMin, invoke);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.setMin) {
            if (this.getMin.setMax > 0) {
                entryRemoved entryremoved = this.setMax;
                maxSize maxsize = this.getMin;
                entryremoved.setMax(maxsize, maxsize.setMax);
            }
            this.setMax.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.setMin) {
            Throwable th = null;
            try {
                if (this.getMin.setMax > 0) {
                    this.setMax.setMax(this.getMin, this.getMin.setMax);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.setMax.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.setMin = true;
            if (th != null) {
                setPaddingLeft.getMax(th);
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
}
