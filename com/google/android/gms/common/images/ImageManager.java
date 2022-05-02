package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import o.PlaybackStateCompat;
import o.onEmbedViewParamChanged;

public final class ImageManager {
    /* access modifiers changed from: private */
    public static final Object zaa = new Object();
    /* access modifiers changed from: private */
    public static HashSet<Uri> zab = new HashSet<>();
    private static ImageManager zac;
    /* access modifiers changed from: private */
    public final Context zad;
    /* access modifiers changed from: private */
    public final Handler zae = new zap(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final ExecutorService zaf = zal.zaa().zaa(4, zaq.zab);
    /* access modifiers changed from: private */
    @Nullable
    public final zaa zag = null;
    /* access modifiers changed from: private */
    public final zak zah = new zak();
    /* access modifiers changed from: private */
    public final Map<zaa, ImageReceiver> zai = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Uri, ImageReceiver> zaj = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Uri, Long> zak = new HashMap();

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, @Nullable Drawable drawable, boolean z);
    }

    public static ImageManager create(Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    static final class zaa extends PlaybackStateCompat.ErrorCode<zac, Bitmap> {
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, @Nullable Object obj3) {
            super.entryRemoved(z, (zac) obj, (Bitmap) obj2, (Bitmap) obj3);
        }
    }

    final class zad implements Runnable {
        private final zaa zaa;

        public zad(zaa zaa2) {
            this.zaa = zaa2;
        }

        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zai.get(this.zaa);
            if (imageReceiver != null) {
                ImageManager.this.zai.remove(this.zaa);
                imageReceiver.zab(this.zaa);
            }
            zac zac = this.zaa.zaa;
            if (zac.zaa == null) {
                this.zaa.zaa(ImageManager.this.zad, ImageManager.this.zah, true);
                return;
            }
            Bitmap zaa2 = ImageManager.this.zaa(zac);
            if (zaa2 != null) {
                this.zaa.zaa(ImageManager.this.zad, zaa2, true);
                return;
            }
            Long l = (Long) ImageManager.this.zak.get(zac.zaa);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < onEmbedViewParamChanged.HOUR_IN_MILLIS) {
                    this.zaa.zaa(ImageManager.this.zad, ImageManager.this.zah, true);
                    return;
                }
                ImageManager.this.zak.remove(zac.zaa);
            }
            this.zaa.zaa(ImageManager.this.zad, ImageManager.this.zah);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.zaj.get(zac.zaa);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(zac.zaa);
                ImageManager.this.zaj.put(zac.zaa, imageReceiver2);
            }
            imageReceiver2.zaa(this.zaa);
            if (!(this.zaa instanceof zad)) {
                ImageManager.this.zai.put(this.zaa, imageReceiver2);
            }
            synchronized (ImageManager.zaa) {
                if (!ImageManager.zab.contains(zac.zaa)) {
                    ImageManager.zab.add(zac.zaa);
                    imageReceiver2.zaa();
                }
            }
        }
    }

    final class zab implements Runnable {
        private final Uri zaa;
        @Nullable
        private final ParcelFileDescriptor zab;

        public zab(Uri uri, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
            this.zaa = uri;
            this.zab = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.zab;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    z2 = true;
                }
                try {
                    this.zab.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.zae.post(new zac(this.zaa, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
            }
        }
    }

    @KeepName
    final class ImageReceiver extends ResultReceiver {
        private final Uri zaa;
        /* access modifiers changed from: private */
        public final ArrayList<zaa> zab = new ArrayList<>();

        ImageReceiver(Uri uri) {
            super(new zap(Looper.getMainLooper()));
            this.zaa = uri;
        }

        public final void zaa(zaa zaa2) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zab.add(zaa2);
        }

        public final void zab(zaa zaa2) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zab.remove(zaa2);
        }

        public final void zaa() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zaa);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.zaf.execute(new zab(this.zaa, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    final class zac implements Runnable {
        private final Uri zaa;
        @Nullable
        private final Bitmap zab;
        private final CountDownLatch zac;
        private boolean zad;

        public zac(Uri uri, @Nullable Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.zaa = uri;
            this.zab = bitmap;
            this.zad = z;
            this.zac = countDownLatch;
        }

        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.zab != null;
            if (ImageManager.this.zag != null) {
                if (this.zad) {
                    ImageManager.this.zag.evictAll();
                    System.gc();
                    this.zad = false;
                    ImageManager.this.zae.post(this);
                    return;
                } else if (this.zab != null) {
                    ImageManager.this.zag.put(new zac(this.zaa), this.zab);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zaj.remove(this.zaa);
            if (imageReceiver != null) {
                ArrayList zaa2 = imageReceiver.zab;
                int size = zaa2.size();
                for (int i = 0; i < size; i++) {
                    zaa zaa3 = (zaa) zaa2.get(i);
                    if (this.zab == null || !z) {
                        ImageManager.this.zak.put(this.zaa, Long.valueOf(SystemClock.elapsedRealtime()));
                        zaa3.zaa(ImageManager.this.zad, ImageManager.this.zah, false);
                    } else {
                        zaa3.zaa(ImageManager.this.zad, this.zab, false);
                    }
                    if (!(zaa3 instanceof zad)) {
                        ImageManager.this.zai.remove(zaa3);
                    }
                }
            }
            this.zac.countDown();
            synchronized (ImageManager.zaa) {
                ImageManager.zab.remove(this.zaa);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.zad = context.getApplicationContext();
    }

    public final void loadImage(ImageView imageView, Uri uri) {
        zaa((zaa) new zab(imageView, uri));
    }

    public final void loadImage(ImageView imageView, int i) {
        zaa((zaa) new zab(imageView, i));
    }

    public final void loadImage(ImageView imageView, Uri uri, int i) {
        zab zab2 = new zab(imageView, uri);
        zab2.zab = i;
        zaa((zaa) zab2);
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaa((zaa) new zad(onImageLoadedListener, uri));
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        zad zad2 = new zad(onImageLoadedListener, uri);
        zad2.zab = i;
        zaa((zaa) zad2);
    }

    private final void zaa(zaa zaa2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zad(zaa2).run();
    }

    /* access modifiers changed from: private */
    @Nullable
    public final Bitmap zaa(zac zac2) {
        zaa zaa2 = this.zag;
        if (zaa2 == null) {
            return null;
        }
        return (Bitmap) zaa2.get(zac2);
    }
}
