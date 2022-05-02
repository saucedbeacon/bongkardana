package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface schedule extends recordWsHsTime, ReadableByteChannel {
    long FastBitmap$CoordinateSystem() throws IOException;

    String Grayscale$Algorithm() throws IOException;

    byte IsOverlapping() throws IOException;

    short equals() throws IOException;

    long getCause() throws IOException;

    int getMax(recordMonitorOfRecvMsg recordmonitorofrecvmsg) throws IOException;

    long getMax(printConnMonitorLog printconnmonitorlog) throws IOException;

    long getMax(recordDnsTime recorddnstime) throws IOException;

    @Deprecated
    submitLazy getMax();

    boolean getMin(long j) throws IOException;

    long invoke() throws IOException;

    short isInside() throws IOException;

    void isInside(long j) throws IOException;

    printConnMonitorLog length(long j) throws IOException;

    schedule length();

    String setMax(long j) throws IOException;

    boolean setMax() throws IOException;

    boolean setMax(printConnMonitorLog printconnmonitorlog) throws IOException;

    long setMin(printConnMonitorLog printconnmonitorlog) throws IOException;

    InputStream setMin();

    String setMin(long j, Charset charset) throws IOException;

    String setMin(Charset charset) throws IOException;

    void setMin(long j) throws IOException;

    void setMin(byte[] bArr) throws IOException;

    int toDoubleRange() throws IOException;

    byte[] toFloatRange(long j) throws IOException;

    int toIntRange() throws IOException;

    long values() throws IOException;
}
