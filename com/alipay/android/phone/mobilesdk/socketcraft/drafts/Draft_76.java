package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alibaba.griver.base.common.utils.MD5Util;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.google.common.net.HttpHeaders;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Draft_76 extends Draft_75 {
    private static final byte[] closehandshake = {-1, 0};
    private boolean failed = false;
    private final Random reuseableRandom = new Random();

    public static byte[] createChallenge(String str, String str2, byte[] bArr) {
        byte[] part = getPart(str);
        byte[] part2 = getPart(str2);
        try {
            return MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5).digest(new byte[]{part[0], part[1], part[2], part[3], part2[0], part2[1], part2[2], part2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String generateKey() {
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

    private static byte[] getPart(String str) {
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

    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        if (this.failed) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        try {
            if (serverHandshake.getFieldValue("Sec-WebSocket-Origin").equals(clientHandshake.getFieldValue(HttpHeaders.ORIGIN))) {
                if (basicAccept(serverHandshake)) {
                    byte[] content = serverHandshake.getContent();
                    if (content == null || content.length == 0) {
                        throw new IncompleteHandshakeException();
                    } else if (Arrays.equals(content, createChallenge(clientHandshake.getFieldValue("Sec-WebSocket-Key1"), clientHandshake.getFieldValue("Sec-WebSocket-Key2"), clientHandshake.getContent()))) {
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

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        if (!clientHandshake.getFieldValue(HttpHeaders.UPGRADE).equals("WebSocket") || !clientHandshake.getFieldValue(HttpHeaders.CONNECTION).contains(HttpHeaders.UPGRADE) || clientHandshake.getFieldValue("Sec-WebSocket-Key1").length() <= 0 || clientHandshake.getFieldValue("Sec-WebSocket-Key2").isEmpty() || !clientHandshake.hasFieldValue(HttpHeaders.ORIGIN)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put(HttpHeaders.UPGRADE, "WebSocket");
        clientHandshakeBuilder.put(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        clientHandshakeBuilder.put("Sec-WebSocket-Key1", generateKey());
        clientHandshakeBuilder.put("Sec-WebSocket-Key2", generateKey());
        if (!clientHandshakeBuilder.hasFieldValue(HttpHeaders.ORIGIN)) {
            StringBuilder sb = new StringBuilder("random");
            sb.append(this.reuseableRandom.nextInt());
            clientHandshakeBuilder.put(HttpHeaders.ORIGIN, sb.toString());
        }
        byte[] bArr = new byte[8];
        this.reuseableRandom.nextBytes(bArr);
        clientHandshakeBuilder.setContent(bArr);
        return clientHandshakeBuilder;
    }

    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        serverHandshakeBuilder.setHttpStatusMessage("WebSocket Protocol Handshake");
        serverHandshakeBuilder.put(HttpHeaders.UPGRADE, "WebSocket");
        serverHandshakeBuilder.put(HttpHeaders.CONNECTION, clientHandshake.getFieldValue(HttpHeaders.CONNECTION));
        serverHandshakeBuilder.put("Sec-WebSocket-Origin", clientHandshake.getFieldValue(HttpHeaders.ORIGIN));
        StringBuilder sb = new StringBuilder("ws://");
        sb.append(clientHandshake.getFieldValue(HttpHeaders.HOST));
        sb.append(clientHandshake.getResourceDescriptor());
        serverHandshakeBuilder.put("Sec-WebSocket-Location", sb.toString());
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key1");
        String fieldValue2 = clientHandshake.getFieldValue("Sec-WebSocket-Key2");
        byte[] content = clientHandshake.getContent();
        if (fieldValue == null || fieldValue2 == null || content == null || content.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        serverHandshakeBuilder.setContent(createChallenge(fieldValue, fieldValue2, content));
        return serverHandshakeBuilder;
    }

    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        HandshakeBuilder translateHandshakeHttp = translateHandshakeHttp(byteBuffer, this.role);
        if ((translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Key1") || this.role == WebSocket.Role.CLIENT) && !translateHandshakeHttp.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_VERSION)) {
            byte[] bArr = new byte[(this.role == WebSocket.Role.SERVER ? 8 : 16)];
            try {
                byteBuffer.get(bArr);
                translateHandshakeHttp.setContent(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return translateHandshakeHttp;
    }

    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        List<Framedata> translateRegularFrame = super.translateRegularFrame(byteBuffer);
        if (translateRegularFrame != null) {
            return translateRegularFrame;
        }
        byteBuffer.reset();
        List<Framedata> list = this.readyframes;
        this.readingState = true;
        if (this.currentFrame == null) {
            this.currentFrame = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() <= this.currentFrame.remaining()) {
                this.currentFrame.put(byteBuffer);
                if (this.currentFrame.hasRemaining()) {
                    this.readyframes = new LinkedList();
                    return list;
                } else if (Arrays.equals(this.currentFrame.array(), closehandshake)) {
                    list.add(new CloseFrameBuilder(1000));
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

    public ByteBuffer createBinaryFrame(Framedata framedata) {
        if (framedata.getOpcode() == Framedata.Opcode.CLOSING) {
            return ByteBuffer.wrap(closehandshake);
        }
        return super.createBinaryFrame(framedata);
    }

    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.ONEWAY;
    }

    public Draft copyInstance() {
        return new Draft_76();
    }
}
