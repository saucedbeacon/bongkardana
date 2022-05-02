package com.alipay.zoloz.toyger.upload;

public class UploadContent {
    public final byte[] content;
    public final byte[] contentSig;
    public final boolean isUTF8;

    public UploadContent(byte[] bArr, byte[] bArr2, boolean z) {
        this.content = bArr;
        this.contentSig = bArr2;
        this.isUTF8 = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadContent{content=");
        String str = "null";
        sb.append(this.content == null ? str : "***");
        sb.append(", contentSig=");
        if (this.contentSig != null) {
            str = "***";
        }
        sb.append(str);
        sb.append(", isUTF8=");
        sb.append(this.isUTF8);
        sb.append('}');
        return sb.toString();
    }
}
