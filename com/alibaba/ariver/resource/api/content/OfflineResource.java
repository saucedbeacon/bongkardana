package com.alibaba.ariver.resource.api.content;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.ResourceSourceType;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

public class OfflineResource extends AbstractResource {

    /* renamed from: a  reason: collision with root package name */
    private String f10171a = null;
    private ResourcePackage b;
    private byte[] c;

    public boolean isLocal() {
        return true;
    }

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

    public /* bridge */ /* synthetic */ Map getRequestHeadersMap() {
        return super.getRequestHeadersMap();
    }

    @NonNull
    public /* bridge */ /* synthetic */ String getUrl() {
        return super.getUrl();
    }

    public /* bridge */ /* synthetic */ void setSourceType(ResourceSourceType resourceSourceType) {
        super.setSourceType(resourceSourceType);
    }

    public OfflineResource(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
        this.mSourceType = ResourceSourceType.OFFLINE;
    }

    public OfflineResource(String str, byte[] bArr, String str2) {
        super(str);
        this.c = bArr;
        this.f10171a = str2;
        this.mSourceType = ResourceSourceType.OFFLINE;
    }

    public InputStream getStream() {
        return new ByteArrayInputStream(this.c);
    }

    public String getMimeType() {
        if (TextUtils.isEmpty(this.f10171a)) {
            return super.getMimeType();
        }
        return this.f10171a;
    }

    public ResourceSourceType getSourceType() {
        return this.mSourceType;
    }

    public ResourcePackage getBelongsPackage() {
        return this.b;
    }

    public void setBelongsPackage(ResourcePackage resourcePackage) {
        this.b = resourcePackage;
    }

    public byte[] getBytes() {
        return this.c;
    }

    public void setBytes(byte[] bArr) {
        this.c = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OfflineResource(");
        sb.append(getUrl());
        sb.append(") size: ");
        sb.append(this.c.length);
        return sb.toString();
    }
}
