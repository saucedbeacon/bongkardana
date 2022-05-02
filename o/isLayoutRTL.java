package o;

import android.annotation.SuppressLint;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint({"Assert", "UseValueOf"})
public class isLayoutRTL extends Draft {
    static final /* synthetic */ boolean isInside = (!isLayoutRTL.class.desiredAssertionStatus());
    private final Random IsOverlapping = new Random();
    private ByteBuffer equals;
    private Framedata toIntRange = null;

    class setMax extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public setMax(int i) {
            this.preferedsize = i;
        }

        public final int getPreferedSize() {
            return this.preferedsize;
        }
    }

    public static int length(resolveIsInfinite resolveisinfinite) {
        String min = resolveisinfinite.getMin(HttpHeaders.SEC_WEBSOCKET_VERSION);
        if (min.length() > 0) {
            try {
                return new Integer(min.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final Draft.HandshakeState getMin(computeScrollRange computescrollrange, collectInitialPrefetchPositions collectinitialprefetchpositions) throws InvalidHandshakeException {
        if (!computescrollrange.setMax(HttpHeaders.SEC_WEBSOCKET_KEY) || !collectinitialprefetchpositions.setMax(HttpHeaders.SEC_WEBSOCKET_ACCEPT)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (setMax(computescrollrange.getMin(HttpHeaders.SEC_WEBSOCKET_KEY)).equals(collectinitialprefetchpositions.getMin(HttpHeaders.SEC_WEBSOCKET_ACCEPT))) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public Draft.HandshakeState getMax(computeScrollRange computescrollrange) throws InvalidHandshakeException {
        int length = length((resolveIsInfinite) computescrollrange);
        if (length == 7 || length == 8) {
            return getMin((resolveIsInfinite) computescrollrange) ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public final ByteBuffer setMin(Framedata framedata) {
        ByteBuffer min = framedata.getMin();
        int i = 0;
        boolean z = this.setMax == WebSocket.Role.CLIENT;
        int i2 = min.remaining() <= 125 ? 1 : min.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + min.remaining());
        byte b = Byte.MIN_VALUE;
        allocate.put((byte) (((byte) (framedata.setMax() ? -128 : 0)) | getMax(framedata.toFloatRange())));
        byte[] max = setMax((long) min.remaining(), i2);
        if (isInside || max.length == i2) {
            if (i2 == 1) {
                byte b2 = max[0];
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b2 | b));
            } else if (i2 == 2) {
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b | 126));
                allocate.put(max);
            } else if (i2 == 8) {
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b | Byte.MAX_VALUE));
                allocate.put(max);
            } else {
                throw new RuntimeException("Size representation not supported/specified");
            }
            if (z) {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(this.IsOverlapping.nextInt());
                allocate.put(allocate2.array());
                while (min.hasRemaining()) {
                    allocate.put((byte) (min.get() ^ allocate2.get(i % 4)));
                    i++;
                }
            } else {
                allocate.put(min);
            }
            if (isInside || allocate.remaining() == 0) {
                allocate.flip();
                return allocate;
            }
            throw new AssertionError(allocate.remaining());
        }
        throw new AssertionError();
    }

    private static byte getMax(Framedata.Opcode opcode) {
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return 10;
        }
        StringBuilder sb = new StringBuilder("Don't know how to handle ");
        sb.append(opcode.toString());
        throw new RuntimeException(sb.toString());
    }

    private static String setMax(String str) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(trim);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        String obj = sb.toString();
        try {
            return getInitialPrefetchItemCount.setMax(MessageDigest.getInstance("SHA1").digest(obj.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public scrollVerticallyBy length(scrollVerticallyBy scrollverticallyby) {
        scrollverticallyby.length(HttpHeaders.UPGRADE, "websocket");
        scrollverticallyby.length(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        scrollverticallyby.length(HttpHeaders.SEC_WEBSOCKET_VERSION, PrepareException.ERROR_AUTH_FAIL);
        byte[] bArr = new byte[16];
        this.IsOverlapping.nextBytes(bArr);
        scrollverticallyby.length(HttpHeaders.SEC_WEBSOCKET_KEY, getInitialPrefetchItemCount.setMax(bArr));
        return scrollverticallyby;
    }

    public final updateLayoutState length(computeScrollRange computescrollrange, scrollBy scrollby) throws InvalidHandshakeException {
        scrollby.length(HttpHeaders.UPGRADE, "websocket");
        scrollby.length(HttpHeaders.CONNECTION, computescrollrange.getMin(HttpHeaders.CONNECTION));
        scrollby.length("Switching Protocols");
        String min = computescrollrange.getMin(HttpHeaders.SEC_WEBSOCKET_KEY);
        if (min != null) {
            scrollby.length(HttpHeaders.SEC_WEBSOCKET_ACCEPT, setMax(min));
            return scrollby;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    private static byte[] setMax(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    public final List<Framedata> setMax(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.equals == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.equals.remaining();
                if (remaining2 > remaining) {
                    this.equals.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.equals.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(getMin((ByteBuffer) this.equals.duplicate().position(0)));
                this.equals = null;
            } catch (setMax e) {
                this.equals.limit();
                int preferedSize = e.getPreferedSize();
                if (preferedSize >= 0) {
                    ByteBuffer allocate = ByteBuffer.allocate(preferedSize);
                    if (isInside || allocate.limit() > this.equals.limit()) {
                        this.equals.rewind();
                        allocate.put(this.equals);
                        this.equals = allocate;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw new InvalidDataException(1002, "Negative count");
                }
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(getMin(byteBuffer));
            } catch (setMax e2) {
                byteBuffer.reset();
                int preferedSize2 = e2.getPreferedSize();
                if (preferedSize2 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(preferedSize2);
                    this.equals = allocate2;
                    allocate2.put(byteBuffer);
                } else {
                    throw new InvalidDataException(1002, "Negative count");
                }
            }
        }
        return linkedList;
    }

    private Framedata getMin(ByteBuffer byteBuffer) throws setMax, InvalidDataException {
        Framedata.Opcode opcode;
        computeScrollExtent computescrollextent;
        int remaining = byteBuffer.remaining();
        int i = 2;
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            byte b2 = (byte) ((b & Byte.MAX_VALUE) >> 4);
            if (b2 == 0) {
                byte b3 = byteBuffer.get();
                boolean z2 = (b3 & Byte.MIN_VALUE) != 0;
                int i2 = (byte) (b3 & Byte.MAX_VALUE);
                byte b4 = (byte) (b & Ascii.SI);
                if (b4 == 0) {
                    opcode = Framedata.Opcode.CONTINUOUS;
                } else if (b4 == 1) {
                    opcode = Framedata.Opcode.TEXT;
                } else if (b4 != 2) {
                    switch (b4) {
                        case 8:
                            opcode = Framedata.Opcode.CLOSING;
                            break;
                        case 9:
                            opcode = Framedata.Opcode.PING;
                            break;
                        case 10:
                            opcode = Framedata.Opcode.PONG;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder("unknow optcode ");
                            sb.append((short) b4);
                            throw new InvalidFrameException(sb.toString());
                    }
                } else {
                    opcode = Framedata.Opcode.BINARY;
                }
                if (z || !(opcode == Framedata.Opcode.PING || opcode == Framedata.Opcode.PONG || opcode == Framedata.Opcode.CLOSING)) {
                    if (i2 < 0 || i2 > 125) {
                        if (opcode == Framedata.Opcode.PING || opcode == Framedata.Opcode.PONG || opcode == Framedata.Opcode.CLOSING) {
                            throw new InvalidFrameException("more than 125 octets");
                        } else if (i2 == 126) {
                            if (remaining >= 4) {
                                byte[] bArr = new byte[3];
                                bArr[1] = byteBuffer.get();
                                bArr[2] = byteBuffer.get();
                                i2 = new BigInteger(bArr).intValue();
                                i = 4;
                            } else {
                                throw new setMax(4);
                            }
                        } else if (remaining >= 10) {
                            byte[] bArr2 = new byte[8];
                            for (int i3 = 0; i3 < 8; i3++) {
                                bArr2[i3] = byteBuffer.get();
                            }
                            long longValue = new BigInteger(bArr2).longValue();
                            if (longValue <= 2147483647L) {
                                i2 = (int) longValue;
                                i = 10;
                            } else {
                                throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                            }
                        } else {
                            throw new setMax(10);
                        }
                    }
                    int i4 = i + (z2 ? 4 : 0) + i2;
                    if (remaining < i4) {
                        throw new setMax(i4);
                    } else if (i2 >= 0) {
                        ByteBuffer allocate = ByteBuffer.allocate(i2);
                        if (z2) {
                            byte[] bArr3 = new byte[4];
                            byteBuffer.get(bArr3);
                            for (int i5 = 0; i5 < i2; i5++) {
                                allocate.put((byte) (byteBuffer.get() ^ bArr3[i5 % 4]));
                            }
                        } else {
                            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                            byteBuffer.position(byteBuffer.position() + allocate.limit());
                        }
                        if (opcode == Framedata.Opcode.CLOSING) {
                            computescrollextent = new scrollHorizontallyBy();
                        } else {
                            computescrollextent = new computeScrollOffset();
                            computescrollextent.setMin(z);
                            computescrollextent.setMax(opcode);
                        }
                        allocate.flip();
                        computescrollextent.setMax(allocate);
                        return computescrollextent;
                    } else {
                        throw new InvalidDataException(1002, "Negative count");
                    }
                } else {
                    throw new InvalidFrameException("control frames may no be fragmented");
                }
            } else {
                throw new InvalidFrameException("bad rsv ".concat(String.valueOf(b2)));
            }
        } else {
            throw new setMax(2);
        }
    }

    public final void length() {
        this.equals = null;
    }

    public Draft getMax() {
        return new isLayoutRTL();
    }

    public final Draft.CloseHandshakeType setMax() {
        return Draft.CloseHandshakeType.TWOWAY;
    }
}
