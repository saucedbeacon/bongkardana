package com.alibaba.griver.image.framework.utils;

import android.graphics.Bitmap;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.image.framework.meta.StaticOptions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FalconFacade {
    public static final int QUA_HIGH = 2;
    public static final int QUA_LOCAL_ORIGINAL = 3;
    public static final int QUA_LOW = 0;
    public static final int QUA_MIDDLE = 1;
    public static final int QUA_WEBP = 4;

    /* renamed from: a  reason: collision with root package name */
    private static FalconFacade f10482a = new FalconFacade();

    interface FalconInterface {
        Bitmap cutImage_keepRatio(InputStream inputStream, int i, int i2);

        FalconDecoderBridge getFalconImgCut();

        boolean isUseAshmem();
    }

    public static FalconFacade get() {
        return f10482a;
    }

    private FalconFacade() {
        try {
            StaticOptions.jniDebug = GriverEnv.isDebuggable() && new File("/sdcard/debugJni.t").exists();
        } catch (Throwable unused) {
            RVLogger.w("ignore init error");
        }
    }

    private FalconInterface a() {
        FalconInterfaceImpl falconInterfaceImpl = new FalconInterfaceImpl();
        return (FalconInterface) Proxy.newProxyInstance(falconInterfaceImpl.getClass().getClassLoader(), falconInterfaceImpl.getClass().getInterfaces(), new FalconImageCutProxy(falconInterfaceImpl));
    }

    public Bitmap cutImageKeepRatio(InputStream inputStream, int i, int i2) {
        return a().cutImage_keepRatio(inputStream, i, i2);
    }

    public Bitmap cutImageKeepRatio(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Bitmap cutImageKeepRatio = cutImageKeepRatio((InputStream) byteArrayInputStream, i, i2);
        IOUtils.closeQuietly(byteArrayInputStream);
        return cutImageKeepRatio;
    }

    class FalconInterfaceImpl implements FalconInterface {

        /* renamed from: a  reason: collision with root package name */
        private FalconDecoderBridge f10484a;
        private boolean b = ImageUtils.isSdkMatch();

        public FalconInterfaceImpl() {
            FalconDecoderBridge falconDecoderBridge = new FalconDecoderBridge();
            this.f10484a = falconDecoderBridge;
            falconDecoderBridge.setIsUseNewMethod(this.b);
        }

        public FalconDecoderBridge getFalconImgCut() {
            return this.f10484a;
        }

        public boolean isUseAshmem() {
            return this.b;
        }

        public Bitmap cutImage_keepRatio(InputStream inputStream, int i, int i2) {
            return this.f10484a.cutImage_keepRatio(inputStream, i, i2);
        }
    }

    class FalconImageCutProxy implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private FalconInterface f10483a;

        public FalconImageCutProxy(FalconInterface falconInterface) {
            this.f10483a = falconInterface;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (ByteArrayOutputStream.class.equals(method.getReturnType())) {
                return method.invoke(this.f10483a, objArr);
            }
            return a(method, objArr);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object a(java.lang.reflect.Method r8, java.lang.Object[] r9) {
            /*
                r7 = this;
                java.lang.String r0 = "FalconImageCutProxy decode by ashmem error"
                java.lang.String r1 = "FalconFacade"
                com.alibaba.griver.image.framework.utils.FalconFacade$FalconInterface r2 = r7.f10483a
                com.alibaba.griver.image.framework.utils.FalconDecoderBridge r2 = r2.getFalconImgCut()
                com.alibaba.griver.image.framework.utils.FalconFacade$FalconInterface r3 = r7.f10483a
                boolean r3 = r3.isUseAshmem()
                r4 = 1
                r5 = 0
                r6 = 0
                if (r3 == 0) goto L_0x0038
                com.alibaba.griver.image.framework.utils.FalconFacade$FalconInterface r3 = r7.f10483a     // Catch:{ InvocationTargetException -> 0x0027, all -> 0x0022 }
                java.lang.Object r0 = r8.invoke(r3, r9)     // Catch:{ InvocationTargetException -> 0x0027, all -> 0x0022 }
                if (r0 == 0) goto L_0x001f
                r1 = 1
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                r6 = r0
                goto L_0x0030
            L_0x0022:
                r3 = move-exception
                com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r0, r3)
                goto L_0x002f
            L_0x0027:
                r3 = move-exception
                java.lang.Throwable r3 = r3.getCause()
                com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r0, r3)
            L_0x002f:
                r1 = 0
            L_0x0030:
                if (r1 != 0) goto L_0x0039
                java.lang.String r0 = "FalconImageCutProxy decode by ashmem result: false"
                com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0)
                goto L_0x0039
            L_0x0038:
                r1 = 0
            L_0x0039:
                if (r1 != 0) goto L_0x0044
                r2.setIsUseNewMethod(r5)
                com.alibaba.griver.image.framework.utils.FalconFacade$FalconInterface r0 = r7.f10483a
                java.lang.Object r6 = r8.invoke(r0, r9)
            L_0x0044:
                boolean r8 = r6 instanceof android.graphics.Bitmap
                if (r8 == 0) goto L_0x004e
                r8 = r6
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r8.setHasAlpha(r4)
            L_0x004e:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.FalconFacade.FalconImageCutProxy.a(java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }
}
