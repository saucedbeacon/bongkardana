package com.alipay.android.phone.mobilesdk.socketcraft;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

public class AbstractWrappedByteChannel implements WrappedByteChannel {
    private final ByteChannel channel;

    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.channel = byteChannel;
    }

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.channel = wrappedByteChannel;
    }

    public int read(ByteBuffer byteBuffer) {
        return this.channel.read(byteBuffer);
    }

    public boolean isOpen() {
        return this.channel.isOpen();
    }

    public void close() {
        this.channel.close();
    }

    public int write(ByteBuffer byteBuffer) {
        return this.channel.write(byteBuffer);
    }

    public boolean isNeedWrite() {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedWrite();
        }
        return false;
    }

    public void writeMore() {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            ((WrappedByteChannel) byteChannel).writeMore();
        }
    }

    public boolean isNeedRead() {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedRead();
        }
        return false;
    }

    public int readMore(ByteBuffer byteBuffer) {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    public boolean isBlocking() {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isBlocking();
        }
        return false;
    }
}
