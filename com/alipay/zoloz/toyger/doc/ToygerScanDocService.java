package com.alipay.zoloz.toyger.doc;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.IToygerDocDelegate;
import com.alipay.zoloz.toyger.ToygerService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerDoc;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.alipay.zoloz.toyger.blob.model.BlobElem;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ToygerScanDocService implements IToygerDocDelegate {
    /* access modifiers changed from: private */
    public final String TAG = ToygerScanDocService.class.getName();
    /* access modifiers changed from: private */
    public final AtomicBoolean isToygerReady = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public DocBlobManager mBlobManager;
    private List<BlobElem> mCacheData = new ArrayList();
    /* access modifiers changed from: private */
    public final ReentrantLock mColorFrameQueueLock = new ReentrantLock();
    /* access modifiers changed from: private */
    public ToygerDocBlobConfig mDocBlobConfig;
    /* access modifiers changed from: private */
    public ToygerDocConfig mDocConfig;
    /* access modifiers changed from: private */
    public final BlockingQueue<TGFrame> mFrameQueue = new LinkedBlockingDeque(1);
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Handler mProcessHandler;
    private HandlerThread mProcessThread;
    /* access modifiers changed from: private */
    public ToygerDocCallback mToygerCallback;

    public void handleInfoReady(TGFrame tGFrame, ToygerDocAttr toygerDocAttr) {
    }

    public void handleLog(int i, String str, byte[] bArr) {
    }

    private byte[] loadModel(Context context) {
        try {
            InputStream open = context.getAssets().open(ToygerService.ASSET_FACE);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private String loadLicense(Context context) {
        try {
            InputStream open = context.getAssets().open(ToygerService.ASSET_LICENSE);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            return new String(bArr);
        } catch (Exception unused) {
            return "";
        }
    }

    public boolean init(Context context, String str, ToygerDocCallback toygerDocCallback) {
        return init(context, str, toygerDocCallback, (Map<String, Object>) null);
    }

    public boolean init(Context context, String str, ToygerDocCallback toygerDocCallback, Map<String, Object> map) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 2;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-971849981, oncanceled);
            onCancelLoad.getMin(-971849981, oncanceled);
        }
        this.mToygerCallback = toygerDocCallback;
        byte[] loadModel = loadModel(context);
        initThread();
        if (map != null && map.containsKey("meta_serializer")) {
            i = Integer.parseInt(map.get("meta_serializer").toString());
        }
        initBlobManager(i);
        if (TextUtils.isEmpty(str)) {
            str = loadLicense(context);
        }
        initToyger(context, loadModel, str);
        return true;
    }

    private void initThread() {
        HandlerThread handlerThread = new HandlerThread("ToygerProcessDocQueue");
        this.mProcessThread = handlerThread;
        handlerThread.start();
        this.mProcessHandler = new Handler(this.mProcessThread.getLooper());
    }

    private void initBlobManager(int i) {
        this.mBlobManager = new DocBlobManager(i);
    }

    private void initToyger(final Context context, final byte[] bArr, final String str) {
        this.mProcessHandler.post(new Runnable() {
            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put("StateSignature", ToygerDocState.class.getName().replace(".", "/"));
                hashMap.put("AttrSignature", ToygerDocAttr.class.getName().replace(".", "/"));
                hashMap.put("FrameSignature", TGFrame.class.getName().replace(".", "/"));
                hashMap.put("Algorithm", "Doc");
                Context context = context;
                if (ToygerDoc.init(context, bArr, str, context.getPackageName(), hashMap)) {
                    ToygerScanDocService.this.mToygerCallback.onEvent(1, (Map<String, Object>) null);
                } else {
                    ToygerScanDocService.this.mToygerCallback.onEvent(-4, (Map<String, Object>) null);
                }
            }
        });
    }

    public void config(final String str, final String str2, final Map<String, Object> map) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(23460593, oncanceled);
            onCancelLoad.getMin(23460593, oncanceled);
        }
        this.mProcessHandler.post(new Runnable() {
            public void run() {
                try {
                    ToygerScanDocService.this.mColorFrameQueueLock.lock();
                    ToygerDoc.reset();
                    ToygerDocBlobConfig unused = ToygerScanDocService.this.mDocBlobConfig = (ToygerDocBlobConfig) JSON.parseObject(str2, ToygerDocBlobConfig.class);
                    ToygerScanDocService.this.mBlobManager.setBlobConfig(ToygerScanDocService.this.mDocBlobConfig);
                    ToygerDocConfig unused2 = ToygerScanDocService.this.mDocConfig = (ToygerDocConfig) JSON.parseObject(str, ToygerDocConfig.class);
                    ToygerScanDocService.this.mDocConfig.docType = ToygerScanDocService.this.mDocBlobConfig.docType;
                    ToygerScanDocService.this.mDocConfig.pageNo = ToygerScanDocService.this.mDocBlobConfig.pageNo;
                    if (map != null && map.containsKey(ToygerService.KEY_ROTATE_TIMES)) {
                        map.get(ToygerService.KEY_ROTATE_TIMES);
                    }
                    float[] fArr = (map == null || !map.containsKey(ToygerService.KEY_DOC_FRAME_POINTS)) ? null : (float[]) map.get(ToygerService.KEY_DOC_FRAME_POINTS);
                    if (fArr == null) {
                        ToygerScanDocService.this.mToygerCallback.onEvent(-8, (Map<String, Object>) null);
                    } else {
                        Rect rect = (map == null || !map.containsKey(ToygerService.KEY_DOC_FRAME_RECT)) ? null : (Rect) map.get(ToygerService.KEY_DOC_FRAME_RECT);
                        if (rect == null) {
                            ToygerScanDocService.this.mToygerCallback.onEvent(-8, (Map<String, Object>) null);
                        } else {
                            ToygerScanDocService.this.mDocConfig.points = fArr;
                            ToygerScanDocService.this.mDocConfig.rect = rect;
                            ToygerDoc.config(ToygerScanDocService.this, ToygerScanDocService.this.mDocConfig);
                            ToygerScanDocService.this.isToygerReady.set(true);
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th) {
                    ToygerScanDocService.this.mColorFrameQueueLock.unlock();
                    throw th;
                }
                ToygerScanDocService.this.mColorFrameQueueLock.unlock();
            }
        });
    }

    public void scan(TGFrame tGFrame) {
        TGFrame deepCopy;
        if (this.isToygerReady.get() && tGFrame != null && this.mFrameQueue.remainingCapacity() > 0 && (deepCopy = tGFrame.deepCopy()) != null) {
            this.mFrameQueue.offer(deepCopy);
            this.mProcessHandler.post(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
                    throw r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
                    com.alipay.zoloz.toyger.doc.ToygerScanDocService.access$700(r4.this$0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
                    com.alipay.zoloz.toyger.doc.ToygerScanDocService.access$100(r4.this$0).unlock();
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0028 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        com.alipay.zoloz.toyger.doc.ToygerScanDocService r0 = com.alipay.zoloz.toyger.doc.ToygerScanDocService.this     // Catch:{ all -> 0x0028 }
                        java.util.concurrent.BlockingQueue r0 = r0.mFrameQueue     // Catch:{ all -> 0x0028 }
                        r1 = 1
                        java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0028 }
                        java.lang.Object r0 = r0.poll(r1, r3)     // Catch:{ all -> 0x0028 }
                        com.alipay.zoloz.toyger.algorithm.TGFrame r0 = (com.alipay.zoloz.toyger.algorithm.TGFrame) r0     // Catch:{ all -> 0x0028 }
                        com.alipay.zoloz.toyger.doc.ToygerScanDocService r1 = com.alipay.zoloz.toyger.doc.ToygerScanDocService.this     // Catch:{ all -> 0x0028 }
                        java.util.concurrent.locks.ReentrantLock r1 = r1.mColorFrameQueueLock     // Catch:{ all -> 0x0028 }
                        r1.lock()     // Catch:{ all -> 0x0028 }
                        if (r0 == 0) goto L_0x001e
                        com.alipay.zoloz.toyger.algorithm.ToygerDoc.processImage(r0)     // Catch:{ all -> 0x0028 }
                    L_0x001e:
                        com.alipay.zoloz.toyger.doc.ToygerScanDocService r0 = com.alipay.zoloz.toyger.doc.ToygerScanDocService.this
                        java.util.concurrent.locks.ReentrantLock r0 = r0.mColorFrameQueueLock
                        r0.unlock()
                        return
                    L_0x0028:
                        com.alipay.zoloz.toyger.doc.ToygerScanDocService r0 = com.alipay.zoloz.toyger.doc.ToygerScanDocService.this     // Catch:{ all -> 0x002e }
                        java.lang.String unused = r0.TAG     // Catch:{ all -> 0x002e }
                        goto L_0x001e
                    L_0x002e:
                        r0 = move-exception
                        com.alipay.zoloz.toyger.doc.ToygerScanDocService r1 = com.alipay.zoloz.toyger.doc.ToygerScanDocService.this
                        java.util.concurrent.locks.ReentrantLock r1 = r1.mColorFrameQueueLock
                        r1.unlock()
                        goto L_0x003a
                    L_0x0039:
                        throw r0
                    L_0x003a:
                        goto L_0x0039
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.doc.ToygerScanDocService.AnonymousClass3.run():void");
                }
            });
        }
    }

    public void reset() {
        this.isToygerReady.set(true);
        ToygerDoc.reset();
        this.mFrameQueue.clear();
    }

    public void reset(boolean z) {
        if (z) {
            this.mCacheData.clear();
        }
        reset();
    }

    public void release() {
        this.mCacheData.clear();
        this.mToygerCallback = null;
        ToygerDoc.release();
    }

    public void handleStateUpdated(final ToygerDocState toygerDocState, final ToygerDocAttr toygerDocAttr) {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                ToygerScanDocService.this.mToygerCallback.onStateUpdated(toygerDocState, toygerDocAttr, (Map<String, Object>) null);
            }
        });
    }

    public void handleUpdate(final ToygerDocState toygerDocState, final ToygerDocAttr toygerDocAttr) {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                ToygerScanDocService.this.mToygerCallback.onStateUpdated(toygerDocState, toygerDocAttr, (Map<String, Object>) null);
            }
        });
    }

    public void handleFinish(final int i, final ToygerDocInfo toygerDocInfo) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(463198659, oncanceled);
            onCancelLoad.getMin(463198659, oncanceled);
        }
        if (i == 0) {
            this.mCacheData.add(this.mBlobManager.generateBlobElem(toygerDocInfo, this.mDocBlobConfig, this.mDocConfig));
        }
        this.mMainHandler.post(new Runnable() {
            public void run() {
                ToygerScanDocService.this.isToygerReady.set(false);
                int i = i;
                if (i == 0) {
                    ToygerScanDocService.this.mToygerCallback.onComplete(i, toygerDocInfo.frame);
                } else if (i == 1) {
                    ToygerScanDocService.this.mToygerCallback.onEvent(-9, (Map<String, Object>) null);
                } else {
                    ToygerScanDocService.this.mToygerCallback.onEvent(-8, (Map<String, Object>) null);
                }
            }
        });
    }

    public void handleEvent(int i, String str) {
        this.mToygerCallback.onEvent(i, (Map<String, Object>) null);
    }

    public void handleEventTriggered(int i, String str) {
        this.mToygerCallback.onEvent(i, (Map<String, Object>) null);
    }

    public Map<String, Object> generateScanBlob(String str, int i, Map<String, Object> map) {
        map.put("bis_token", str);
        map.put(BlobStatic.BLOB_META_INVTP_TYPE, "normal");
        map.put(BlobStatic.BLOB_META_RETRY, Integer.valueOf(i));
        List<BlobElem> list = this.mCacheData;
        if (list == null || list.size() <= 0) {
            return null;
        }
        byte[] generateScanBlob = this.mBlobManager.generateScanBlob(this.mCacheData, map);
        this.mCacheData.clear();
        HashMap hashMap = new HashMap();
        hashMap.put("content", generateScanBlob);
        hashMap.put("key", this.mBlobManager.getKey());
        hashMap.put(ToygerService.KEY_RES_9_IS_UTF8, Boolean.TRUE);
        return hashMap;
    }
}
