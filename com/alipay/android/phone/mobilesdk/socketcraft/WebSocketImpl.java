package com.alipay.android.phone.mobilesdk.socketcraft;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_10;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_76;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.WebsocketNotConnectedException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class WebSocketImpl implements WebSocket {
    static final /* synthetic */ boolean $assertionsDisabled = (!WebSocketImpl.class.desiredAssertionStatus());
    public static boolean DEBUG = true;
    public static int RCVBUF = 16384;
    public static final String TAG = "WebSocketImpl";
    public static final List<Draft> defaultdraftlist;
    public ByteChannel channel;
    private Integer closecode;
    private Boolean closedremotely;
    private String closemessage;
    private Framedata.Opcode current_continuous_frame_opcode;
    private Draft draft;
    private volatile boolean flushandclosestate;
    private ClientHandshake handshakerequest;
    public final BlockingQueue<ByteBuffer> inQueue;
    public SelectionKey key;
    private List<Draft> knownDrafts;
    public final BlockingQueue<ByteBuffer> outQueue;
    private WebSocket.READYSTATE readystate;
    private String resourceDescriptor;
    private WebSocket.Role role;
    private ByteBuffer tmpHandshakeBytes;
    private final WebSocketListener wsl;

    static {
        ArrayList arrayList = new ArrayList(4);
        defaultdraftlist = arrayList;
        arrayList.add(new Draft_17());
        defaultdraftlist.add(new Draft_10());
        defaultdraftlist.add(new Draft_76());
        defaultdraftlist.add(new Draft_75());
    }

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.role = WebSocket.Role.SERVER;
        if (list == null || list.isEmpty()) {
            this.knownDrafts = defaultdraftlist;
        } else {
            this.knownDrafts = list;
        }
    }

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft2) {
        this.flushandclosestate = false;
        this.readystate = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.draft = null;
        this.current_continuous_frame_opcode = null;
        this.tmpHandshakeBytes = ByteBuffer.allocate(0);
        this.handshakerequest = null;
        this.closemessage = null;
        this.closecode = null;
        this.closedremotely = null;
        this.resourceDescriptor = null;
        if (webSocketListener == null || (draft2 == null && this.role == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.outQueue = new LinkedBlockingQueue();
        this.inQueue = new LinkedBlockingQueue();
        this.wsl = webSocketListener;
        this.role = WebSocket.Role.CLIENT;
        if (draft2 != null) {
            this.draft = draft2.copyInstance();
        }
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft2, Socket socket) {
        this(webSocketListener, draft2);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list, Socket socket) {
        this(webSocketListener, list);
    }

    public void decode(ByteBuffer byteBuffer) {
        if ($assertionsDisabled || byteBuffer.hasRemaining()) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("process(");
                sb.append(byteBuffer.remaining());
                sb.append("): {");
                sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
                sb.append("}");
                SCLogCatUtil.debug(TAG, sb.toString());
            }
            if (this.readystate != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
                decodeFrames(byteBuffer);
            } else if (decodeHandshake(byteBuffer)) {
                if (!$assertionsDisabled && this.tmpHandshakeBytes.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                    throw new AssertionError();
                } else if (byteBuffer.hasRemaining()) {
                    decodeFrames(byteBuffer);
                } else if (this.tmpHandshakeBytes.hasRemaining()) {
                    decodeFrames(this.tmpHandshakeBytes);
                }
            }
            if (!$assertionsDisabled && !isClosing() && !isFlushAndClose() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            return;
        }
        throw new AssertionError();
    }

    private boolean decodeHandshake(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.tmpHandshakeBytes.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.tmpHandshakeBytes.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.tmpHandshakeBytes.capacity() + byteBuffer.remaining());
                this.tmpHandshakeBytes.flip();
                allocate.put(this.tmpHandshakeBytes);
                this.tmpHandshakeBytes = allocate;
            }
            this.tmpHandshakeBytes.put(byteBuffer);
            this.tmpHandshakeBytes.flip();
            byteBuffer2 = this.tmpHandshakeBytes;
        }
        byteBuffer2.mark();
        try {
            if (this.draft == null && isFlashEdgeCase(byteBuffer2) == Draft.HandshakeState.MATCHED) {
                try {
                    write(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(this.wsl.getFlashPolicy(this))));
                    close(-3, "");
                } catch (InvalidDataException unused) {
                    close(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
                }
                return false;
            }
            try {
                if (this.role != WebSocket.Role.SERVER) {
                    if (this.role == WebSocket.Role.CLIENT) {
                        this.draft.setParseMode(this.role);
                        Handshakedata translateHandshake = this.draft.translateHandshake(byteBuffer2);
                        if (!(translateHandshake instanceof ServerHandshake)) {
                            flushAndClose(1002, "wrong http function", false);
                            return false;
                        }
                        ServerHandshake serverHandshake = (ServerHandshake) translateHandshake;
                        if (this.draft.acceptHandshakeAsClient(this.handshakerequest, serverHandshake) == Draft.HandshakeState.MATCHED) {
                            try {
                                this.wsl.onWebsocketHandshakeReceivedAsClient(this, this.handshakerequest, serverHandshake);
                                open(serverHandshake);
                                return true;
                            } catch (InvalidDataException e) {
                                flushAndClose(e.getCloseCode(), e.getMessage(), false);
                                return false;
                            } catch (RuntimeException e2) {
                                this.wsl.onWebsocketError(this, e2);
                                flushAndClose(-1, e2.getMessage(), false);
                                return false;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("draft ");
                            sb.append(this.draft);
                            sb.append(" refuses handshake");
                            close(1002, sb.toString());
                        }
                    }
                    return false;
                } else if (this.draft == null) {
                    for (Draft copyInstance : this.knownDrafts) {
                        Draft copyInstance2 = copyInstance.copyInstance();
                        try {
                            copyInstance2.setParseMode(this.role);
                            byteBuffer2.reset();
                            Handshakedata translateHandshake2 = copyInstance2.translateHandshake(byteBuffer2);
                            if (!(translateHandshake2 instanceof ClientHandshake)) {
                                flushAndClose(1002, "wrong http function", false);
                                return false;
                            }
                            ClientHandshake clientHandshake = (ClientHandshake) translateHandshake2;
                            if (copyInstance2.acceptHandshakeAsServer(clientHandshake) == Draft.HandshakeState.MATCHED) {
                                this.resourceDescriptor = clientHandshake.getResourceDescriptor();
                                try {
                                    write(copyInstance2.createHandshake(copyInstance2.postProcessHandshakeResponseAsServer(clientHandshake, this.wsl.onWebsocketHandshakeReceivedAsServer(this, copyInstance2, clientHandshake)), this.role));
                                    this.draft = copyInstance2;
                                    open(clientHandshake);
                                    return true;
                                } catch (InvalidDataException e3) {
                                    flushAndClose(e3.getCloseCode(), e3.getMessage(), false);
                                    return false;
                                } catch (RuntimeException e4) {
                                    this.wsl.onWebsocketError(this, e4);
                                    flushAndClose(-1, e4.getMessage(), false);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } catch (InvalidHandshakeException unused2) {
                        }
                    }
                    if (this.draft == null) {
                        close(1002, "no draft matches");
                    }
                    return false;
                } else {
                    Handshakedata translateHandshake3 = this.draft.translateHandshake(byteBuffer2);
                    if (!(translateHandshake3 instanceof ClientHandshake)) {
                        flushAndClose(1002, "wrong http function", false);
                        return false;
                    }
                    ClientHandshake clientHandshake2 = (ClientHandshake) translateHandshake3;
                    if (this.draft.acceptHandshakeAsServer(clientHandshake2) == Draft.HandshakeState.MATCHED) {
                        open(clientHandshake2);
                        return true;
                    }
                    close(1002, "the handshake did finaly not match");
                    return false;
                }
            } catch (InvalidHandshakeException e5) {
                close((InvalidDataException) e5);
            }
        } catch (IncompleteHandshakeException e6) {
            if (this.tmpHandshakeBytes.capacity() == 0) {
                byteBuffer2.reset();
                int preferedSize = e6.getPreferedSize();
                if (preferedSize == 0) {
                    preferedSize = byteBuffer2.capacity() + 16;
                } else if (!$assertionsDisabled && e6.getPreferedSize() < byteBuffer2.remaining()) {
                    throw new AssertionError();
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(preferedSize);
                this.tmpHandshakeBytes = allocate2;
                allocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.tmpHandshakeBytes;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.tmpHandshakeBytes;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
    }

    private void decodeFrames(ByteBuffer byteBuffer) {
        try {
            for (Framedata next : this.draft.translateFrame(byteBuffer)) {
                if (DEBUG) {
                    SCLogCatUtil.debug(TAG, "matched frame: ".concat(String.valueOf(next)));
                }
                Framedata.Opcode opcode = next.getOpcode();
                boolean isFin = next.isFin();
                if (opcode == Framedata.Opcode.CLOSING) {
                    int i = 1005;
                    String str = "";
                    if (next instanceof CloseFrame) {
                        CloseFrame closeFrame = (CloseFrame) next;
                        i = closeFrame.getCloseCode();
                        str = closeFrame.getMessage();
                    }
                    if (this.readystate == WebSocket.READYSTATE.CLOSING) {
                        closeConnection(i, str, true);
                    } else if (this.draft.getCloseHandshakeType() == Draft.CloseHandshakeType.TWOWAY) {
                        close(i, str, true);
                    } else {
                        flushAndClose(i, str, false);
                    }
                } else if (opcode == Framedata.Opcode.PING) {
                    this.wsl.onWebsocketPing(this, next);
                } else if (opcode == Framedata.Opcode.PONG) {
                    this.wsl.onWebsocketPong(this, next);
                } else {
                    if (isFin) {
                        if (opcode != Framedata.Opcode.CONTINUOUS) {
                            if (this.current_continuous_frame_opcode != null) {
                                throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                            } else if (opcode == Framedata.Opcode.TEXT) {
                                try {
                                    this.wsl.onWebsocketMessage((WebSocket) this, Charsetfunctions.stringUtf8(next.getPayloadData()));
                                } catch (RuntimeException e) {
                                    this.wsl.onWebsocketError(this, e);
                                }
                            } else if (opcode == Framedata.Opcode.BINARY) {
                                try {
                                    this.wsl.onWebsocketMessage((WebSocket) this, next.getPayloadData());
                                } catch (RuntimeException e2) {
                                    this.wsl.onWebsocketError(this, e2);
                                }
                            } else {
                                throw new InvalidDataException(1002, "non control or continious frame expected");
                            }
                        }
                    }
                    if (opcode != Framedata.Opcode.CONTINUOUS) {
                        if (this.current_continuous_frame_opcode == null) {
                            this.current_continuous_frame_opcode = opcode;
                        } else {
                            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                        }
                    } else if (isFin) {
                        if (this.current_continuous_frame_opcode != null) {
                            this.current_continuous_frame_opcode = null;
                        } else {
                            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                        }
                    } else if (this.current_continuous_frame_opcode == null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                    try {
                        this.wsl.onWebsocketMessageFragment(this, next);
                    } catch (RuntimeException e3) {
                        this.wsl.onWebsocketError(this, e3);
                    }
                }
            }
        } catch (InvalidDataException e4) {
            this.wsl.onWebsocketError(this, e4);
            close(e4);
        }
    }

    private void close(int i, String str, boolean z) {
        if (this.readystate != WebSocket.READYSTATE.CLOSING && this.readystate != WebSocket.READYSTATE.CLOSED) {
            if (this.readystate == WebSocket.READYSTATE.OPEN) {
                if (i != 1006) {
                    if (this.draft.getCloseHandshakeType() != Draft.CloseHandshakeType.NONE) {
                        if (!z) {
                            try {
                                this.wsl.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                try {
                                    this.wsl.onWebsocketError(this, e);
                                } catch (InvalidDataException e2) {
                                    this.wsl.onWebsocketError(this, e2);
                                    flushAndClose(1006, "generated frame is invalid", false);
                                }
                            }
                        }
                        sendFrame(new CloseFrameBuilder(i, str));
                    }
                    flushAndClose(i, str, z);
                } else if ($assertionsDisabled || !z) {
                    this.readystate = WebSocket.READYSTATE.CLOSING;
                    flushAndClose(i, str, false);
                    return;
                } else {
                    throw new AssertionError();
                }
            } else if (i != -3) {
                flushAndClose(-1, str, false);
            } else if ($assertionsDisabled || z) {
                flushAndClose(-3, str, true);
            } else {
                throw new AssertionError();
            }
            if (i == 1002) {
                flushAndClose(i, str, z);
            }
            this.readystate = WebSocket.READYSTATE.CLOSING;
            this.tmpHandshakeBytes = null;
        }
    }

    public void close(int i, String str) {
        close(i, str, false);
    }

    /* access modifiers changed from: protected */
    public synchronized void closeConnection(int i, String str, boolean z) {
        if (this.readystate != WebSocket.READYSTATE.CLOSED) {
            if (this.key != null) {
                this.key.cancel();
            }
            if (this.channel != null) {
                try {
                    this.channel.close();
                } catch (IOException e) {
                    this.wsl.onWebsocketError(this, e);
                }
            }
            try {
                this.wsl.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.wsl.onWebsocketError(this, e2);
            }
            if (this.draft != null) {
                this.draft.reset();
            }
            this.handshakerequest = null;
            this.readystate = WebSocket.READYSTATE.CLOSED;
            this.outQueue.clear();
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    public void closeConnection(int i, boolean z) {
        closeConnection(i, "", z);
    }

    public void closeConnection() {
        if (this.closedremotely != null) {
            closeConnection(this.closecode.intValue(), this.closemessage, this.closedremotely.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    public void closeConnection(int i, String str) {
        closeConnection(i, str, false);
    }

    /* access modifiers changed from: protected */
    public synchronized void flushAndClose(int i, String str, boolean z) {
        int i2;
        if (str != null) {
            try {
                i2 = str.length();
            } catch (RuntimeException e) {
                this.wsl.onWebsocketError(this, e);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            i2 = 0;
        }
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(-691134970, oncanceled);
            onCancelLoad.getMin(-691134970, oncanceled);
        }
        if (!this.flushandclosestate) {
            this.closecode = Integer.valueOf(i);
            this.closemessage = str;
            this.closedremotely = Boolean.valueOf(z);
            this.flushandclosestate = true;
            this.wsl.onWriteDemand(this);
            this.wsl.onWebsocketClosing(this, i, str, z);
            if (this.draft != null) {
                this.draft.reset();
            }
            this.handshakerequest = null;
        }
    }

    public void eot() {
        if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            closeConnection(-1, true);
        } else if (this.flushandclosestate) {
            closeConnection(this.closecode.intValue(), this.closemessage, this.closedremotely.booleanValue());
        } else if (this.draft.getCloseHandshakeType() == Draft.CloseHandshakeType.NONE) {
            closeConnection(1000, true);
        } else if (this.draft.getCloseHandshakeType() != Draft.CloseHandshakeType.ONEWAY || this.role == WebSocket.Role.SERVER) {
            closeConnection(1006, true);
        } else {
            closeConnection(1000, true);
        }
    }

    public void close(int i) {
        close(i, "", false);
    }

    public void close(InvalidDataException invalidDataException) {
        close(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    public void send(String str) {
        if (str != null) {
            send((Collection<Framedata>) this.draft.createFrames(str, this.role == WebSocket.Role.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            send((Collection<Framedata>) this.draft.createFrames(byteBuffer, this.role == WebSocket.Role.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public void send(byte[] bArr) {
        send(ByteBuffer.wrap(bArr));
    }

    private void send(Collection<Framedata> collection) {
        if (isOpen()) {
            for (Framedata sendFrame : collection) {
                sendFrame(sendFrame);
            }
            return;
        }
        throw new WebsocketNotConnectedException();
    }

    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        send((Collection<Framedata>) this.draft.continuousFrame(opcode, byteBuffer, z));
    }

    public void sendFrame(Framedata framedata) {
        if (DEBUG) {
            SCLogCatUtil.debug(TAG, "send frame: ".concat(String.valueOf(framedata)));
        }
        write(this.draft.createBinaryFrame(framedata));
    }

    public boolean hasBufferedData() {
        return !this.outQueue.isEmpty();
    }

    private Draft.HandshakeState isFlashEdgeCase(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        if (byteBuffer.limit() > Draft.FLASH_POLICY_REQUEST.length) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (byteBuffer.limit() >= Draft.FLASH_POLICY_REQUEST.length) {
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                if (Draft.FLASH_POLICY_REQUEST[i] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return Draft.HandshakeState.NOT_MATCHED;
                }
                i++;
            }
            return Draft.HandshakeState.MATCHED;
        }
        throw new IncompleteHandshakeException(Draft.FLASH_POLICY_REQUEST.length);
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) {
        if ($assertionsDisabled || this.readystate != WebSocket.READYSTATE.CONNECTING) {
            this.handshakerequest = this.draft.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
            String resourceDescriptor2 = clientHandshakeBuilder.getResourceDescriptor();
            this.resourceDescriptor = resourceDescriptor2;
            if ($assertionsDisabled || resourceDescriptor2 != null) {
                try {
                    this.wsl.onWebsocketHandshakeSentAsClient(this, this.handshakerequest);
                    write(this.draft.createHandshake(this.handshakerequest, this.role));
                } catch (InvalidDataException unused) {
                    throw new InvalidHandshakeException("Handshake data rejected by client.");
                } catch (RuntimeException e) {
                    this.wsl.onWebsocketError(this, e);
                    throw new InvalidHandshakeException("rejected because of".concat(String.valueOf(e)));
                }
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError("shall only be called once");
        }
    }

    private void write(ByteBuffer byteBuffer) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append("}");
            SCLogCatUtil.debug(TAG, sb.toString());
        }
        this.outQueue.add(byteBuffer);
        this.wsl.onWriteDemand(this);
    }

    private void write(List<ByteBuffer> list) {
        for (ByteBuffer write : list) {
            write(write);
        }
    }

    private void open(Handshakedata handshakedata) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("open using draft: ");
            sb.append(this.draft.getClass().getSimpleName());
            SCLogCatUtil.debug(TAG, sb.toString());
        }
        this.readystate = WebSocket.READYSTATE.OPEN;
        try {
            this.wsl.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.wsl.onWebsocketError(this, e);
        }
    }

    public boolean isConnecting() {
        if ($assertionsDisabled || !this.flushandclosestate || this.readystate == WebSocket.READYSTATE.CONNECTING) {
            return this.readystate == WebSocket.READYSTATE.CONNECTING;
        }
        throw new AssertionError();
    }

    public boolean isOpen() {
        if ($assertionsDisabled || this.readystate != WebSocket.READYSTATE.OPEN || !this.flushandclosestate) {
            return this.readystate == WebSocket.READYSTATE.OPEN;
        }
        throw new AssertionError();
    }

    public boolean isClosing() {
        return this.readystate == WebSocket.READYSTATE.CLOSING;
    }

    public boolean isFlushAndClose() {
        return this.flushandclosestate;
    }

    public boolean isClosed() {
        return this.readystate == WebSocket.READYSTATE.CLOSED;
    }

    public WebSocket.READYSTATE getReadyState() {
        return this.readystate;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public InetSocketAddress getRemoteSocketAddress() {
        return this.wsl.getRemoteSocketAddress(this);
    }

    public InetSocketAddress getLocalSocketAddress() {
        return this.wsl.getLocalSocketAddress(this);
    }

    public Draft getDraft() {
        return this.draft;
    }

    public void close() {
        close(1000);
    }

    public String getResourceDescriptor() {
        return this.resourceDescriptor;
    }
}
