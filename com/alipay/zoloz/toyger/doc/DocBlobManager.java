package com.alipay.zoloz.toyger.doc;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import com.alipay.zoloz.toyger.blob.model.Blob;
import com.alipay.zoloz.toyger.blob.model.BlobElem;
import com.alipay.zoloz.toyger.blob.model.Content;
import com.alipay.zoloz.toyger.blob.model.DocBlobElement;
import com.alipay.zoloz.toyger.blob.model.DocInfo;
import com.alipay.zoloz.toyger.blob.model.Meta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DocBlobManager extends BlobManager<ToygerDocInfo> {
    protected static final String INFO_DOC_TYPE = "docType";
    protected static final String INFO_PAGE_NUMBER = "pageNo";
    protected static final String INFO_PIC_SIZE = "picSize";
    protected Rect mCropRect;
    protected long picSize = 0;

    public boolean isUTF8() {
        return true;
    }

    public DocBlobManager(int i) {
        super(i);
    }

    public long getPicSize() {
        return this.picSize;
    }

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        this.config = toygerDocBlobConfig;
        if (this.crypto == null) {
            this.crypto = new CryptoManager(toygerDocBlobConfig.pubkey);
        }
    }

    public void setCropRect(Rect rect) {
        int width = (int) ((((float) rect.width()) * 0.5f) / 2.0f);
        int height = (int) ((((float) rect.height()) * 0.5f) / 2.0f);
        this.mCropRect = new Rect(rect.left - width, rect.top - height, rect.right + width, rect.bottom + height);
    }

    public byte[] generateBlob(List<ToygerDocInfo> list, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (ToygerDocInfo next : list) {
            DocBlobElement docBlobElement = new DocBlobElement();
            docBlobElement.type = "doc";
            if (next.getBlobConfig() == null) {
                docBlobElement.subType = BlobStatic.SUB_TYPE_DOC_IMAGE;
            } else {
                docBlobElement.subType = next.getBlobConfig().subType;
            }
            docBlobElement.version = "1.0";
            docBlobElement.idx = 0;
            docBlobElement.content = processFrame(next.frame, this.mCropRect);
            if (docBlobElement.content != null) {
                this.picSize = (long) docBlobElement.content.length;
            } else {
                this.picSize = 0;
            }
            docBlobElement.docInfo = generateDocInfo(next, map);
            arrayList.add(docBlobElement);
        }
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = BlobStatic.BLOB_VERSION;
        Meta generateMeta = generateMeta(list, map);
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        return convertData(content);
    }

    private byte[] convertData(Content content) {
        try {
            return this.crypto.encrypt(this.mConvertManager.convert(content));
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] generateScanBlob(List<BlobElem> list, Map<String, Object> map) {
        Blob blob = new Blob();
        blob.blobElem = list;
        blob.blobVersion = BlobStatic.BLOB_VERSION;
        Meta generateMeta = generateMeta((List) null, map);
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        return convertData(content);
    }

    public BlobElem generateBlobElem(ToygerDocInfo toygerDocInfo, ToygerDocBlobConfig toygerDocBlobConfig, ToygerDocConfig toygerDocConfig) {
        if (toygerDocInfo == null) {
            return null;
        }
        DocBlobElement docBlobElement = new DocBlobElement();
        docBlobElement.type = "doc";
        docBlobElement.subType = toygerDocBlobConfig.subType;
        docBlobElement.version = "1.0";
        int i = 0;
        docBlobElement.idx = 0;
        float[] fArr = toygerDocConfig.points;
        PointF pointF = new PointF(fArr[0], fArr[1]);
        PointF pointF2 = new PointF(fArr[2], fArr[3]);
        PointF pointF3 = new PointF(fArr[4], fArr[5]);
        PointF pointF4 = new PointF(fArr[6], fArr[7]);
        setCropRect(toygerDocConfig.rect);
        docBlobElement.content = processFrame(toygerDocInfo.frame, this.mCropRect);
        if (docBlobElement.content == null) {
            return null;
        }
        this.picSize = (long) docBlobElement.content.length;
        DocInfo docInfo = new DocInfo();
        docInfo.docType = getDocType();
        docInfo.pageNo = getPageNum();
        docInfo.region = new ArrayList();
        int i2 = toygerDocInfo.frame.width;
        int i3 = toygerDocInfo.frame.height;
        if (i2 > i3) {
            int i4 = i2;
            i2 = i3;
            i3 = i4;
        }
        int i5 = this.mCropRect.left < 0 ? 0 : this.mCropRect.left;
        if (this.mCropRect.top >= 0) {
            i = this.mCropRect.top;
        }
        Rect rect = new Rect(i5, i, this.mCropRect.right > i2 ? i2 : this.mCropRect.right, this.mCropRect.bottom > i3 ? i3 : this.mCropRect.bottom);
        rect.width();
        rect.height();
        float f = (float) i2;
        float f2 = (float) i3;
        docInfo.region.add(new Point((int) ((pointF.x * f) - ((float) rect.left)), (int) ((pointF.y * f2) - ((float) rect.top))));
        docInfo.region.add(new Point((int) ((pointF2.x * f) - ((float) rect.left)), (int) ((pointF2.y * f2) - ((float) rect.top))));
        docInfo.region.add(new Point((int) ((pointF3.x * f) - ((float) rect.left)), (int) ((pointF3.y * f2) - ((float) rect.top))));
        docInfo.region.add(new Point((int) ((pointF4.x * f) - ((float) rect.left)), (int) ((pointF4.y * f2) - ((float) rect.top))));
        docBlobElement.docInfo = docInfo;
        return docBlobElement;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveImageToFile(com.alipay.zoloz.toyger.algorithm.TGFrame r17, android.graphics.Rect r18, android.graphics.Point r19, android.graphics.Point r20, android.graphics.Point r21, android.graphics.Point r22) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = 0
            if (r0 == 0) goto L_0x014e
            byte[] r7 = r0.data
            if (r7 != 0) goto L_0x0019
            java.nio.ByteBuffer r7 = r0.byteBuffer
            if (r7 != 0) goto L_0x0019
            goto L_0x014e
        L_0x0019:
            byte[] r7 = r0.data
            if (r7 != 0) goto L_0x0037
            java.nio.ByteBuffer r7 = r0.byteBuffer
            if (r7 == 0) goto L_0x0037
            java.nio.ByteBuffer r7 = r0.byteBuffer
            r7.clear()
            java.nio.ByteBuffer r7 = r0.byteBuffer
            int r7 = r7.remaining()
            byte[] r7 = new byte[r7]
            r0.data = r7
            java.nio.ByteBuffer r7 = r0.byteBuffer
            byte[] r8 = r0.data
            r7.get(r8)
        L_0x0037:
            byte[] r7 = r0.data
            int r8 = r0.width
            int r9 = r0.height
            r10 = 0
            android.graphics.Bitmap r7 = com.alipay.zoloz.toyger.blob.BitmapHelper.bytes2Bitmap(r7, r8, r9, r10)
            if (r7 == 0) goto L_0x0149
            int r0 = r0.rotation
            android.graphics.Bitmap r0 = com.alipay.zoloz.toyger.blob.BitmapHelper.rotateBitmap(r7, r0)
            if (r0 == 0) goto L_0x0147
            int r8 = r18.width()
            int r9 = r0.getWidth()
            if (r8 != r9) goto L_0x0061
            int r8 = r18.height()
            int r9 = r0.getHeight()
            if (r8 != r9) goto L_0x0061
            goto L_0x00b2
        L_0x0061:
            int r8 = r18.width()
            if (r8 == 0) goto L_0x00b2
            int r8 = r18.height()
            if (r8 != 0) goto L_0x006e
            goto L_0x00b2
        L_0x006e:
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r1.left
            if (r9 >= 0) goto L_0x0076
            r9 = 0
            goto L_0x0078
        L_0x0076:
            int r9 = r1.left
        L_0x0078:
            int r11 = r1.top
            if (r11 >= 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            int r10 = r1.top
        L_0x007f:
            int r11 = r1.right
            int r12 = r0.getWidth()
            if (r11 <= r12) goto L_0x008c
            int r11 = r0.getWidth()
            goto L_0x008e
        L_0x008c:
            int r11 = r1.right
        L_0x008e:
            int r12 = r1.bottom
            int r13 = r0.getHeight()
            if (r12 <= r13) goto L_0x009b
            int r1 = r0.getHeight()
            goto L_0x009d
        L_0x009b:
            int r1 = r1.bottom
        L_0x009d:
            r8.<init>(r9, r10, r11, r1)
            int r1 = r8.height()
            if (r1 <= 0) goto L_0x00b2
            int r1 = r8.width()
            if (r1 > 0) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            android.graphics.Bitmap r1 = com.alipay.zoloz.toyger.blob.BitmapHelper.cropBitmap(r0, r8)
            goto L_0x00b3
        L_0x00b2:
            r1 = r0
        L_0x00b3:
            if (r1 == 0) goto L_0x014b
            int r8 = r1.getWidth()
            int r9 = r1.getHeight()
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r10)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r8)
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>()
            r8.getWidth()
            r8.getHeight()
            r9 = 0
            r15.drawBitmap(r1, r9, r9, r6)
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r14.setColor(r6)
            int r6 = r2.x
            float r10 = (float) r6
            int r6 = r2.y
            float r11 = (float) r6
            int r6 = r3.x
            float r12 = (float) r6
            int r6 = r3.y
            float r13 = (float) r6
            r9 = r15
            r6 = r14
            r9.drawLine(r10, r11, r12, r13, r14)
            r9 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r6.setColor(r9)
            int r9 = r2.x
            float r10 = (float) r9
            int r2 = r2.y
            float r11 = (float) r2
            int r2 = r5.x
            float r12 = (float) r2
            int r2 = r5.y
            float r13 = (float) r2
            r9 = r15
            r9.drawLine(r10, r11, r12, r13, r14)
            r2 = -256(0xffffffffffffff00, float:NaN)
            r6.setColor(r2)
            int r2 = r3.x
            float r10 = (float) r2
            int r2 = r3.y
            float r11 = (float) r2
            int r2 = r4.x
            float r12 = (float) r2
            int r2 = r4.y
            float r13 = (float) r2
            r9.drawLine(r10, r11, r12, r13, r14)
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r6.setColor(r2)
            int r2 = r5.x
            float r2 = (float) r2
            int r3 = r5.y
            float r3 = (float) r3
            int r5 = r4.x
            float r5 = (float) r5
            int r4 = r4.y
            float r4 = (float) r4
            r17 = r15
            r18 = r2
            r19 = r3
            r20 = r5
            r21 = r4
            r22 = r6
            r17.drawLine(r18, r19, r20, r21, r22)
            r2 = 31
            r15.save(r2)
            r15.restore()
            saveBitmap(r8)
            r8.recycle()
            goto L_0x014b
        L_0x0147:
            r1 = r6
            goto L_0x014b
        L_0x0149:
            r0 = r6
            r1 = r0
        L_0x014b:
            r2 = r1
            r6 = r7
            goto L_0x0151
        L_0x014e:
            r0 = r6
            r1 = r0
            r2 = r1
        L_0x0151:
            if (r6 == 0) goto L_0x0156
            r6.recycle()
        L_0x0156:
            if (r1 == 0) goto L_0x015d
            if (r1 == r0) goto L_0x015d
            r1.recycle()
        L_0x015d:
            if (r0 == 0) goto L_0x0162
            r0.recycle()
        L_0x0162:
            if (r2 == 0) goto L_0x0167
            r2.recycle()
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.doc.DocBlobManager.saveImageToFile(com.alipay.zoloz.toyger.algorithm.TGFrame, android.graphics.Rect, android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point):void");
    }

    public static String saveBitmap(Bitmap bitmap) {
        File file = new File("/sdcard/doc_scan/");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/sdcard/doc_scan/");
            sb.append(generateFileName());
            sb.append(".jpg");
            File file2 = new File(sb.toString());
            if (!file2.exists()) {
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (IOException unused) {
            return null;
        }
    }

    private static String generateFileName() {
        return UUID.randomUUID().toString();
    }

    public Rect convertRectByPoints(TGFrame tGFrame, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        int i = tGFrame.rotation % 180 == 0 ? tGFrame.width : tGFrame.height;
        int i2 = i == tGFrame.width ? tGFrame.height : tGFrame.width;
        Rect rect = new Rect();
        rect.left = 0;
        rect.right = i;
        float min = ((Math.min(pointF.y, pointF2.y) + Math.max(pointF3.y, pointF4.y)) / 2.0f) * ((float) i2);
        float f = (float) (i / 2);
        rect.top = (int) (min - f);
        rect.bottom = (int) (min + f);
        return rect;
    }

    private float[] getMinMax(float[] fArr) {
        float f = fArr[1];
        float f2 = fArr[1];
        for (int i = 1; i < fArr.length; i += 2) {
            float f3 = fArr[i];
            if (f > f3) {
                f = f3;
            }
            if (f2 < f3) {
                f2 = f3;
            }
        }
        return new float[]{f, f2};
    }

    private DocInfo generateDocInfo(ToygerDocInfo toygerDocInfo, Map<String, Object> map) {
        DocInfo docInfo = new DocInfo();
        docInfo.docType = getDocType();
        docInfo.pageNo = getPageNum();
        return docInfo;
    }

    public Meta generateMeta(List<ToygerDocInfo> list, Map<String, Object> map) {
        Meta generateMeta = super.generateMeta(list, map);
        generateMeta.type = BlobStatic.META_TYPE_DOC;
        generateMeta.serialize = this.metaSerializer;
        generateMeta.collectInfo = new HashMap();
        generateMeta.collectInfo.put("docType", getDocType());
        generateMeta.collectInfo.put(INFO_PAGE_NUMBER, Integer.valueOf(getPageNum()));
        generateMeta.collectInfo.put(INFO_PIC_SIZE, Long.valueOf(this.picSize));
        if (map != null && map.size() > 0) {
            generateMeta.collectInfo.putAll(map);
        }
        return generateMeta;
    }

    public byte[] getKey() {
        return this.crypto.getAESCypher();
    }

    /* access modifiers changed from: protected */
    public String getDocType() {
        return ((ToygerDocBlobConfig) this.config).docType;
    }

    /* access modifiers changed from: protected */
    public int getPageNum() {
        return ((ToygerDocBlobConfig) this.config).pageNo;
    }
}
