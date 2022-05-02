package o;

public interface resize extends entryRemoved {
    void flush();

    resize getMax();

    resize getMax(int i);

    resize getMin(int i);

    resize getMin(long j);

    resize getMin(String str);

    maxSize setMax();

    resize setMax(int i);

    resize setMax(long j);

    resize setMax(byte[] bArr);

    resize setMin(byte[] bArr, int i, int i2);
}
