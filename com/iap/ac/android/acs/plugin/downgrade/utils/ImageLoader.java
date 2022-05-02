package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iap.ac.android.common.log.ACLog;
import java.net.URL;
import java.net.URLConnection;

public class ImageLoader {
    /* access modifiers changed from: private */
    public static final String TAG = ApiDowngradeUtils.logTag(com.alibaba.griver.base.common.ImageLoader.TAG);
    private static final int TIMEOUT_IN_MILLIS = 10000;

    interface OnLoaderListener {
        void onImageLoaded(Bitmap bitmap);
    }

    public static void loadImage(@NonNull final ImageView imageView, @NonNull String str, @Nullable final Drawable drawable) {
        AsyncTask.execute(new ImageLoaderRunnable(str, new OnLoaderListener() {
            public final void onImageLoaded(Bitmap bitmap) {
                if (bitmap == null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                ACLog.d(ImageLoader.TAG, "loadImage() onImageLoaded bitmap is ".concat(String.valueOf(bitmap)));
            }
        }));
    }

    protected static class ImageLoaderRunnable implements Runnable {
        /* access modifiers changed from: private */
        public OnLoaderListener listener;
        private String url;

        public ImageLoaderRunnable(String str, OnLoaderListener onLoaderListener) {
            this.url = str;
            this.listener = onLoaderListener;
        }

        public void run() {
            if (this.listener != null && !TextUtils.isEmpty(this.url)) {
                String access$000 = ImageLoader.TAG;
                StringBuilder sb = new StringBuilder("load image url: ");
                sb.append(this.url);
                ACLog.d(access$000, sb.toString());
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.url).openConnection());
                    uRLConnection.setConnectTimeout(10000);
                    uRLConnection.setReadTimeout(10000);
                    String access$0002 = ImageLoader.TAG;
                    StringBuilder sb2 = new StringBuilder("load image length: ");
                    sb2.append(uRLConnection.getContentLength());
                    ACLog.d(access$0002, sb2.toString());
                    final Bitmap decodeStream = BitmapFactory.decodeStream(uRLConnection.getInputStream());
                    ApiDowngradeUtils.runOnMain(new Runnable() {
                        public void run() {
                            ACLog.d(ImageLoader.TAG, "listener.onImageLoaded");
                            ImageLoaderRunnable.this.listener.onImageLoaded(decodeStream);
                        }
                    });
                } catch (Throwable th) {
                    ACLog.e(ImageLoader.TAG, "load onImageLoaded exception.", th);
                    ApiDowngradeUtils.runOnMain(new Runnable() {
                        public void run() {
                            if (ImageLoaderRunnable.this.listener != null) {
                                ImageLoaderRunnable.this.listener.onImageLoaded((Bitmap) null);
                            }
                        }
                    });
                }
            }
        }
    }
}
