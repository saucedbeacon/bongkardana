package com.mixpanel.android.java_websocket.drafts;

import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.collectAdjacentPrefetchPositions;
import o.collectInitialPrefetchPositions;
import o.computeScrollOffset;
import o.computeScrollRange;
import o.resolveIsInfinite;
import o.scrollBy;
import o.scrollVerticallyBy;
import o.updateLayoutState;

public abstract class Draft {
    public static int getMax = 1000;
    public static final byte[] length = collectAdjacentPrefetchPositions.setMin("<policy-file-request/>\u0000");
    public static int setMin = 64;
    protected Framedata.Opcode getMin = null;
    protected WebSocket.Role setMax = null;

    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public abstract HandshakeState getMax(computeScrollRange computescrollrange) throws InvalidHandshakeException;

    public abstract Draft getMax();

    public abstract HandshakeState getMin(computeScrollRange computescrollrange, collectInitialPrefetchPositions collectinitialprefetchpositions) throws InvalidHandshakeException;

    public abstract scrollVerticallyBy length(scrollVerticallyBy scrollverticallyby) throws InvalidHandshakeException;

    public abstract updateLayoutState length(computeScrollRange computescrollrange, scrollBy scrollby) throws InvalidHandshakeException;

    public abstract void length();

    public abstract CloseHandshakeType setMax();

    public abstract List<Framedata> setMax(ByteBuffer byteBuffer) throws InvalidDataException;

    public abstract ByteBuffer setMin(Framedata framedata);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.updateLayoutState setMin(java.nio.ByteBuffer r6, com.mixpanel.android.java_websocket.WebSocket.Role r7) throws com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException, com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException {
        /*
            java.lang.String r0 = getMin((java.nio.ByteBuffer) r6)
            if (r0 == 0) goto L_0x0074
            r1 = 3
            java.lang.String r2 = " "
            java.lang.String[] r0 = r0.split(r2, r1)
            int r2 = r0.length
            if (r2 != r1) goto L_0x006e
            com.mixpanel.android.java_websocket.WebSocket$Role r1 = com.mixpanel.android.java_websocket.WebSocket.Role.CLIENT
            r2 = 2
            r3 = 1
            if (r7 != r1) goto L_0x002d
            o.collectPrefetchPositionsForLayoutState r7 = new o.collectPrefetchPositionsForLayoutState
            r7.<init>()
            r1 = r7
            o.scrollBy r1 = (o.scrollBy) r1
            r4 = r0[r3]
            short r4 = java.lang.Short.parseShort(r4)
            r1.setMin(r4)
            r0 = r0[r2]
            r1.length(r0)
            goto L_0x0037
        L_0x002d:
            o.isSmoothScrollbarEnabled r7 = new o.isSmoothScrollbarEnabled
            r7.<init>()
            r0 = r0[r3]
            r7.setMin(r0)
        L_0x0037:
            java.lang.String r0 = getMin((java.nio.ByteBuffer) r6)
            if (r0 == 0) goto L_0x0065
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0065
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1, r2)
            int r1 = r0.length
            if (r1 != r2) goto L_0x005d
            r1 = 0
            r1 = r0[r1]
            r0 = r0[r3]
            java.lang.String r4 = "^ +"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replaceFirst(r4, r5)
            r7.length(r1, r0)
            goto L_0x0037
        L_0x005d:
            com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException r6 = new com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException
            java.lang.String r7 = "not an http header"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            return r7
        L_0x0068:
            com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException r6 = new com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException
            r6.<init>()
            throw r6
        L_0x006e:
            com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException r6 = new com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException
            r6.<init>()
            throw r6
        L_0x0074:
            com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException r7 = new com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException
            int r6 = r6.capacity()
            int r6 = r6 + 128
            r7.<init>(r6)
            goto L_0x0081
        L_0x0080:
            throw r7
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.java_websocket.drafts.Draft.setMin(java.nio.ByteBuffer, com.mixpanel.android.java_websocket.WebSocket$Role):o.updateLayoutState");
    }

    protected static boolean getMin(resolveIsInfinite resolveisinfinite) {
        return resolveisinfinite.getMin(HttpHeaders.UPGRADE).equalsIgnoreCase("websocket") && resolveisinfinite.getMin(HttpHeaders.CONNECTION).toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public final List<Framedata> length(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        if (opcode == Framedata.Opcode.BINARY || opcode == Framedata.Opcode.TEXT || opcode == Framedata.Opcode.TEXT) {
            if (this.getMin != null) {
                this.getMin = Framedata.Opcode.CONTINUOUS;
            } else {
                this.getMin = opcode;
            }
            computeScrollOffset computescrolloffset = new computeScrollOffset(this.getMin);
            try {
                computescrolloffset.setMax(byteBuffer);
                computescrolloffset.setMin(z);
                if (z) {
                    this.getMin = null;
                } else {
                    this.getMin = opcode;
                }
                return Collections.singletonList(computescrolloffset);
            } catch (InvalidDataException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
    }

    public static List<ByteBuffer> setMax(resolveIsInfinite resolveisinfinite) {
        return getMax(resolveisinfinite);
    }

    public static List<ByteBuffer> getMax(resolveIsInfinite resolveisinfinite) {
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (resolveisinfinite instanceof computeScrollRange) {
            sb.append("GET ");
            sb.append(((computeScrollRange) resolveisinfinite).setMin());
            sb.append(" HTTP/1.1");
        } else if (resolveisinfinite instanceof collectInitialPrefetchPositions) {
            StringBuilder sb2 = new StringBuilder("HTTP/1.1 101 ");
            sb2.append(((collectInitialPrefetchPositions) resolveisinfinite).setMin());
            sb.append(sb2.toString());
        } else {
            throw new RuntimeException("unknow role");
        }
        sb.append("\r\n");
        Iterator<String> length2 = resolveisinfinite.length();
        while (length2.hasNext()) {
            String next = length2.next();
            String min = resolveisinfinite.getMin(next);
            sb.append(next);
            sb.append(": ");
            sb.append(min);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] max = collectAdjacentPrefetchPositions.setMax(sb.toString());
        byte[] max2 = resolveisinfinite.getMax();
        if (max2 == null) {
            i = 0;
        } else {
            i = max2.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + max.length);
        allocate.put(max);
        if (max2 != null) {
            allocate.put(max2);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public resolveIsInfinite length(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return setMin(byteBuffer, this.setMax);
    }

    public final void getMin(WebSocket.Role role) {
        this.setMax = role;
    }

    private static String getMin(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b = b2;
        }
        if (allocate == null) {
            return null;
        }
        return collectAdjacentPrefetchPositions.setMax(allocate.array(), allocate.limit());
    }
}
