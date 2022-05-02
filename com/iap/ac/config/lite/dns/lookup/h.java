package com.iap.ac.config.lite.dns.lookup;

import com.iap.ac.config.lite.c.e;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.UUID;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final SecureRandom f9809a = new SecureRandom();
    private static Selector b;

    static {
        e.b("NioUdpClient");
    }

    private static byte[] a(String str, int i) throws Exception {
        Iterator<SelectionKey> it = b.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            String str2 = (String) next.attachment();
            if (str != null && str.equals(str2)) {
                return a(next, i);
            }
        }
        return null;
    }

    private static byte[] a(SelectionKey selectionKey, int i) throws Exception {
        if (selectionKey.isReadable()) {
            DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
            ByteBuffer allocate = ByteBuffer.allocate(i);
            int read = datagramChannel.read(allocate);
            if (read > 0) {
                allocate.flip();
                byte[] bArr = new byte[read];
                System.arraycopy(allocate.array(), 0, bArr, 0, read);
                try {
                    datagramChannel.disconnect();
                    datagramChannel.close();
                } catch (IOException unused) {
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new EOFException("channel not readable");
    }

    static byte[] a(InetSocketAddress inetSocketAddress, byte[] bArr, long j) throws Exception {
        b = Selector.open();
        DatagramChannel open = DatagramChannel.open();
        try {
            return a(inetSocketAddress, bArr, j, open);
        } catch (Exception e) {
            open.disconnect();
            open.close();
            b.wakeup();
            b.close();
            throw e;
        }
    }

    private static byte[] a(InetSocketAddress inetSocketAddress, byte[] bArr, long j, DatagramChannel datagramChannel) throws Exception {
        boolean z = false;
        datagramChannel.configureBlocking(false);
        int i = 0;
        while (true) {
            if (i >= 1024) {
                break;
            }
            try {
                datagramChannel.socket().bind(new InetSocketAddress(f9809a.nextInt(28231) + 32768));
                z = true;
                break;
            } catch (SocketException unused) {
                i++;
            }
        }
        if (z) {
            datagramChannel.connect(inetSocketAddress);
            long currentTimeMillis = System.currentTimeMillis() + j;
            String obj = UUID.randomUUID().toString();
            datagramChannel.register(b, 1, obj);
            if (datagramChannel.send(ByteBuffer.wrap(bArr), datagramChannel.socket().getRemoteSocketAddress()) <= 0) {
                throw new EOFException();
            } else if (b.select(1000) < 0) {
                throw new IOException("not complete nio udp request");
            } else if (System.currentTimeMillis() - currentTimeMillis <= 0) {
                return a(obj, 512);
            } else {
                throw new SocketTimeoutException("Query timed out");
            }
        } else {
            throw new IOException("No available source port found");
        }
    }
}
