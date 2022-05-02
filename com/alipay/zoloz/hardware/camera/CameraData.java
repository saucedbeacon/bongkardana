package com.alipay.zoloz.hardware.camera;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class CameraData {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    boolean focusStatus;
    ByteBuffer mColorData;
    int mColorFrameMode;
    int mColorHeight;
    int mColorWidth;
    ShortBuffer mDepthData;
    int mDepthHeight;
    int mDepthWidth;
    boolean mMirror;
    int mPreviewHeight;
    int mPreviewWidth;

    public CameraData() {
        this.focusStatus = true;
    }

    public CameraData(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, shortBuffer, i4, i5, i6, i7, false);
    }

    public CameraData(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7, boolean z) {
        this.focusStatus = true;
        this.mColorData = byteBuffer;
        this.mColorWidth = i;
        this.mColorHeight = i2;
        this.mColorFrameMode = i3;
        this.mDepthData = shortBuffer;
        this.mDepthWidth = i4;
        this.mDepthHeight = i5;
        this.mPreviewWidth = i6;
        this.mPreviewHeight = i7;
        this.mMirror = z;
    }

    public void setColorData(ByteBuffer byteBuffer) {
        this.mColorData = byteBuffer;
    }

    public ByteBuffer getColorData() {
        return this.mColorData;
    }

    public void setColorWidth(int i) {
        this.mColorWidth = i;
    }

    public int getColorWidth() {
        return this.mColorWidth;
    }

    public void setColorHeight(int i) {
        this.mColorHeight = i;
    }

    public int getColorHeight() {
        return this.mColorHeight;
    }

    public void setColorFrameMode(int i) {
        this.mColorFrameMode = i;
    }

    public int getColorFrameMode() {
        return this.mColorFrameMode;
    }

    public void setDepthData(ShortBuffer shortBuffer) {
        this.mDepthData = shortBuffer;
    }

    public ShortBuffer getDepthData() {
        return this.mDepthData;
    }

    public void setDepthWidth(int i) {
        this.mDepthWidth = i;
    }

    public int getDepthWidth() {
        return this.mDepthWidth;
    }

    public void setDepthHeight(int i) {
        this.mDepthHeight = i;
    }

    public int getDepthHeight() {
        return this.mDepthHeight;
    }

    public void setPreviewWidth(int i) {
        this.mPreviewWidth = i;
    }

    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    public void setPreviewHeight(int i) {
        this.mPreviewHeight = i;
    }

    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    public void setMirror(boolean z) {
        this.mMirror = z;
    }

    public boolean getMirror() {
        return this.mMirror;
    }

    public void setFocusStatus(boolean z) {
        this.focusStatus = z;
    }

    public boolean isFocusStatus() {
        return this.focusStatus;
    }

    public CameraData deepClone() {
        CameraData cameraData = new CameraData();
        cameraData.mColorData = ByteBuffer.allocate(this.mColorData.capacity());
        this.mColorData.rewind();
        cameraData.mColorData.put(this.mColorData);
        this.mColorData.rewind();
        cameraData.mColorData.rewind();
        cameraData.mColorWidth = this.mColorWidth;
        cameraData.mColorHeight = this.mColorHeight;
        cameraData.mColorFrameMode = this.mColorFrameMode;
        ShortBuffer shortBuffer = this.mDepthData;
        if (shortBuffer != null) {
            cameraData.mDepthData = ShortBuffer.allocate(shortBuffer.capacity());
            this.mDepthData.rewind();
            cameraData.mDepthData.put(this.mDepthData);
            this.mDepthData.rewind();
            cameraData.mDepthData.rewind();
        } else {
            cameraData.mDepthData = null;
        }
        cameraData.mDepthWidth = this.mDepthWidth;
        cameraData.mDepthHeight = this.mDepthHeight;
        cameraData.mPreviewWidth = this.mPreviewWidth;
        cameraData.mPreviewHeight = this.mPreviewHeight;
        cameraData.mMirror = this.mMirror;
        return cameraData;
    }

    public void recycle() {
        this.mColorData = null;
        this.mDepthData = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraData{, mColorWidth=");
        sb.append(this.mColorWidth);
        sb.append(", mColorHeight=");
        sb.append(this.mColorHeight);
        sb.append(", mColorFrameMode=");
        sb.append(this.mColorFrameMode);
        sb.append(", mDepthWidth=");
        sb.append(this.mDepthWidth);
        sb.append(", mDepthHeight=");
        sb.append(this.mDepthHeight);
        sb.append(", mPreviewWidth=");
        sb.append(this.mPreviewWidth);
        sb.append(", mPreviewHeight=");
        sb.append(this.mPreviewHeight);
        sb.append(", mMirror=");
        sb.append(this.mMirror);
        sb.append('}');
        return sb.toString();
    }
}
