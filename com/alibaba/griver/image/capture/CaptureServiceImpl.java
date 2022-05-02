package com.alibaba.griver.image.capture;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.activity.GriverCaptureActivity;
import com.alibaba.griver.image.capture.listener.CaptureListener;
import com.alibaba.griver.image.capture.meta.MediaInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CaptureServiceImpl extends CaptureService {
    public static final String EXTRA_KEY_BUSINESS_ID = "businessId";

    /* renamed from: a  reason: collision with root package name */
    private static CaptureSession f9095a;

    public static synchronized void setUpCurrentSession(CaptureListener captureListener) {
        synchronized (CaptureServiceImpl.class) {
            if (f9095a != null) {
                if (f9095a.getListener() == captureListener) {
                    RVLogger.w("CaptureServiceImpl", "CaptureListener is same,do nothing.");
                } else {
                    RVLogger.w("CaptureServiceImpl", "Capture job concurrent,cancel the old one!");
                }
            }
            RVLogger.w("CaptureServiceImpl", "Update CaptureSession");
            f9095a = new CaptureSession(captureListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void notifyAction(boolean r3, com.alibaba.griver.image.capture.meta.MediaInfo r4, boolean r5) {
        /*
            java.lang.Class<com.alibaba.griver.image.capture.CaptureServiceImpl> r0 = com.alibaba.griver.image.capture.CaptureServiceImpl.class
            monitor-enter(r0)
            java.lang.String r1 = "CaptureServiceImpl"
            java.lang.String r2 = "notifyAction called"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r2)     // Catch:{ all -> 0x002a }
            com.alibaba.griver.image.capture.CaptureServiceImpl$CaptureSession r1 = f9095a     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0021
            com.alibaba.griver.image.capture.CaptureServiceImpl$CaptureSession r1 = f9095a     // Catch:{ all -> 0x002a }
            r1.notifyAction(r3, r4)     // Catch:{ all -> 0x002a }
            if (r5 == 0) goto L_0x001f
            java.lang.String r3 = "CaptureServiceImpl"
            java.lang.String r4 = "Clear session"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r4)     // Catch:{ all -> 0x002a }
            r3 = 0
            f9095a = r3     // Catch:{ all -> 0x002a }
        L_0x001f:
            monitor-exit(r0)
            return
        L_0x0021:
            java.lang.String r3 = "CaptureServiceImpl"
            java.lang.String r4 = "notifyAction called when captureSession is Null!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.capture.CaptureServiceImpl.notifyAction(boolean, com.alibaba.griver.image.capture.meta.MediaInfo, boolean):void");
    }

    public void capture(App app, CaptureListener captureListener, String str, Bundle bundle) {
        if (a(str, captureListener)) {
            setUpCurrentSession(captureListener);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("businessId", str);
            Intent intent = new Intent(app.getAppContext().getContext(), GriverCaptureActivity.class);
            intent.putExtras(bundle);
            app.getAppContext().getContext().startActivity(intent);
            return;
        }
        RVLogger.d("CaptureServiceImpl", "CaptureService action called,but args is not valid!");
    }

    private boolean a(String str, CaptureListener captureListener) {
        return !TextUtils.isEmpty(str) && captureListener != null;
    }

    static class CaptureSession {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<CaptureListener> f10455a;
        public List<MediaInfo> mediaInfos = new LinkedList();

        public CaptureSession(CaptureListener captureListener) {
            this.f10455a = new WeakReference<>(captureListener);
        }

        public CaptureListener getListener() {
            return this.f10455a.get();
        }

        public void notifyAction(boolean z, MediaInfo mediaInfo) {
            if (mediaInfo == null) {
                notifyAction(z, (List<MediaInfo>) null, (Map<String, Object>) null);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(mediaInfo);
            notifyAction(z, linkedList, (Map<String, Object>) null);
        }

        public void notifyAction(boolean z, List<MediaInfo> list, Map<String, Object> map) {
            CaptureListener captureListener = this.f10455a.get();
            if (captureListener != null) {
                RVLogger.d("CaptureServiceImpl", "Is canceled : ".concat(String.valueOf(z)));
                captureListener.onAction(z, (list == null || list.isEmpty()) ? null : list.get(0));
            }
        }
    }
}
