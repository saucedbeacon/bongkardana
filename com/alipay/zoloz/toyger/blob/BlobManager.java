package com.alipay.zoloz.toyger.blob;

import android.graphics.Rect;
import android.text.TextUtils;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.blob.model.Meta;
import com.alipay.zoloz.toyger.convert.ConvertManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BlobManager<Info> {
    public static final String TAG = "BlobManager";
    protected ToygerBlobConfig config;
    protected CryptoManager crypto;
    protected String mBisToken;
    protected ConvertManager mConvertManager;
    protected String mInvokeType;
    public int metaSerializer;

    public abstract byte[] generateBlob(List<Info> list, Map<String, Object> map);

    public abstract byte[] getKey();

    public abstract boolean isUTF8();

    public BlobManager(int i) {
        this.metaSerializer = i;
        this.mConvertManager = new ConvertManager(i);
    }

    public void setInvokeType(String str) {
        this.mInvokeType = str;
    }

    public void setBisToken(String str) {
        this.mBisToken = str;
    }

    /* access modifiers changed from: protected */
    public byte[] processFrame(TGFrame tGFrame) {
        return processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate() * 100.0f), new Rect(0, 0, 0, 0));
    }

    /* access modifiers changed from: protected */
    public byte[] processFrame(TGFrame tGFrame, Rect rect) {
        if (rect == null) {
            rect = new Rect(0, 0, 0, 0);
        }
        return processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate() * 100.0f), rect);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r11v6, types: [byte[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        if (r11 != 0) goto L_0x00d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame r9, int r10, int r11, android.graphics.Rect r12) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x00d9
            byte[] r1 = r9.data
            if (r1 != 0) goto L_0x000d
            java.nio.ByteBuffer r1 = r9.byteBuffer
            if (r1 != 0) goto L_0x000d
            goto L_0x00d9
        L_0x000d:
            byte[] r1 = r9.data
            if (r1 != 0) goto L_0x002b
            java.nio.ByteBuffer r1 = r9.byteBuffer
            if (r1 == 0) goto L_0x002b
            java.nio.ByteBuffer r1 = r9.byteBuffer
            r1.clear()
            java.nio.ByteBuffer r1 = r9.byteBuffer
            int r1 = r1.remaining()
            byte[] r1 = new byte[r1]
            r9.data = r1
            java.nio.ByteBuffer r1 = r9.byteBuffer
            byte[] r2 = r9.data
            r1.get(r2)
        L_0x002b:
            int r1 = r8.getFrameMode(r9)
            if (r1 < 0) goto L_0x00d9
            byte[] r2 = r9.data
            int r3 = r9.width
            int r4 = r9.height
            android.graphics.Bitmap r1 = com.alipay.zoloz.toyger.blob.BitmapHelper.bytes2Bitmap(r2, r3, r4, r1)
            if (r1 == 0) goto L_0x00d3
            int r9 = r9.rotation
            android.graphics.Bitmap r9 = com.alipay.zoloz.toyger.blob.BitmapHelper.rotateBitmap(r1, r9)
            if (r9 == 0) goto L_0x00d1
            int r2 = r12.width()
            int r3 = r9.getWidth()
            if (r2 != r3) goto L_0x005a
            int r2 = r12.height()
            int r3 = r9.getHeight()
            if (r2 != r3) goto L_0x005a
            goto L_0x00ac
        L_0x005a:
            int r2 = r12.width()
            if (r2 == 0) goto L_0x00ac
            int r2 = r12.height()
            if (r2 != 0) goto L_0x0067
            goto L_0x00ac
        L_0x0067:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r12.left
            r4 = 0
            if (r3 >= 0) goto L_0x0070
            r3 = 0
            goto L_0x0072
        L_0x0070:
            int r3 = r12.left
        L_0x0072:
            int r5 = r12.top
            if (r5 >= 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            int r4 = r12.top
        L_0x0079:
            int r5 = r12.right
            int r6 = r9.getWidth()
            if (r5 <= r6) goto L_0x0086
            int r5 = r9.getWidth()
            goto L_0x0088
        L_0x0086:
            int r5 = r12.right
        L_0x0088:
            int r6 = r12.bottom
            int r7 = r9.getHeight()
            if (r6 <= r7) goto L_0x0095
            int r12 = r9.getHeight()
            goto L_0x0097
        L_0x0095:
            int r12 = r12.bottom
        L_0x0097:
            r2.<init>(r3, r4, r5, r12)
            int r12 = r2.height()
            if (r12 <= 0) goto L_0x00ac
            int r12 = r2.width()
            if (r12 > 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            android.graphics.Bitmap r12 = com.alipay.zoloz.toyger.blob.BitmapHelper.cropBitmap(r9, r2)
            goto L_0x00ad
        L_0x00ac:
            r12 = r9
        L_0x00ad:
            int r2 = r12.getWidth()
            if (r2 <= r10) goto L_0x00b6
            if (r10 <= 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            int r10 = r12.getWidth()
        L_0x00ba:
            int r2 = r12.getWidth()
            if (r10 == r2) goto L_0x00c5
            android.graphics.Bitmap r10 = com.alipay.zoloz.toyger.blob.BitmapHelper.resize(r12, r10)
            goto L_0x00c6
        L_0x00c5:
            r10 = r12
        L_0x00c6:
            if (r10 == 0) goto L_0x00cf
            byte[] r11 = com.alipay.zoloz.toyger.blob.BitmapHelper.bitmapToByteArray(r10, r11)
            if (r11 == 0) goto L_0x00cf
            goto L_0x00d7
        L_0x00cf:
            r11 = r0
            goto L_0x00d7
        L_0x00d1:
            r10 = r0
            goto L_0x00d5
        L_0x00d3:
            r9 = r0
            r10 = r9
        L_0x00d5:
            r11 = r10
            r12 = r11
        L_0x00d7:
            r0 = r1
            goto L_0x00dd
        L_0x00d9:
            r9 = r0
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x00dd:
            if (r0 == 0) goto L_0x00e2
            r0.recycle()
        L_0x00e2:
            if (r12 == 0) goto L_0x00e9
            if (r12 == r9) goto L_0x00e9
            r12.recycle()
        L_0x00e9:
            if (r9 == 0) goto L_0x00ee
            r9.recycle()
        L_0x00ee:
            if (r10 == 0) goto L_0x00f3
            r10.recycle()
        L_0x00f3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.blob.BlobManager.processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame, int, int, android.graphics.Rect):byte[]");
    }

    public Meta generateMeta(List<Info> list, Map<String, Object> map) {
        Meta meta = new Meta();
        String string = getString(map, BlobStatic.BLOB_META_INVTP_TYPE);
        String string2 = getString(map, "bis_token");
        meta.invtpType = string;
        meta.bisToken = string2;
        meta.extInfo = new HashMap();
        String string3 = getString(map, BlobStatic.BLOB_META_RETRY);
        if (TextUtils.isEmpty(string3)) {
            string3 = "0";
        }
        meta.extInfo.put("retry", string3);
        return meta;
    }

    private String getString(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    private int getFrameMode(TGFrame tGFrame) {
        int i = tGFrame.frameMode;
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }
}
