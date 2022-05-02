package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.NotSendableException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.google.common.net.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class Draft_75 extends Draft {
    public static final byte CR = 13;
    public static final byte END_OF_FRAME = -1;
    public static final byte LF = 10;
    public static final byte START_OF_FRAME = 0;
    protected ByteBuffer currentFrame;
    protected boolean readingState = false;
    protected List<Framedata> readyframes = new LinkedList();
    private final Random reuseableRandom = new Random();

    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        return (!clientHandshake.getFieldValue("WebSocket-Origin").equals(serverHandshake.getFieldValue(HttpHeaders.ORIGIN)) || !basicAccept(serverHandshake)) ? Draft.HandshakeState.NOT_MATCHED : Draft.HandshakeState.MATCHED;
    }

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        if (!clientHandshake.hasFieldValue(HttpHeaders.ORIGIN) || !basicAccept(clientHandshake)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    public ByteBuffer createBinaryFrame(Framedata framedata) {
        if (framedata.getOpcode() == Framedata.Opcode.TEXT) {
            ByteBuffer payloadData = framedata.getPayloadData();
            ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + 2);
            allocate.put((byte) 0);
            payloadData.mark();
            allocate.put(payloadData);
            payloadData.reset();
            allocate.put((byte) -1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        throw new RuntimeException("not yet implemented");
    }

    public List<Framedata> createFrames(String str, boolean z) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-735550129, oncanceled);
            onCancelLoad.getMin(-735550129, oncanceled);
        }
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

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put(HttpHeaders.UPGRADE, "WebSocket");
        clientHandshakeBuilder.put(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        if (!clientHandshakeBuilder.hasFieldValue(HttpHeaders.ORIGIN)) {
            StringBuilder sb = new StringBuilder("random");
            sb.append(this.reuseableRandom.nextInt());
            clientHandshakeBuilder.put(HttpHeaders.ORIGIN, sb.toString());
        }
        return clientHandshakeBuilder;
    }

    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        serverHandshakeBuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverHandshakeBuilder.put(HttpHeaders.UPGRADE, "WebSocket");
        serverHandshakeBuilder.put(HttpHeaders.CONNECTION, clientHandshake.getFieldValue(HttpHeaders.CONNECTION));
        serverHandshakeBuilder.put("WebSocket-Origin", clientHandshake.getFieldValue(HttpHeaders.ORIGIN));
        StringBuilder sb = new StringBuilder("ws://");
        sb.append(clientHandshake.getFieldValue(HttpHeaders.HOST));
        sb.append(clientHandshake.getResourceDescriptor());
        serverHandshakeBuilder.put("WebSocket-Location", sb.toString());
        return serverHandshakeBuilder;
    }

    /* access modifiers changed from: protected */
    public List<Framedata> translateRegularFrame(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b == 0) {
                if (!this.readingState) {
                    this.readingState = true;
                } else {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
            } else if (b == -1) {
                if (this.readingState) {
                    ByteBuffer byteBuffer2 = this.currentFrame;
                    if (byteBuffer2 != null) {
                        byteBuffer2.flip();
                        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
                        framedataImpl1.setPayload(this.currentFrame);
                        framedataImpl1.setFin(true);
                        framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
                        this.readyframes.add(framedataImpl1);
                        this.currentFrame = null;
                        byteBuffer.mark();
                    }
                    this.readingState = false;
                } else {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
            } else if (!this.readingState) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.currentFrame;
                if (byteBuffer3 == null) {
                    this.currentFrame = createBuffer();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.currentFrame = increaseBuffer(this.currentFrame);
                }
                this.currentFrame.put(b);
            }
        }
        List<Framedata> list = this.readyframes;
        this.readyframes = new LinkedList();
        return list;
    }

    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        List<Framedata> translateRegularFrame = translateRegularFrame(byteBuffer);
        if (translateRegularFrame != null) {
            return translateRegularFrame;
        }
        throw new InvalidDataException(1002);
    }

    public void reset() {
        this.readingState = false;
        this.currentFrame = null;
    }

    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.NONE;
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(INITIAL_FAMESIZE);
    }

    public ByteBuffer increaseBuffer(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(byteBuffer.capacity() * 2));
        allocate.put(byteBuffer);
        return allocate;
    }

    public Draft copyInstance() {
        return new Draft_75();
    }
}
