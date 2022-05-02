package com.alipay.zoloz.zface.services;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.hardware.isp.IspService;
import com.alipay.zoloz.isp.IspResult;
import com.alipay.zoloz.isp.ToygerIsp;
import java.util.concurrent.TimeUnit;

public class ToygerIspService extends BioService {
    private static final float MAX_BRIGHTNESS = 0.7f;
    private static final float MIN_BRIGHTNESS = 0.3f;
    private static final String TAG = "ZFaceIspService";
    private final long ISP_DELAY = TimeUnit.SECONDS.toMillis(1);
    private long begin = 0;
    /* access modifiers changed from: private */
    public boolean ispRunning = false;
    private boolean mInitialized = false;
    private IspService mIspService;
    private HandlerThread mIspThread;
    /* access modifiers changed from: private */
    public Handler mIspThreadHandler;
    private ToygerIsp mToygerIsp;

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
    }

    public void init(int i, int i2, int i3, int i4, int i5) {
        if (this.mBioServiceManager != null) {
            this.mIspService = (IspService) this.mBioServiceManager.getBioService(IspService.class);
        }
        IspService ispService = this.mIspService;
        if (ispService != null) {
            float[] colorTemperature = ispService.getColorTemperature();
            float[][][] awbTable = this.mIspService.getAwbTable();
            HandlerThread handlerThread = new HandlerThread("adjustIsp");
            this.mIspThread = handlerThread;
            handlerThread.start();
            this.mIspThreadHandler = new Handler(this.mIspThread.getLooper());
            ToygerIsp toygerIsp = new ToygerIsp();
            this.mToygerIsp = toygerIsp;
            toygerIsp.init(i, i2, i3, i4, i5, colorTemperature, awbTable);
        }
        this.mInitialized = true;
        this.begin = System.currentTimeMillis();
    }

    private boolean validateRegion(RectF rectF) {
        if (rectF != null) {
            return rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void adjustIsp(final com.alipay.zoloz.toyger.algorithm.TGFrame r7, com.alipay.zoloz.toyger.algorithm.TGFaceState r8, com.alipay.zoloz.toyger.algorithm.TGFaceAttr r9) {
        /*
            r6 = this;
            com.alipay.zoloz.hardware.isp.IspService r0 = r6.mIspService
            if (r0 == 0) goto L_0x0071
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.begin
            long r0 = r0 - r2
            long r2 = r6.ISP_DELAY
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0071
            boolean r8 = r8.hasFace
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x002e
            android.graphics.RectF r8 = r9.faceRegion
            float r2 = r9.brightness
            r3 = 1050253722(0x3e99999a, float:0.3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0048
            float r9 = r9.brightness
            r2 = 1060320051(0x3f333333, float:0.7)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            r9 = 0
            goto L_0x0049
        L_0x002e:
            r8 = 1131413504(0x43700000, float:240.0)
            int r9 = r7.width
            float r9 = (float) r9
            float r8 = r8 / r9
            r9 = 1123024896(0x42f00000, float:120.0)
            int r2 = r7.height
            float r2 = (float) r2
            float r9 = r9 / r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r3 - r8
            float r5 = r3 - r9
            float r8 = r8 + r3
            float r9 = r9 + r3
            r2.<init>(r4, r5, r8, r9)
            r8 = r2
        L_0x0048:
            r9 = 1
        L_0x0049:
            if (r9 == 0) goto L_0x0071
            boolean r9 = r6.validateRegion(r8)
            if (r9 == 0) goto L_0x0071
            int r9 = r7.width
            int r2 = r7.height
            int r3 = r7.rotation
            android.graphics.Rect r8 = com.alipay.zoloz.toyger.face.FaceBlobManager.convertFaceRegion(r8, r9, r2, r3, r0)
            monitor-enter(r6)
            boolean r9 = r6.ispRunning     // Catch:{ all -> 0x006e }
            if (r9 != 0) goto L_0x006c
            r6.ispRunning = r1     // Catch:{ all -> 0x006e }
            android.os.Handler r9 = r6.mIspThreadHandler     // Catch:{ all -> 0x006e }
            com.alipay.zoloz.zface.services.ToygerIspService$1 r0 = new com.alipay.zoloz.zface.services.ToygerIspService$1     // Catch:{ all -> 0x006e }
            r0.<init>(r8, r7)     // Catch:{ all -> 0x006e }
            r9.post(r0)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.zface.services.ToygerIspService.adjustIsp(com.alipay.zoloz.toyger.algorithm.TGFrame, com.alipay.zoloz.toyger.algorithm.TGFaceState, com.alipay.zoloz.toyger.algorithm.TGFaceAttr):void");
    }

    /* access modifiers changed from: private */
    public void adjustIsp(Rect rect, byte[] bArr, short[] sArr) {
        int aEMode;
        IspService ispService = this.mIspService;
        if (ispService != null && (aEMode = ispService.getAEMode()) != -1) {
            if (aEMode == 1) {
                this.mIspService.setAEMode(0);
            }
            try {
                IspResult adjustIsp = this.mToygerIsp.adjustIsp(bArr, sArr, rect, this.mIspService.getExposureTime(), this.mIspService.getISO());
                if (adjustIsp != null) {
                    adjustIsp.isNeedSet();
                    adjustIsp.getExposureTime();
                    adjustIsp.getIso();
                    if (adjustIsp.isNeedSet()) {
                        this.mIspService.setExposureTime(adjustIsp.getExposureTime());
                        this.mIspService.setISO(adjustIsp.getIso());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onDestroy() {
        ToygerIsp toygerIsp = this.mToygerIsp;
        if (toygerIsp != null) {
            toygerIsp.release();
        }
        if (this.mIspThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.mIspThread.quitSafely();
            } else {
                this.mIspThread.quit();
            }
            this.mIspThread = null;
            this.mIspThreadHandler = null;
        }
        this.ispRunning = false;
        this.mIspService = null;
        super.onDestroy();
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }
}
