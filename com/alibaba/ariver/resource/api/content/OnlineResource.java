package com.alibaba.ariver.resource.api.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.resources.ResourceSourceType;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.resource.api.content.NetworkStream;
import java.io.InputStream;
import java.util.Map;

public class OnlineResource extends AbstractResource {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private NetworkStream.Listener f10172a;
    private byte[] b = null;
    private boolean c = false;
    private NetworkStream d = null;

    public /* bridge */ /* synthetic */ void addHeader(String str, String str2) {
        super.addHeader(str, str2);
    }

    public /* bridge */ /* synthetic */ void addRequestHeader(String str, String str2) {
        super.addRequestHeader(str, str2);
    }

    public /* bridge */ /* synthetic */ String getEncoding() {
        return super.getEncoding();
    }

    public /* bridge */ /* synthetic */ Map getHeaders() {
        return super.getHeaders();
    }

    public /* bridge */ /* synthetic */ String getMimeType() {
        return super.getMimeType();
    }

    public /* bridge */ /* synthetic */ Map getRequestHeadersMap() {
        return super.getRequestHeadersMap();
    }

    public /* bridge */ /* synthetic */ ResourceSourceType getSourceType() {
        return super.getSourceType();
    }

    @NonNull
    public /* bridge */ /* synthetic */ String getUrl() {
        return super.getUrl();
    }

    public /* bridge */ /* synthetic */ boolean isLocal() {
        return super.isLocal();
    }

    public /* bridge */ /* synthetic */ void setSourceType(ResourceSourceType resourceSourceType) {
        super.setSourceType(resourceSourceType);
    }

    public OnlineResource(@NonNull String str, @Nullable NetworkStream.Listener listener) {
        super(str);
        this.f10172a = listener;
        this.mSourceType = ResourceSourceType.ONLINE;
    }

    public boolean isPackageRequest() {
        return this.c;
    }

    public void setPackageRequest(boolean z) {
        this.c = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized java.io.InputStream getStream() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0012
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x003a }
            byte[] r1 = r5.b     // Catch:{ all -> 0x003a }
            r2 = 0
            byte[] r3 = r5.b     // Catch:{ all -> 0x003a }
            int r3 = r3.length     // Catch:{ all -> 0x003a }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r0
        L_0x0012:
            com.alibaba.ariver.resource.api.content.NetworkStream r0 = r5.d     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x001a
            com.alibaba.ariver.resource.api.content.NetworkStream r0 = r5.d     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r0
        L_0x001a:
            monitor-enter(r5)     // Catch:{ all -> 0x003a }
            com.alibaba.ariver.resource.api.content.NetworkStream r0 = r5.d     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0032
            com.alibaba.ariver.resource.api.content.NetworkStream r0 = new com.alibaba.ariver.resource.api.content.NetworkStream     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r5.getOriginUrl()     // Catch:{ all -> 0x0037 }
            boolean r2 = r5.c     // Catch:{ all -> 0x0037 }
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r3 = r5.f10172a     // Catch:{ all -> 0x0037 }
            java.util.Map r4 = r5.getRequestHeadersMap()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1, r2, r3, r4)     // Catch:{ all -> 0x0037 }
            r5.d = r0     // Catch:{ all -> 0x0037 }
        L_0x0032:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            com.alibaba.ariver.resource.api.content.NetworkStream r0 = r5.d     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.content.OnlineResource.getStream():java.io.InputStream");
    }

    public synchronized byte[] getBytes() {
        if (this.b != null) {
            return this.b;
        }
        InputStream inputStream = null;
        try {
            inputStream = getStream();
            byte[] readToByte = IOUtils.readToByte(inputStream);
            this.b = readToByte;
            return readToByte;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    public void setBytes(byte[] bArr) {
        this.b = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OnlineResource(");
        sb.append(getOriginUrl());
        sb.append(")");
        return sb.toString();
    }
}
