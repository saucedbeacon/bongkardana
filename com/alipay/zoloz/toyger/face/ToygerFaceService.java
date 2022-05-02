package com.alipay.zoloz.toyger.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alipay.zoloz.toyger.ToygerService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.Toyger;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class ToygerFaceService extends ToygerService<ToygerFaceCallback, ToygerFaceState, ToygerFaceAttr, ToygerFaceInfo, ToygerFaceAlgorithmConfig> {
    public static final String KEY_TOYGER_DEPTH_FRAME = "toyger_depth_frame";
    public static final String KEY_TOYGER_FRAME = "toyger_frame";
    public static final String KEY_TOYGER_TIME_CONSUMING = "toygerTimeConsuming";
    private static final int QUEUE_LENGTH = 1;
    private static short[] depthCache;
    /* access modifiers changed from: private */
    public static String licenses;
    /* access modifiers changed from: private */
    public static byte[] model;
    private static byte[] yuvCache;
    private FaceBlobManager blobManager;
    private ToygerFaceAlgorithmConfig faceAlgConfig;
    /* access modifiers changed from: private */
    public boolean isMirror = false;
    private String mBisToken;
    /* access modifiers changed from: private */
    public final ReentrantLock mColorFrameQueueLock = new ReentrantLock();
    private FaceDetector mFaceDetector;
    /* access modifiers changed from: private */
    public final FrameProcessor mFrameProcessor = new FrameProcessor();
    /* access modifiers changed from: private */
    public final BlockingQueue<TGFrame> mFrameQueue = new LinkedBlockingDeque(1);
    private HandlerThread mProcessThread;
    private Handler mProcessThreadHandler;
    private int mRetryTimes = 0;
    /* access modifiers changed from: private */
    public final AtomicBoolean mRunning = new AtomicBoolean(false);
    boolean needFppPreprocess;

    private byte[] generateNormalImg(List<ToygerFaceInfo> list, Map<String, Object> map) {
        return null;
    }

    public void setBisToken(String str) {
        this.mBisToken = str;
    }

    public void setRetryTimes(int i) {
        this.mRetryTimes = i;
    }

    private static boolean load(Context context) {
        try {
            InputStream open = context.getAssets().open(ToygerService.ASSET_FACE);
            byte[] bArr = new byte[open.available()];
            model = bArr;
            open.read(bArr);
            if (model == null) {
                return false;
            }
            try {
                InputStream open2 = context.getAssets().open(ToygerService.ASSET_LICENSE);
                byte[] bArr2 = new byte[open2.available()];
                open2.read(bArr2);
                licenses = new String(bArr2);
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    public static boolean preLoad(Context context) {
        if (model != null) {
            return true;
        }
        return load(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x00fe A[EDGE_INSN: B:123:0x00fe->B:49:0x00fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean init(android.content.Context r13, java.lang.String r14, com.alipay.zoloz.toyger.face.ToygerFaceCallback r15, java.lang.String r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
        /*
            r12 = this;
            r8 = r12
            r2 = r18
            r0 = 0
            if (r13 == 0) goto L_0x000b
            android.content.Context r1 = r13.getApplicationContext()
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            r3 = 0
            if (r1 == 0) goto L_0x002d
            if (r14 == 0) goto L_0x0016
            int r4 = r14.length()
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            int r1 = o.dispatchOnCancelled.setMin(r1, r4)
            if (r4 == r1) goto L_0x002d
            o.onCanceled r5 = new o.onCanceled
            r6 = 8
            r5.<init>(r4, r1, r6)
            r1 = -1890014222(0xffffffff8f58abf2, float:-1.0682738E-29)
            o.onCancelLoad.setMax(r1, r5)
            o.onCancelLoad.getMin(r1, r5)
        L_0x002d:
            r1 = r15
            r8.mToygerCallback = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r4 = "seed"
            java.lang.String r5 = "ztech_enter"
            r1.put(r4, r5)
            java.lang.String r4 = "module"
            java.lang.String r5 = "toyger"
            r1.put(r4, r5)
            com.alipay.zoloz.toyger.ToygerCallback r4 = r8.mToygerCallback
            com.alipay.zoloz.toyger.face.ToygerFaceCallback r4 = (com.alipay.zoloz.toyger.face.ToygerFaceCallback) r4
            r5 = -7
            r4.onEvent(r5, r1)
            byte[] r1 = model
            if (r1 != 0) goto L_0x0052
            load(r13)
        L_0x0052:
            android.os.HandlerThread r1 = r8.mProcessThread
            if (r1 != 0) goto L_0x0062
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r4 = "ToygerProcessQueue"
            r1.<init>(r4)
            r8.mProcessThread = r1
            r1.start()
        L_0x0062:
            android.os.Handler r1 = r8.mProcessThreadHandler
            if (r1 != 0) goto L_0x0073
            android.os.Handler r1 = new android.os.Handler
            android.os.HandlerThread r4 = r8.mProcessThread
            android.os.Looper r4 = r4.getLooper()
            r1.<init>(r4)
            r8.mProcessThreadHandler = r1
        L_0x0073:
            if (r2 == 0) goto L_0x0088
            java.lang.String r1 = "pubkey"
            boolean r4 = r2.containsKey(r1)
            if (r4 == 0) goto L_0x0088
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = r1.toString()
            r4 = r17
            goto L_0x008b
        L_0x0088:
            r4 = r17
            r1 = r0
        L_0x008b:
            com.alipay.zoloz.toyger.face.ToygerFaceBlobConfig r1 = com.alipay.zoloz.toyger.face.ToygerFaceBlobConfig.from(r4, r1)
            if (r1 != 0) goto L_0x0092
            return r3
        L_0x0092:
            if (r2 == 0) goto L_0x00aa
            java.lang.String r4 = "is_mirror"
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r8.isMirror = r4
        L_0x00aa:
            r4 = 2
            if (r2 == 0) goto L_0x00c1
            java.lang.String r5 = "meta_serializer"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r4 = r2.get(r5)
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
        L_0x00c1:
            com.alipay.zoloz.toyger.face.FaceBlobManager r5 = new com.alipay.zoloz.toyger.face.FaceBlobManager
            r5.<init>(r4, r1)
            r8.blobManager = r5
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r4 = com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.from(r16)
            r8.faceAlgConfig = r4
            if (r4 != 0) goto L_0x00d7
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r4 = new com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig
            r4.<init>()
            r8.faceAlgConfig = r4
        L_0x00d7:
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r4 = r8.faceAlgConfig
            java.util.List<java.lang.String> r4 = r4.liveness_combination
            java.util.Iterator r4 = r4.iterator()
        L_0x00df:
            boolean r5 = r4.hasNext()
            r9 = 1
            if (r5 == 0) goto L_0x00fe
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "fpp"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00fc
            java.lang.String r6 = "BlinkLiveness"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00df
        L_0x00fc:
            r8.needFppPreprocess = r9
        L_0x00fe:
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r4 = r8.faceAlgConfig
            boolean r5 = r8.needFppPreprocess
            com.alipay.zoloz.toyger.algorithm.ToygerConfig r4 = r4.toToygerConfig(r5)
            java.util.List<java.lang.String> r5 = r1.collection
            java.lang.String r6 = "#"
            java.lang.String r7 = ""
            r10 = r7
            if (r5 == 0) goto L_0x013a
            r5 = 0
        L_0x0110:
            java.util.List<java.lang.String> r11 = r1.collection
            int r11 = r11.size()
            if (r5 >= r11) goto L_0x013a
            int r11 = r10.length()
            if (r11 <= 0) goto L_0x012f
            java.lang.String r10 = r10.concat(r6)
            java.util.List<java.lang.String> r11 = r1.collection
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r10 = r10.concat(r11)
            goto L_0x0137
        L_0x012f:
            java.util.List<java.lang.String> r10 = r1.collection
            java.lang.Object r10 = r10.get(r5)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0137:
            int r5 = r5 + 1
            goto L_0x0110
        L_0x013a:
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r1 = r4.livenessConfig
            r1.collection = r10
            r1 = 0
        L_0x013f:
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r5 = r8.faceAlgConfig
            java.util.List<java.lang.String> r5 = r5.liveness_combination
            int r5 = r5.size()
            if (r1 >= r5) goto L_0x0170
            int r5 = r7.length()
            if (r5 <= 0) goto L_0x0162
            java.lang.String r5 = r7.concat(r6)
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r7 = r8.faceAlgConfig
            java.util.List<java.lang.String> r7 = r7.liveness_combination
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r5 = r5.concat(r7)
            goto L_0x016c
        L_0x0162:
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r5 = r8.faceAlgConfig
            java.util.List<java.lang.String> r5 = r5.liveness_combination
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
        L_0x016c:
            r7 = r5
            int r1 = r1 + 1
            goto L_0x013f
        L_0x0170:
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r1 = r4.livenessConfig
            r1.livenessCombinations = r7
            com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig r1 = r8.faceAlgConfig
            java.util.Map<java.lang.String, java.util.List<java.lang.Float>> r1 = r1.threshold
            if (r1 == 0) goto L_0x0263
            java.lang.String r5 = "DragonflyLiveness"
            java.lang.Object r5 = r1.get(r5)
            boolean r6 = r5 instanceof java.util.List
            if (r6 == 0) goto L_0x0187
            java.util.List r5 = (java.util.List) r5
            goto L_0x0188
        L_0x0187:
            r5 = r0
        L_0x0188:
            if (r5 == 0) goto L_0x01ab
            r6 = 0
        L_0x018b:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x01ab
            java.lang.Object r7 = r5.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            if (r6 != 0) goto L_0x01a2
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r10 = r4.livenessConfig
            r10.dragonflyMin = r7
            goto L_0x01a8
        L_0x01a2:
            if (r6 != r9) goto L_0x01a8
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r10 = r4.livenessConfig
            r10.dragonflyMax = r7
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x018b
        L_0x01ab:
            java.lang.String r5 = "GeminiLiveness"
            java.lang.Object r5 = r1.get(r5)
            boolean r6 = r5 instanceof java.util.List
            if (r6 == 0) goto L_0x01b8
            java.util.List r5 = (java.util.List) r5
            goto L_0x01b9
        L_0x01b8:
            r5 = r0
        L_0x01b9:
            if (r5 == 0) goto L_0x01dc
            r6 = 0
        L_0x01bc:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x01dc
            java.lang.Object r7 = r5.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            if (r6 != 0) goto L_0x01d3
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r10 = r4.livenessConfig
            r10.geminiMin = r7
            goto L_0x01d9
        L_0x01d3:
            if (r6 != r9) goto L_0x01d9
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r10 = r4.livenessConfig
            r10.geminiMax = r7
        L_0x01d9:
            int r6 = r6 + 1
            goto L_0x01bc
        L_0x01dc:
            java.lang.String r5 = "BatLiveness"
            java.lang.Object r5 = r1.get(r5)
            boolean r6 = r5 instanceof java.util.List
            if (r6 == 0) goto L_0x01e9
            r0 = r5
            java.util.List r0 = (java.util.List) r0
        L_0x01e9:
            if (r0 == 0) goto L_0x01ff
            int r5 = r0.size()
            if (r5 <= 0) goto L_0x01ff
            com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig r5 = r4.livenessConfig
            java.lang.Object r0 = r0.get(r3)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r5.batLivenessThreshold = r0
        L_0x01ff:
            java.lang.String r0 = "zfaceBlinkLiveness"
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0231
            int r5 = r0.size()
            if (r5 <= 0) goto L_0x021d
            com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig r5 = r4.qualityConfig
            java.lang.Object r6 = r0.get(r3)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5.blinkOpenness = r6
        L_0x021d:
            int r5 = r0.size()
            if (r5 <= r9) goto L_0x0231
            com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig r5 = r4.qualityConfig
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r5.diffThreshold = r0
        L_0x0231:
            java.lang.String r0 = "ZisaBlinkLiveness"
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0263
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x024f
            com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig r1 = r4.qualityConfig
            java.lang.Object r3 = r0.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.blinkOpenness = r3
        L_0x024f:
            int r1 = r0.size()
            if (r1 <= r9) goto L_0x0263
            com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig r1 = r4.qualityConfig
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.diffThreshold = r0
        L_0x0263:
            com.alipay.zoloz.toyger.ToygerCallback r0 = r8.mToygerCallback
            r7 = r0
            com.alipay.zoloz.toyger.face.ToygerFaceCallback r7 = (com.alipay.zoloz.toyger.face.ToygerFaceCallback) r7
            android.os.Handler r10 = r8.mProcessThreadHandler
            com.alipay.zoloz.toyger.face.ToygerFaceService$1 r11 = new com.alipay.zoloz.toyger.face.ToygerFaceService$1
            r0 = r11
            r1 = r12
            r2 = r18
            r3 = r4
            r4 = r14
            r5 = r13
            r6 = r12
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.post(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.face.ToygerFaceService.init(android.content.Context, java.lang.String, com.alipay.zoloz.toyger.face.ToygerFaceCallback, java.lang.String, java.lang.String, java.util.Map):boolean");
    }

    public boolean processImage(TGFrame tGFrame) {
        if (this.mFrameQueue.remainingCapacity() > 0) {
            this.mFrameQueue.offer(tGFrame.deepCopy());
            Handler handler = this.mProcessThreadHandler;
            if (handler == null) {
                return false;
            }
            handler.post(new Runnable() {
                public void run() {
                    try {
                        if (ToygerFaceService.this.mRunning.get()) {
                            TGFrame tGFrame = (TGFrame) ToygerFaceService.this.mFrameQueue.poll(1, TimeUnit.SECONDS);
                            ToygerFaceService.this.mColorFrameQueueLock.lock();
                            if (tGFrame != null) {
                                if (ToygerFaceService.this.isMirror) {
                                    tGFrame.data = ToygerFaceService.mirrorYUV420(tGFrame.data, tGFrame.width, tGFrame.height);
                                }
                                Toyger.processImage(tGFrame);
                            }
                            ToygerFaceService.this.mFrameProcessor.clearFrame();
                            ToygerFaceService.this.mColorFrameQueueLock.unlock();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        return true;
    }

    public void reset() {
        Iterator it = this.mFrameQueue.iterator();
        while (it.hasNext()) {
            try {
                this.mColorFrameQueueLock.lock();
                ((TGFrame) it.next()).recycle();
                this.mColorFrameQueueLock.unlock();
                it.remove();
            } catch (Throwable unused) {
            }
        }
        this.mProcessThreadHandler.post(new Runnable() {
            public void run() {
                Toyger.reset();
            }
        });
    }

    public void release() {
        this.mRunning.set(false);
        HashMap hashMap = new HashMap();
        hashMap.put("seed", "ztech_exit");
        hashMap.put("module", "toyger");
        ((ToygerFaceCallback) this.mToygerCallback).onEvent(-7, hashMap);
        reset();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mProcessThreadHandler.post(new Runnable() {
            public void run() {
                Toyger.release();
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(1, TimeUnit.SECONDS);
            if (this.mProcessThread != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.mProcessThread.quitSafely();
                } else {
                    this.mProcessThread.quit();
                }
            }
            this.mProcessThread = null;
            this.mProcessThreadHandler.removeCallbacksAndMessages((Object) null);
            this.mProcessThreadHandler = null;
        } catch (InterruptedException unused) {
        }
        yuvCache = null;
        depthCache = null;
    }

    public void handleEventTriggered(int i, String str) {
        super.handleEventTriggered(i, str);
    }

    public void handleStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr) {
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_TOYGER_FRAME, this.mFrameProcessor.getTgFrame());
        ((ToygerFaceCallback) this.mToygerCallback).onStateUpdated(toygerFaceState, toygerFaceAttr, hashMap);
    }

    public void handleInfoReady(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
        if (2 == this.faceAlgConfig.log_level) {
            FrameProcessor.clearOldBinFiles();
            int i = tGFrame.rotation % 180 == 0 ? tGFrame.width : tGFrame.height;
            Rect convertFaceRegion = FaceBlobManager.convertFaceRegion(toygerFaceAttr.faceRegion, i, i == tGFrame.width ? tGFrame.height : tGFrame.width, tGFrame.rotation, false);
            StringBuilder sb = new StringBuilder();
            sb.append(convertFaceRegion.left);
            sb.append("_");
            sb.append(convertFaceRegion.top);
            sb.append("_");
            sb.append(convertFaceRegion.right);
            sb.append("_");
            sb.append(convertFaceRegion.bottom);
            String obj = sb.toString();
            this.mFrameProcessor.saveTgFrame(obj);
            this.mFrameProcessor.saveTgDepthFrame(obj);
        }
        Bitmap rotateBitmap = BitmapHelper.rotateBitmap(BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, tGFrame.frameMode), tGFrame.rotation);
        ((ToygerFaceCallback) this.mToygerCallback).onHighQualityFrame(BitmapHelper.reverseBitmap(rotateBitmap, 0), toygerFaceAttr);
        if (rotateBitmap != null) {
            rotateBitmap.recycle();
        }
    }

    private void onHighQuallity(ToygerFaceInfo toygerFaceInfo) {
        TGFrame tGFrame = toygerFaceInfo.frame;
        Bitmap reverseBitmap = BitmapHelper.reverseBitmap(BitmapHelper.rotateBitmap(BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, tGFrame.frameMode), tGFrame.rotation), 0);
        ((ToygerFaceCallback) this.mToygerCallback).onHighQualityFrame(reverseBitmap, (ToygerFaceAttr) toygerFaceInfo.attr);
    }

    public void handleFinished(int i, List<ToygerFaceInfo> list, Map<String, Object> map) {
        map.put("bis_token", this.mBisToken);
        map.put(BlobStatic.BLOB_META_RETRY, Integer.valueOf(this.mRetryTimes));
        if (i == 0) {
            map.put(BlobStatic.DRAGONFLY_PASS, 1);
            ArrayList arrayList = new ArrayList();
            onHighQuallity(list.get(0));
            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                map.put(BlobStatic.BLOB_META_INVTP_TYPE, BlobStatic.INVTP_TYPE_ASYNC_UPLOAD);
                ToygerFaceInfo toygerFaceInfo = list.get(i2);
                if (toygerFaceInfo != null) {
                    arrayList.add(this.blobManager.generateBlob(Arrays.asList(new ToygerFaceInfo[]{toygerFaceInfo}), map));
                }
            }
            if (list.size() > 0) {
                map.put(BlobStatic.BLOB_META_INVTP_TYPE, "normal");
                ToygerFaceInfo toygerFaceInfo2 = list.get(list.size() - 1);
                if (toygerFaceInfo2 != null) {
                    arrayList.add(this.blobManager.generateBlob(Arrays.asList(new ToygerFaceInfo[]{toygerFaceInfo2}), map));
                }
            }
            byte[] key = this.blobManager.getKey();
            StringBuilder sb = new StringBuilder("handleFinished(): result=");
            sb.append(i);
            sb.append(", infos=");
            sb.append(list);
            sb.append(", extIno=");
            sb.append(map);
            sb.append(", key:");
            sb.append(key.length);
            ((ToygerFaceCallback) this.mToygerCallback).onComplete(i, (List<byte[]>) arrayList, key, this.blobManager.isUTF8());
        } else if (i == 1) {
            HashMap hashMap = new HashMap();
            map.put(BlobStatic.BLOB_META_INVTP_TYPE, BlobStatic.INVTP_TYPE_ASYNC_UPLOAD);
            map.put(BlobStatic.DRAGONFLY_PASS, 0);
            for (ToygerFaceInfo next : list) {
                if (ToygerFaceElementType.getBlobElemType(next).equals(BlobStatic.SUB_TYPE_PANO)) {
                    hashMap.put("data", this.blobManager.generateBlob(Arrays.asList(new ToygerFaceInfo[]{next}), map));
                }
            }
            hashMap.put("key", this.blobManager.getKey());
            hashMap.put("utf8", Boolean.valueOf(this.blobManager.isUTF8()));
            ((ToygerFaceCallback) this.mToygerCallback).onEvent(-3, hashMap);
        } else {
            ((ToygerFaceCallback) this.mToygerCallback).onEvent(-8, (Map<String, Object>) null);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] mirrorYUV420(byte[] bArr, int i, int i2) {
        if (yuvCache == null) {
            yuvCache = new byte[(((i * i2) * 3) / 2)];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = i - 1; i5 >= 0; i5--) {
                yuvCache[i3] = bArr[(i4 * i) + i5];
                i3++;
            }
        }
        for (int i6 = i2; i6 < (i2 * 3) / 2; i6++) {
            for (int i7 = i - 2; i7 >= 0; i7 -= 2) {
                byte[] bArr2 = yuvCache;
                int i8 = (i6 * i) + i7;
                bArr2[i3] = bArr[i8];
                int i9 = i3 + 1;
                bArr2[i9] = bArr[i8 + 1];
                i3 = i9 + 1;
            }
        }
        byte[] bArr3 = yuvCache;
        System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
        return bArr;
    }

    public List<LivenessAction> getLivenessActions() {
        ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig = this.faceAlgConfig;
        if (toygerFaceAlgorithmConfig != null) {
            return toygerFaceAlgorithmConfig.liveness_action_combination;
        }
        return null;
    }
}
