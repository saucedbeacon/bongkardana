package com.alipay.zoloz.isp;

import android.graphics.Rect;
import com.alipay.streammedia.devicesengine.DevicesNativeEngineApi;
import com.alipay.streammedia.devicesengine.camera.FaceRectParams;
import com.alipay.streammedia.devicesengine.camera.ImageParams;
import com.alipay.streammedia.devicesengine.camera.IspAdjustResult;
import tv.danmaku.ijk.media.player.IjkLibLoader;

public class ToygerIsp {
    private static final String TAG = "ToygerIsp";
    private DevicesNativeEngineApi mEngineApi;

    static {
        try {
            DevicesNativeEngineApi.loadLibrariesOnce((IjkLibLoader) null);
        } catch (Throwable unused) {
        }
    }

    public void init(int i, int i2, int i3, int i4, int i5, float[] fArr, float[][][] fArr2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.mEngineApi = new DevicesNativeEngineApi();
            ImageParams imageParams = new ImageParams();
            imageParams.orgWidth = i;
            imageParams.orgHeight = i2;
            imageParams.dispWidth = i3;
            imageParams.dispHeight = i4;
            this.mEngineApi.ispCreate(imageParams, fArr, fArr2, convert(i5));
        } catch (Throwable unused) {
            this.mEngineApi = null;
        }
        StringBuilder sb = new StringBuilder("ToygerIsp.init(): mEngineApi=");
        sb.append(this.mEngineApi);
        sb.append(", cost ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms.");
    }

    private DevicesNativeEngineApi.ImageType convert(int i) {
        if (i == 0) {
            return DevicesNativeEngineApi.ImageType.NV21;
        }
        if (i == 1) {
            return DevicesNativeEngineApi.ImageType.BGR_24;
        }
        if (i == 2) {
            return DevicesNativeEngineApi.ImageType.BGR_24;
        }
        if (i == 3) {
            return DevicesNativeEngineApi.ImageType.RGBA;
        }
        if (i != 4) {
            return DevicesNativeEngineApi.ImageType.NV21;
        }
        return DevicesNativeEngineApi.ImageType.RGB_24;
    }

    public IspResult adjustIsp(byte[] bArr, short[] sArr, Rect rect, long j, int i) {
        if (this.mEngineApi != null) {
            try {
                FaceRectParams faceRectParams = new FaceRectParams();
                faceRectParams.setX(rect.left);
                faceRectParams.setY(rect.top);
                faceRectParams.setWidth(rect.right - rect.left);
                faceRectParams.setHeight(rect.bottom - rect.top);
                IspAdjustResult ispAdjust = this.mEngineApi.ispAdjust(bArr, sArr, faceRectParams, j, (long) i);
                return new IspResult(ispAdjust.needSet, ispAdjust.exposureTime, ispAdjust.ISO);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void release() {
        DevicesNativeEngineApi devicesNativeEngineApi = this.mEngineApi;
        if (devicesNativeEngineApi != null) {
            try {
                devicesNativeEngineApi.ispDestory();
            } catch (Throwable unused) {
            }
        }
    }
}
