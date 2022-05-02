package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.google.common.net.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class Draft {
    public static final byte[] FLASH_POLICY_REQUEST = Charsetfunctions.utf8Bytes("<policy-file-request/>\u0000");
    public static int INITIAL_FAMESIZE = 64;
    public static int MAX_FAME_SIZE = 1000;
    protected Framedata.Opcode continuousFrameType = null;
    protected WebSocket.Role role = null;

    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public abstract HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake);

    public abstract HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake);

    public abstract Draft copyInstance();

    public abstract ByteBuffer createBinaryFrame(Framedata framedata);

    public abstract List<Framedata> createFrames(String str, boolean z);

    public abstract List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z);

    public abstract CloseHandshakeType getCloseHandshakeType();

    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder);

    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder);

    public abstract void reset();

    public abstract List<Framedata> translateFrame(ByteBuffer byteBuffer);

    public static ByteBuffer readLine(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String readStringLine(ByteBuffer byteBuffer) {
        ByteBuffer readLine = readLine(byteBuffer);
        if (readLine == null) {
            return null;
        }
        return Charsetfunctions.stringAscii(readLine.array(), 0, readLine.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder translateHandshakeHttp(java.nio.ByteBuffer r6, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role r7) {
        /*
            java.lang.String r0 = readStringLine(r6)
            if (r0 == 0) goto L_0x0074
            r1 = 3
            java.lang.String r2 = " "
            java.lang.String[] r0 = r0.split(r2, r1)
            int r2 = r0.length
            if (r2 != r1) goto L_0x006e
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r1 = com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role.CLIENT
            r2 = 2
            r3 = 1
            if (r7 != r1) goto L_0x002d
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server r7 = new com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server
            r7.<init>()
            r1 = r7
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder r1 = (com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder) r1
            r4 = r0[r3]
            short r4 = java.lang.Short.parseShort(r4)
            r1.setHttpStatus(r4)
            r0 = r0[r2]
            r1.setHttpStatusMessage(r0)
            goto L_0x0037
        L_0x002d:
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client r7 = new com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client
            r7.<init>()
            r0 = r0[r3]
            r7.setResourceDescriptor(r0)
        L_0x0037:
            java.lang.String r0 = readStringLine(r6)
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
            r7.put(r1, r0)
            goto L_0x0037
        L_0x005d:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException r6 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException
            java.lang.String r7 = "not an http header"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            return r7
        L_0x0068:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException r6 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException
            r6.<init>()
            throw r6
        L_0x006e:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException r6 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException
            r6.<init>()
            throw r6
        L_0x0074:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException r7 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException
            int r6 = r6.capacity()
            int r6 = r6 + 128
            r7.<init>(r6)
            goto L_0x0081
        L_0x0080:
            throw r7
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft.translateHandshakeHttp(java.nio.ByteBuffer, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role):com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder");
    }

    /* access modifiers changed from: protected */
    public boolean basicAccept(Handshakedata handshakedata) {
        return handshakedata.getFieldValue(HttpHeaders.UPGRADE).equalsIgnoreCase("websocket") && handshakedata.getFieldValue(HttpHeaders.CONNECTION).toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public List<Framedata> continuousFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        if (opcode == Framedata.Opcode.BINARY || opcode == Framedata.Opcode.TEXT || opcode == Framedata.Opcode.TEXT) {
            if (this.continuousFrameType != null) {
                this.continuousFrameType = Framedata.Opcode.CONTINUOUS;
            } else {
                this.continuousFrameType = opcode;
            }
            FramedataImpl1 framedataImpl1 = new FramedataImpl1(this.continuousFrameType);
            try {
                framedataImpl1.setPayload(byteBuffer);
                framedataImpl1.setFin(z);
                if (z) {
                    this.continuousFrameType = null;
                } else {
                    this.continuousFrameType = opcode;
                }
                return Collections.singletonList(framedataImpl1);
            } catch (InvalidDataException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role2) {
        return createHandshake(handshakedata, role2, true);
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role2, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (handshakedata instanceof ClientHandshake) {
            sb.append("GET ");
            sb.append(((ClientHandshake) handshakedata).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else if (handshakedata instanceof ServerHandshake) {
            StringBuilder sb2 = new StringBuilder("HTTP/1.1 101 ");
            sb2.append(((ServerHandshake) handshakedata).getHttpStatusMessage());
            sb.append(sb2.toString());
        } else {
            throw new RuntimeException("unknow role");
        }
        sb.append("\r\n");
        Iterator<String> iterateHttpFields = handshakedata.iterateHttpFields();
        while (iterateHttpFields.hasNext()) {
            String next = iterateHttpFields.next();
            String fieldValue = handshakedata.getFieldValue(next);
            sb.append(next);
            sb.append(": ");
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] asciiBytes = Charsetfunctions.asciiBytes(sb.toString());
        byte[] content = z ? handshakedata.getContent() : null;
        if (content == null) {
            i = 0;
        } else {
            i = content.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + asciiBytes.length);
        allocate.put(asciiBytes);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        return translateHandshakeHttp(byteBuffer, this.role);
    }

    public int checkAlloc(int i) {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public void setParseMode(WebSocket.Role role2) {
        this.role = role2;
    }

    public WebSocket.Role getRole() {
        return this.role;
    }
}
