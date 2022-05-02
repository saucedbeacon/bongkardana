package com.alipay.android.phone.mobilesdk.socketcraft;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class SocketChannelIOHelper {
    public static boolean read(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, ByteChannel byteChannel) {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read == -1) {
            webSocketImpl.eot();
            return false;
        } else if (read != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean readMore(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, WrappedByteChannel wrappedByteChannel) {
        byteBuffer.clear();
        int readMore = wrappedByteChannel.readMore(byteBuffer);
        byteBuffer.flip();
        if (readMore != -1) {
            return wrappedByteChannel.isNeedRead();
        }
        webSocketImpl.eot();
        return false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static boolean batch(com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl r4, java.nio.channels.ByteChannel r5) {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = r5 instanceof com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
            if (r0 == 0) goto L_0x0035
            r0 = r5
            com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel r0 = (com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel) r0
            boolean r2 = r0.isNeedWrite()
            if (r2 == 0) goto L_0x0036
            r0.writeMore()
            goto L_0x0036
        L_0x001c:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L_0x0026
            return r1
        L_0x0026:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L_0x001c
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x006b
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.outQueue
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x006b
            boolean r2 = r4.isFlushAndClose()
            if (r2 == 0) goto L_0x006b
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r2 = r4.getDraft()
            if (r2 == 0) goto L_0x006b
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r2 = r4.getDraft()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r2 = r2.getRole()
            if (r2 == 0) goto L_0x006b
            com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft r2 = r4.getDraft()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r2 = r2.getRole()
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r3 = com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role.SERVER
            if (r2 != r3) goto L_0x006b
            monitor-enter(r4)
            r4.closeConnection()     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x006b:
            if (r0 == 0) goto L_0x0076
            com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel r5 = (com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel) r5
            boolean r4 = r5.isNeedWrite()
            if (r4 == 0) goto L_0x0076
            return r1
        L_0x0076:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.SocketChannelIOHelper.batch(com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl, java.nio.channels.ByteChannel):boolean");
    }
}
