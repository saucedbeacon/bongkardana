package com.alibaba.griver.image.framework.decode;

import android.graphics.Bitmap;
import com.alibaba.griver.image.framework.meta.APImageInfo;

public class DecodeResult {
    public Bitmap bitmap;
    public int code = -1;
    public int extra;
    public APImageInfo srcInfo;
    public byte[] yuvData;
    public APImageInfo yuvInfo;

    public interface CODE {
        public static final int ERROR = -1;
        public static final int SUCCESS = 0;
    }

    public interface EXTRA {
        public static final int DEGRADE_RGB565 = 1;
        public static final int DEGRADE_SAMPLE_SIZE = 2;
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult{code=");
        sb.append(this.code);
        sb.append(", bitmap=");
        sb.append(this.bitmap);
        sb.append(", bitmap.info=");
        sb.append(a());
        sb.append(", yuvData=");
        sb.append(this.yuvData);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", srcInfo=");
        sb.append(this.srcInfo);
        sb.append(", yuvInfo=");
        sb.append(this.yuvInfo);
        sb.append('}');
        return sb.toString();
    }

    private String a() {
        if (this.bitmap == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.bitmap.getWidth());
        sb.append("x");
        sb.append(this.bitmap.getHeight());
        sb.append(",");
        sb.append(this.bitmap.getConfig());
        sb.append("]");
        return sb.toString();
    }
}
