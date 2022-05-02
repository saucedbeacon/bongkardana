package com.alibaba.griver.base.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;

public class ImageLoader implements Runnable {
    public static final String TAG = "ImageLoader";

    /* renamed from: a  reason: collision with root package name */
    private String f10217a;
    /* access modifiers changed from: private */
    public ImageListener b;

    public ImageLoader(String str, ImageListener imageListener) {
        this.f10217a = str;
        this.b = imageListener;
    }

    public void run() {
        if (this.b != null && !TextUtils.isEmpty(this.f10217a)) {
            StringBuilder sb = new StringBuilder("load image ");
            sb.append(this.f10217a);
            GriverLogger.d(TAG, sb.toString());
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f10217a).openConnection());
                uRLConnection.setConnectTimeout(10000);
                uRLConnection.setReadTimeout(10000);
                StringBuilder sb2 = new StringBuilder("load image length ");
                sb2.append(uRLConnection.getContentLength());
                GriverLogger.d(TAG, sb2.toString());
                final Bitmap decodeStream = BitmapFactory.decodeStream(uRLConnection.getInputStream());
                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                    public void run() {
                        GriverLogger.d(ImageLoader.TAG, "listener.onImage");
                        ImageLoader.this.b.onImage(decodeStream);
                    }
                });
            } catch (Throwable th) {
                GriverLogger.e(TAG, "load image exception.", th);
                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                    public void run() {
                        if (ImageLoader.this.b != null) {
                            ImageLoader.this.b.onImage((Bitmap) null);
                        }
                    }
                });
            }
        }
    }
}
