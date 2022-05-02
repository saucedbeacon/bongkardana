package com.alipay.android.phone.mobilesdk.socketcraft;

import java.io.EOFException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

public class SSLSocketChannel2 implements WrappedByteChannel, ByteChannel {
    static final /* synthetic */ boolean $assertionsDisabled = (!SSLSocketChannel2.class.desiredAssertionStatus());
    protected static ByteBuffer emptybuffer = ByteBuffer.allocate(0);
    protected int bufferallocations = 0;
    protected ExecutorService exec;
    protected ByteBuffer inCrypt;
    protected ByteBuffer inData;
    protected ByteBuffer outCrypt;
    protected SSLEngineResult readEngineResult;
    protected SelectionKey selectionKey;
    protected SocketChannel socketChannel;
    protected SSLEngine sslEngine;
    protected List<Future<?>> tasks;
    protected SSLEngineResult writeEngineResult;

    public SSLSocketChannel2(SocketChannel socketChannel2, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey2) {
        if (socketChannel2 == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.socketChannel = socketChannel2;
        this.sslEngine = sSLEngine;
        this.exec = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.writeEngineResult = sSLEngineResult;
        this.readEngineResult = sSLEngineResult;
        this.tasks = new ArrayList(3);
        if (selectionKey2 != null) {
            selectionKey2.interestOps(selectionKey2.interestOps() | 4);
            this.selectionKey = selectionKey2;
        }
        createBuffers(sSLEngine.getSession());
        this.socketChannel.write(wrap(emptybuffer));
        processHandshake();
    }

    private void consumeFutureUninterruptible(Future<?> future) {
        boolean z = false;
        while (true) {
            try {
                future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            try {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void processHandshake() {
        /*
            r3 = this;
            monitor-enter(r3)
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x000d
            monitor-exit(r3)
            return
        L_0x000d:
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.tasks     // Catch:{ all -> 0x00df }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x003c
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.tasks     // Catch:{ all -> 0x00df }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00df }
        L_0x001b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00df }
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch:{ all -> 0x00df }
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0031
            r0.remove()     // Catch:{ all -> 0x00df }
            goto L_0x001b
        L_0x0031:
            boolean r0 = r3.isBlocking()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x003a
            r3.consumeFutureUninterruptible(r1)     // Catch:{ all -> 0x00df }
        L_0x003a:
            monitor-exit(r3)
            return
        L_0x003c:
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x0090
            boolean r0 = r3.isBlocking()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0056
            javax.net.ssl.SSLEngineResult r0 = r3.readEngineResult     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x006b
        L_0x0056:
            java.nio.ByteBuffer r0 = r3.inCrypt     // Catch:{ all -> 0x00df }
            r0.compact()     // Catch:{ all -> 0x00df }
            java.nio.channels.SocketChannel r0 = r3.socketChannel     // Catch:{ all -> 0x00df }
            java.nio.ByteBuffer r1 = r3.inCrypt     // Catch:{ all -> 0x00df }
            int r0 = r0.read(r1)     // Catch:{ all -> 0x00df }
            r1 = -1
            if (r0 == r1) goto L_0x0088
            java.nio.ByteBuffer r0 = r3.inCrypt     // Catch:{ all -> 0x00df }
            r0.flip()     // Catch:{ all -> 0x00df }
        L_0x006b:
            java.nio.ByteBuffer r0 = r3.inData     // Catch:{ all -> 0x00df }
            r0.compact()     // Catch:{ all -> 0x00df }
            r3.unwrap()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult r0 = r3.readEngineResult     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x0090
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch:{ all -> 0x00df }
            r3.createBuffers(r0)     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            return
        L_0x0088:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "connection closed unexpectedly by peer"
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x0090:
            r3.consumeDelegatedTasks()     // Catch:{ all -> 0x00df }
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.tasks     // Catch:{ all -> 0x00df }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00a5
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x00c5
        L_0x00a5:
            java.nio.channels.SocketChannel r0 = r3.socketChannel     // Catch:{ all -> 0x00df }
            java.nio.ByteBuffer r1 = emptybuffer     // Catch:{ all -> 0x00df }
            java.nio.ByteBuffer r1 = r3.wrap(r1)     // Catch:{ all -> 0x00df }
            r0.write(r1)     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult r0 = r3.writeEngineResult     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x00c5
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch:{ all -> 0x00df }
            r3.createBuffers(r0)     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            return
        L_0x00c5:
            boolean r0 = $assertionsDisabled     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00da
            javax.net.ssl.SSLEngine r0 = r3.sslEngine     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00df }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00df }
            if (r0 == r1) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00da:
            r0 = 1
            r3.bufferallocations = r0     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x00e3
        L_0x00e2:
            throw r0
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.SSLSocketChannel2.processHandshake():void");
    }

    private synchronized ByteBuffer wrap(ByteBuffer byteBuffer) {
        this.outCrypt.compact();
        this.writeEngineResult = this.sslEngine.wrap(byteBuffer, this.outCrypt);
        this.outCrypt.flip();
        return this.outCrypt;
    }

    private synchronized ByteBuffer unwrap() {
        while (true) {
            int remaining = this.inData.remaining();
            SSLEngineResult unwrap = this.sslEngine.unwrap(this.inCrypt, this.inData);
            this.readEngineResult = unwrap;
            if (unwrap.getStatus() != SSLEngineResult.Status.OK || (remaining == this.inData.remaining() && this.sslEngine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                this.inData.flip();
            }
        }
        this.inData.flip();
        return this.inData;
    }

    /* access modifiers changed from: protected */
    public void consumeDelegatedTasks() {
        while (true) {
            Runnable delegatedTask = this.sslEngine.getDelegatedTask();
            if (delegatedTask != null) {
                this.tasks.add(this.exec.submit(delegatedTask));
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void createBuffers(SSLSession sSLSession) {
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.inData;
        if (byteBuffer == null) {
            this.inData = ByteBuffer.allocate(max);
            this.outCrypt = ByteBuffer.allocate(packetBufferSize);
            this.inCrypt = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.inData = ByteBuffer.allocate(max);
            }
            if (this.outCrypt.capacity() != packetBufferSize) {
                this.outCrypt = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.inCrypt.capacity() != packetBufferSize) {
                this.inCrypt = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.inData.rewind();
        this.inData.flip();
        this.inCrypt.rewind();
        this.inCrypt.flip();
        this.outCrypt.rewind();
        this.outCrypt.flip();
        this.bufferallocations++;
    }

    public int write(ByteBuffer byteBuffer) {
        if (!isHandShakeComplete()) {
            processHandshake();
            return 0;
        }
        int write = this.socketChannel.write(wrap(byteBuffer));
        if (this.writeEngineResult.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    public int read(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!isHandShakeComplete()) {
            if (isBlocking()) {
                while (!isHandShakeComplete()) {
                    processHandshake();
                }
            } else {
                processHandshake();
                if (!isHandShakeComplete()) {
                    return 0;
                }
            }
        }
        int readRemaining = readRemaining(byteBuffer);
        if (readRemaining != 0) {
            return readRemaining;
        }
        if ($assertionsDisabled || this.inData.position() == 0) {
            this.inData.clear();
            if (!this.inCrypt.hasRemaining()) {
                this.inCrypt.clear();
            } else {
                this.inCrypt.compact();
            }
            if ((isBlocking() || this.readEngineResult.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.socketChannel.read(this.inCrypt) == -1) {
                return -1;
            }
            this.inCrypt.flip();
            unwrap();
            int transfereTo = transfereTo(this.inData, byteBuffer);
            return (transfereTo != 0 || !isBlocking()) ? transfereTo : read(byteBuffer);
        }
        throw new AssertionError();
    }

    private int readRemaining(ByteBuffer byteBuffer) {
        if (this.inData.hasRemaining()) {
            return transfereTo(this.inData, byteBuffer);
        }
        if (!this.inData.hasRemaining()) {
            this.inData.clear();
        }
        if (!this.inCrypt.hasRemaining()) {
            return 0;
        }
        unwrap();
        int transfereTo = transfereTo(this.inData, byteBuffer);
        if (this.readEngineResult.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (transfereTo > 0) {
            return transfereTo;
        }
        return 0;
    }

    public boolean isConnected() {
        return this.socketChannel.isConnected();
    }

    public void close() {
        this.sslEngine.closeOutbound();
        this.sslEngine.getSession().invalidate();
        if (this.socketChannel.isOpen()) {
            this.socketChannel.write(wrap(emptybuffer));
        }
        this.socketChannel.close();
        this.exec.shutdownNow();
    }

    private boolean isHandShakeComplete() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.sslEngine.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public SelectableChannel configureBlocking(boolean z) {
        return this.socketChannel.configureBlocking(z);
    }

    public boolean connect(SocketAddress socketAddress) {
        return this.socketChannel.connect(socketAddress);
    }

    public boolean finishConnect() {
        return this.socketChannel.finishConnect();
    }

    public Socket socket() {
        return this.socketChannel.socket();
    }

    public boolean isInboundDone() {
        return this.sslEngine.isInboundDone();
    }

    public boolean isOpen() {
        return this.socketChannel.isOpen();
    }

    public boolean isNeedWrite() {
        return this.outCrypt.hasRemaining() || !isHandShakeComplete();
    }

    public void writeMore() {
        write(this.outCrypt);
    }

    public boolean isNeedRead() {
        if (!this.inData.hasRemaining()) {
            return (!this.inCrypt.hasRemaining() || this.readEngineResult.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.readEngineResult.getStatus() == SSLEngineResult.Status.CLOSED) ? false : true;
        }
        return true;
    }

    public int readMore(ByteBuffer byteBuffer) {
        return readRemaining(byteBuffer);
    }

    private int transfereTo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; i++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }

    public boolean isBlocking() {
        return this.socketChannel.isBlocking();
    }
}
