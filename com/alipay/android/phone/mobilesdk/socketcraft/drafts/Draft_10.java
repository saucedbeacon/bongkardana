package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.LimitExedeedException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.NotSendableException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Base64;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Draft_10 extends Draft {
    static final /* synthetic */ boolean $assertionsDisabled = (!Draft_10.class.desiredAssertionStatus());
    private ByteBuffer incompleteframe;
    private final Random reuseableRandom = new Random();

    class IncompleteException extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public IncompleteException(int i) {
            this.preferedsize = i;
        }

        public int getPreferedSize() {
            return this.preferedsize;
        }
    }

    public static int readVersion(Handshakedata handshakedata) {
        String fieldValue = handshakedata.getFieldValue(HttpHeaders.SEC_WEBSOCKET_VERSION);
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        if (!clientHandshake.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY) || !serverHandshake.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_ACCEPT)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (generateFinalKey(clientHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY)).equals(serverHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_ACCEPT))) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        int readVersion = readVersion(clientHandshake);
        if (readVersion == 7 || readVersion == 8) {
            return basicAccept(clientHandshake) ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public ByteBuffer createBinaryFrame(Framedata framedata) {
        ByteBuffer payloadData = framedata.getPayloadData();
        int i = 0;
        boolean z = this.role == WebSocket.Role.CLIENT;
        int i2 = payloadData.remaining() <= 125 ? 1 : payloadData.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + payloadData.remaining());
        byte b = Byte.MIN_VALUE;
        allocate.put((byte) (((byte) (framedata.isFin() ? -128 : 0)) | fromOpcode(framedata.getOpcode())));
        byte[] byteArray = toByteArray((long) payloadData.remaining(), i2);
        if ($assertionsDisabled || byteArray.length == i2) {
            if (i2 == 1) {
                byte b2 = byteArray[0];
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b2 | b));
            } else if (i2 == 2) {
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b | 126));
                allocate.put(byteArray);
            } else if (i2 == 8) {
                if (!z) {
                    b = 0;
                }
                allocate.put((byte) (b | Byte.MAX_VALUE));
                allocate.put(byteArray);
            } else {
                throw new RuntimeException("Size representation not supported/specified");
            }
            if (z) {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(this.reuseableRandom.nextInt());
                allocate.put(allocate2.array());
                while (payloadData.hasRemaining()) {
                    allocate.put((byte) (payloadData.get() ^ allocate2.get(i % 4)));
                    i++;
                }
            } else {
                allocate.put(payloadData);
            }
            if ($assertionsDisabled || allocate.remaining() == 0) {
                allocate.flip();
                return allocate;
            }
            throw new AssertionError(allocate.remaining());
        }
        throw new AssertionError();
    }

    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(byteBuffer);
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.BINARY);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException((Throwable) e);
        }
    }

    public List<Framedata> createFrames(String str, boolean z) {
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException((Throwable) e);
        }
    }

    private byte fromOpcode(Framedata.Opcode opcode) {
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

    private String generateFinalKey(String str) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(trim);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        String obj = sb.toString();
        try {
            return Base64.encodeBytes(MessageDigest.getInstance("SHA1").digest(obj.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put(HttpHeaders.UPGRADE, "websocket");
        clientHandshakeBuilder.put(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        clientHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_VERSION, PrepareException.ERROR_AUTH_FAIL);
        byte[] bArr = new byte[16];
        this.reuseableRandom.nextBytes(bArr);
        clientHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_KEY, Base64.encodeBytes(bArr));
        return clientHandshakeBuilder;
    }

    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        serverHandshakeBuilder.put(HttpHeaders.UPGRADE, "websocket");
        serverHandshakeBuilder.put(HttpHeaders.CONNECTION, clientHandshake.getFieldValue(HttpHeaders.CONNECTION));
        serverHandshakeBuilder.setHttpStatusMessage("Switching Protocols");
        String fieldValue = clientHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY);
        if (fieldValue != null) {
            serverHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_ACCEPT, generateFinalKey(fieldValue));
            return serverHandshakeBuilder;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    private byte[] toByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    private Framedata.Opcode toOpcode(byte b) {
        if (b == 0) {
            return Framedata.Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Framedata.Opcode.TEXT;
        }
        if (b == 2) {
            return Framedata.Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Framedata.Opcode.CLOSING;
            case 9:
                return Framedata.Opcode.PING;
            case 10:
                return Framedata.Opcode.PONG;
            default:
                StringBuilder sb = new StringBuilder("unknow optcode ");
                sb.append((short) b);
                throw new InvalidFrameException(sb.toString());
        }
    }

    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        LinkedList linkedList = new LinkedList();
        if (this.incompleteframe != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.incompleteframe.remaining();
                if (remaining2 > remaining) {
                    this.incompleteframe.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.incompleteframe.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(translateSingleFrame((ByteBuffer) this.incompleteframe.duplicate().position(0)));
                this.incompleteframe = null;
            } catch (IncompleteException e) {
                this.incompleteframe.limit();
                ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(e.getPreferedSize()));
                if ($assertionsDisabled || allocate.limit() > this.incompleteframe.limit()) {
                    this.incompleteframe.rewind();
                    allocate.put(this.incompleteframe);
                    this.incompleteframe = allocate;
                    return translateFrame(byteBuffer);
                }
                throw new AssertionError();
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(translateSingleFrame(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferedSize()));
                this.incompleteframe = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public Framedata translateSingleFrame(ByteBuffer byteBuffer) {
        FrameBuilder frameBuilder;
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
                Framedata.Opcode opcode = toOpcode((byte) (b & Ascii.SI));
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
                                throw new IncompleteException(4);
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
                            throw new IncompleteException(10);
                        }
                    }
                    int i4 = i + (z2 ? 4 : 0) + i2;
                    if (remaining >= i4) {
                        ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(i2));
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
                            frameBuilder = new CloseFrameBuilder();
                        } else {
                            frameBuilder = new FramedataImpl1();
                            frameBuilder.setFin(z);
                            frameBuilder.setOptcode(opcode);
                        }
                        allocate.flip();
                        frameBuilder.setPayload(allocate);
                        return frameBuilder;
                    }
                    throw new IncompleteException(i4);
                }
                throw new InvalidFrameException("control frames may no be fragmented");
            }
            throw new InvalidFrameException("bad rsv ".concat(String.valueOf(b2)));
        }
        throw new IncompleteException(2);
    }

    public void reset() {
        this.incompleteframe = null;
    }

    public Draft copyInstance() {
        return new Draft_10();
    }

    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.TWOWAY;
    }
}
