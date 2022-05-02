package com.alibaba.griver.image.photo.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.image.framework.api.APImageFormat;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ImageObserver {
    private static ImageObserver d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<ImageFileObserver> f10505a;
    private HandlerThread b;
    private Handler c = new Handler(this.b.getLooper());
    private volatile boolean e;

    private ImageObserver() {
        HandlerThread handlerThread = new HandlerThread("BeeImageObserverThread");
        this.b = handlerThread;
        handlerThread.start();
    }

    public static synchronized ImageObserver getInstance() {
        ImageObserver imageObserver;
        synchronized (ImageObserver.class) {
            if (d == null) {
                d = new ImageObserver();
            }
            imageObserver = d;
        }
        return imageObserver;
    }

    public void active(final List list) {
        if (!this.e) {
            this.e = true;
            a((Runnable) new Runnable() {
                public void run() {
                    ImageObserver.this.a(list);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(List list) {
        StringBuilder sb = new StringBuilder("doActive### count = ");
        sb.append(list == null ? 0 : list.size());
        RVLogger.d("ImageObserver", sb.toString());
        this.f10505a = new LinkedList();
        if (list != null && !list.isEmpty()) {
            for (Object valueOf : list) {
                ImageFileObserver imageFileObserver = new ImageFileObserver(String.valueOf(valueOf));
                this.f10505a.add(imageFileObserver);
                imageFileObserver.startWatching();
            }
        }
    }

    public void destroy() {
        a((Runnable) new Runnable() {
            public void run() {
                if (ImageObserver.this.f10505a != null && !ImageObserver.this.f10505a.isEmpty()) {
                    for (ImageFileObserver stopWatching : ImageObserver.this.f10505a) {
                        stopWatching.stopWatching();
                    }
                    ImageObserver.this.f10505a.clear();
                }
            }
        });
    }

    private void a(Runnable runnable) {
        a(runnable, 0);
    }

    private void a(Runnable runnable, int i) {
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        if (i > 0) {
            handler.postDelayed(new SafeRunnable(runnable), (long) i);
        } else {
            handler.post(new SafeRunnable(runnable));
        }
    }

    class SafeRunnable implements Runnable {
        Runnable mRunnable;

        public SafeRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }

        public void run() {
            try {
                if (this.mRunnable != null) {
                    this.mRunnable.run();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("SafeRunnable exception:");
                sb.append(th.getMessage());
                RVLogger.d("ImageObserver", sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(final String str) {
        a(new Runnable() {
            public void run() {
                ImageObserver.this.b(str);
            }
        }, 3000);
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        RVLogger.d("ImageObserver", "doScanImage### path = ".concat(String.valueOf(str)));
        String substring = str.substring(str.lastIndexOf(".") + 1);
        if (!c(substring)) {
            RVLogger.d("ImageObserver", "Ignore invalid file suffix = ".concat(String.valueOf(substring)));
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            RVLogger.d("ImageObserver", "Ignore path = ".concat(String.valueOf(str)));
            return;
        }
        RVLogger.d("ImageObserver", "Do scan path = ".concat(String.valueOf(str)));
        GriverEnv.getApplicationContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    private boolean c(String str) {
        return str.equalsIgnoreCase(APImageFormat.SUFFIX_JPG) || str.equalsIgnoreCase(APImageFormat.SUFFIX_PNG) || str.equalsIgnoreCase("jpeg") || str.equalsIgnoreCase("bmp") || str.equalsIgnoreCase(APImageFormat.SUFFIX_GIF);
    }

    class ImageFileObserver extends FileObserver {
        String mDir;

        ImageFileObserver(String str) {
            super(str, 136);
            this.mDir = str;
        }

        public void onEvent(int i, String str) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(495580122, oncanceled);
                onCancelLoad.getMin(495580122, oncanceled);
            }
            if (128 == i || 8 == i) {
                ImageObserver imageObserver = ImageObserver.this;
                StringBuilder sb = new StringBuilder();
                sb.append(this.mDir);
                sb.append(File.separator);
                sb.append(str);
                imageObserver.a(sb.toString());
            }
        }
    }
}
