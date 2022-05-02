package com.alibaba.griver.device.jsapi.screen;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.alibaba.griver.base.common.logger.GriverLogger;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import java.util.ArrayList;
import java.util.List;

public class ScreenShotObserver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10426a = {"_data", "date_added"};
    /* access modifiers changed from: private */
    public static final String b = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    /* access modifiers changed from: private */
    public final List<H5ScreenShotListener> c = new ArrayList();
    /* access modifiers changed from: private */
    public H5ScreenShotListener d;
    /* access modifiers changed from: private */
    public Context e;
    private final ContentObserver f = new ContentObserver(new Handler(Looper.getMainLooper())) {
        public void onChange(boolean z) {
            GriverLogger.d("H5ScreenShotObserver", "old onChange ".concat(String.valueOf(z)));
            try {
                super.onChange(z);
                onChange(z, (Uri) null);
            } catch (Throwable th) {
                GriverLogger.e("H5ScreenShotObserver", "screen shot error", th);
            }
        }

        /* access modifiers changed from: package-private */
        public Cursor query(Uri uri) {
            if (uri == null) {
                return ScreenShotObserver.this.e.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ScreenShotObserver.f10426a, (String) null, (String[]) null, "date_added DESC");
            }
            if (!uri.toString().contains(ScreenShotObserver.b)) {
                return null;
            }
            return ScreenShotObserver.this.e.getContentResolver().query(uri, ScreenShotObserver.f10426a, (String) null, (String[]) null, "date_added DESC");
        }

        public void onChange(boolean z, Uri uri) {
            try {
                StringBuilder sb = new StringBuilder("new onChange ");
                sb.append(z);
                sb.append(", uri ");
                sb.append(uri);
                GriverLogger.d("H5ScreenShotObserver", sb.toString());
                if (ScreenShotObserver.this.e == null) {
                    GriverLogger.w("H5ScreenShotObserver", "new onChange mContext == null");
                    return;
                }
                Cursor query = query(uri);
                if (query != null) {
                    if (!query.moveToFirst()) {
                        query.close();
                        return;
                    }
                    String string = query.getString(query.getColumnIndex("_data"));
                    if (Math.abs((System.currentTimeMillis() / 1000) - query.getLong(query.getColumnIndex("date_added"))) <= 10 && !TextUtils.isEmpty(string) && string.toLowerCase().contains(H5ActionJSApi.SCREENSHOT)) {
                        StringBuilder sb2 = new StringBuilder("onScreenShot, listeners: ");
                        sb2.append(ScreenShotObserver.this.c.size());
                        sb2.append(", path: ");
                        sb2.append(string);
                        GriverLogger.d("H5ScreenShotObserver", sb2.toString());
                        if (ScreenShotObserver.this.d != null) {
                            ScreenShotObserver.this.d.onScreenShot();
                        }
                        if (ScreenShotObserver.this.c.size() > 0) {
                            for (H5ScreenShotListener onScreenShot : ScreenShotObserver.this.c) {
                                onScreenShot.onScreenShot();
                            }
                        }
                    }
                    query.close();
                }
            } catch (Throwable th) {
                GriverLogger.e("H5ScreenShotObserver", "screen shot error", th);
            }
        }
    };

    public interface H5ScreenShotListener {
        void onScreenShot();
    }

    public ScreenShotObserver(Context context) {
        this.e = context;
        if (context != null) {
            GriverLogger.d("H5ScreenShotObserver", "registerContentObserver");
            this.e.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.f);
        }
    }

    public void setCommonListener(H5ScreenShotListener h5ScreenShotListener) {
        this.d = h5ScreenShotListener;
    }

    public void registerListener(H5ScreenShotListener h5ScreenShotListener) {
        this.c.add(h5ScreenShotListener);
    }

    public void release() {
        this.c.clear();
        if (this.e != null) {
            GriverLogger.d("H5ScreenShotObserver", "unregisterContentObserver");
            this.e.getContentResolver().unregisterContentObserver(this.f);
        }
        this.e = null;
    }
}
