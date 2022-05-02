package o;

import android.annotation.SuppressLint;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint({"UseValueOf"})
public final class scrollToPositionWithOffset extends createLayoutState {
    private static final byte[] toFloatRange = {-1, 0};
    private boolean equals = false;
    private final Random toString = new Random();

    private static byte[] getMax(String str, String str2, byte[] bArr) throws InvalidHandshakeException {
        byte[] min = setMin(str);
        byte[] min2 = setMin(str2);
        try {
            return MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5).digest(new byte[]{min[0], min[1], min[2], min[3], min2[0], min2[1], min2[2], min2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String setMin() {
        Random random = new Random();
        long nextInt = (long) (random.nextInt(12) + 1);
        String l = Long.toString(((long) (random.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1)) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        for (int i = 0; i < nextInt2; i++) {
            int abs = Math.abs(random.nextInt(l.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l = new StringBuilder(l).insert(abs, nextInt3).toString();
        }
        for (int i2 = 0; ((long) i2) < nextInt; i2++) {
            l = new StringBuilder(l).insert(Math.abs(random.nextInt(l.length() - 1) + 1), " ").toString();
        }
        return l;
    }

    private static byte[] setMin(String str) throws InvalidHandshakeException {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = (long) (str.split(" ").length - 1);
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) ((int) (longValue >> 24)), (byte) ((int) ((longValue << 8) >> 24)), (byte) ((int) ((longValue << 16) >> 24)), (byte) ((int) ((longValue << 24) >> 24))};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    public final Draft.HandshakeState getMin(computeScrollRange computescrollrange, collectInitialPrefetchPositions collectinitialprefetchpositions) {
        if (this.equals) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        try {
            if (collectinitialprefetchpositions.getMin("Sec-WebSocket-Origin").equals(computescrollrange.getMin(HttpHeaders.ORIGIN))) {
                if (getMin((resolveIsInfinite) collectinitialprefetchpositions)) {
                    byte[] max = collectinitialprefetchpositions.getMax();
                    if (max == null || max.length == 0) {
                        throw new IncompleteHandshakeException();
                    } else if (Arrays.equals(max, getMax(computescrollrange.getMin("Sec-WebSocket-Key1"), computescrollrange.getMin("Sec-WebSocket-Key2"), computescrollrange.getMax()))) {
                        return Draft.HandshakeState.MATCHED;
                    } else {
                        return Draft.HandshakeState.NOT_MATCHED;
                    }
                }
            }
            return Draft.HandshakeState.NOT_MATCHED;
        } catch (InvalidHandshakeException e) {
            throw new RuntimeException("bad handshakerequest", e);
        }
    }

    public final Draft.HandshakeState getMax(computeScrollRange computescrollrange) {
        if (!computescrollrange.getMin(HttpHeaders.UPGRADE).equals("WebSocket") || !computescrollrange.getMin(HttpHeaders.CONNECTION).contains(HttpHeaders.UPGRADE) || computescrollrange.getMin("Sec-WebSocket-Key1").length() <= 0 || computescrollrange.getMin("Sec-WebSocket-Key2").isEmpty() || !computescrollrange.setMax(HttpHeaders.ORIGIN)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    public final scrollVerticallyBy length(scrollVerticallyBy scrollverticallyby) {
        scrollverticallyby.length(HttpHeaders.UPGRADE, "WebSocket");
        scrollverticallyby.length(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        scrollverticallyby.length("Sec-WebSocket-Key1", setMin());
        scrollverticallyby.length("Sec-WebSocket-Key2", setMin());
        if (!scrollverticallyby.setMax(HttpHeaders.ORIGIN)) {
            StringBuilder sb = new StringBuilder("random");
            sb.append(this.toString.nextInt());
            scrollverticallyby.length(HttpHeaders.ORIGIN, sb.toString());
        }
        byte[] bArr = new byte[8];
        this.toString.nextBytes(bArr);
        scrollverticallyby.length(bArr);
        return scrollverticallyby;
    }

    public final updateLayoutState length(computeScrollRange computescrollrange, scrollBy scrollby) throws InvalidHandshakeException {
        scrollby.length("WebSocket Protocol Handshake");
        scrollby.length(HttpHeaders.UPGRADE, "WebSocket");
        scrollby.length(HttpHeaders.CONNECTION, computescrollrange.getMin(HttpHeaders.CONNECTION));
        scrollby.length("Sec-WebSocket-Origin", computescrollrange.getMin(HttpHeaders.ORIGIN));
        StringBuilder sb = new StringBuilder("ws://");
        sb.append(computescrollrange.getMin(HttpHeaders.HOST));
        sb.append(computescrollrange.setMin());
        scrollby.length("Sec-WebSocket-Location", sb.toString());
        String min = computescrollrange.getMin("Sec-WebSocket-Key1");
        String min2 = computescrollrange.getMin("Sec-WebSocket-Key2");
        byte[] max = computescrollrange.getMax();
        if (min == null || min2 == null || max == null || max.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        scrollby.length(getMax(min, min2, max));
        return scrollby;
    }

    public final resolveIsInfinite length(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        updateLayoutState min = setMin(byteBuffer, this.setMax);
        if ((min.setMax("Sec-WebSocket-Key1") || this.setMax == WebSocket.Role.CLIENT) && !min.setMax(HttpHeaders.SEC_WEBSOCKET_VERSION)) {
            byte[] bArr = new byte[(this.setMax == WebSocket.Role.SERVER ? 8 : 16)];
            try {
                byteBuffer.get(bArr);
                min.length(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return min;
    }

    public final List<Framedata> setMax(ByteBuffer byteBuffer) throws InvalidDataException {
        byteBuffer.mark();
        List<Framedata> max = super.getMax(byteBuffer);
        if (max != null) {
            return max;
        }
        byteBuffer.reset();
        List<Framedata> list = this.IsOverlapping;
        this.toIntRange = true;
        if (this.isInside == null) {
            this.isInside = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() <= this.isInside.remaining()) {
                this.isInside.put(byteBuffer);
                if (this.isInside.hasRemaining()) {
                    this.IsOverlapping = new LinkedList();
                    return list;
                } else if (Arrays.equals(this.isInside.array(), toFloatRange)) {
                    list.add(new scrollHorizontallyBy((byte) 0));
                    return list;
                } else {
                    throw new InvalidFrameException();
                }
            } else {
                throw new InvalidFrameException();
            }
        } else {
            throw new InvalidFrameException();
        }
    }

    public final ByteBuffer setMin(Framedata framedata) {
        if (framedata.toFloatRange() == Framedata.Opcode.CLOSING) {
            return ByteBuffer.wrap(toFloatRange);
        }
        return super.setMin(framedata);
    }

    public final Draft.CloseHandshakeType setMax() {
        return Draft.CloseHandshakeType.ONEWAY;
    }

    public final Draft getMax() {
        return new scrollToPositionWithOffset();
    }
}
