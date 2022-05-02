package com.alibaba.griver.image.capture.meta;

import android.graphics.Rect;
import java.io.Serializable;

public class MediaInfo implements Serializable {
    public static final int MEDIA_TYPE_IMAGE = 0;
    public static final int MEDIA_TYPE_VIDEO = 1;
    public Bounds cropRect;
    public long durationMs;
    public int heightPx;
    public Bounds innerWindowBounds;
    public boolean isTakenByCMD;
    public boolean isTakenByFrontCamera;
    public Bounds maskBounds;
    public long mediaFileSize;
    public int mediaType;
    public String path;
    public int rotation;
    public int widthPx;

    public MediaInfo(int i, String str, int i2, int i3, int i4, long j) {
        this(i, str, i2, i3, i4, j, (Bounds) null, (Bounds) null, (Bounds) null);
    }

    public MediaInfo(int i, String str, int i2, int i3, int i4, long j, Bounds bounds, Bounds bounds2, Bounds bounds3) {
        this.mediaType = i;
        this.path = str;
        this.heightPx = i3;
        this.widthPx = i2;
        this.rotation = i4;
        this.durationMs = j;
        this.maskBounds = bounds;
        this.innerWindowBounds = bounds2;
        this.cropRect = bounds3;
    }

    public MediaInfo() {
    }

    public static class Bounds implements Serializable {
        public int bottom;
        public int left;
        public int right;
        public int top;

        public Bounds(Rect rect) {
            this.left = rect.left;
            this.top = rect.top;
            this.right = rect.right;
            this.bottom = rect.bottom;
        }

        public Bounds() {
        }
    }
}
